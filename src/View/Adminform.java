/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;



import java.util.Calendar;
import java.util.GregorianCalendar;




/**
 *
 * @author Vijay kumar
 */
public class Adminform extends javax.swing.JFrame {
     
   TeacherInternalform teacherIF=null;
   StudentListInternalFrame studentIF;
   Course courseIF=null;
   FeesInternalframe feesIF=null;
   assignCourse assignCourseIF=null;
   
   
   public Adminform() {
        initComponents();
               

        
        teacherIF =new TeacherInternalform();
          courseIF=new Course();
          assignCourseIF=new assignCourse();
          feesIF=new FeesInternalframe();
          studentIF=new StudentListInternalFrame();
       
            
      
        
        
    }
    
//  public Managerframe(String name) {
//      this.jLabel3.setText(name);
//      initComponents();
//    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jLabel3 = new javax.swing.JLabel();
        jDesktopPane1 = new javax.swing.JDesktopPane();
        jButton_teacher = new javax.swing.JButton();
        jButton_course = new javax.swing.JButton();
        jButton_Studentlist = new javax.swing.JButton();
        jButton_Assigncourses = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel_course = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel_addteacher = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLayeredPane1 = new javax.swing.JLayeredPane();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setFont(new java.awt.Font("Dialog", 3, 36)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 10, -1, -1));

        jButton_teacher.setBackground(new java.awt.Color(0, 0, 204));
        jButton_teacher.setFont(new java.awt.Font("Maiandra GD", 1, 18)); // NOI18N
        jButton_teacher.setForeground(new java.awt.Color(255, 255, 255));
        jButton_teacher.setText("Add Teachers ");
        jButton_teacher.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_teacherActionPerformed(evt);
            }
        });
        jDesktopPane1.add(jButton_teacher);
        jButton_teacher.setBounds(700, 390, 280, 39);

        jButton_course.setBackground(new java.awt.Color(0, 0, 255));
        jButton_course.setFont(new java.awt.Font("Maiandra GD", 1, 18)); // NOI18N
        jButton_course.setForeground(new java.awt.Color(255, 255, 255));
        jButton_course.setText("Add Courses");
        jButton_course.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_courseActionPerformed(evt);
            }
        });
        jDesktopPane1.add(jButton_course);
        jButton_course.setBounds(700, 320, 280, 40);

        jButton_Studentlist.setBackground(new java.awt.Color(0, 0, 204));
        jButton_Studentlist.setFont(new java.awt.Font("Maiandra GD", 1, 18)); // NOI18N
        jButton_Studentlist.setForeground(new java.awt.Color(255, 255, 255));
        jButton_Studentlist.setText("View Student List");
        jButton_Studentlist.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_StudentlistActionPerformed(evt);
            }
        });
        jDesktopPane1.add(jButton_Studentlist);
        jButton_Studentlist.setBounds(700, 260, 280, 39);

        jButton_Assigncourses.setBackground(new java.awt.Color(0, 0, 255));
        jButton_Assigncourses.setFont(new java.awt.Font("Maiandra GD", 1, 18)); // NOI18N
        jButton_Assigncourses.setForeground(new java.awt.Color(255, 255, 255));
        jButton_Assigncourses.setText("Assign Courses to Teachers");
        jButton_Assigncourses.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_AssigncoursesActionPerformed(evt);
            }
        });
        jDesktopPane1.add(jButton_Assigncourses);
        jButton_Assigncourses.setBounds(700, 200, 280, 39);

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(153, 0, 0));
        jLabel1.setText("Logout");
        jLabel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel1MouseClicked(evt);
            }
        });
        jDesktopPane1.add(jLabel1);
        jLabel1.setBounds(880, 470, 80, 180);

        jLabel_course.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel_courseMouseClicked(evt);
            }
        });
        jDesktopPane1.add(jLabel_course);
        jLabel_course.setBounds(350, 190, 280, 150);

        jLabel4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel4MouseClicked(evt);
            }
        });
        jDesktopPane1.add(jLabel4);
        jLabel4.setBounds(360, 360, 280, 140);

        jLabel5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel5MouseClicked(evt);
            }
        });
        jDesktopPane1.add(jLabel5);
        jLabel5.setBounds(60, 350, 290, 150);

        jLabel_addteacher.setText(".");
        jLabel_addteacher.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel_addteacherMouseClicked(evt);
            }
        });
        jDesktopPane1.add(jLabel_addteacher);
        jLabel_addteacher.setBounds(70, 190, 270, 150);

        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/aaaa copy.jpg"))); // NOI18N
        jDesktopPane1.add(jLabel10);
        jLabel10.setBounds(0, 0, 1000, 600);

        getContentPane().add(jDesktopPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1000, 600));
        getContentPane().add(jLayeredPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 30, -1, -1));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton_AssigncoursesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_AssigncoursesActionPerformed
       if(assignCourseIF!=null){
            this.jDesktopPane1.add(assignCourseIF);

            assignCourseIF.setVisible(true);
        }
    }//GEN-LAST:event_jButton_AssigncoursesActionPerformed

    private void jButton_StudentlistActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_StudentlistActionPerformed
        if(studentIF!=null){
            this.jDesktopPane1.add(studentIF);

            studentIF.setVisible(true);
        }
    }//GEN-LAST:event_jButton_StudentlistActionPerformed

    private void jButton_courseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_courseActionPerformed

        // TODO add your handling code here:

        if(courseIF!=null){
            this.jDesktopPane1.add(courseIF);

            courseIF.setVisible(true);
        }
    }//GEN-LAST:event_jButton_courseActionPerformed

    private void jButton_teacherActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_teacherActionPerformed

        if(teacherIF!=null){
            this.jDesktopPane1.add(teacherIF);

            teacherIF.setVisible(true);
        }
    }//GEN-LAST:event_jButton_teacherActionPerformed

    private void jLabel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseClicked
    this.dispose();
    new Loginframe().setVisible(true);
    }//GEN-LAST:event_jLabel1MouseClicked

    private void jLabel_addteacherMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel_addteacherMouseClicked
        // TODO add your handling code here:
                if(teacherIF!=null){
            this.jDesktopPane1.add(teacherIF);

            teacherIF.setVisible(true);
        }
    }//GEN-LAST:event_jLabel_addteacherMouseClicked

    private void jLabel_courseMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel_courseMouseClicked
        // TODO add your handling code here:+
                if(courseIF!=null){
            this.jDesktopPane1.add(courseIF);

            courseIF.setVisible(true);
        }

    }//GEN-LAST:event_jLabel_courseMouseClicked

    private void jLabel4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel4MouseClicked
        // TODO add your handling code here:
          if(assignCourseIF!=null){
            this.jDesktopPane1.add(assignCourseIF);

            assignCourseIF.setVisible(true);
        }
    }//GEN-LAST:event_jLabel4MouseClicked

    private void jLabel5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel5MouseClicked

        // TODO add your handling code here:
          if(studentIF!=null){
            this.jDesktopPane1.add(studentIF);

            studentIF.setVisible(true);
        }
        
    }//GEN-LAST:event_jLabel5MouseClicked

    /**
     * @param args the command line arguments
//     */
//    public static void main(String args[]) {
//        /* Set the Nimbus look and feel */
//        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
//        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
//         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
//         */
//        try {
//            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
//                if ("Nimbus".equals(info.getName())) {
//                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
//                    break;
//                }
//            }
//        } catch (ClassNotFoundException ex) {
//            java.util.logging.Logger.getLogger(Adminform.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (InstantiationException ex) {
//            java.util.logging.Logger.getLogger(Adminform.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (IllegalAccessException ex) {
//            java.util.logging.Logger.getLogger(Adminform.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
//            java.util.logging.Logger.getLogger(Adminform.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        }
//        //</editor-fold>
//        //</editor-fold>
//
//        /* Create and display the form */
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                new Adminform().setVisible(true);
//            }
//        });
//    }
   
    


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton jButton_Assigncourses;
    private javax.swing.JButton jButton_Studentlist;
    private javax.swing.JButton jButton_course;
    private javax.swing.JButton jButton_teacher;
    private javax.swing.JDesktopPane jDesktopPane1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel_addteacher;
    private javax.swing.JLabel jLabel_course;
    private javax.swing.JLayeredPane jLayeredPane1;
    // End of variables declaration//GEN-END:variables
}
