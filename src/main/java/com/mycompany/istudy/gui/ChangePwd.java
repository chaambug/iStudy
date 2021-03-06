/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.istudy.gui;

import com.mycompany.istudy.db.entities.Student;
import com.mycompany.istudy.db.services.impl.StudentManager;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

/**
 *
 * @author Cham
 */
public class ChangePwd extends javax.swing.JFrame {

    private final UserWin userwin;
    /**
     * Creates new form ChangePwd
     * @param userwin
     */
    public ChangePwd(final UserWin userwin) {
        this.userwin = userwin;
        setUndecorated(true);
        setAlwaysOnTop (true);
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        baseJPanel = new javax.swing.JPanel();
        oldPwdJLabel = new javax.swing.JLabel();
        oldPwdJPasswordField = new javax.swing.JPasswordField();
        jLabel2 = new javax.swing.JLabel();
        newPwdJLabel = new javax.swing.JPasswordField();
        repeatNewPwdJLabel = new javax.swing.JLabel();
        repeatNewPwdJPasswordField = new javax.swing.JPasswordField();
        confirmJButton = new javax.swing.JButton();
        cancelJButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        baseJPanel.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Change Password Area", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 14))); // NOI18N

        oldPwdJLabel.setText("Old password");

        oldPwdJPasswordField.setBackground(new java.awt.Color(240, 240, 240));

        jLabel2.setText("New password");

        newPwdJLabel.setBackground(new java.awt.Color(240, 240, 240));

        repeatNewPwdJLabel.setText("Repeat New password");

        repeatNewPwdJPasswordField.setBackground(new java.awt.Color(240, 240, 240));

        confirmJButton.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        confirmJButton.setText("Confirm");
        confirmJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                confirmJButtonActionPerformed(evt);
            }
        });

        cancelJButton.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        cancelJButton.setText("Cancel");
        cancelJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelJButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout baseJPanelLayout = new javax.swing.GroupLayout(baseJPanel);
        baseJPanel.setLayout(baseJPanelLayout);
        baseJPanelLayout.setHorizontalGroup(
            baseJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(baseJPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(baseJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(oldPwdJPasswordField)
                    .addComponent(newPwdJLabel)
                    .addComponent(repeatNewPwdJPasswordField)
                    .addComponent(oldPwdJLabel)
                    .addComponent(jLabel2)
                    .addComponent(repeatNewPwdJLabel)
                    .addGroup(baseJPanelLayout.createSequentialGroup()
                        .addComponent(confirmJButton, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cancelJButton, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        baseJPanelLayout.setVerticalGroup(
            baseJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(baseJPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(oldPwdJLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(oldPwdJPasswordField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(newPwdJLabel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(repeatNewPwdJLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(repeatNewPwdJPasswordField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(baseJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(confirmJButton)
                    .addComponent(cancelJButton))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(baseJPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(baseJPanel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void cancelJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelJButtonActionPerformed
        this.dispose();
    }//GEN-LAST:event_cancelJButtonActionPerformed

    private void confirmJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_confirmJButtonActionPerformed
       final String oldPwd = ((JTextField) oldPwdJPasswordField).getText();
       final String newPwd = ((JTextField) newPwdJLabel).getText();
       final String repeatedNewPwd = ((JTextField) repeatNewPwdJPasswordField).getText();
       
       Student student = StudentManager.getInstance().getStudent();
       
       if (validateEneteredData(oldPwd, newPwd, repeatedNewPwd, student)) {
           student.setPasswort(newPwd);
           StudentManager.getInstance().updateStudent(student);
           JOptionPane.showMessageDialog(this,
                        "Please login again",
                        "Password change successful",
                        JOptionPane.INFORMATION_MESSAGE);
           userwin.defaultExitBehavior();
       }
    }//GEN-LAST:event_confirmJButtonActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel baseJPanel;
    private javax.swing.JButton cancelJButton;
    private javax.swing.JButton confirmJButton;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPasswordField newPwdJLabel;
    private javax.swing.JLabel oldPwdJLabel;
    private javax.swing.JPasswordField oldPwdJPasswordField;
    private javax.swing.JLabel repeatNewPwdJLabel;
    private javax.swing.JPasswordField repeatNewPwdJPasswordField;
    // End of variables declaration//GEN-END:variables

    private boolean validateEneteredData(String oldPwd, String newPwd, String repeatedNewPwd, Student student) {
        if(oldPwd == null || oldPwd.trim().length() == 0) {
            dialogToUser("Please enter your old password");
            return false;
        }
        if(newPwd == null || newPwd.trim().length() == 0) {
            dialogToUser("Please enter your new password");
            return false;
        }
        if(repeatedNewPwd == null || repeatedNewPwd.trim().length() == 0) {
            dialogToUser("Please repeat your enetered new password");
            return false;
        }
        if(!newPwd.equals(repeatedNewPwd)) {
            dialogToUser("Entered new passwords are not identical");
            return false;
        }
        if(!student.getPasswort().equals(oldPwd)) {
            dialogToUser("Actual password (old) is not valid");
            return false;
        }
        return true;
    }
    
    private void dialogToUser(final String message) {
        JOptionPane.showMessageDialog(this,
                        message,
                        "Input error",
                        JOptionPane.ERROR_MESSAGE);
    }

}
