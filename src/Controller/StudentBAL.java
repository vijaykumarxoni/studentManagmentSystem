/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Model.StudentBean;
import Model.StudentSearchingBean;
import database.DB;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

/**
 *
 * @author Vijay kumar
 */
public class StudentBAL {
       private static Connection con = DB.con;

    public static ArrayList<StudentBean> getStudent(int teacherId) {
        ArrayList<StudentBean> stu_list = new ArrayList<>();
        try {
            String query = "SELECT * FROM student_table WHERE status=1 AND id = "+teacherId;
            PreparedStatement ps = con.prepareStatement(query);


            ResultSet rs = ps.executeQuery(query);
            while (rs.next()) {
                int id = rs.getInt("student_id");
               String name=  rs.getString("student_name");
                String roll_no = rs.getString("roll_no");
                double fees=rs.getDouble("fees");
                String course= rs.getString("course");
                int teacher_id = rs.getInt("id");
              
                
                stu_list.add(new StudentBean(id,name, roll_no, fees, course,teacher_id));
               

            }
        } catch (Exception e) {
            System.out.println("Error in getStudent");
            e.printStackTrace();
        }

        return stu_list;
    }
    
    public static int cascadeDelStudent(int studentId) {
        int i = 0;
        String query = "UPDATE  student_table SET STATUS = 0 WHERE student_id=?";
        try {
            PreparedStatement ps = con.prepareStatement(query);
            ps.setInt(1, studentId);
            i = ps.executeUpdate();

        } catch (Exception e) {

            System.out.println("Error in cascadeDelStudent");
            e.printStackTrace();
        }
        return i;
    }

    public static int addStudent(String name, String roll_no, double fees, String course,int teacher_id) {
        int i = 0;
        String query = "INSERT INTO  student_table  VALUES (NULL,?,?,? ,?,?,?,1)";
        try {
            PreparedStatement ps = con.prepareStatement(query);
            ps.setString(1, name);
           ps.setString(2, course);
            ps.setString(3, roll_no);
            
            
            ps.setDouble(4, fees);
           
            ps.setInt(5, teacher_id);
            ps.setString(6, "Not Paid");
            
            
            i = ps.executeUpdate();
        } catch (Exception e) {

            System.out.println("Error in addStudent");
            e.printStackTrace();
        }
        return i;
    }
    
     public static ArrayList<StudentSearchingBean> SearchStudent(String search,int teacherId) {
        ArrayList<StudentSearchingBean> searchingList = new ArrayList<>();
        try {
            String query =" SELECT * FROM student_table WHERE status=1 AND id='"+teacherId+"' AND student_name LIKE '"+search+"%' "; 
            PreparedStatement ps = con.prepareStatement(query);

            ResultSet rs = ps.executeQuery(query);
            while (rs.next()) {
                int id=rs.getInt("student_id");
                String stu_name = rs.getString("student_name");
                String feesStatus = rs.getString("Fees_Status");
             
                searchingList.add(new StudentSearchingBean(id,stu_name, feesStatus));
                

            }
        } catch (Exception e) {
            System.out.println("Error in getsearchStudent");
            e.printStackTrace();
        }

        return searchingList;
    }
      public static int updateStudent( int student_id,String stu_name,  String roll_no,double fees) {
        int i = 0;
        String query = "UPDATE student_table SET student_name = ?, roll_no = ?, fees = ?  WHERE student_id = ? ";
        
        try {
            PreparedStatement ps = con.prepareStatement(query);
            ps.setString(1, stu_name);
           
            ps.setString(2, roll_no);
            ps.setDouble(3, fees);
            
            
            
          
            ps.setInt(4,student_id );
            i = ps.executeUpdate();
        } catch (Exception e) {

            System.out.println("Error in updateStudent");
            e.printStackTrace();
        }
        return i;
        
    }
}
