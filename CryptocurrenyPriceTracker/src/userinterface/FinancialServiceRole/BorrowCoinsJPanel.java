/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.FinancialServiceRole;

import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Network.Network;
import Business.Organization.FinancialServiceOrganization;
import Business.Organization.Organization;
import Business.UserAccount.UserAccount;
import Business.WorkQueue.BorrowCoinsWorkRequest;
import Business.WorkQueue.WorkRequest;
import java.awt.CardLayout;
import java.text.SimpleDateFormat;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Pramathesh Navalekar
 */
public class BorrowCoinsJPanel extends javax.swing.JPanel {

    private JPanel userProcessContainer;
    private EcoSystem business;
    private UserAccount account;
    private FinancialServiceOrganization financialServiceOrganization;
    private Enterprise enterprise;

    /**
     * Creates new form BorrowCoinsJPanel
     */
    public BorrowCoinsJPanel(JPanel userProcessContainer, UserAccount account, FinancialServiceOrganization organization, Enterprise enterprise, EcoSystem business) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.account = account;
        this.business = business;
        this.enterprise = enterprise;
        this.financialServiceOrganization = organization;
        populateTable();
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
        tblBorrowRequest = new javax.swing.JTable();
        btnBack = new javax.swing.JButton();
        btnAssign = new javax.swing.JButton();
        btnProcess = new javax.swing.JButton();

        tblBorrowRequest.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Request Id", "Customer Name", "Request Date", "Receiver", "Resolve Date", "Resolution"
            }
        ));
        jScrollPane1.setViewportView(tblBorrowRequest);

        btnBack.setForeground(new java.awt.Color(0, 153, 153));
        btnBack.setText("Back");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        btnAssign.setForeground(new java.awt.Color(0, 153, 153));
        btnAssign.setText("Assign to me");
        btnAssign.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAssignActionPerformed(evt);
            }
        });

        btnProcess.setForeground(new java.awt.Color(0, 153, 153));
        btnProcess.setText("Process");
        btnProcess.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnProcessActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(102, 102, 102)
                .addComponent(btnBack)
                .addGap(118, 118, 118)
                .addComponent(btnAssign)
                .addGap(91, 91, 91)
                .addComponent(btnProcess)
                .addContainerGap(97, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 515, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(106, 106, 106)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAssign)
                    .addComponent(btnProcess)
                    .addComponent(btnBack))
                .addContainerGap(201, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        // TODO add your handling code here:
        userProcessContainer.remove(this);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_btnBackActionPerformed

    private void btnAssignActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAssignActionPerformed
        // TODO add your handling code here:
        int selectedRow = tblBorrowRequest.getSelectedRow();
        if (selectedRow < 0) {
            JOptionPane.showMessageDialog(null, "Select a request first");
        } else {
            BorrowCoinsWorkRequest dwr = (BorrowCoinsWorkRequest) tblBorrowRequest.getValueAt(selectedRow, 0);
            if ((dwr.getReceiver()== null)) {
                dwr.setReceiver(account);
                JOptionPane.showMessageDialog(null, "Request assigned successfully");
                btnProcess.setEnabled(true);
            } else {
                JOptionPane.showMessageDialog(null, "Request cannot be assigned ");
                btnProcess.setEnabled(false);
            }
            populateTable();
        }
    }//GEN-LAST:event_btnAssignActionPerformed
    public void populateTable() {
        DefaultTableModel model = (DefaultTableModel) tblBorrowRequest.getModel();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        model.setRowCount(0);
        for (WorkRequest wr : financialServiceOrganization.getWorkQueue().getWorkRequestList()) {
            if (wr instanceof BorrowCoinsWorkRequest && (wr.getReceiver() == null || wr.getReceiver() == account)) {
                BorrowCoinsWorkRequest dwr = (BorrowCoinsWorkRequest) wr;
                Object[] row = new Object[6];
                row[0] = dwr;
                row[1] = dwr.getSender().getUsername();
                row[2] = sdf.format(dwr.getRequestDate());
                UserAccount r = dwr.getReceiver();
                row[3] = r != null ? r : "";
                row[4] = dwr.getResolveDate() != null ? sdf.format(dwr.getResolveDate()) : "";
                row[5] = dwr.getStatus();
                model.addRow(row);
            }
        }

    }
    private void btnProcessActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnProcessActionPerformed
        // TODO add your handling code here:
        System.out.println("Selected borrowing request sent for processing");
        int selectedRow = tblBorrowRequest.getSelectedRow();

        if (selectedRow >= 0) {
            BorrowCoinsWorkRequest request = (BorrowCoinsWorkRequest) tblBorrowRequest.getValueAt(selectedRow, 0);
            if (request.getReceiver() != null) {
                if (!(request.getStatus().equalsIgnoreCase("Completed"))) {
                    request.setStatus("Processing");
                    ProcessBorrowJPanel panel = new ProcessBorrowJPanel(userProcessContainer, request, business, enterprise, account);
                    userProcessContainer.add("ProcessBorrowJPanel", panel);
                    CardLayout layout = (CardLayout) userProcessContainer.getLayout();
                    layout.next(userProcessContainer);
                }
                else
                {
                JOptionPane.showMessageDialog(null, "Cannot process completed request");
                return;
                }
            } else {
                JOptionPane.showMessageDialog(null, "Please assign the request before processing.");
                return;
            }

        } else {
            JOptionPane.showMessageDialog(null, "Please select a request message to process.");
            return;
        }
    }//GEN-LAST:event_btnProcessActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAssign;
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnProcess;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblBorrowRequest;
    // End of variables declaration//GEN-END:variables
}
