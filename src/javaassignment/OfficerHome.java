/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package javaassignment;

/**
 *
 * @author mcsee
 */
public class OfficerHome extends javax.swing.JFrame {

    /**
     * Creates new form OfficerHome
     */
    public OfficerHome() {
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

        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        btnApprove = new javax.swing.JButton();
        btnsearchModi = new javax.swing.JButton();
        CheckSalesbtn = new javax.swing.JButton();
        invoicebtn = new javax.swing.JButton();
        approvedSalesReportbtn = new javax.swing.JButton();
        workDoneReportbtn = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        btnLogout = new javax.swing.JButton();
        invoicebtn1 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        jButton2.setText("jButton2");

        jButton3.setText("jButton3");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnApprove.setText("Approve / Reject sales order");
        btnApprove.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        btnApprove.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnApproveActionPerformed(evt);
            }
        });
        getContentPane().add(btnApprove, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 120, 191, 72));

        btnsearchModi.setText("Search and modify sales order ");
        btnsearchModi.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        btnsearchModi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnsearchModiActionPerformed(evt);
            }
        });
        getContentPane().add(btnsearchModi, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 120, 190, 72));

        CheckSalesbtn.setText("Check Sales order");
        CheckSalesbtn.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        CheckSalesbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CheckSalesbtnActionPerformed(evt);
            }
        });
        getContentPane().add(CheckSalesbtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 231, 191, 72));

        invoicebtn.setText("Generate invoice");
        invoicebtn.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        invoicebtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                invoicebtnActionPerformed(evt);
            }
        });
        getContentPane().add(invoicebtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(121, 232, 190, 70));

        approvedSalesReportbtn.setText("Approved Sales Report");
        approvedSalesReportbtn.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        approvedSalesReportbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                approvedSalesReportbtnActionPerformed(evt);
            }
        });
        getContentPane().add(approvedSalesReportbtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 342, 191, 71));

        workDoneReportbtn.setText("Work Done Report");
        workDoneReportbtn.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        workDoneReportbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                workDoneReportbtnActionPerformed(evt);
            }
        });
        getContentPane().add(workDoneReportbtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(371, 343, 190, 70));

        jPanel1.setBackground(new java.awt.Color(153, 153, 153));
        jPanel1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, null, java.awt.Color.gray, null, null));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("OFFICER HOME PAGE ");

        btnLogout.setText("Logout");
        btnLogout.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        btnLogout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLogoutActionPerformed(evt);
            }
        });

        invoicebtn1.setText("Manage personal profile");
        invoicebtn1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        invoicebtn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                invoicebtn1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 198, Short.MAX_VALUE)
                .addComponent(invoicebtn1, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnLogout, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(11, 11, 11)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(invoicebtn1, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnLogout, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(11, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 660, -1));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pic/Furniture 2.jpg"))); // NOI18N
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 660, 550));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnApproveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnApproveActionPerformed
        ApproveSO menu = new ApproveSO();
        menu.show();  // display dashboard
        dispose();
    }//GEN-LAST:event_btnApproveActionPerformed

    private void btnsearchModiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnsearchModiActionPerformed
        SearchModiSO menu = new SearchModiSO();
        menu.show();
        dispose();
    }//GEN-LAST:event_btnsearchModiActionPerformed

    private void CheckSalesbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CheckSalesbtnActionPerformed
        // TODO add your handling code here:
        new CheckSaleOrder().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_CheckSalesbtnActionPerformed

    private void invoicebtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_invoicebtnActionPerformed
        // TODO add your handling code here:
        new GenerateInvoice().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_invoicebtnActionPerformed

    private void invoicebtn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_invoicebtn1ActionPerformed
        new PersonalProfile().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_invoicebtn1ActionPerformed

    private void approvedSalesReportbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_approvedSalesReportbtnActionPerformed
        // TODO add your handling code here:
        GenerateApprovedSalesReport a = new GenerateApprovedSalesReport();
        a.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_approvedSalesReportbtnActionPerformed

    private void workDoneReportbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_workDoneReportbtnActionPerformed
        // TODO add your handling code here:
        GenerateWorkDoneReport a = new GenerateWorkDoneReport();
        a.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_workDoneReportbtnActionPerformed

    private void btnLogoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLogoutActionPerformed
        // TODO add your handling code here:
        Login a = new Login();
        a.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnLogoutActionPerformed

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
            java.util.logging.Logger.getLogger(OfficerHome.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(OfficerHome.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(OfficerHome.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(OfficerHome.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new OfficerHome().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton CheckSalesbtn;
    private javax.swing.JButton approvedSalesReportbtn;
    private javax.swing.JButton btnApprove;
    private javax.swing.JButton btnLogout;
    private javax.swing.JButton btnsearchModi;
    private javax.swing.JButton invoicebtn;
    private javax.swing.JButton invoicebtn1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton workDoneReportbtn;
    // End of variables declaration//GEN-END:variables
}
