/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.GovernmentRole;

import Business.Customer.Customer;
import Business.Customer.iText;
import Business.EcoSystem;
import Business.Organization.GovernmentOrganization;
import Business.Organization.Organization;
import Business.UserAccount.UserAccount;
import com.itextpdf.text.DocumentException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JPanel;
import userinterface.CustomerRole.CustomerWorkAreaJPanel;

/**
 *
 * @author mansigandhi
 */
public class GovernmentWorkAreaJPanel extends javax.swing.JPanel {
    private JPanel userProcessContainer;
    private EcoSystem business;
    private UserAccount userAccount;
    private GovernmentOrganization accountOrganization;


    /**
     * Creates new form GovernmentWorkAreaJPanel
     */
    public GovernmentWorkAreaJPanel(JPanel userProcessContainer, UserAccount account, Organization organization, EcoSystem business) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.userAccount = account;
        this.business = business;
        this.accountOrganization = (GovernmentOrganization)organization;
        populateCustomers();
    }
    public void populateCustomers()
{
   for (Customer cus :business.getCustomerDirectory().getCustomerList()){
  
        cusComboBox.addItem(cus);
        //id will be populated in the comboBox
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

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        cusComboBox = new javax.swing.JComboBox();
        btnGeneratePDF = new javax.swing.JButton();

        jLabel1.setText("Government work Area");

        jLabel2.setText("Customer");

        btnGeneratePDF.setText("Generate PDF");
        btnGeneratePDF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGeneratePDFActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(120, 120, 120)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(42, 42, 42)
                        .addComponent(jLabel2)
                        .addGap(53, 53, 53)
                        .addComponent(cusComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(108, 108, 108)
                        .addComponent(btnGeneratePDF)))
                .addContainerGap(105, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addComponent(jLabel1)
                .addGap(74, 74, 74)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(cusComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(46, 46, 46)
                .addComponent(btnGeneratePDF)
                .addContainerGap(63, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnGeneratePDFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGeneratePDFActionPerformed
        // TODO add your handling code here:
        try{
             Customer cus = (Customer)cusComboBox.getSelectedItem();
            iText.generatePDF(cus.getUseraccount(), business);
        }catch(DocumentException ex){
            Logger.getLogger(GovernmentWorkAreaJPanel.class.getName()).log(Level.SEVERE,null,ex);
    
        }
    }//GEN-LAST:event_btnGeneratePDFActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnGeneratePDF;
    private javax.swing.JComboBox cusComboBox;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    // End of variables declaration//GEN-END:variables
}
