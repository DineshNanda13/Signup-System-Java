
import java.awt.event.WindowEvent;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author SONY INDIA
 */
public class SignUp extends javax.swing.JFrame{
        
    /**
     * Creates new form SignUp
     */
    public SignUp() {
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

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jlblSetU = new javax.swing.JLabel();
        jSetUtxt = new javax.swing.JTextField();
        jlblSetP = new javax.swing.JLabel();
        jSetPtxt = new javax.swing.JPasswordField();
        jlblConfirm = new javax.swing.JLabel();
        jConfirmPtxt = new javax.swing.JPasswordField();
        jLabel4 = new javax.swing.JLabel();
        jSignbtn = new javax.swing.JButton();
        jCancelbtn = new javax.swing.JButton();
        jSresetbtn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 40));

        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(java.awt.Color.white, 20));

        jlblSetU.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jlblSetU.setText("Set Username:");

        jSetUtxt.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jSetUtxt.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));

        jlblSetP.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jlblSetP.setText("Set Password:");

        jSetPtxt.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jSetPtxt.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        jSetPtxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jSetPtxtActionPerformed(evt);
            }
        });

        jlblConfirm.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jlblConfirm.setText("Confirm Password:");

        jConfirmPtxt.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jConfirmPtxt.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel4.setText("Register");

        jSignbtn.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jSignbtn.setText("Sign Up");
        jSignbtn.addContainerListener(new java.awt.event.ContainerAdapter() {
            public void componentAdded(java.awt.event.ContainerEvent evt) {
                jSignbtnComponentAdded(evt);
            }
        });
        jSignbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jSignbtnActionPerformed(evt);
            }
        });

        jCancelbtn.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jCancelbtn.setText("Cancel");
        jCancelbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCancelbtnActionPerformed(evt);
            }
        });

        jSresetbtn.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jSresetbtn.setText("Reset");
        jSresetbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jSresetbtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(106, 253, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jlblSetU)
                            .addComponent(jlblSetP))
                        .addGap(94, 94, 94))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(jlblConfirm)
                        .addGap(43, 43, 43)))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jConfirmPtxt, javax.swing.GroupLayout.PREFERRED_SIZE, 262, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jSetPtxt, javax.swing.GroupLayout.PREFERRED_SIZE, 262, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jSetUtxt, javax.swing.GroupLayout.PREFERRED_SIZE, 262, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(293, 293, 293))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(422, 422, 422)
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(290, 290, 290)
                        .addComponent(jSignbtn)
                        .addGap(60, 60, 60)
                        .addComponent(jSresetbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(62, 62, 62)
                        .addComponent(jCancelbtn)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(62, 62, 62)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(68, 68, 68)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlblSetU)
                    .addComponent(jSetUtxt, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(13, 13, 13)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlblSetP)
                    .addComponent(jSetPtxt, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(11, 11, 11)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jConfirmPtxt, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jlblConfirm))
                .addGap(40, 40, 40)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jSignbtn)
                    .addComponent(jCancelbtn)
                    .addComponent(jSresetbtn))
                .addContainerGap(157, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(25, Short.MAX_VALUE)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(21, 21, 21))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jSetPtxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jSetPtxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jSetPtxtActionPerformed

    private void jCancelbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCancelbtnActionPerformed
        System.exit(0);
    }//GEN-LAST:event_jCancelbtnActionPerformed

    private void jSignbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jSignbtnActionPerformed
        if(jSetUtxt.getText().equals("") && jSetPtxt.getText().equals(jConfirmPtxt.getText()))
        {
            JOptionPane.showMessageDialog(null, "Username field is empty", "Signup Error", JOptionPane.ERROR_MESSAGE);
            jSetPtxt.setText(null);
            jConfirmPtxt.setText(null);
        }
        else if(jSetPtxt.getText().equals(jConfirmPtxt.getText()))
        {
            Login nf1=new Login();
            Login.jtxtU.setText(this.jSetUtxt.getText());
            Login.jtxtP.setText(this.jConfirmPtxt.getText());
            nf1.setVisible(true);
            nf1.pack();
            nf1.setLocationRelativeTo(null);
            nf1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            this.dispose();
        }
        else if(!jSetPtxt.getText().equals(jConfirmPtxt.getText()))
        {
            JOptionPane.showMessageDialog(null, "Passwords didn't match", "Signup Error", JOptionPane.ERROR_MESSAGE);
            jSetUtxt.setText(null);
            jSetPtxt.setText(null);
            jConfirmPtxt.setText(null);

        }

    }//GEN-LAST:event_jSignbtnActionPerformed

    private void jSresetbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jSresetbtnActionPerformed
            jSetUtxt.setText(null);
            jSetPtxt.setText(null);
            jConfirmPtxt.setText(null);
    }//GEN-LAST:event_jSresetbtnActionPerformed

    private void jSignbtnComponentAdded(java.awt.event.ContainerEvent evt) {//GEN-FIRST:event_jSignbtnComponentAdded
        // TODO add your handling code here:
    }//GEN-LAST:event_jSignbtnComponentAdded

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(SignUp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SignUp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SignUp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SignUp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SignUp().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jCancelbtn;
    private javax.swing.JPasswordField jConfirmPtxt;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPasswordField jSetPtxt;
    private javax.swing.JTextField jSetUtxt;
    public javax.swing.JButton jSignbtn;
    private javax.swing.JButton jSresetbtn;
    private javax.swing.JLabel jlblConfirm;
    private javax.swing.JLabel jlblSetP;
    private javax.swing.JLabel jlblSetU;
    // End of variables declaration//GEN-END:variables
private void systemExit1()
{
    WindowEvent w=new WindowEvent(this,WindowEvent.WINDOW_CLOSING);
}
}

