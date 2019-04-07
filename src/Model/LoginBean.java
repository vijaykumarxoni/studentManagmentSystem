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
public class LoginBean {
    private int id;
    private String username;
    private String password;
    private String post;
    private int course_id;
    private String course;

    public LoginBean(String course) {
        this.course = course;
    }

    public int getCourse_id() {
        return course_id;
    }

    public void setCourse_id(int course_id) {
        this.course_id = course_id;
    }

    public LoginBean(int id) {
        this.id = id;
    }

    public LoginBean(int id,String username, String password, String post) {
         this.id=id;
        this.username = username;
        this.password = password;
        this.post = post;
    }

    public String getPost() {
        return post;
    }
 
    public void setPost(String post) {
        this.post = post;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "LoginBean{" + "username=" + username + ", password=" + password + ", post=" + post + '}';
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCourse() {
        return course;
    }

    public void setCourse(String course) {
        this.course = course;
    }
    
}
