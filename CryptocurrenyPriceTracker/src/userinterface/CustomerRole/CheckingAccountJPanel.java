/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.CustomerRole;

import Business.Account.Account;
import Business.Customer.Customer;
import Business.EcoSystem;
import Business.Enterprise.Bank;
import Business.Enterprise.Enterprise;
import Business.Network.Network;
import Business.Organization.CheckingAccountOrganization;
import Business.Organization.Organization;
import Business.Organization.SavingsAccountOrganization;
import Business.UserAccount.UserAccount;
import Business.WorkQueue.CheckingAccountWorkRequest;
import Business.WorkQueue.SavingAccountWorkRequest;
import java.awt.CardLayout;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.util.Date;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author mansigandhi
 */
public class CheckingAccountJPanel extends javax.swing.JPanel {

    private JPanel userProcessContainer;
    private UserAccount account;
    private EcoSystem ecosystem;

    /**
     * Creates new form CheckingAccountJPanel
     */
    public CheckingAccountJPanel(JPanel userProcessContainer, UserAccount account, EcoSystem ecosystem) {
        initComponents();
        this.account = account;
        this.ecosystem = ecosystem;
        this.userProcessContainer = userProcessContainer;
        populateNetworks();
        networkJComboBox.addItemListener(new ItemListener() {
            @Override
            public void itemStateChanged(ItemEvent e) {
                populateEnterprise((Network) networkJComboBox.getSelectedItem());

            }
        });

    }

    private void populateNetworks() {
        //get a list of networks from network directory
        for (Network n : ecosystem.getNetworkList()) {
            networkJComboBox.addItem(n);
        }

    }

