/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

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
public class teacherCourseBAL {
         public static ArrayList<HashMap<String, Object>> c_list = new ArrayList<>();
    private static Connection con = DB.con;
    public static ArrayList<HashMap<String, Object>> getTeacherCourse() {

        ArrayList<HashMap<String, Object>> c_list = new ArrayList<HashMap<String, Object>>();
        try {
            String query = "SELECT* FROM teacher_table INNER JOIN teacher_course USING (id) INNER JOIN course USING (course_id)";
            PreparedStatement ps = con.prepareStatement(query);

            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                HashMap<String, Object> map = new HashMap<String, Object>();

                map.put("id", rs.getInt("id"));
                map.put("teacher_name", rs.getString("teacher_name"));
                map.put("course", rs.getString("course"));
                c_list.add(map);
               

            }
        } catch (Exception e) {
            System.out.println("Error in getTeacherCourse");
            e.printStackTrace();
        }

        return c_list;
    } 
        public static int addTeacher_course(int teacher_id ,int course_id) {
        int i = 0;
        String query = "INSERT INTO teacher_course VALUES ( ?, ?)";
        try {
            PreparedStatement ps = con.prepareStatement(query);
            ps.setInt(1, teacher_id);
            ps.setInt(2, course_id);
            
            
            i = ps.executeUpdate();
        } catch (Exception e) {

            System.out.println("Error in addteacher");
            e.printStackTrace();
        }
        return i;
    }
          public static int delTeacher_course(int teacher_id ,int course_id) {
        int i = 0;
        String query = "DELETE FROM teacher_course WHERE id = ?  AND course_id  = ? ";
        try {
            PreparedStatement ps = con.prepareStatement(query);
            ps.setInt(1, teacher_id);
            ps.setInt(2, course_id);
            
            
            i = ps.executeUpdate();
        } catch (Exception e) {

            System.out.println("Error in addteacher");
            e.printStackTrace();
        }
        return i;
    }
        
}
