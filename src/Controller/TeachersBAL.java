/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;


import Model.IdBean;
import Model.TeacherIDBean;
import Model.TeachersBean;
import database.DB;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

/**
 *
 * @author Vijay kumar
 */
public class TeachersBAL {
    
    private static Connection con = DB.con;

    public static ArrayList<TeachersBean> getTeacher() {
        ArrayList<TeachersBean> list = new ArrayList<>();
        try {
            String query = "SELECT * FROM teacher_table WHERE  status = 1";
            PreparedStatement ps = con.prepareStatement(query);

            ResultSet rs = ps.executeQuery(query);
            while (rs.next()) {
                int id = rs.getInt("id");
                
                String name = rs.getString("teacher_name");
                String gender= rs.getString("Gender");
                int age = rs.getInt("Age");
                String password=rs.getString("pass");
                list.add(new TeachersBean(id, name, age, gender,password));

                }
        } catch (Exception e) {
            System.out.println("Error in getTeachers");
            e.printStackTrace();
        }

        return list;
    }

    public static int addTeacher(String name, String gender, int age,String password) {
        int i = 0;
        String query = "INSERT INTO teacher_table VALUES (NULL,?, ?, ?, ?, 1,1)";
        try {
            PreparedStatement ps = con.prepareStatement(query);
            ps.setString(1, name);
            ps.setString(2, password);
           
            ps.setString(3,gender);
            ps.setInt(4,age);
            i = ps.executeUpdate();
        } catch (Exception e) {

            System.out.println("Error in addteacher");
            e.printStackTrace();
        }
        return i;
    }

    public static int updateTeacher(int id, String name, String gender, int age,String pass) {
        int i = 0;
        String query = "UPDATE teacher_table SET teacher_name = ?,  Gender =?, Age = ? ,pass=? WHERE id=?";
        try {
            PreparedStatement ps = con.prepareStatement(query);
            ps.setString(1, name);
            ps.setString(2, gender);
            ps.setInt(3, age);
            
            ps.setString(4, pass);
            ps.setInt(5, id);
            i = ps.executeUpdate();
        } catch (Exception e) {

            System.out.println("Error in updateTeacher");
            e.printStackTrace();
        }
        return i;
    }


    
    public static int cascadeDelTeacher(int id) {
        int i = 0;
        String query = "UPDATE  teacher_table SET STATUS = 0 WHERE id=?";
        try {
            PreparedStatement ps = con.prepareStatement(query);
            ps.setInt(1, id);
            i = ps.executeUpdate();

        } catch (Exception e) {

            System.out.println("Error in cascadeDelTeacher");
            e.printStackTrace();
        }
        return i;
    }
       
   public static ArrayList<TeachersBean> getTeacherIncombo() {
        ArrayList<TeachersBean> list = new ArrayList<>();
        try {
            String query = "SELECT * FROM teacher_table WHERE  STATUS = 1 AND teacher_status=1";
            PreparedStatement ps = con.prepareStatement(query);

            ResultSet rs = ps.executeQuery(query);
            while (rs.next()) {
                int id = rs.getInt("id");
                
                String name = rs.getString("teacher_name");
                String gender= rs.getString("Gender");
                int age = rs.getInt("Age");
                String password=rs.getString("pass");
                list.add(new TeachersBean(id, name, age, gender,password));

                }
        } catch (Exception e) {
            System.out.println("Error in getTeachersstatus");
            e.printStackTrace();
        }

        return list;
    }
      
    public static int updateTeacherStatus(int id) {
        int i = 0;
        String query = "UPDATE  teacher_table SET  teacher_status =0 WHERE id=?";
        try {
            PreparedStatement ps = con.prepareStatement(query);
            ps.setInt(1, id);
            i = ps.executeUpdate();

        } catch (Exception e) {

            System.out.println("Error in updateTeeacherStatus");
            e.printStackTrace();
        }
        return i;
    }
    public static int assignTeacherID(int Id) {
        String query = "UPDATE teacher_table SET  `teacher_status` = '0' WHERE id ="+Id;
        int i = 0;
        try {
            Statement st = con.createStatement();
            i = st.executeUpdate(query);
        } catch (Exception e) {
            System.out.println("Error in assignteacherid");
            e.printStackTrace();
        }
        return i;
    }
        public static IdBean getTeacherId(String name) {
        
        IdBean bean=null;
        try {
            String query = "SELECT * FROM  teacher_table  WHERE teacher_name= ?";
            PreparedStatement ps = con.prepareStatement(query);
ps.setString(1, name);
            ResultSet rs = ps.executeQuery(query);
            while (rs.next()) {
                int id = rs.getInt("id");
                
              bean=new IdBean(id);
               

                }
        } catch (Exception e) {
            System.out.println("Error in getTeachersId");
            e.printStackTrace();
        }

        return bean;
    }

    
}
