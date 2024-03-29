package ui.Patient;

import Business.Functions.DateValidation;
import Business.Functions.MailValidation;
import Business.Functions.IntegerValidation;
import Business.Functions.ContactValidation;
import Business.Functions.RegexValidation;
import Business.Functions.SysValidations;
import Business.Person.Person;
import Business.userAccount.Users;
import Business.userAccount.UsersCatalog;
import java.awt.CardLayout;
import java.awt.Color;
import java.awt.GradientPaint;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.InputVerifier;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author aayush
 */
public class UpdatePatientProfile extends javax.swing.JPanel {
    
    private JPanel userProcessContainer;
    private Users users;
    private Person person;
    private UsersCatalog usersCatalog;
    
    /**
     * Creates new form ViewVolunteerProfile
     */
    public UpdatePatientProfile(JPanel userProcessContainer, Users users, UsersCatalog usersCatalog) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.users = users;
        person = users.getPerson();
        this.usersCatalog = usersCatalog;
        DateFormat dateformat = new SimpleDateFormat("MM/dd/yyyy");
                
        firstNameField.setText(person.getFirstName());
        lastNameField.setText(person.getLastName());
        //dobField.setText(dateformat.format(person.getDob()));
        genderComboBox.setSelectedItem(person.getGender());
        addressField2.setText(person.getAddress1());
        addressField1.setText(person.getAddress2());
        townField.setText(person.getTown());
        zipCodeField.setText(person.getZipCode());
        occupationField.setText(person.getZipCode());
        emailIDField.setText(person.getEmailId());
        userNameTxtField.setText(users.getName());
        phoneNumberField.setText(String.valueOf(person.getPhoneNumber()));
        
        addInputVerifiers();
        
        
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
//        Color c2 = Color.white;
     
