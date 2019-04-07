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
public class StudentSearchingBean {
    private int stu_id;

    public int getStu_id() {
        return stu_id;
    }

    public void setStu_id(int stu_id) {
        this.stu_id = stu_id;
    }

    public StudentSearchingBean(int stu_id, String stu_name, String feesStatus) {
        this.stu_id = stu_id;
        this.stu_name = stu_name;
        this.feesStatus = feesStatus;
    }
    private String stu_name;
    private String feesStatus;

    

    public String getStu_name() {
        return stu_name;
    }

    public void setStu_name(String stu_name) {
        this.stu_name = stu_name;
    }

    public String getFeesStatus() {
        return feesStatus;
    }

    public void setFeesStatus(String feesStatus) {
        this.feesStatus = feesStatus;
    }
}
