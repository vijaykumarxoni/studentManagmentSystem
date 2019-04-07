/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Model.CourseBean;

import database.DB;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.HashMap;

/**
 *
 * @author Vijay kumar
 */

public class CoursesBAL {
     
    // public static ArrayList<HashMap<String, Object>> c_list = new ArrayList<>();
    private static Connection con = DB.con;

    public static ArrayList<CourseBean> getCourse() {
        ArrayList<CourseBean> course_list = new ArrayList<>();
        try {
            String query = "SELECT * FROM course WHERE  Status = 1";
            PreparedStatement ps = con.prepareStatement(query);

            ResultSet rs = ps.executeQuery(query);
            while (rs.next()) {
                int id = rs.getInt("course_id");
                String course = rs.getString("course");
             
                course_list.add(new CourseBean(id, course));
                

            }
        } catch (Exception e) {
            System.out.println("Error in getTeachers");
            e.printStackTrace();
        }

        return course_list;
    }

    public static int addCourse(String course) {
        int i = 0;
        String query = "INSERT INTO course VALUES (NULL, ?, 1)";
        try {
            PreparedStatement ps = con.prepareStatement(query);
            ps.setString(1, course);
            
            
            i = ps.executeUpdate();
        } catch (Exception e) {

            System.out.println("Error in addteacher");
            e.printStackTrace();
        }
        return i;
    }

    public static int updateCourse(int id, String course) {
        int i = 0;
        String query = "UPDATE course SET course= ?  WHERE course_id=? ";
        try {
            PreparedStatement ps = con.prepareStatement(query);
            ps.setString(1, course);
            
            ps.setInt(2, id);
            i = ps.executeUpdate();
        } catch (Exception e) {

            System.out.println("Error in updateCourse");
            e.printStackTrace();
        }
        return i;
    }


    
    public static int cascadeDelCourse(int id) {
        int i = 0;
        String query = "UPDATE course SET STATUS = 0 WHERE course_id=?";
        try {
            PreparedStatement ps = con.prepareStatement(query);
            ps.setInt(1, id);
            i = ps.executeUpdate();

        } catch (Exception e) {

            System.out.println("Error in cascadeDelCourse");
            e.printStackTrace();
        }
        return i;
    }
    
}