        GradientPaint gp = new GradientPaint(w/4, 0, c2, w/4, h, c1);
        setOpaque( false );
        g2d.setPaint(gp);
        g2d.fillRect(0, 0, w, h);
        setOpaque( true );
    }
    
    private void addInputVerifiers() {
          
        InputVerifier stringValidation = new RegexValidation();
        firstNameField.setInputVerifier(stringValidation);
        lastNameField.setInputVerifier(stringValidation);
        addressField1.setInputVerifier(stringValidation);
        addressField2.setInputVerifier(stringValidation);
        townField.setInputVerifier(stringValidation);
        occupationField.setInputVerifier(stringValidation);
        addressField1.setInputVerifier(stringValidation);
        addressField2.setInputVerifier(stringValidation);
        userNameTxtField.setInputVerifier(stringValidation);
        
        
        InputVerifier dobValidtion = new DateValidation();
        //dobField.setInputVerifier(dobValidtion);
        
        InputVerifier numberValidation = new IntegerValidation();
        zipCodeField.setInputVerifier(numberValidation);
        
        
        
       InputVerifier emailValidtion = new MailValidation();
        emailIDField.setInputVerifier(emailValidtion);
     
         InputVerifier phnumberValidation = new ContactValidation();
        phoneNumberField.setInputVerifier(phnumberValidation);
       
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        manageEnt = new javax.swing.JLabel();
        occupationField = new javax.swing.JTextField();
        emailID = new javax.swing.JLabel();
        emailIDField = new javax.swing.JTextField();
        areaCode = new javax.swing.JLabel();
        userNameTxtField = new javax.swing.JTextField();
        firstName = new javax.swing.JLabel();
        phoneNumber = new javax.swing.JLabel();
        firstNameField = new javax.swing.JTextField();
        phoneNumberField = new javax.swing.JTextField();
        updateJButton = new javax.swing.JButton();
        saveJButton = new javax.swing.JButton();
        LastName = new javax.swing.JLabel();
        backJButton = new javax.swing.JButton();
        lastNameField = new javax.swing.JTextField();
        address = new javax.swing.JLabel();
        addressField1 = new javax.swing.JTextField();
        town = new javax.swing.JLabel();
        townField = new javax.swing.JTextField();
        zipCode = new javax.swing.JLabel();
        zipCodeField = new javax.swing.JTextField();
        occupation = new javax.swing.JLabel();
        address2 = new javax.swing.JLabel();
        addressField2 = new javax.swing.JTextField();
        manageEnt1 = new javax.swing.JLabel();
        gender = new javax.swing.JLabel();
        genderComboBox = new javax.swing.JComboBox();
        viewYourProfile1 = new javax.swing.JLabel();
        viewYourProfile2 = new javax.swing.JLabel();

        manageEnt.setFont(new java.awt.Font("Malayalam MN", 3, 24)); // NOI18N
        manageEnt.setText("Welcome to Heart Help");

        setBackground(new java.awt.Color(0, 255, 204));

        occupationField.setEditable(false);
        occupationField.setEnabled(false);

        emailID.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        emailID.setText("Email Address:");

        emailIDField.setEditable(false);
        emailIDField.setEnabled(false);

        areaCode.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        areaCode.setText("User Name:");

        userNameTxtField.setEditable(false);
        userNameTxtField.setEnabled(false);

        firstName.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        firstName.setText("First Name:");

        phoneNumber.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        phoneNumber.setText("Phone Number:");

        firstNameField.setEditable(false);
        firstNameField.setEnabled(false);

        phoneNumberField.setEditable(false);
        phoneNumberField.setEnabled(false);
        phoneNumberField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                phoneNumberFieldActionPerformed(evt);
            }
        });

        updateJButton.setBackground(new java.awt.Color(0, 153, 153));
        updateJButton.setFont(new java.awt.Font("Georgia", 1, 14)); // NOI18N
        updateJButton.setForeground(new java.awt.Color(255, 255, 255));
        updateJButton.setText("Update");
        updateJButton.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        updateJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateJButtonActionPerformed(evt);
            }
        });

        saveJButton.setBackground(new java.awt.Color(0, 153, 153));
        saveJButton.setFont(new java.awt.Font("Georgia", 1, 14)); // NOI18N
        saveJButton.setForeground(new java.awt.Color(255, 255, 255));
        saveJButton.setText("Save");
        saveJButton.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        saveJButton.setEnabled(false);
        saveJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveJButtonActionPerformed(evt);
            }
        });

        LastName.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        LastName.setText("Last Name:");

        backJButton.setBackground(new java.awt.Color(0, 153, 153));
        backJButton.setFont(new java.awt.Font("Georgia", 1, 14)); // NOI18N
        backJButton.setForeground(new java.awt.Color(255, 255, 255));
        backJButton.setText("<< Back");
        backJButton.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        backJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backJButtonActionPerformed(evt);
            }
        });

        lastNameField.setEditable(false);
        lastNameField.setEnabled(false);

        address.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        address.setText("Address Line1:");

        addressField1.setEditable(false);
        addressField1.setEnabled(false);

        town.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        town.setText("Town/City: ");

        townField.setEditable(false);
        townField.setEnabled(false);

        zipCode.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        zipCode.setText("Zip Code:");

        zipCodeField.setEditable(false);
        zipCodeField.setEnabled(false);

        occupation.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        occupation.setText("Occupation:");

        address2.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        address2.setText("Address Line2 : ");

        addressField2.setEnabled(false);

        manageEnt1.setFont(new java.awt.Font("Georgia", 1, 36)); // NOI18N
        manageEnt1.setText("HealthHub");

        gender.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        gender.setText("Gender:");

        genderComboBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Choose gender", "Female", "Male", "Transgender", "Unknown" }));
        genderComboBox.setEnabled(false);

        viewYourProfile1.setFont(new java.awt.Font("Georgia", 1, 18)); // NOI18N
        viewYourProfile1.setText("Personal Information");

        viewYourProfile2.setFont(new java.awt.Font("Georgia", 1, 18)); // NOI18N
        viewYourProfile2.setText("Address: ");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(44, 44, 44)
                        .addComponent(backJButton)
                        .addGap(323, 323, 323)
                        .addComponent(manageEnt1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(104, 104, 104)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(viewYourProfile1, javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(firstName, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(firstNameField, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(LastName, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lastNameField, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(emailID, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(emailIDField, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(gender)
                                    .addComponent(phoneNumber)
                                    .addComponent(areaCode)
                                    .addComponent(occupation))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(userNameTxtField, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(genderComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(updateJButton)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(saveJButton)
                                            .addGap(14, 14, 14))
                                        .addComponent(occupationField, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(phoneNumberField, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(54, 54, 54)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(viewYourProfile2)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(address2, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(town)
                                    .addComponent(zipCode, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(address, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(zipCodeField, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(townField, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(addressField2, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(addressField1, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                .addContainerGap(369, Short.MAX_VALUE))
        );

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {addressField1, addressField2, townField, zipCodeField});

        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(52, 52, 52)
                        .addComponent(backJButton))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(manageEnt1)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(viewYourProfile1)
                            .addComponent(viewYourProfile2))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(firstName)
                            .addComponent(firstNameField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(address)
                                .addComponent(addressField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(LastName)
                                    .addComponent(lastNameField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(address2)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(addressField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(16, 16, 16)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(2, 2, 2)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(emailID)
                                    .addComponent(emailIDField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(gender))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(town)
                                    .addComponent(townField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(6, 6, 6))
                    .addComponent(genderComboBox, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(occupation)
                    .addComponent(occupationField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(zipCode)
                    .addComponent(zipCodeField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(phoneNumber)
                    .addComponent(phoneNumberField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 16, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(areaCode)
                    .addComponent(userNameTxtField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(66, 66, 66)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(updateJButton)
                    .addComponent(saveJButton))
                .addGap(300, 300, 300))
        );

        layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {addressField1, addressField2, townField, zipCodeField});

    }// </editor-fold>//GEN-END:initComponents

    private void phoneNumberFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_phoneNumberFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_phoneNumberFieldActionPerformed

    private void updateJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateJButtonActionPerformed

        firstNameField.setEnabled(true);
        lastNameField.setEnabled(true);
        //dobField.setEnabled(true);
        genderComboBox.setEnabled(true);
        addressField1.setEnabled(true);
        addressField2.setEnabled(true);
        townField.setEnabled(true);
        zipCodeField.setEnabled(true);
        occupationField.setEnabled(true);
        userNameTxtField.setEnabled(true);
        phoneNumberField.setEnabled(true);
        saveJButton.setEnabled(true);
        updateJButton.setEnabled(false);
        firstNameField.setEditable(true);
        lastNameField.setEditable(true);
       // dobField.setEditable(true);
        addressField1.setEditable(true);
         addressField2.setEditable(true);
        townField.setEditable(true);
        zipCodeField.setEditable(true);
        occupationField.setEditable(true);
        userNameTxtField.setEditable(true);
        phoneNumberField.setEditable(true);
    }//GEN-LAST:event_updateJButtonActionPerformed

    private void saveJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveJButtonActionPerformed

       
        if(firstNameField.getText()!= null && !firstNameField.getText().isEmpty() &&
            lastNameField.getText()!= null && !lastNameField.getText().isEmpty() &&
           addressField1.getText()!=null && !addressField1.getText().isEmpty() &&
            addressField2.getText()!=null && !addressField2.getText().isEmpty() &&
            townField.getText()!=null && !townField.getText().isEmpty() &&
            occupationField.getText()!=null && !occupationField.getText().isEmpty() &&
            emailIDField.getText()!=null && !emailIDField.getText().isEmpty() &&
             userNameTxtField.getText()!=null && !userNameTxtField.getText().isEmpty() 
                && genderComboBox.getSelectedIndex()>=1 && 
             zipCodeField.getText()!=null && !zipCodeField.getText().isEmpty())
        {
            try
            {
                 if(!(users.getName().equals(userNameTxtField.getText()))&&!(usersCatalog.checkUniqueName(userNameTxtField.getText())))
                    {
                        JOptionPane.showMessageDialog(null, "Users Name already exists!, Please Enter valid users name","warning", JOptionPane.WARNING_MESSAGE);
                        return;
                    }
                 
                
//                  Date dateOfBirthVal = new SimpleDateFormat("MM/dd/yyyy").parse(dobField.getText()) ;
//                  int age = SysValidations.ageCalculation(dateOfBirthVal);
//                   if(age<12)
//                    {
//                    JOptionPane.showMessageDialog(null, "Your age does not q userlify to be a Volunteer!","warning", JOptionPane.WARNING_MESSAGE);
//                     return;
//                    }
                    person.setFirstName(firstNameField.getText());
                    person.setLastName(lastNameField.getText());
                    person.setAddress2(addressField2.getText());
                    person.setAddress1(addressField1.getText());
                    person.setTown(townField.getText());
                    person.setZipCode(zipCodeField.getText());
                    person.setOccupation(occupationField.getText());
                    users.setName(userNameTxtField.getText());
                    //person.setDob(dateOfBirthVal);
                    person.setPhoneNumber(phoneNumberField.getText());
            }
            catch(NumberFormatException nfe)
            {
                JOptionPane.showMessageDialog(this, "Please Enter valid details", "warning",JOptionPane.WARNING_MESSAGE);
            return;
            }
//            catch(ParseException pe)
//            {
//            JOptionPane.showMessageDialog(this, "Please Enter valid details", "warning",JOptionPane.WARNING_MESSAGE);
//            return; 
//            }
           
             JOptionPane.showMessageDialog(null, "Your Profile has been updated successfully", "success", JOptionPane.PLAIN_MESSAGE);
                updateJButton.setEnabled(true);
                saveJButton.setEnabled(false);
                firstNameField.setEnabled(false);
                lastNameField.setEnabled(false);
                addressField2.setEnabled(false);
//                dobField.setEnabled(false);
                genderComboBox.setEnabled(false);
                addressField1.setEnabled(false);
                townField.setEnabled(false);
                zipCodeField.setEnabled(false);
                occupationField.setEnabled(false);
                emailIDField.setEnabled(false);
                userNameTxtField.setEnabled(false);
                phoneNumberField.setEnabled(false);
         }
        else
        {
            JOptionPane.showMessageDialog(null, "Please Enter data in all the fields");
        }

    }//GEN-LAST:event_saveJButtonActionPerformed

    private void backJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backJButtonActionPerformed

        userProcessContainer.remove(this);
        CardLayout layout = (CardLayout)userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_backJButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel LastName;
    private javax.swing.JLabel address;
    private javax.swing.JLabel address2;
    private javax.swing.JTextField addressField1;
    private javax.swing.JTextField addressField2;
    private javax.swing.JLabel areaCode;
    private javax.swing.JButton backJButton;
    private javax.swing.JLabel emailID;
    private javax.swing.JTextField emailIDField;
    private javax.swing.JLabel firstName;
    private javax.swing.JTextField firstNameField;
    private javax.swing.JLabel gender;
    private javax.swing.JComboBox genderComboBox;
    private javax.swing.JTextField lastNameField;
    private javax.swing.JLabel manageEnt;
    private javax.swing.JLabel manageEnt1;
    private javax.swing.JLabel occupation;
    private javax.swing.JTextField occupationField;
    private javax.swing.JLabel phoneNumber;
    private javax.swing.JTextField phoneNumberField;
    private javax.swing.JButton saveJButton;
    private javax.swing.JLabel town;
    private javax.swing.JTextField townField;
    private javax.swing.JButton updateJButton;
    private javax.swing.JTextField userNameTxtField;
    private javax.swing.JLabel viewYourProfile1;
    private javax.swing.JLabel viewYourProfile2;
    private javax.swing.JLabel zipCode;
    private javax.swing.JTextField zipCodeField;
    // End of variables declaration//GEN-END:variables
}
