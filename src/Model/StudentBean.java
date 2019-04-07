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
public class StudentBean {
    private int Student_id;
    private String Student_name;
    private String roll_no;
    private double fees;
    private String course;
    private int teacher_id;
    private int course_id;
    private String fees_status;

    public StudentBean(int Student_id, String Student_name, String fees_status) {
        this.Student_id = Student_id;
        this.Student_name = Student_name;
        this.fees_status = fees_status;
    }

    public StudentBean(int Student_id) {
        this.Student_id = Student_id;
    }
    

    public StudentBean(int Student_id, String Student_name, String roll_no, double fees, String course,int teacher_id) {
        this.Student_id = Student_id;
        this.Student_name = Student_name;
        this.roll_no = roll_no;
        this.fees = fees;
        this.course = course;
        this.teacher_id=teacher_id;
        this.course_id=course_id;
    }

    public String getCourse() {
        return course;
    }

    public void setCourse(String course) {
        this.course = course;
    }

    public int getStudent_id() {
        return Student_id;
    }

    public void setStudent_id(int Student_id) {
        this.Student_id = Student_id;
    }

    public String getStudent_name() {
        return Student_name;
    }

    public void setStudent_name(String Student_name) {
        this.Student_name = Student_name;
    }

    public String getRoll_no() {
        return roll_no;
    }

    public void setRoll_no(String roll_no) {
        this.roll_no = roll_no;
    }

    public double getFees() {
        return fees;
    }

    public void setFees(double fees) {
        this.fees = fees;
    }

    @Override
    public String toString() {
        return "StudentBean{" + "Student_id=" + Student_id + ", Student_name=" + Student_name + ", roll_no=" + roll_no + ", fees=" + fees + ", course=" + course + '}';
    }

    public int getTeacher_id() {
        return teacher_id;
    }

    public void setTeacher_id(int teacher_id) {
        this.teacher_id = teacher_id;
    }

    public int getCourse_id() {
        return course_id;
    }

    public void setCourse_id(int course_id) {
        this.course_id = course_id;
    }

    public String getFees_status() {
        return fees_status;
    }

    public void setFees_status(String fees_status) {
        this.fees_status = fees_status;
    }
            
            
}
