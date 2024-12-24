
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;
import javax.swing.JOptionPane;
public class enter extends javax.swing.JFrame {
    ArrayList<Users> users;
    ArrayList<Admins> admins;

    public enter() {
        initComponents();
        users = new ArrayList<Users>();
        admins = new ArrayList<Admins>();
        populateArrayList();
        String[] UserArray = new String[users.size()];
        for (int i = 0; i < users.size(); i++) {
            UserArray[i] = users.get(i).getUserName() /*+ users.get(i).getPassword()*/;
        }
        String[] AdminArray = new String[admins.size()];
        for (int i = 0; i < admins.size(); i++) {
            AdminArray[i] = admins.get(i).getAdminName()/*+ admins.get(i).getAdminPass()*/;
        }

    }

    public void populateArrayList() {
        try {
            FileInputStream file = new FileInputStream("Users.dat");
            ObjectInputStream inputFile = new ObjectInputStream(file);

            boolean endOfFile = false;
            while (!endOfFile) {
                try {
                    users.add((Users) inputFile.readObject());
                } catch (EOFException e) {
                    endOfFile = true;
                } catch (Exception f) {
                    JOptionPane.showMessageDialog(null,
                            f.getMessage());
                }
            }
            inputFile.close();
        } catch (IOException e) {
            JOptionPane.showMessageDialog(null,
                    e.getMessage());
        }
        try {
            FileInputStream file = new FileInputStream("Admin.dat");
            ObjectInputStream inputFile = new ObjectInputStream(file);

            boolean endOfFile = false;
            while (!endOfFile) {
                try {
                    admins.add((Admins) inputFile.readObject());
                } catch (EOFException e) {
                    endOfFile = true;
                } catch (Exception f) {
                    JOptionPane.showMessageDialog(null, f.getMessage());
                }
            }
            inputFile.close();
        } catch (IOException e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        tfName = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        cbKind = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        tfPass = new javax.swing.JPasswordField();
        cbViewPass = new javax.swing.JCheckBox();
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setBackground(new java.awt.Color(242, 119, 107));
        setUndecorated(true);
        setResizable(false);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 17)); // NOI18N
        jLabel1.setText("Please Enter User Name & Password");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/png/user.png"))); // NOI18N
        jLabel2.setText(" User Name :");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/png/key.png"))); // NOI18N
        jLabel3.setText("   Password :");

        jButton1.setText("OK");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        cbKind.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "User", "Admin" }));
        cbKind.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbKindActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/png/ellipse (2).png"))); // NOI18N
        jLabel4.setText("Admin or User :");

        tfPass.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfPassActionPerformed(evt);
            }
        });

        cbViewPass.setText("View Password");
        cbViewPass.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbViewPassActionPerformed(evt);
            }
        });

        jPanel2.setBackground(new java.awt.Color(51, 0, 153));
        jPanel2.setPreferredSize(new java.awt.Dimension(10, 0));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 8, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        jPanel3.setBackground(new java.awt.Color(153, 153, 255));
        jPanel3.setPreferredSize(new java.awt.Dimension(7, 0));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 7, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        jPanel4.setBackground(new java.awt.Color(51, 0, 153));
        jPanel4.setPreferredSize(new java.awt.Dimension(10, 0));

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 8, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        jPanel5.setBackground(new java.awt.Color(153, 153, 255));
        jPanel5.setPreferredSize(new java.awt.Dimension(7, 0));

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 7, Short.MAX_VALUE)
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        jLabel5.setBackground(new java.awt.Color(255, 51, 51));
        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(204, 0, 0));
        jLabel5.setText(" X");
        jLabel5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 0, 153), 4));
        jLabel5.setMaximumSize(new java.awt.Dimension(20, 20));
        jLabel5.setMinimumSize(new java.awt.Dimension(20, 20));
        jLabel5.setPreferredSize(new java.awt.Dimension(37, 37));
        jLabel5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel5MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, 8, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(57, 57, 57)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jButton1)
                            .addComponent(jLabel4)
                            .addComponent(jLabel3)
                            .addComponent(jLabel2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(tfName, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(tfPass, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(cbKind, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(cbViewPass, javax.swing.GroupLayout.Alignment.TRAILING)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(77, 77, 77)
                        .addComponent(jLabel1)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 70, Short.MAX_VALUE)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 8, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 34, Short.MAX_VALUE)
                    .addComponent(tfName, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(tfPass, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbKind, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cbViewPass)
                    .addComponent(jButton1))
                .addGap(47, 47, 47))
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 299, Short.MAX_VALUE)
            .addComponent(jPanel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 299, Short.MAX_VALUE)
            .addComponent(jPanel4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 299, Short.MAX_VALUE)
            .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, 299, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        setSize(new java.awt.Dimension(565, 294));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

        if (this.tfName.getText().isEmpty() || this.tfPass.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Please enter all details");
        } else {
            String Name = this.tfName.getText().trim();
            String Password = this.tfPass.getText().trim();
            int Selected = this.cbKind.getSelectedIndex();
            welcomeUser u = new welcomeUser(Name, Password);
            welcomeAdmin a = new welcomeAdmin(Name, Password);
            String[] UserArray = new String[users.size()];
            String[] AdminArray = new String[admins.size()];

            for (int i = 0; i < UserArray.length; i++) {
                String trueName = users.get(i).getUserName();

                if (trueName.equals(Name)) {
                    for (int j = 0; j < UserArray.length; j++) {
                        String truePass = users.get(j).getPassword();
                        if (i == j && truePass.equals(Password) && Selected == 0) {
                            new userPanel().setVisible(true);
                            u.setUserName(Name);
                            u.getDetails();
                            dispose();
                        }
                    }
                } 
            }
            for (int k = 0; k < AdminArray.length; k++) {
                String trueAdminName = admins.get(k).getAdminName();

                if (trueAdminName.equals(Name)) {
                    for (int l = 0; l < AdminArray.length; l++) {
                        String trueAdminPass = admins.get(l).getAdminPass();
                        if (l == k && trueAdminPass.equals(Password) && Selected == 1) {
                            new admin().setVisible(true);
                            a.setAdminName(Name);
                            a.getDetails();
                            dispose();
                            break;

                        } else if (l == k && trueAdminPass.equals(Password) && Selected == 0) {
                            new userPanel().setVisible(true);
                            a.setAdminName(Name);
                            a.getDetailsUser();
                            dispose();
                            break;
                        }
                    }
                } 
            }
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void cbViewPassActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbViewPassActionPerformed
        if (cbViewPass.isSelected()) {
            tfPass.setEchoChar((char) 0);
        } else {
            tfPass.setEchoChar('*');
        }
    }//GEN-LAST:event_cbViewPassActionPerformed

    private void tfPassActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfPassActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfPassActionPerformed

    private void cbKindActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbKindActionPerformed

    }//GEN-LAST:event_cbKindActionPerformed

    private void jLabel5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel5MouseClicked
        System.exit(0);

    }//GEN-LAST:event_jLabel5MouseClicked

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
            java.util.logging.Logger.getLogger(enter.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(enter.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(enter.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(enter.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new enter().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> cbKind;
    private javax.swing.JCheckBox cbViewPass;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JTextField tfName;
    private javax.swing.JPasswordField tfPass;
    // End of variables declaration//GEN-END:variables
}
