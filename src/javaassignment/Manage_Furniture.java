/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package javaassignment;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javaassignment.Sales_Orders;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Joshua
 */
public class Manage_Furniture extends javax.swing.JFrame {

    File f = new File("furniture.txt");
    String oldString, newString;
    Salesperson obj1 = new Salesperson();
    
    /**
     * Creates new form Manage_SalesOrder
     */
    public Manage_Furniture() {
        initComponents(); 
        try {
            FileReader fr = new FileReader(f);
            BufferedReader br = new BufferedReader(fr);
            DefaultTableModel model = (DefaultTableModel)Table_Orders.getModel();
            Object[] tableLines = br.lines().toArray();
            
            for(int i = 0; i < tableLines.length; i++){
                String line = tableLines[i].toString().trim();
                String[] dataRow = line.split(",");
                model.addRow(dataRow);
            }
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Manage_Furniture.class.getName()).log(Level.SEVERE, null, ex);
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

        buttonGroup1 = new javax.swing.ButtonGroup();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        tfidNumber = new javax.swing.JTextField();
        tfFurnitureName = new javax.swing.JTextField();
        cbCategory = new javax.swing.JComboBox<>();
        tfPrice = new javax.swing.JTextField();
        tfShortDescription = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        Table_Orders = new javax.swing.JTable();
        btnEdit = new javax.swing.JButton();
        btnDelete = new javax.swing.JButton();
        btnAdd = new javax.swing.JButton();
        rbYes = new javax.swing.JRadioButton();
        rbNo = new javax.swing.JRadioButton();
        tfDesigner = new javax.swing.JTextField();
        btnBack = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel2.setText("ID Number:");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel3.setText("Furniture Name:");

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel4.setText("Category:");

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel5.setText("Price:");

        jLabel6.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel6.setText("Other Colors:");

        jLabel7.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel7.setText("Designer:");

        jLabel8.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel8.setText("Short Description:");

        tfidNumber.setEnabled(false);
        tfidNumber.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfidNumberActionPerformed(evt);
            }
        });

        cbCategory.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Sofas", "Beds", "Tables", "Chairs" }));

        tfPrice.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfPriceActionPerformed(evt);
            }
        });

        Table_Orders.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID Number", "Furniture Name", "Category", "Price(RM)", "Other Colors", "Designer", "Short Description"
            }
        ));
        Table_Orders.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Table_OrdersMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(Table_Orders);

        btnEdit.setText("Edit");
        btnEdit.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        btnEdit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditActionPerformed(evt);
            }
        });

        btnDelete.setText("Delete");
        btnDelete.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });

        btnAdd.setText("Add");
        btnAdd.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        btnAdd.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnAddMouseClicked(evt);
            }
        });
        btnAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddActionPerformed(evt);
            }
        });

        buttonGroup1.add(rbYes);
        rbYes.setText("Yes");
        rbYes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbYesActionPerformed(evt);
            }
        });

        buttonGroup1.add(rbNo);
        rbNo.setText("No");
        rbNo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbNoActionPerformed(evt);
            }
        });

        tfDesigner.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfDesignerActionPerformed(evt);
            }
        });

        btnBack.setText("Return back to menu");
        btnBack.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(153, 153, 153));
        jPanel1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Manage Furniture");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel1)
                .addContainerGap(22, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel8, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel3)
                                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGap(14, 14, 14))))
                .addGap(160, 160, 160)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnEdit, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(67, 67, 67)
                        .addComponent(btnDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(tfidNumber)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(rbYes, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 222, Short.MAX_VALUE)
                        .addComponent(rbNo, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(49, 49, 49))
                    .addComponent(cbCategory, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(tfPrice)
                    .addComponent(tfShortDescription)
                    .addComponent(tfFurnitureName)
                    .addComponent(tfDesigner))
                .addGap(141, 141, 141))
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 921, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(388, 388, 388)
                        .addComponent(btnBack, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 359, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(tfidNumber, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(19, 19, 19)
                        .addComponent(tfFurnitureName, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(19, 19, 19)
                        .addComponent(cbCategory, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(19, 19, 19)
                        .addComponent(tfPrice, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(19, 19, 19)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(rbYes)
                            .addComponent(rbNo))
                        .addGap(25, 25, 25)
                        .addComponent(tfDesigner, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(tfShortDescription, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(9, 9, 9)
                        .addComponent(jLabel2)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel3)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel4)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel5)
                        .addGap(21, 21, 21)
                        .addComponent(jLabel6)
                        .addGap(15, 15, 15)
                        .addComponent(jLabel7)
                        .addGap(23, 23, 23)
                        .addComponent(jLabel8)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE, false)
                        .addComponent(btnAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(btnEdit, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(btnBack, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(30, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnEditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditActionPerformed
         DefaultTableModel table = (DefaultTableModel) Table_Orders.getModel();
        if (Table_Orders.getSelectedRowCount() == 1){
            String furnitureName, category, designer, shortDescription, otherColors = null, availability;
            double price;
            int idNumber;
            
            idNumber = Integer.parseInt(tfidNumber.getText());
            furnitureName = tfFurnitureName.getText();
            category = cbCategory.getSelectedItem().toString();
            designer = tfDesigner.getText();
            price = Double.parseDouble(tfPrice.getText());
            shortDescription = tfShortDescription.getText();
            if (rbYes.isSelected())
                otherColors = "Yes";
            else if (rbNo.isSelected())
                otherColors = "No";
            
            //Update the text file
            newString = (idNumber+","+furnitureName+","+category+","+price+","+otherColors+","+designer+","+shortDescription);
            Sales_Orders admin = new Sales_Orders();
            admin.editOrders(oldString, newString);
            
            //Update the table
            table.setValueAt(idNumber,Table_Orders.getSelectedRow(),0);
            table.setValueAt(furnitureName, Table_Orders.getSelectedRow(),1);
            table.setValueAt(category, Table_Orders.getSelectedRow(),2);
            table.setValueAt(price, Table_Orders.getSelectedRow(),3);
            table.setValueAt(otherColors, Table_Orders.getSelectedRow(),4);
            table.setValueAt(designer, Table_Orders.getSelectedRow(),5);
            table.setValueAt(shortDescription, Table_Orders.getSelectedRow(),6);
            
            JOptionPane.showMessageDialog(rootPane,"Update Successful!", "Success!", JOptionPane.INFORMATION_MESSAGE);
        }
        else
            JOptionPane.showMessageDialog(rootPane, "Please select a row from the table...", "Error!", JOptionPane.ERROR_MESSAGE);
    }//GEN-LAST:event_btnEditActionPerformed

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        DefaultTableModel table = (DefaultTableModel) Table_Orders.getModel();
        
        //delete row
        if (Table_Orders.getSelectedRowCount()==1){
            //if single row selected then delete
            table.removeRow(Table_Orders.getSelectedRow());
        }else{
            if(Table_Orders.getRowCount ()==0) {
                //table is empty then display message
                JOptionPane.showMessageDialog(this, "Table is empty");
            }else{
                // if table is not empty but row isn't selected or multiple row are selected
                JOptionPane.showMessageDialog(this, "Please Select Row to Delete");
            }
        }
    }//GEN-LAST:event_btnDeleteActionPerformed

    private void btnAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddActionPerformed
        String furnitureName, category, designer, shortDescription, otherColors = null, availability;
        double price;
        int idNumber = 0;
        
        try {
            idNumber = obj1.getNewID("furniture.txt");
        } catch (IOException ex) {
            Logger.getLogger(Manage_Furniture.class.getName()).log(Level.SEVERE, null, ex);
        }
        furnitureName = tfFurnitureName.getText();
        category = cbCategory.getSelectedItem().toString();
        designer = tfDesigner.getText();
        price = Double.parseDouble(tfPrice.getText());
        shortDescription = tfShortDescription.getText();
        if (rbYes.isSelected())
            otherColors = "Yes";
        else if (rbNo.isSelected())
            otherColors = "No";
        
        Sales_Orders ac = new Sales_Orders();
        ac.addOrders(idNumber,furnitureName,category,price,otherColors,designer,shortDescription);
        DefaultTableModel model_add = (DefaultTableModel) Table_Orders.getModel();
        model_add.addRow(new Object[]{idNumber,furnitureName,category,price,otherColors,designer,shortDescription,"Pending"});
        JOptionPane.showMessageDialog(rootPane, "The order has been added!", "Success!", JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_btnAddActionPerformed

    private void tfPriceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfPriceActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfPriceActionPerformed

    private void btnAddMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAddMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_btnAddMouseClicked

    private void Table_OrdersMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Table_OrdersMouseClicked
        DefaultTableModel model = (DefaultTableModel) Table_Orders.getModel();
        
        String tbidNumber = model.getValueAt(Table_Orders.getSelectedRow(), 0).toString();
        String tbFurnitureName = model.getValueAt(Table_Orders.getSelectedRow(), 1).toString();
        String tbCategory = model.getValueAt(Table_Orders.getSelectedRow(), 2).toString();
        String tbPrice = model.getValueAt(Table_Orders.getSelectedRow(),3).toString();
        String tbOtherColors = model.getValueAt(Table_Orders.getSelectedRow(), 4).toString();
        String tbDesigner = model.getValueAt(Table_Orders.getSelectedRow(),5).toString();
        String tbShortDescription = model.getValueAt(Table_Orders.getSelectedRow(),6).toString();
        
        
        tfidNumber.setText(tbidNumber);
        tfFurnitureName.setText(tbFurnitureName);
        cbCategory.setSelectedItem(tbCategory);
        tfPrice.setText(tbPrice);
        tfDesigner.setText(tbDesigner);
        tfShortDescription.setText(tbShortDescription);
        if ("Yes".equals(tbOtherColors))
            rbYes.setSelected(true);
        else if ("No".equals(tbOtherColors))
            rbNo.setSelected(true);
         
        oldString = (tbidNumber+","+tbFurnitureName+","+tbCategory+","+tbPrice+","+tbDesigner+","+tbShortDescription+","+tbOtherColors);
    }//GEN-LAST:event_Table_OrdersMouseClicked

    private void rbYesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbYesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rbYesActionPerformed

    private void rbNoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbNoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rbNoActionPerformed

    private void tfDesignerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfDesignerActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfDesignerActionPerformed

    private void tfidNumberActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfidNumberActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfidNumberActionPerformed

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        // TODO add your handling code here:
        SalespersonHome a = new SalespersonHome();
        a.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnBackActionPerformed

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
            java.util.logging.Logger.getLogger(Manage_Furniture.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Manage_Furniture.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Manage_Furniture.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Manage_Furniture.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Manage_Furniture().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable Table_Orders;
    private javax.swing.JButton btnAdd;
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnEdit;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JComboBox<String> cbCategory;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JRadioButton rbNo;
    private javax.swing.JRadioButton rbYes;
    private javax.swing.JTextField tfDesigner;
    private javax.swing.JTextField tfFurnitureName;
    private javax.swing.JTextField tfPrice;
    private javax.swing.JTextField tfShortDescription;
    private javax.swing.JTextField tfidNumber;
    // End of variables declaration//GEN-END:variables
}
