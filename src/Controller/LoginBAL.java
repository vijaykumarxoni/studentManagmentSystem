/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Model.course_idBean;
import Model.LoginBean;
import Model.Subjectbean;
import database.DB;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;



/**
 *
 * @author Vijay kumar
 */
public class LoginBAL {
     private static Connection con = DB.con;
     public static LoginBean getLogin(String name , String pas) {
         
         LoginBean Bean=null;
    try{     
        
        String query="SELECT * FROM login WHERE Username = '"+name+"' AND password ='"+pas+"' " ;
     PreparedStatement ps = con.prepareStatement(query);
     // Statement st=con.createStatement();
     
 //ps.setString(1, name);
 // ps.setString(2, pas);
     
     ResultSet rs = ps.executeQuery();
        
    while(rs.next()){
        int id=rs.getInt("id");
     String username=rs.getString("Username");
     String password=rs.getString("password");
     String post=rs.getString("Post");
     
     Bean=new LoginBean(id,username, password, post);
 
    }
        
    
     
     
     } catch(Exception e){
         System.out.println("Error in getMangaerFrame");
         e.printStackTrace();
     }
         
     return Bean;
             }
     
     
      
        public static course_idBean getCourseId(int teacher_id) {
         
         course_idBean Idbean=null;
    try{     
        
        String query="SELECT * FROM teacher_course WHERE id=?";
     PreparedStatement ps = con.prepareStatement(query);
     // Statement st=con.createStatement();
     
 ps.setInt(1, teacher_id);
 // ps.setString(2, pas);
     
     ResultSet rs = ps.executeQuery();
        
    while(rs.next()){
        int course_id=rs.getInt("course_id");
     
     
     Idbean=new course_idBean(course_id);
 
    }
        
    
     
     
     } catch(Exception e){
         System.out.println("Error in getCourseId");
         e.printStackTrace();
     }
         
     return Idbean;
             }
        //
   public static Subjectbean getCourse(int course_id) {
         
         Subjectbean subBean=null;
    try{     
        
        String query="SELECT * FROM course WHERE course_id=?" ;
     PreparedStatement ps = con.prepareStatement(query);
     // Statement st=con.createStatement();
     
 ps.setInt(1,course_id);
 // ps.setString(2, pas);
     
     ResultSet rs = ps.executeQuery();
        
    while(rs.next()){
     String course=rs.getString("course");
     subBean=new Subjectbean(course);
 
    }
        
     } catch(Exception e){
         System.out.println("Error in getCourse");
         e.printStackTrace();
     }
    return subBean;
             }
    public static int addLogin(String name,String password) {
        int i = 0;
        String query = "INSERT INTO login VALUES (NULL, ?, ?,1,?)";
        try {
            PreparedStatement ps = con.prepareStatement(query);
            ps.setString(1, name);
            ps.setString(2,"Teacher");
            ps.setString(3,password);
            
            
            i = ps.executeUpdate();
        } catch (Exception e) {

            System.out.println("Error in addlogin");
            e.printStackTrace();
        }
        return i;
    }
        public static int updateLogin(int id, String name, String pass) {
        int i = 0;
        String query = "UPDATE login SET Username = ?,PASSWORD=? WHERE id=?";
        try {
            PreparedStatement ps = con.prepareStatement(query);
            ps.setString(1, name);
            ps.setString(2, pass);
           
            
          
            ps.setInt(3, id);
            i = ps.executeUpdate();
        } catch (Exception e) {

            System.out.println("Error in updateLogin");
            e.printStackTrace();
        }
        return i;
    }
   
}
