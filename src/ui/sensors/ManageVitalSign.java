package ui.Sensors;

import Business.NetworkHelp;
//import Business.Enterprises.NGOEnterprise;
import Business.Person.Patient;
import Business.RequestFramework.SensorRequestFramework;
import Business.userAccount.Users;
import Business.RequestFramework.RequestFramework;

import java.awt.CardLayout;
import java.awt.Color;
import java.awt.GradientPaint;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author prasanna
 */
public class ManageVitalSign extends javax.swing.JPanel {
     
    private JPanel userProcessContainer;
    private Users users;
    private Patient person;
    private NetworkHelp environment;

    /**
     * Creates new form HeartRateSensorJPanel
     */
    public ManageVitalSign(JPanel userProcessContainer, Users users, NetworkHelp environment) {
        initComponents();
        
        this.userProcessContainer = userProcessContainer;
        this.users = users;
        person = (Patient) users.getPerson();
        this.environment = environment;
        //vitalSignPanel.setVisible(false);

    }
    
   // @Override
//    protected void paintComponent(Graphics g) {
//        super.paintComponent(g);
//        Graphics2D g2d = (Graphics2D) g;
//        g2d.setRenderingHint(RenderingHints.KEY_RENDERING, RenderingHints.VALUE_RENDER_QUALITY);
//        int w = getWidth();
//        int h = getHeight();
//        
//        Color c1 = new Color(210,240,114);
//        Color c2 = new Color(210,240,114);
////        Color c2 = Color.white;
//     
//        GradientPaint gp = new GradientPaint(w/4, 0, c2, w/4, h, c1);
//        setOpaque( false );
//        g2d.setPaint(gp);
//        g2d.fillRect(0, 0, w, h);
//        setOpaque( true );
//    }
    
