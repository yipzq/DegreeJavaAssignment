/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package javaassignment;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author mcsee
 */
public class SearchModiSO extends javax.swing.JFrame {

    DefaultTableModel model;
    Officer saleso = new Officer();
    ArrayList<String[]> detailsList = new ArrayList<>();
    DataValidation valid = new DataValidation();
    int results, orderID, quantity;
    String [] sales;
    String itemID;
    double price, total;
    
    public SearchModiSO() {
        initComponents();
        model = (DefaultTableModel) jTable.getModel();
        displayASO();
        saleso.readFurFile();
        saleso.readASOFile2();
    }
    
    private void displayASO(){
        model.setRowCount(0);
        saleso.readASOFile2();
        detailsList = saleso.getApprovedSOList();
        for (String[] details : detailsList){
            if (details.length == 8){              
                    model.insertRow(model.getRowCount(), new Object[]{details[0],details[1],details[2],details[3],details[4],details[5],details[6],details[7]});
            }
        }
    }
    
    
    
    public void viewAll() {
        model.setRowCount(0);
        
        for (String[] details : detailsList) {
            if (details.length == 8) {
                model.insertRow(model.getRowCount(), new Object[]{details[0], details[1], details[2], details[3], details[4], details[5], details[6], details[7]});
            }
        }
    }
    
    /*
    public void calPrice(String itemID){
        for (var details : detailsList){
            if (itemID.equals(details[0])){
                price = Integer.parseInt(details[3]);
                break;              
            }
        }
        total = price * quantity;
    }
    */
    
