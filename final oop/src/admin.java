
import java.awt.Color;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class admin extends javax.swing.JFrame {

    public admin() {

        initComponents();
        readFile();
    }

    public void readFile() {
        File file = new File("Liste.dat");

        try {
            FileReader fr = new FileReader(file);
            BufferedReader br = new BufferedReader(fr);

            DefaultTableModel model = (DefaultTableModel) jTable4.getModel();
            Object[] line = br.lines().toArray();
            for (int i = 0; i < line.length; i++) {
                Object[] row = line[i].toString().split(" ");
                model.addRow(row);
            }
        } catch (FileNotFoundException ex) {
            java.util.logging.Logger.getLogger(admin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenu3 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem4 = new javax.swing.JMenuItem();
        jMenuItem5 = new javax.swing.JMenuItem();
        jMenuItem6 = new javax.swing.JMenuItem();
        jCheckBoxMenuItem1 = new javax.swing.JCheckBoxMenuItem();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        jScrollPane4 = new javax.swing.JScrollPane();
        jTable4 = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        tfLabor = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        tfPieces = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        tfDolar = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        tfID = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        tfRatio = new javax.swing.JTextField();
        bUpdate = new javax.swing.JButton();
        bDelete = new javax.swing.JButton();
        bAdd = new javax.swing.JButton();
        tfGram = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem9 = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenuItem3 = new javax.swing.JMenuItem();

        jMenu3.setText("jMenu3");

        jMenuItem1.setText("jMenuItem1");

        jMenuItem4.setText("jMenuItem4");

        jMenuItem5.setText("jMenuItem5");

        jMenuItem6.setText("jMenuItem6");

        jCheckBoxMenuItem1.setSelected(true);
        jCheckBoxMenuItem1.setText("jCheckBoxMenuItem1");

        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane2.setViewportView(jTable2);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setAutoRequestFocus(false);
        setBackground(new java.awt.Color(255, 255, 255));
        setUndecorated(true);
        setResizable(false);

        jTable4.setAutoCreateRowSorter(true);
        jTable4.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(0, 51, 204)));
        jTable4.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Item Code", "Labor Cost", "Pieces", "Raw Material Cost", "Total"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable4.setSelectionForeground(new java.awt.Color(153, 0, 0));
        jTable4.getTableHeader().setReorderingAllowed(false);
        jTable4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable4MouseClicked(evt);
            }
        });
        jScrollPane4.setViewportView(jTable4);
        if (jTable4.getColumnModel().getColumnCount() > 0) {
            jTable4.getColumnModel().getColumn(0).setResizable(false);
            jTable4.getColumnModel().getColumn(1).setResizable(false);
            jTable4.getColumnModel().getColumn(2).setResizable(false);
            jTable4.getColumnModel().getColumn(3).setResizable(false);
            jTable4.getColumnModel().getColumn(4).setResizable(false);
        }

        jPanel1.setBackground(new java.awt.Color(204, 204, 204));

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
            .addGap(0, 426, Short.MAX_VALUE)
        );

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

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        jLabel1.setText("Labor Costs :");

        tfLabor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfLaborActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        jLabel2.setText("Pieces :");

        tfPieces.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfPiecesActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        jLabel5.setText("Raw Material Cost :");

        tfDolar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfDolarActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        jLabel4.setText("Item Code :");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        jLabel3.setText("Dolar/TL :");

        tfRatio.setForeground(new java.awt.Color(204, 204, 204));
        tfRatio.setText("Ton/Dolar"); // NOI18N
        tfRatio.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tfRatioMouseClicked(evt);
            }
        });
        tfRatio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfRatioActionPerformed(evt);
            }
        });

        bUpdate.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        bUpdate.setText("Update");
        bUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bUpdateActionPerformed(evt);
            }
        });

        bDelete.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        bDelete.setText("Delete");
        bDelete.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bDeleteMouseClicked(evt);
            }
        });

        bAdd.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        bAdd.setText("Add");
        bAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bAddActionPerformed(evt);
            }
        });

        tfGram.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfGramActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        jLabel6.setText("Gram :");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGap(79, 79, 79)
                            .addComponent(jLabel4)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(tfID, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                            .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                    .addComponent(jLabel5)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(tfRatio, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(jLabel2)
                                        .addComponent(jLabel1))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(tfPieces, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(tfLabor, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(jLabel3)
                                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(tfGram)
                                        .addComponent(tfDolar, javax.swing.GroupLayout.DEFAULT_SIZE, 106, Short.MAX_VALUE))))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(38, 38, 38)
                        .addComponent(bUpdate)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(bAdd)
                        .addGap(18, 18, 18)
                        .addComponent(bDelete)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 43, Short.MAX_VALUE)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 8, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(16, 16, 16))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tfID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addGap(25, 25, 25)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tfLabor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addGap(23, 23, 23)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tfPieces, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tfRatio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tfGram, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addGap(9, 9, 9)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tfDolar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addGap(51, 51, 51)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bUpdate)
                    .addComponent(bAdd)
                    .addComponent(bDelete))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 426, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 426, Short.MAX_VALUE)))
        );

        jMenu1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/png/folder.png"))); // NOI18N
        jMenu1.setText("File");
        jMenu1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N

        jMenuItem9.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jMenuItem9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/png/exit.png"))); // NOI18N
        jMenuItem9.setText("Exit");
        jMenuItem9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem9ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem9);

        jMenuBar1.add(jMenu1);

        jMenu2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/png/User_icon_2.svg.png"))); // NOI18N
        jMenu2.setText("User");
        jMenu2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N

        jMenuItem2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jMenuItem2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/png/addemployee.png"))); // NOI18N
        jMenuItem2.setText("Add User");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem2);

        jMenuItem3.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jMenuItem3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/png/edit.png"))); // NOI18N
        jMenuItem3.setText("Edit User");
        jMenuItem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem3ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem3);

        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 652, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(118, 118, 118))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
        );

        setSize(new java.awt.Dimension(1011, 457));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuItem9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem9ActionPerformed
        System.exit(0);
    }//GEN-LAST:event_jMenuItem9ActionPerformed

    private void tfLaborActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfLaborActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfLaborActionPerformed

    private void tfPiecesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfPiecesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfPiecesActionPerformed

    private static final java.util.logging.Logger LOG = java.util.logging.Logger.getLogger(admin.class.getName());

    private void tfDolarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfDolarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfDolarActionPerformed

    private void jTable4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable4MouseClicked
        DefaultTableModel tblModel = (DefaultTableModel) jTable4.getModel();
        
        String ID = tblModel.getValueAt(jTable4.getSelectedRow(), 0).toString();
        String Labor = tblModel.getValueAt(jTable4.getSelectedRow(), 1).toString();
        String Pieces = tblModel.getValueAt(jTable4.getSelectedRow(), 2).toString();
        String Ratio = tblModel.getValueAt(jTable4.getSelectedRow(), 3).toString();

        tfID.setText(ID);
        tfLabor.setText(Labor);
        tfPieces.setText(Pieces);
        tfRatio.setText(Ratio);
        
        
        
    }//GEN-LAST:event_jTable4MouseClicked

    private void bAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bAddActionPerformed
        if (tfID.getText().equals("") || tfLabor.getText().equals("") || tfPieces.getText().equals("") || tfRatio.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Please enter all data!");
        } else {
            double Total = Integer.parseInt(tfLabor.getText()) + Integer.parseInt(tfPieces.getText()) + Integer.parseInt(tfRatio.getText());
            double rawTotal =Integer.parseInt(tfRatio.getText())*(Double.parseDouble(tfDolar.getText())/1000000)*Integer.parseInt(tfGram.getText());
            String newTotal = Double.toString(Total);
            String newRawTotal =Double.toString(rawTotal);
            String list[] = {tfID.getText(), tfLabor.getText(), tfPieces.getText(), newRawTotal, newTotal};
            DefaultTableModel tblModel = (DefaultTableModel) jTable4.getModel();

            tblModel.addRow(list);
            tfID.setText("");
            tfLabor.setText("");
            tfPieces.setText("");
            tfRatio.setText("");

        }
        JOptionPane.showMessageDialog(null, "Data Added  Completely");
        int yn = JOptionPane.showConfirmDialog(null, "DO You Want to Save", "Choose Your Option", JOptionPane.YES_NO_OPTION);
        if (yn == JOptionPane.NO_OPTION) {

        } else {
            try {
                File file = new File("Liste.dat");
                if (!file.exists()) {
                    file.createNewFile();
                }
                FileWriter fw = new FileWriter(file.getAbsoluteFile());
                BufferedWriter bw = new BufferedWriter(fw);
                for (int i = 0; i < jTable4.getRowCount(); i++) {
                    for (int j = 0; j < jTable4.getColumnCount(); j++) {
                        bw.write(jTable4.getModel().getValueAt(i, j).toString() + " ");
                    }
                    bw.write("\n");
                }
                bw.close();
                fw.close();
                JOptionPane.showMessageDialog(null, "Data Saved Completely");
            } catch (Exception e) {
                e.printStackTrace();
            }

        }
    }//GEN-LAST:event_bAddActionPerformed

    private void bUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bUpdateActionPerformed
        if (jTable4.getSelectedRow() < 0 || jTable4.getSelectedRow() > 3) {
            JOptionPane.showMessageDialog(null, "Please Select Row");
        } else {
            DefaultTableModel tblModel = (DefaultTableModel) jTable4.getModel();

            String ID = tfID.getText();
            String Labor = tfLabor.getText();
            String Pieces = tfPieces.getText();
            String Ratio = tfRatio.getText();

            tblModel.setValueAt(ID, jTable4.getSelectedRow(), 0);
            tblModel.setValueAt(Labor, jTable4.getSelectedRow(), 1);
            tblModel.setValueAt(Pieces, jTable4.getSelectedRow(), 2);
            tblModel.setValueAt(Ratio, jTable4.getSelectedRow(), 3);
            

        }
    }//GEN-LAST:event_bUpdateActionPerformed

    private void bDeleteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bDeleteMouseClicked
        if (jTable4.getSelectedRow() < 0 || jTable4.getSelectedRow() > 3) {
            JOptionPane.showMessageDialog(null, "Please Select Row");
        } else {
            DefaultTableModel tblModel = (DefaultTableModel) jTable4.getModel();

            tblModel.removeRow(jTable4.getSelectedRow());
            tfID.setText("");
            tfLabor.setText("");
            tfPieces.setText("");
            tfRatio.setText("");
        
        JOptionPane.showMessageDialog(null, "Data Deleted Completely");
        int yn = JOptionPane.showConfirmDialog(null, "DO You Want to Save", "Choose Your Option", JOptionPane.YES_NO_OPTION);
        if (yn == JOptionPane.NO_OPTION) {

        } else {
            try {
                File file = new File("Liste.dat");
                if (!file.exists()) {
                    file.createNewFile();
                }
                FileWriter fw = new FileWriter(file.getAbsoluteFile());
                BufferedWriter bw = new BufferedWriter(fw);
                for (int i = 0; i < jTable4.getRowCount(); i++) {
                    for (int j = 0; j < jTable4.getColumnCount(); j++) {
                        bw.write(jTable4.getModel().getValueAt(i, j).toString() + " ");
                    }
                    bw.write("\n");
                }
                bw.close();
                fw.close();
                JOptionPane.showMessageDialog(null, "Data Deleted & Saved Completely");
            } catch (Exception e) {
                e.printStackTrace();
            }

        }
    }
        
    }//GEN-LAST:event_bDeleteMouseClicked

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        new user().setVisible(true);
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void tfRatioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfRatioActionPerformed
        
    }//GEN-LAST:event_tfRatioActionPerformed

    private void tfRatioMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tfRatioMouseClicked
        tfRatio.setText("");
        tfRatio.setForeground(Color.black);
    }//GEN-LAST:event_tfRatioMouseClicked

    private void tfGramActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfGramActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfGramActionPerformed

    private void jMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem3ActionPerformed
        new editUser().setVisible(true);
    }//GEN-LAST:event_jMenuItem3ActionPerformed

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
            java.util.logging.Logger.getLogger(admin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(admin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(admin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(admin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new admin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bAdd;
    private javax.swing.JButton bDelete;
    private javax.swing.JButton bUpdate;
    private javax.swing.JCheckBoxMenuItem jCheckBoxMenuItem1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JMenuItem jMenuItem5;
    private javax.swing.JMenuItem jMenuItem6;
    private javax.swing.JMenuItem jMenuItem9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JTable jTable2;
    private javax.swing.JTable jTable4;
    private javax.swing.JTextField tfDolar;
    private javax.swing.JTextField tfGram;
    private javax.swing.JTextField tfID;
    private javax.swing.JTextField tfLabor;
    private javax.swing.JTextField tfPieces;
    private javax.swing.JTextField tfRatio;
    // End of variables declaration//GEN-END:variables
}
