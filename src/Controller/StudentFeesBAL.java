/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Model.IdBean;
import Model.StudentBean;
import Model.TeacherIDBean;
import database.DB;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

/**
 *
 * @author Vijay kumar
 */
public class StudentFeesBAL {
      private static Connection con = DB.con;

    public static ArrayList<StudentBean> getStudents_fees(int teacherId) {
        ArrayList<StudentBean> fees_list = new ArrayList<>();
        try {
            String query = "SELECT * FROM student_table WHERE status=1 AND id = "+teacherId;
            PreparedStatement ps = con.prepareStatement(query);


            ResultSet rs = ps.executeQuery(query);
            while (rs.next()) {
                int id = rs.getInt("student_id");
               String name=  rs.getString("student_name");
             String fees_status=rs.getString("Fees_Status");
                int teacher_id = rs.getInt("id");
              
                
                fees_list.add(new StudentBean(id,name,fees_status));
               

            }
        } catch (Exception e) {
            System.out.println("Error in getTransation");
            e.printStackTrace();
        }

        return fees_list;
    }
    
    public static int updateFeesStatus(int student_id,String fees_status) {
        int i = 0;
        String query = "UPDATE student_table SET Fees_Status =? WHERE student_id = ?";
        try {
            PreparedStatement ps = con.prepareStatement(query);
            ps.setString(1, fees_status);
            ps.setInt(2,student_id);
           
            
           
            i = ps.executeUpdate();
        } catch (Exception e) {

            System.out.println("Error in updateFeesStatus");
            e.printStackTrace();
        }
        return i;
    }
        public static IdBean getRoll(int teacherId,String name) {
        ArrayList<StudentBean> fees_list = new ArrayList<>();
        IdBean stu_id=null;
           String query = "SELECT * FROM student_table WHERE student_name='"+name+"' AND id="+teacherId;
        try {
        
            PreparedStatement ps = con.prepareStatement(query);
//ps.setString(1, name);

            ResultSet rs = ps.executeQuery(query);
            while (rs.next()) {
                int stuid = rs.getInt("student_id");
                 
           stu_id=new IdBean(stuid);
                 
               

            }
        } catch (Exception e) {
            System.out.println("Error in getRoll");
            e.printStackTrace();
        }

        return stu_id;
    }
         public static TeacherIDBean getTeacherID(String teacher_name) {
        ArrayList<TeacherIDBean> id_List = new ArrayList<>();
        
        TeacherIDBean Bean=null;
        try {
            String query = "SELECT * FROM  login_table WHERE STATUS =1 AND username="+teacher_name;
            PreparedStatement ps = con.prepareStatement(query);

            ResultSet rs = ps.executeQuery(query);
            
                int id = rs.getInt("id");
  
             Bean=new TeacherIDBean(id);

                
        } catch (Exception e) {
            System.out.println("Error in getTeachersID");
            e.printStackTrace();
        }

        return Bean;
    }
      
}
