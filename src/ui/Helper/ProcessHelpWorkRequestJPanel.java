/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ui.Helper;

import Business.Organizations.Org;
import Business.Organizations.OrgCatalog;
//import Business.Organizations.TransportationOrg;
import Business.RequestFramework.HelpRequestFrameworkFramework;
import Business.RequestFramework.ManagerRequestFrameworkFramework;
import Business.userAccount.Users;
//import Business.RequestFramework.TransportationRequestFramework;

import java.awt.CardLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.GradientPaint;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author prasanna
 */
public class ProcessHelpWorkRequestJPanel extends javax.swing.JPanel {
    
    private JPanel userProcessContainer;
    private HelpRequestFrameworkFramework request;
    private Users usersAccount;
    private OrgCatalog od;
    
    /**
     * Creates new form ProcessHelpWorkRequestJPanel
     */
    public ProcessHelpWorkRequestJPanel(JPanel userProcessContainer, HelpRequestFrameworkFramework request, Users usersAccount, OrgCatalog od) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.request = request;
        this.usersAccount = usersAccount;
        this.od = od;
        
        requestResultCombo.removeAllItems();
        requestResultCombo.addItem(ManagerRequestFrameworkFramework.REQUEST_ACCEPT);
        requestResultCombo.addItem(ManagerRequestFrameworkFramework.REQUEST_REJECT);
        
//        needTransportCombo.removeAllItems();
//        needTransportCombo.addItem("YES");
//        needTransportCombo.addItem("NO");
//        
      
    }
    
    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        Graphics2D g2d = (Graphics2D) g;
        g2d.setRenderingHint(RenderingHints.KEY_RENDERING, RenderingHints.VALUE_RENDER_QUALITY);
        int w = getWidth();
        int h = getHeight();
        
        Color c1 = new Color(210,240,114);
         Color c2 = new Color(210,240,114);
     
        GradientPaint gp = new GradientPaint(w/4, 0, c2, w/4, h, c1);
        setOpaque( false );
        g2d.setPaint(gp);
        g2d.fillRect(0, 0, w, h);
        setOpaque( true );
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        submitJButton = new javax.swing.JButton();
        requestStatus = new javax.swing.JLabel();
        backJButton = new javax.swing.JButton();
        requestResultCombo = new javax.swing.JComboBox();
        submitRequest = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        commentsTxtAreaField = new javax.swing.JTextArea();

        setBackground(new java.awt.Color(102, 255, 102));

        submitJButton.setBackground(new java.awt.Color(0, 153, 255));
        submitJButton.setFont(new java.awt.Font("Georgia", 1, 14)); // NOI18N
        submitJButton.setForeground(new java.awt.Color(255, 255, 255));
        submitJButton.setText("Submit Result");
        submitJButton.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        submitJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                submitJButtonActionPerformed(evt);
            }
        });

        requestStatus.setFont(new java.awt.Font("Georgia", 1, 14)); // NOI18N
        requestStatus.setText("GetHelp Request ");

        backJButton.setBackground(new java.awt.Color(0, 153, 255));
        backJButton.setFont(new java.awt.Font("Georgia", 1, 14)); // NOI18N
        backJButton.setForeground(new java.awt.Color(255, 255, 255));
        backJButton.setText("Back");
        backJButton.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        backJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backJButtonActionPerformed(evt);
            }
        });

        requestResultCombo.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        submitRequest.setFont(new java.awt.Font("Georgia", 1, 24)); // NOI18N
        submitRequest.setText("Process Work Request :");

        jLabel2.setFont(new java.awt.Font("Georgia", 1, 14)); // NOI18N
        jLabel2.setText("Add comments: ");

        commentsTxtAreaField.setColumns(20);
        commentsTxtAreaField.setRows(5);
        jScrollPane1.setViewportView(commentsTxtAreaField);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(66, 66, 66)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(submitRequest, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(requestStatus)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(backJButton, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel2)))
                        .addGap(61, 61, 61)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(requestResultCombo, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(303, 303, 303)
                        .addComponent(submitJButton, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(429, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addComponent(submitRequest)
                .addGap(34, 34, 34)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(requestStatus)
                    .addComponent(requestResultCombo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(57, 57, 57)
                        .addComponent(jLabel2)))
                .addGap(88, 88, 88)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(submitJButton)
                    .addComponent(backJButton))
                .addContainerGap(172, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void submitJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_submitJButtonActionPerformed
        if(requestResultCombo.getSelectedIndex()<0 || commentsTxtAreaField.getText().trim().isEmpty()
//           || needTransportCombo.getSelectedIndex()<0  
                )
        {
        JOptionPane.showMessageDialog(null, "Please enter data in all fields", "warning", JOptionPane.WARNING_MESSAGE);
        return;
        }
        if(commentsTxtAreaField.getText().length()>100 )
        {
        JOptionPane.showMessageDialog(null, "Please enter few words()less than 100 char) in text area", "warning", JOptionPane.WARNING_MESSAGE);
        return;      
        }
        request.setRequestOutcome((String)requestResultCombo.getSelectedItem());
        request.setComments(commentsTxtAreaField.getText());
        request.setStatus(ManagerRequestFrameworkFramework.REQUEST_COMPLETED);
        request.setResolveDate(new Date());
//        String needTransport = (String)needTransportCombo.getSelectedItem();
       
        JOptionPane.showMessageDialog(null, "GetHelp RequestFramework has been processed successfully", "success", JOptionPane.PLAIN_MESSAGE);
        
//        if(needTransport.equals("YES"))
//        {
//        TransportationRequestFramework needTransportWorkRequest = new TransportationRequestFramework();
//        needTransportWorkRequest.setReqMessage("Need Transport");
//        needTransportWorkRequest.setSenderDetails(usersAccount);
//        needTransportWorkRequest.setStatus("Sent");
//        needTransportWorkRequest.setRequestDate(new Date());
//        needTransportWorkRequest.setNeedTransportation((String)needTransportCombo.getSelectedItem()); 
//        Org organization = null;
//        for(Org org : od.getOrganizationsList())
//        {
//         if(org instanceof TransportationOrg)
//         {
//             organization = org;
//         }
//        }
//          if(organization == null)
//          {
//          JOptionPane.showMessageDialog(null, "Unable to create transport request! Please create transport organization !!", "warning", JOptionPane.WARNING_MESSAGE);
//          return;     
//          }
//            organization.getRequestPipeline().getRequestList().add(needTransportWorkRequest);
//            usersAccount.getRequestPipeline().getRequestList().add(needTransportWorkRequest);
//        
//         JOptionPane.showMessageDialog(null, "Transport RequestFramework has been created successfully", "success", JOptionPane.PLAIN_MESSAGE);
//        commentsTxtAreaField.setText("");
//        }      
        
        
    }//GEN-LAST:event_submitJButtonActionPerformed

    private void backJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backJButtonActionPerformed

        userProcessContainer.remove(this);
        Component[] componentArray = userProcessContainer.getComponents();
        Component component = componentArray[componentArray.length - 1];
        ViewPersonalHelpRequests viewHelpRequestsJPanel = (ViewPersonalHelpRequests) component;
        viewHelpRequestsJPanel.populatehelpRequestTable();
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_backJButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backJButton;
    private javax.swing.JTextArea commentsTxtAreaField;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JComboBox requestResultCombo;
    private javax.swing.JLabel requestStatus;
    private javax.swing.JButton submitJButton;
    private javax.swing.JLabel submitRequest;
    // End of variables declaration//GEN-END:variables
}