    public void search(int orderID) {
        boolean found = false;
        model.setRowCount(0);
        results = 0;

        for (String[] s : detailsList) {
            // Assuming orderID is stored as an integer in the details array
            if (Integer.parseInt(s[0]) == orderID) {
                sales = s;
                model.insertRow(model.getRowCount(), new Object[]{sales[0],sales[1],sales[2],sales[3],sales[4],sales[5],sales[6],sales[7]});
                found = true;
                results++;
                break;
            }
        }

        if (!found) {
            JOptionPane.showMessageDialog(null, "Order ID not found.", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable = new javax.swing.JTable();
        txtSearchBar = new javax.swing.JTextField();
        btnSearch = new javax.swing.JButton();
        btnViewAll = new javax.swing.JButton();
        txtQuantity = new javax.swing.JTextField();
        txtcoName = new javax.swing.JTextField();
        btnEditRow = new javax.swing.JButton();
        btnBack = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        cmbStatus = new javax.swing.JComboBox<>();
        btnClearForm = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null}
            },
            new String [] {
                "OrderID", "Date and Time", "ItemID", "Quantity", "Total Price", "Customer/Organization name", "Staff ID", "Status"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable);

        txtSearchBar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSearchBarActionPerformed(evt);
            }
        });

        btnSearch.setText("Search");
        btnSearch.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        btnSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearchActionPerformed(evt);
            }
        });

        btnViewAll.setText("View All ");
        btnViewAll.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        btnViewAll.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnViewAllActionPerformed(evt);
            }
        });

        txtQuantity.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtQuantityActionPerformed(evt);
            }
        });

        txtcoName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtcoNameActionPerformed(evt);
            }
        });

        btnEditRow.setText("Edit Row");
        btnEditRow.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        btnEditRow.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditRowActionPerformed(evt);
            }
        });

        btnBack.setText("Return to officer menu");
        btnBack.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        jLabel2.setText("Quantity :");

        jLabel4.setText("Customer / Organization name : ");

        jLabel5.setText("Status :");

        cmbStatus.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "None", "In Progress ", "Work Done" }));

        btnClearForm.setText("Clear Form");
        btnClearForm.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        btnClearForm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClearFormActionPerformed(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(153, 153, 153));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Approved Sale Order ");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(14, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(txtSearchBar, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btnSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btnViewAll, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 703, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5))
                        .addGap(36, 36, 36)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtQuantity)
                            .addComponent(txtcoName)
                            .addComponent(cmbStatus, 0, 133, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnClearForm, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(31, Short.MAX_VALUE))
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(288, 288, 288)
                        .addComponent(btnBack, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(323, 323, 323)
                        .addComponent(btnEditRow, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(39, 39, 39)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtSearchBar, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnViewAll, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtQuantity, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2)
                    .addComponent(btnClearForm, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(txtcoName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cmbStatus, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5))))
                .addGap(41, 41, 41)
                .addComponent(btnEditRow, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnBack, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(13, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnViewAllActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnViewAllActionPerformed
       viewAll();
    }//GEN-LAST:event_btnViewAllActionPerformed

    private void txtSearchBarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSearchBarActionPerformed

    }//GEN-LAST:event_txtSearchBarActionPerformed

    
    private void btnSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearchActionPerformed
    int orderID;
        try {
            orderID = Integer.parseInt(txtSearchBar.getText());
            search(orderID);
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Please enter a valid order ID.", "Error", JOptionPane.ERROR_MESSAGE);
        }

    }//GEN-LAST:event_btnSearchActionPerformed

    private void txtQuantityActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtQuantityActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtQuantityActionPerformed

    private void txtcoNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtcoNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtcoNameActionPerformed

    private void btnEditRowActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditRowActionPerformed
      if (jTable.getSelectedRowCount() < 1) {
            JOptionPane.showMessageDialog(null, "No row selected.", "Error", JOptionPane.ERROR_MESSAGE);
        } else if (jTable.getSelectedRowCount() > 1) {
            JOptionPane.showMessageDialog(null, "More than one row selected.", "Error", JOptionPane.ERROR_MESSAGE);
        } else {
            String quantity, coName, status;
            quantity = txtQuantity.getText();
            coName = txtcoName.getText();
            status = String.valueOf(cmbStatus.getSelectedItem());

            // Combined validation for quantity
            if (!valid.containsOnlyNumbers(quantity)) {
                JOptionPane.showMessageDialog(null, "Quantity can only contain only numbers.", "Error", JOptionPane.ERROR_MESSAGE);
            } else {
                // Proceed if both validations pass
                saleso.setOrderID(orderID);
                saleso.getOrderDetails();
                ArrayList<String[]> al = saleso.changeSODetails(quantity, coName, status, itemID);
                try {
                    saleso.overwriteFile("ApprovedSO.txt", al, 8);
                } catch (IOException ex) {
                    Logger.getLogger(SearchModiSO.class.getName()).log(Level.SEVERE, null, ex);
                }

                displayASO();
                JOptionPane.showMessageDialog(null, "Row edited successfully.", "Success", JOptionPane.INFORMATION_MESSAGE);
            }
        }
    }//GEN-LAST:event_btnEditRowActionPerformed

    private void jTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableMouseClicked
        orderID = Integer.parseInt(model.getValueAt(jTable.getSelectedRow(), 0).toString());
        saleso.setOrderID(orderID);
        
        String tbQuantity = model.getValueAt(jTable.getSelectedRow(), 3).toString();
        String tbCoName = model.getValueAt(jTable.getSelectedRow(), 5).toString();
        String tbStatus = model.getValueAt(jTable.getSelectedRow(),7).toString();
        itemID = model.getValueAt(jTable.getSelectedRow(),2).toString();

        txtQuantity.setText(tbQuantity);
        txtcoName.setText(tbCoName);
         if (tbStatus.equals("In Progress")){
            cmbStatus.setSelectedIndex(1);
        } else if (tbStatus.equals("Work Done")){
            cmbStatus.setSelectedIndex(2);
        }
        
       // calPrice(itemID);

    }//GEN-LAST:event_jTableMouseClicked

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed

        OfficerHome menu = new OfficerHome ();
        menu.show();  // display dashboard
        dispose();
    }//GEN-LAST:event_btnBackActionPerformed

    private void btnClearFormActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClearFormActionPerformed
        // TODO add your handling code here:
        txtQuantity.setText("");
        txtcoName.setText("");
        cmbStatus.setSelectedIndex(0);
    }//GEN-LAST:event_btnClearFormActionPerformed

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
            java.util.logging.Logger.getLogger(SearchModiSO.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SearchModiSO.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SearchModiSO.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SearchModiSO.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SearchModiSO().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnClearForm;
    private javax.swing.JButton btnEditRow;
    private javax.swing.JButton btnSearch;
    private javax.swing.JButton btnViewAll;
    private javax.swing.JComboBox<String> cmbStatus;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable;
    private javax.swing.JTextField txtQuantity;
    private javax.swing.JTextField txtSearchBar;
    private javax.swing.JTextField txtcoName;
    // End of variables declaration//GEN-END:variables

    
}
