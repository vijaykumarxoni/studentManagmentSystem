/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

/**
 *
 * @author Vijay kumar
 */
public class AdminBean {
    private int teacher_id;
    private String teacher_name;
    private String gender;
    private int age;

    public AdminBean(int teacher_id, String teacher_name, String gender, int age) {
        this.teacher_id = teacher_id;
        this.teacher_name = teacher_name;
        this.gender = gender;
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
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

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    @Override
    public String toString() {
        return "AdminBean{" + "teacher_id=" + teacher_id + ", teacher_name=" + teacher_name + ", gender=" + gender + ", age=" + age + '}';
    }
}