   /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        shareInfoGroup = new javax.swing.ButtonGroup();
        hasSensorGroup = new javax.swing.ButtonGroup();
        getAlertsGroup = new javax.swing.ButtonGroup();
        hasCardiacProbGroup = new javax.swing.ButtonGroup();
        sendToDoctorGroup = new javax.swing.ButtonGroup();
        getAlertFromHH = new javax.swing.JLabel();
        submitVitalSignsJBtn = new javax.swing.JButton();
        cancelJBtn = new javax.swing.JButton();
        vitalSignPanel = new javax.swing.JPanel();
        hasSensorRadioYes = new javax.swing.JRadioButton();
        respRateCheckBox = new javax.swing.JCheckBox();
        getAlertJRadioYes = new javax.swing.JRadioButton();
        sysBPCheckBox = new javax.swing.JCheckBox();
        weightCheckBox = new javax.swing.JCheckBox();
        getAlert = new javax.swing.JLabel();
        sensorDevice = new javax.swing.JLabel();
        getAlertJRadioNo = new javax.swing.JRadioButton();
        vitalSignsTrck = new javax.swing.JLabel();
        hasSensorRadioNo = new javax.swing.JRadioButton();
        heartRateChckBox = new javax.swing.JCheckBox();
        shareInfo = new javax.swing.JLabel();
        cardiacProblems = new javax.swing.JLabel();
        shareVitalInfoJRadioYes = new javax.swing.JRadioButton();
        shareVitalInfoJRadioNo = new javax.swing.JRadioButton();
        hasCardiacYes = new javax.swing.JRadioButton();
        hasCardiacRadioNo = new javax.swing.JRadioButton();
        backJButton = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 255, 0));

        getAlertFromHH.setFont(new java.awt.Font("Georgia", 1, 36)); // NOI18N
        getAlertFromHH.setText("Manage Vital Signs");

        submitVitalSignsJBtn.setBackground(new java.awt.Color(0, 153, 153));
        submitVitalSignsJBtn.setFont(new java.awt.Font("Georgia", 1, 14)); // NOI18N
        submitVitalSignsJBtn.setText("Submit");
        submitVitalSignsJBtn.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        submitVitalSignsJBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                submitVitalSignsJBtnActionPerformed(evt);
            }
        });

        cancelJBtn.setBackground(new java.awt.Color(0, 153, 153));
        cancelJBtn.setFont(new java.awt.Font("Georgia", 1, 14)); // NOI18N
        cancelJBtn.setText("Cancel");
        cancelJBtn.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        vitalSignPanel.setBackground(new java.awt.Color(255, 255, 255));
        vitalSignPanel.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        hasSensorGroup.add(hasSensorRadioYes);
        hasSensorRadioYes.setFont(new java.awt.Font("Georgia", 0, 14)); // NOI18N
        hasSensorRadioYes.setText("Yes");
        hasSensorRadioYes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                hasSensorRadioYesActionPerformed(evt);
            }
        });

        respRateCheckBox.setFont(new java.awt.Font("Georgia", 0, 14)); // NOI18N
        respRateCheckBox.setText("Respiratory Rate");

        getAlertsGroup.add(getAlertJRadioYes);
        getAlertJRadioYes.setFont(new java.awt.Font("Georgia", 0, 14)); // NOI18N
        getAlertJRadioYes.setText("Yes");
        getAlertJRadioYes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                getAlertJRadioYesActionPerformed(evt);
            }
        });

        sysBPCheckBox.setFont(new java.awt.Font("Georgia", 0, 14)); // NOI18N
        sysBPCheckBox.setText("Systollic Blood Pressure");

        weightCheckBox.setFont(new java.awt.Font("Georgia", 0, 14)); // NOI18N
        weightCheckBox.setText("Weight");

        getAlert.setFont(new java.awt.Font("Georgia", 0, 14)); // NOI18N
        getAlert.setText("Would you like to get alert from Heart Help:");

        sensorDevice.setFont(new java.awt.Font("Georgia", 0, 14)); // NOI18N
        sensorDevice.setText("Do you have a sensor device to track Vital Signs");

        getAlertsGroup.add(getAlertJRadioNo);
        getAlertJRadioNo.setFont(new java.awt.Font("Georgia", 0, 14)); // NOI18N
        getAlertJRadioNo.setText("No");
        getAlertJRadioNo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                getAlertJRadioNoActionPerformed(evt);
            }
        });

        vitalSignsTrck.setFont(new java.awt.Font("Georgia", 0, 14)); // NOI18N
        vitalSignsTrck.setText("Please Select Vital Signs you would like to track:");

        hasSensorGroup.add(hasSensorRadioNo);
        hasSensorRadioNo.setFont(new java.awt.Font("Georgia", 0, 14)); // NOI18N
        hasSensorRadioNo.setText("No");
        hasSensorRadioNo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                hasSensorRadioNoActionPerformed(evt);
            }
        });

        heartRateChckBox.setFont(new java.awt.Font("Georgia", 0, 14)); // NOI18N
        heartRateChckBox.setText("Heart Rate");

        shareInfo.setFont(new java.awt.Font("Georgia", 0, 14)); // NOI18N
        shareInfo.setText("Would you like to share Vital Sign Information with us :");

        cardiacProblems.setFont(new java.awt.Font("Georgia", 0, 14)); // NOI18N
        cardiacProblems.setText("Do you have Cardiac problems ");

        shareInfoGroup.add(shareVitalInfoJRadioYes);
        shareVitalInfoJRadioYes.setFont(new java.awt.Font("Georgia", 0, 14)); // NOI18N
        shareVitalInfoJRadioYes.setText("Yes");
        shareVitalInfoJRadioYes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                shareVitalInfoJRadioYesActionPerformed(evt);
            }
        });

        shareInfoGroup.add(shareVitalInfoJRadioNo);
        shareVitalInfoJRadioNo.setFont(new java.awt.Font("Georgia", 0, 14)); // NOI18N
        shareVitalInfoJRadioNo.setText("No");
        shareVitalInfoJRadioNo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                shareVitalInfoJRadioNoActionPerformed(evt);
            }
        });

        hasCardiacProbGroup.add(hasCardiacYes);
        hasCardiacYes.setFont(new java.awt.Font("Georgia", 0, 14)); // NOI18N
        hasCardiacYes.setText("Yes");
        hasCardiacYes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                hasCardiacYesActionPerformed(evt);
            }
        });

        hasCardiacProbGroup.add(hasCardiacRadioNo);
        hasCardiacRadioNo.setFont(new java.awt.Font("Georgia", 0, 14)); // NOI18N
        hasCardiacRadioNo.setText("No");
        hasCardiacRadioNo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                hasCardiacRadioNoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout vitalSignPanelLayout = new javax.swing.GroupLayout(vitalSignPanel);
        vitalSignPanel.setLayout(vitalSignPanelLayout);
        vitalSignPanelLayout.setHorizontalGroup(
            vitalSignPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, vitalSignPanelLayout.createSequentialGroup()
                .addContainerGap(29, Short.MAX_VALUE)
                .addGroup(vitalSignPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(vitalSignPanelLayout.createSequentialGroup()
                        .addGroup(vitalSignPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(vitalSignsTrck, javax.swing.GroupLayout.PREFERRED_SIZE, 307, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(sensorDevice, javax.swing.GroupLayout.PREFERRED_SIZE, 302, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(getAlert))
                        .addGap(58, 58, 58)
                        .addGroup(vitalSignPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(weightCheckBox)
                            .addComponent(sysBPCheckBox)
                            .addGroup(vitalSignPanelLayout.createSequentialGroup()
                                .addComponent(getAlertJRadioYes)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(getAlertJRadioNo))
                            .addGroup(vitalSignPanelLayout.createSequentialGroup()
                                .addComponent(hasSensorRadioYes)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(hasSensorRadioNo))
                            .addComponent(respRateCheckBox)
                            .addComponent(heartRateChckBox, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(vitalSignPanelLayout.createSequentialGroup()
                        .addGroup(vitalSignPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(vitalSignPanelLayout.createSequentialGroup()
                                .addComponent(cardiacProblems)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(hasCardiacYes))
                            .addGroup(vitalSignPanelLayout.createSequentialGroup()
                                .addComponent(shareInfo)
                                .addGap(18, 18, 18)
                                .addComponent(shareVitalInfoJRadioYes)))
                        .addGap(18, 18, 18)
                        .addGroup(vitalSignPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(shareVitalInfoJRadioNo)
                            .addComponent(hasCardiacRadioNo)))))
        );
        vitalSignPanelLayout.setVerticalGroup(
            vitalSignPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(vitalSignPanelLayout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addGroup(vitalSignPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(shareInfo)
                    .addComponent(shareVitalInfoJRadioYes)
                    .addComponent(shareVitalInfoJRadioNo))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(vitalSignPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cardiacProblems)
                    .addComponent(hasCardiacYes)
                    .addComponent(hasCardiacRadioNo))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 20, Short.MAX_VALUE)
                .addGroup(vitalSignPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(sensorDevice)
                    .addGroup(vitalSignPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(hasSensorRadioYes)
                        .addComponent(hasSensorRadioNo)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(vitalSignPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(vitalSignsTrck)
                    .addComponent(heartRateChckBox))
                .addGap(18, 18, 18)
                .addComponent(respRateCheckBox)
                .addGap(18, 18, 18)
                .addComponent(sysBPCheckBox)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(weightCheckBox)
                .addGap(21, 21, 21)
                .addGroup(vitalSignPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(getAlert)
                    .addComponent(getAlertJRadioYes)
                    .addComponent(getAlertJRadioNo))
                .addGap(53, 53, 53))
        );

        backJButton.setBackground(new java.awt.Color(0, 153, 153));
        backJButton.setFont(new java.awt.Font("Georgia", 1, 14)); // NOI18N
        backJButton.setText("<< Back");
        backJButton.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        backJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backJButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(345, 345, 345)
                        .addComponent(submitVitalSignsJBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(43, 43, 43)
                        .addComponent(cancelJBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(196, 196, 196)
                        .addComponent(vitalSignPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addComponent(backJButton, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(173, 173, 173)
                        .addComponent(getAlertFromHH, javax.swing.GroupLayout.PREFERRED_SIZE, 371, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(519, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(getAlertFromHH)
                    .addComponent(backJButton, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(vitalSignPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 21, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cancelJBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(submitVitalSignsJBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(41, 41, 41))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void submitVitalSignsJBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_submitVitalSignsJBtnActionPerformed
      
        try
        {
        if(shareInfoGroup.getSelection() == null || hasCardiacProbGroup.getSelection() == null)
       {
      JOptionPane.showMessageDialog(null, "Please Select a radio button to Let us know if you would like to share Information ","warning", JOptionPane.WARNING_MESSAGE);
       return;      
       }
       
       if(shareVitalInfoJRadioYes.isSelected() && hasCardiacYes.isSelected())
       {
        person.setShareVital(true);
        person.setHasCardiacProb(true);
           
         boolean hR =  false;
         boolean bp = false;
         boolean rr = false;
         boolean wght = false;
            
      ArrayList<String> vitalSigns = new ArrayList<>();
        if(heartRateChckBox.isSelected())
        {
        hR=true;    
        vitalSigns.add(heartRateChckBox.getText());
        }
        if(sysBPCheckBox.isSelected())
        {
            bp = true;
          vitalSigns.add(sysBPCheckBox.getText());   
        }
        if(respRateCheckBox.isSelected())
        {
            rr = true;
          vitalSigns.add(respRateCheckBox.getText());   
        }
         if(weightCheckBox.isSelected())
        {
            wght = true;
          vitalSigns.add(weightCheckBox.getText());   
        }
       if(!hR || !bp || !rr || !wght)
         {
        JOptionPane.showMessageDialog(null, "Please Select all the Checkboxes to track Vital signs","warning", JOptionPane.WARNING_MESSAGE);
         return;      
        }
        
         person.setVitalSignTrackList(vitalSigns);
       }
       if(hasSensorGroup.getSelection() == null)
       {
       JOptionPane.showMessageDialog(null, "Please Select a radio button to Let us know if you have a sensor device ","warning", JOptionPane.WARNING_MESSAGE);
       return;        
       }
      
       if(getAlertsGroup.getSelection() == null)
       {
       JOptionPane.showMessageDialog(null, "Please Select a radio button to Let us know if you would like to get alerts ","warning", JOptionPane.WARNING_MESSAGE);
       return;     
       }
     // To add vital sign data  
     if(person.isShareVital() && person.isHasSensor())
     {
        person.setHasSensor(true);
        person.addVitalSign();    
      }
       JOptionPane.showMessageDialog(null, "Vital Sign information has been updated successfully ","success", JOptionPane.PLAIN_MESSAGE);
       
       if(person.isShareVital() && !person.isHasSensor())
       {
        person.setHasSensor(false);
        int dialogButton = JOptionPane.YES_NO_OPTION;
        int dialogResult = JOptionPane.showConfirmDialog(this, "Do you need a sensor ? ", "warning",dialogButton);
        if(dialogResult == JOptionPane.YES_OPTION)
        {
            
        if(!(users.getRequestPipeline().getRequestList().isEmpty()))
                {
                for(RequestFramework requestFramework : users.getRequestPipeline().getRequestList())
                {
                   if(requestFramework.getReqMessage().equalsIgnoreCase("Need Sensor Device"))
                   {
                JOptionPane.showMessageDialog(null, "You have placed a requestFramework for sensor device earlier ","warning", JOptionPane.WARNING_MESSAGE);
                 return;              
                   }
                }
                }    
            
        String message = "Need Sensor Device";    
        SensorRequestFramework nsdwr = new SensorRequestFramework();
        nsdwr.setReqMessage("Need Sensor Device");
        nsdwr.setComments(message);
        nsdwr.setSenderDetails(users);
        nsdwr.setStatus("Sent");
        
//      try
//      {
//        for(Network Network : environment.getNetworkList())
//        {
//          for(Enterprise enterprise : Network.getEnterprisesDirectory().getEnterprisesList())
//          {
//              if(enterprise instanceof NGOEnterprise)
//              {
//              if(enterprise.getOrganizationsDirectory().getOrganizationsList().isEmpty())
//              {
//             JOptionPane.showMessageDialog(null, "Donor Organization in Non Profit Enterprise does not exist as of now ","warning", JOptionPane.WARNING_MESSAGE);
//             return;       
//              }
//              for(Org org : enterprise.getOrganizationsDirectory().getOrganizationsList())
//              {
//              org.getRequestPipeline().getRequestList().add(nsdwr);
//              }
//             }
//          }
//        }
//      }
//      catch(NullPointerException npe)
//      {
//       JOptionPane.showMessageDialog(null, "Non Profit Enterprise does not exist as of now ","warning", JOptionPane.WARNING_MESSAGE);
//        return;          
//      }
        users.getRequestPipeline().getRequestList().add(nsdwr);
        JOptionPane.showMessageDialog(null, "RequestFramework has been created successfully", "success", JOptionPane.PLAIN_MESSAGE);
         
        }
        resetFields();
        }
        }
        catch(Exception e)
        {
      JOptionPane.showMessageDialog(null, "Please enter data in all fields  ","warning", JOptionPane.WARNING_MESSAGE);
         return;    
        }
       
    }//GEN-LAST:event_submitVitalSignsJBtnActionPerformed
    
    public void  resetFields()
    {
        hasCardiacYes.setSelected(false);
        hasCardiacRadioNo.setSelected(false);
        shareVitalInfoJRadioNo.setSelected(false);
        shareVitalInfoJRadioYes.setSelected(false);
        hasSensorRadioYes.setSelected(false);
        hasSensorRadioNo.setSelected(false);
        heartRateChckBox.setSelected(false);
        respRateCheckBox.setSelected(false);
        sysBPCheckBox.setSelected(false);
        weightCheckBox.setSelected(false);
        getAlertJRadioYes.setSelected(false);
        getAlertJRadioNo.setSelected(false);
    }
       

    private void shareVitalInfoJRadioYesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_shareVitalInfoJRadioYesActionPerformed
         
         person.setShareVital(true);
         if(hasCardiacYes.isSelected())
         {
           vitalSignPanel.setVisible(true);   
         }
           
    }//GEN-LAST:event_shareVitalInfoJRadioYesActionPerformed

    private void shareVitalInfoJRadioNoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_shareVitalInfoJRadioNoActionPerformed
         person.setShareVital(false);
         vitalSignPanel.setVisible(false);
    }//GEN-LAST:event_shareVitalInfoJRadioNoActionPerformed

    private void hasSensorRadioYesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_hasSensorRadioYesActionPerformed
       person.setHasSensor(true);
       
    }//GEN-LAST:event_hasSensorRadioYesActionPerformed

    private void hasSensorRadioNoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_hasSensorRadioNoActionPerformed
        person.setHasSensor(false);
    }//GEN-LAST:event_hasSensorRadioNoActionPerformed

    private void getAlertJRadioYesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_getAlertJRadioYesActionPerformed
       person.setGetAlerts(true);
    }//GEN-LAST:event_getAlertJRadioYesActionPerformed

    private void getAlertJRadioNoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_getAlertJRadioNoActionPerformed
        person.setGetAlerts(false);
    }//GEN-LAST:event_getAlertJRadioNoActionPerformed

    private void backJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backJButtonActionPerformed
         userProcessContainer.remove(this);
        CardLayout layout = (CardLayout)userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_backJButtonActionPerformed

    private void hasCardiacYesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_hasCardiacYesActionPerformed
        person.setHasCardiacProb(true);
        if(shareVitalInfoJRadioYes.isSelected())
        {
        vitalSignPanel.setVisible(true);
        }
    }//GEN-LAST:event_hasCardiacYesActionPerformed

    private void hasCardiacRadioNoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_hasCardiacRadioNoActionPerformed
       person.setHasCardiacProb(false);
        vitalSignPanel.setVisible(false);
    }//GEN-LAST:event_hasCardiacRadioNoActionPerformed
  
    
  

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backJButton;
    private javax.swing.JButton cancelJBtn;
    private javax.swing.JLabel cardiacProblems;
    private javax.swing.JLabel getAlert;
    private javax.swing.JLabel getAlertFromHH;
    private javax.swing.JRadioButton getAlertJRadioNo;
    private javax.swing.JRadioButton getAlertJRadioYes;
    private javax.swing.ButtonGroup getAlertsGroup;
    private javax.swing.ButtonGroup hasCardiacProbGroup;
    private javax.swing.JRadioButton hasCardiacRadioNo;
    private javax.swing.JRadioButton hasCardiacYes;
    private javax.swing.ButtonGroup hasSensorGroup;
    private javax.swing.JRadioButton hasSensorRadioNo;
    private javax.swing.JRadioButton hasSensorRadioYes;
    private javax.swing.JCheckBox heartRateChckBox;
    private javax.swing.JCheckBox respRateCheckBox;
    private javax.swing.ButtonGroup sendToDoctorGroup;
    private javax.swing.JLabel sensorDevice;
    private javax.swing.JLabel shareInfo;
    private javax.swing.ButtonGroup shareInfoGroup;
    private javax.swing.JRadioButton shareVitalInfoJRadioNo;
    private javax.swing.JRadioButton shareVitalInfoJRadioYes;
    private javax.swing.JButton submitVitalSignsJBtn;
    private javax.swing.JCheckBox sysBPCheckBox;
    private javax.swing.JPanel vitalSignPanel;
    private javax.swing.JLabel vitalSignsTrck;
    private javax.swing.JCheckBox weightCheckBox;
    // End of variables declaration//GEN-END:variables

 
}
