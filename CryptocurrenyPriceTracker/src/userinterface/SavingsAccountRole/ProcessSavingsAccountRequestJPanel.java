/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.SavingsAccountRole;

import Business.Account.Account;
import Business.Customer.Customer;
import Business.EcoSystem;
import Business.UserAccount.UserAccount;
import Business.UserAccount.UserAccountDirectory;
import Business.WorkQueue.AdviceWorkRequest;
import Business.WorkQueue.SavingAccountWorkRequest;
import java.awt.CardLayout;
import java.awt.Component;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author poojahiremath
 */
public class ProcessSavingsAccountRequestJPanel extends javax.swing.JPanel {
    JPanel userProcessContainer;
    SavingAccountWorkRequest swr;
    EcoSystem ecosystem;
    //private static int count=1000000;
    private int id;
    private double rand;
            

    /**
     * Creates new form ProcessSavingsAccountRequestJPanel
     */
    public ProcessSavingsAccountRequestJPanel(JPanel userProcessContainer, SavingAccountWorkRequest swr,EcoSystem ecosystem) {
        initComponents();
        this.userProcessContainer= userProcessContainer;
        this.swr=swr;
        this.ecosystem= ecosystem;
        rand = Math.random()*10000000; 
        id =(int)rand;
        System.out.println("Savings Process Id>>"+id);
        nameTF.setText(swr.getSender().getUsername());
        idTF.setText(String.valueOf(id));
        
       //. count++;  
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
        nameTF = new javax.swing.JTextField();
        idTF = new javax.swing.JTextField();
        btnBack = new javax.swing.JButton();
        btnSend = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 255, 255));
        setForeground(new java.awt.Color(0, 153, 153));

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 153, 153));
        jLabel1.setText("Customer Name:");

        jLabel2.setBackground(new java.awt.Color(255, 255, 255));
        jLabel2.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 153, 153));
        jLabel2.setText("Savings Account ID:");

        nameTF.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        nameTF.setForeground(new java.awt.Color(0, 153, 153));
        nameTF.setEnabled(false);

        idTF.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        idTF.setForeground(new java.awt.Color(0, 153, 153));
        idTF.setEnabled(false);

        btnBack.setBackground(new java.awt.Color(255, 255, 255));
        btnBack.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        btnBack.setForeground(new java.awt.Color(0, 153, 153));
        btnBack.setText("Back");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        btnSend.setBackground(new java.awt.Color(255, 255, 255));
        btnSend.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        btnSend.setForeground(new java.awt.Color(0, 153, 153));
        btnSend.setText("Send ID");
        btnSend.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSendActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(39, 39, 39)
                        .addComponent(btnBack))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(175, 175, 175)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(8, 8, 8)
                                .addComponent(jLabel1)))
                        .addGap(36, 36, 36)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(idTF, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(nameTF, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(299, 299, 299)
                        .addComponent(btnSend)))
                .addContainerGap(242, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(84, 84, 84)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(nameTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(idTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(75, 75, 75)
                .addComponent(btnSend)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 181, Short.MAX_VALUE)
                .addComponent(btnBack)
                .addGap(49, 49, 49))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        // TODO add your handling code here:
        userProcessContainer.remove(this);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
        Component[] components = userProcessContainer.getComponents();
        for (Component c : components) {
            if (c instanceof SavingsAccountWorkAreaJPanel) {
                SavingsAccountWorkAreaJPanel savingsAccountWorkAreaJPanel = (SavingsAccountWorkAreaJPanel) c;
                savingsAccountWorkAreaJPanel.populateTable();
            }
        }
    }//GEN-LAST:event_btnBackActionPerformed

    private void btnSendActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSendActionPerformed
        // TODO add your handling code here:
        Account acc=new Account();
        acc.setType("Savings");
        acc.setBal(1000);
        acc.setId(id);
        acc.setBankName(swr.getsEnterprise());
        
        List<Customer> list=ecosystem.getCustomerDirectory().getCustomerList();
        for(Customer cus:list){
            System.out.println(list);
            //String s1=usr.getUsername();
           // String s2=swr.getSender().getUsername();
            if(cus.getUseraccount().getUsername().equalsIgnoreCase(swr.getSender().getUsername()))
            {
                  cus.getAccountList().add(acc); 
                  JOptionPane.showMessageDialog(null, "account added to account list");
            }
         
        
        }
        swr.setStatus("Completed");
        swr.setResolveDate(new Date());
        System.out.println("Saving account created for the requested customer");
    }//GEN-LAST:event_btnSendActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnSend;
    private javax.swing.JTextField idTF;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JTextField nameTF;
    // End of variables declaration//GEN-END:variables
}
