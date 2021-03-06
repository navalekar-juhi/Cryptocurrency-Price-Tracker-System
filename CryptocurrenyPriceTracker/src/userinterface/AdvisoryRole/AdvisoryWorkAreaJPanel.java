/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.AdvisoryRole;

import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Organization.AdvisoryOrganization;
import Business.Organization.FinancialServiceOrganization;
import Business.Organization.Organization;
import Business.UserAccount.UserAccount;
import Business.WorkQueue.AdviceWorkRequest;
import Business.WorkQueue.WorkRequest;
import java.awt.CardLayout;
import java.text.SimpleDateFormat;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author mansigandhi
 */
public class AdvisoryWorkAreaJPanel extends javax.swing.JPanel {

    private JPanel userProcessContainer;
    private EcoSystem business;
    private UserAccount account;
    private Enterprise enterprise;
    private Organization organization;

    /**
     * Creates new form AdvisoryWorkAreaJPanel
     */
    public AdvisoryWorkAreaJPanel(JPanel userProcessContainer, UserAccount account, Organization organization, Enterprise enterprise, EcoSystem business) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.account = account;
        this.business = business;
        this.organization = organization;
        this.enterprise = enterprise;
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

        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblAdviceRequest = new javax.swing.JTable();
        btnAssign = new javax.swing.JButton();
        btnAdvice = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 255, 255));
        setForeground(new java.awt.Color(0, 153, 153));

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 153, 153));
        jLabel1.setText("Advisory");

        tblAdviceRequest.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        tblAdviceRequest.setForeground(new java.awt.Color(0, 153, 153));
        tblAdviceRequest.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Request Id", "Customer Name", "Amount", "Request Date", "Receiver", "Resolve Date"
            }
        ));
        jScrollPane1.setViewportView(tblAdviceRequest);

        btnAssign.setBackground(new java.awt.Color(255, 255, 255));
        btnAssign.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        btnAssign.setForeground(new java.awt.Color(0, 153, 153));
        btnAssign.setText("Assign to Me");
        btnAssign.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAssignActionPerformed(evt);
            }
        });

        btnAdvice.setBackground(new java.awt.Color(255, 255, 255));
        btnAdvice.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        btnAdvice.setForeground(new java.awt.Color(0, 153, 153));
        btnAdvice.setText("Advice");
        btnAdvice.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAdviceActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(100, 100, 100)
                .addComponent(btnAssign)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnAdvice)
                .addGap(68, 68, 68))
            .addGroup(layout.createSequentialGroup()
                .addGap(357, 357, 357)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(161, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 547, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(123, 123, 123))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jLabel1)
                .addGap(44, 44, 44)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(75, 75, 75)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAssign)
                    .addComponent(btnAdvice))
                .addContainerGap(249, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnAssignActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAssignActionPerformed
        // TODO add your handling code here:
        int selectedRow = tblAdviceRequest.getSelectedRow();
        if (selectedRow < 0) {
            JOptionPane.showMessageDialog(null, "Select a request first");
        } else {
            AdviceWorkRequest awr = (AdviceWorkRequest) tblAdviceRequest.getValueAt(selectedRow, 0);
            if (awr.getReceiver() == null) {
                awr.setReceiver(account);
                JOptionPane.showMessageDialog(null, "Request assigned successfully");
                btnAdvice.setEnabled(true);
            } else {
                JOptionPane.showMessageDialog(null, "Request cannot be assigned ");
                btnAdvice.setEnabled(false);
            }
            populateTable();
        }

    }//GEN-LAST:event_btnAssignActionPerformed

    private void btnAdviceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAdviceActionPerformed
        // TODO add your handling code here:
        int selectedRow = tblAdviceRequest.getSelectedRow();
        if (tblAdviceRequest.getValueAt(selectedRow, 4).toString().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Please assign the selected request.");
            return;

        } //  boolean value=tblAdviceRequest.getValueAt(selectedRow, 4)).toString().isEmpty();
        else if ((selectedRow >= 0) && !(tblAdviceRequest.getValueAt(selectedRow, 4)).toString().isEmpty()) {
            AdviceWorkRequest request = (AdviceWorkRequest) tblAdviceRequest.getValueAt(selectedRow, 0);

            request.setStatus("Processing");
            System.out.println("Advice request selected for processing");
            ProcessAdviceJPanel panel = new ProcessAdviceJPanel(userProcessContainer, request, business);
            userProcessContainer.add("ProcessAdviceJPanel", panel);
            CardLayout layout = (CardLayout) userProcessContainer.getLayout();
            layout.next(userProcessContainer);

        } else {
            JOptionPane.showMessageDialog(null, "Please select a request message to process.");
            return;
        }
    }//GEN-LAST:event_btnAdviceActionPerformed
    public void populateTable() {
        DefaultTableModel model = (DefaultTableModel) tblAdviceRequest.getModel();
        Organization found = null;
        for (Organization o : enterprise.getOrganizationDirectory().getOrganizationList()) {
            if (o instanceof AdvisoryOrganization) {
                found = o;
                break;
            }
        }

        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        model.setRowCount(0);
        for (WorkRequest wr : found.getWorkQueue().getWorkRequestList()) {
            if (wr instanceof AdviceWorkRequest && (wr.getReceiver() == null || wr.getReceiver() == account)) {
                AdviceWorkRequest awr = (AdviceWorkRequest) wr;
                Object[] row = new Object[6];
                row[0] = awr;
                row[1] = awr.getSender().getUsername();
                row[2] = awr.getdAmount();
                row[3] = sdf.format(awr.getRequestDate());
                UserAccount r = awr.getReceiver();
                row[4] = r != null ? r : "";
                row[5] = awr.getResolveDate() != null ? sdf.format(awr.getResolveDate()) : "";
                model.addRow(row);
            }
        }

    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdvice;
    private javax.swing.JButton btnAssign;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblAdviceRequest;
    // End of variables declaration//GEN-END:variables
}
