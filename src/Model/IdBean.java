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
public class IdBean {
    private int stu_id;

    public IdBean(int stu_id) {
        this.stu_id = stu_id;
    }

    public int getStu_id() {
        return stu_id;
    }

    public void setStu_id(int stu_id) {
        this.stu_id = stu_id;
    }

    @Override
    public String toString() {
        return  ""+stu_id;
    }
}