    private void populateEnterprise(Network n) {
        //get list of enterprise under the network who can advice which is investment bank or private broker
        enterpriseNameJComboBox.removeAllItems();
        for (Enterprise e : n.getEnterpriseDirectory().getEnterpriseList()) {
            if ((e instanceof Bank)) {
                for (Organization o : e.getOrganizationDirectory().getOrganizationList()) {
                    if (o instanceof CheckingAccountOrganization) {
                        enterpriseNameJComboBox.addItem(e);
                    }
                }
            }
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

        jLabel4 = new javax.swing.JLabel();
        enterpriseNameJComboBox = new javax.swing.JComboBox();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        networkJComboBox = new javax.swing.JComboBox();
        jLabel1 = new javax.swing.JLabel();
        btnBack = new javax.swing.JButton();
        RequestAdvice = new javax.swing.JButton();
        messageTF = new javax.swing.JTextField();
        btnViewAccount = new javax.swing.JButton();

        jLabel4.setText("Message");

        enterpriseNameJComboBox.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N

        jLabel3.setText("Enterprise");

        jLabel2.setText("Network");

        networkJComboBox.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        networkJComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                networkJComboBoxActionPerformed(evt);
            }
        });

        jLabel1.setText("Add Checking Account");

        btnBack.setText("Back");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        RequestAdvice.setText("Create Account(Req)");
        RequestAdvice.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RequestAdviceActionPerformed(evt);
            }
        });

        messageTF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                messageTFActionPerformed(evt);
            }
        });

        btnViewAccount.setText("View Checking Accounts");
        btnViewAccount.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnViewAccountActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(165, 165, 165)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel2)
                                .addComponent(jLabel3)
                                .addComponent(jLabel4))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(networkJComboBox, 0, 158, Short.MAX_VALUE)
                                .addComponent(enterpriseNameJComboBox, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(messageTF)))
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(btnBack, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGap(43, 43, 43)
                            .addComponent(RequestAdvice, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(57, 57, 57)
                        .addComponent(jLabel1)
                        .addGap(105, 105, 105)))
                .addGap(166, 166, 166))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnViewAccount)
                .addGap(15, 15, 15))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(btnViewAccount)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1)
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(networkJComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(enterpriseNameJComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(messageTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(44, 44, 44)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(RequestAdvice)
                    .addComponent(btnBack))
                .addContainerGap(59, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void networkJComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_networkJComboBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_networkJComboBoxActionPerformed

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        // TODO add your handling code here:
        userProcessContainer.remove(this);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_btnBackActionPerformed

    private void RequestAdviceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RequestAdviceActionPerformed
        // TODO add your handling code here:
        String cusname = account.getUsername();
        Enterprise e1 = (Enterprise) enterpriseNameJComboBox.getSelectedItem();
        System.out.println(e1);

        List<Customer> c = ecosystem.getCustomerDirectory().getCustomerList();
       
            for (Customer cus : c) {
                if (cus.getUseraccount().getUsername().equalsIgnoreCase(cusname)) {
                    
//                    for (Account a : cus.getAccountList()) {
//                        System.out.println(a.getBankName());
//                        // try{
//                        if (a.getBankName().equalsIgnoreCase(e1.toString())) {
//                            System.out.println("They are equal");
//
//                            JOptionPane.showMessageDialog(null, "Checking account already present");
//                            break;
//
//                        } else {
                            CheckingAccountWorkRequest awr = new CheckingAccountWorkRequest();
                            awr.setsMessage(messageTF.getText());
                            awr.setsNetwork(networkJComboBox.getSelectedItem().toString());
                            awr.setsEnterprise(enterpriseNameJComboBox.getSelectedItem().toString());
                            awr.setSender(account);
                            awr.setRequestDate(new Date());
                            awr.setStatus("Requested");
                            awr.setType("Checking");
                            Network n = (Network) networkJComboBox.getSelectedItem();
                            Enterprise e = (Enterprise) enterpriseNameJComboBox.getSelectedItem();
                            for (Organization o : e.getOrganizationDirectory().getOrganizationList()) {
                                if (o instanceof CheckingAccountOrganization) {
                                    o.getWorkQueue().getWorkRequestList().add(awr);
                                }
                            }
                            account.getWorkQueue().getWorkRequestList().add(awr);

                            JOptionPane.showMessageDialog(null, "Request message sent");
                       //}

                    //}
                }

            }
       

        //checking 
      /*  CheckingAccountWorkRequest awr = new CheckingAccountWorkRequest();
         awr.setsMessage(messageTF.getText());
         awr.setsNetwork(networkJComboBox.getSelectedItem().toString());
         awr.setsEnterprise(enterpriseNameJComboBox.getSelectedItem().toString());
         awr.setSender(account);
         awr.setRequestDate(new Date());
         awr.setStatus("Requested");
         awr.setType("Checking");
         Network n = (Network) networkJComboBox.getSelectedItem();
         Enterprise e = (Enterprise) enterpriseNameJComboBox.getSelectedItem();
         for (Organization o : e.getOrganizationDirectory().getOrganizationList()) {
         if (o instanceof CheckingAccountOrganization) {
         o.getWorkQueue().getWorkRequestList().add(awr);
         }
         }
         account.getWorkQueue().getWorkRequestList().add(awr);

         JOptionPane.showMessageDialog(null, "Request message sent");*/
    }//GEN-LAST:event_RequestAdviceActionPerformed

    private void messageTFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_messageTFActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_messageTFActionPerformed

    private void btnViewAccountActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnViewAccountActionPerformed
        // TODO add your handling code here:
        ViewCheckingAccountJPanel panel = new ViewCheckingAccountJPanel(userProcessContainer, account, ecosystem);
        userProcessContainer.add("ViewCheckingAccountJPanel", panel);
        CardLayout cardLayout = (CardLayout) userProcessContainer.getLayout();
        cardLayout.next(userProcessContainer);
    }//GEN-LAST:event_btnViewAccountActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton RequestAdvice;
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnViewAccount;
    private javax.swing.JComboBox enterpriseNameJComboBox;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JTextField messageTF;
    private javax.swing.JComboBox networkJComboBox;
    // End of variables declaration//GEN-END:variables
}
