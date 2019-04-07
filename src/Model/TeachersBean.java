/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.util.ArrayList;

/**
 *
 * @author Vijay kumar
 */
public class TeachersBean {

   
    private String teacher_name;
    private int age;
    private String gender;
    private String pass;
    private static ArrayList <StudentBean>stu_list;
    

    public TeachersBean(int teacher_id, String teacher_name, int age, String gender,String pass) {
        this.teacher_id = teacher_id;
        this.teacher_name = teacher_name;
        this.age = age;
        this.gender = gender;
        this.pass=pass;
        this.stu_list=new ArrayList<StudentBean>();
        
    }
 public static ArrayList <StudentBean> getStu_list() {
        return stu_list;
    }

    public static void setStu_list(ArrayList <StudentBean> aStu_list) {
        stu_list = aStu_list;
    }
    private int teacher_id;

    public TeachersBean(int teacher_id) {
        this.teacher_id = teacher_id;
    }
    public String getGender() {
        return gender;
    }

    public void setGender(String male) {
        this.gender = male;
    }

    public int getTeacher_id() {
        return teacher_id;
    }

    public void setTeacher_id(int teacher_id) {
        this.teacher_id = teacher_id;
    }

    public String getTeacher_name() {
        return teacher_name;
    }

    public void setTeacher_name(String teacher_name) {
        this.teacher_name = teacher_name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return  teacher_name ;
    }

    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }
    
    
}
