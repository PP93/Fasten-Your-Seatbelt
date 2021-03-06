package fys;

import javax.swing.ImageIcon;

public class AppMan_NewAccount extends javax.swing.JPanel {

    public AppMan_NewAccount() {
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

        Label_AccountType = new javax.swing.JLabel();
        Label_FirstName = new javax.swing.JLabel();
        Label_LastName = new javax.swing.JLabel();
        Label_Username = new javax.swing.JLabel();
        Label_Password = new javax.swing.JLabel();
        Label_Email = new javax.swing.JLabel();
        Label_PhoneNumber = new javax.swing.JLabel();
        Radio_ServiceDeskEmployee = new javax.swing.JRadioButton();
        Radio_Manager = new javax.swing.JRadioButton();
        Radio_ApplicationManager = new javax.swing.JRadioButton();
        Field_FirstName = new javax.swing.JTextField();
        Field_LastName = new javax.swing.JTextField();
        Field_Username = new javax.swing.JTextField();
        Field_Password = new javax.swing.JTextField();
        Field_Email = new javax.swing.JTextField();
        Field_PhoneNumber = new javax.swing.JTextField();
        Button_Reset = new javax.swing.JLabel();
        Button_Save = new javax.swing.JLabel();
        Tab_NewAccount = new javax.swing.JLabel();
        Tab_ManageAccounts = new javax.swing.JLabel();
        Tab_LogOut = new javax.swing.JLabel();
        Background = new javax.swing.JLabel();

        setMaximumSize(new java.awt.Dimension(1280, 720));
        setMinimumSize(new java.awt.Dimension(1280, 720));
        setName(""); // NOI18N
        setPreferredSize(new java.awt.Dimension(1280, 720));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Label_AccountType.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        Label_AccountType.setForeground(new java.awt.Color(153, 0, 0));
        Label_AccountType.setText("Account Type:");
        add(Label_AccountType, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 250, -1, -1));

        Label_FirstName.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        Label_FirstName.setForeground(new java.awt.Color(153, 0, 0));
        Label_FirstName.setText("First Name:");
        add(Label_FirstName, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 290, -1, -1));

        Label_LastName.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        Label_LastName.setForeground(new java.awt.Color(153, 0, 0));
        Label_LastName.setText("Last Name:");
        add(Label_LastName, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 330, -1, -1));

        Label_Username.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        Label_Username.setForeground(new java.awt.Color(153, 0, 0));
        Label_Username.setText("Username:");
        add(Label_Username, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 370, -1, -1));

        Label_Password.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        Label_Password.setForeground(new java.awt.Color(153, 0, 0));
        Label_Password.setText("Password:");
        add(Label_Password, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 410, -1, -1));

        Label_Email.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        Label_Email.setForeground(new java.awt.Color(153, 0, 0));
        Label_Email.setText("Email:");
        add(Label_Email, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 450, -1, -1));

        Label_PhoneNumber.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        Label_PhoneNumber.setForeground(new java.awt.Color(153, 0, 0));
        Label_PhoneNumber.setText("Phone Number:");
        add(Label_PhoneNumber, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 490, -1, -1));

        Radio_ServiceDeskEmployee.setBackground(new java.awt.Color(255, 255, 255));
        Radio_ServiceDeskEmployee.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        Radio_ServiceDeskEmployee.setForeground(new java.awt.Color(153, 0, 0));
        Radio_ServiceDeskEmployee.setText("Service Desk Employee");
        Radio_ServiceDeskEmployee.setBorder(null);
        Radio_ServiceDeskEmployee.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        Radio_ServiceDeskEmployee.setOpaque(false);
        Radio_ServiceDeskEmployee.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Radio_ServiceDeskEmployeeActionPerformed(evt);
            }
        });
        add(Radio_ServiceDeskEmployee, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 250, -1, -1));

        Radio_Manager.setBackground(new java.awt.Color(255, 255, 255));
        Radio_Manager.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        Radio_Manager.setForeground(new java.awt.Color(153, 0, 0));
        Radio_Manager.setText("Manager");
        Radio_Manager.setBorder(null);
        Radio_Manager.setOpaque(false);
        add(Radio_Manager, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 250, -1, -1));

        Radio_ApplicationManager.setBackground(new java.awt.Color(255, 255, 255));
        Radio_ApplicationManager.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        Radio_ApplicationManager.setForeground(new java.awt.Color(153, 0, 0));
        Radio_ApplicationManager.setText("Application Manager");
        Radio_ApplicationManager.setBorder(null);
        Radio_ApplicationManager.setOpaque(false);
        Radio_ApplicationManager.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Radio_ApplicationManagerActionPerformed(evt);
            }
        });
        add(Radio_ApplicationManager, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 250, -1, -1));

        Field_FirstName.setForeground(new java.awt.Color(153, 0, 0));
        Field_FirstName.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        add(Field_FirstName, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 290, 520, 30));

        Field_LastName.setForeground(new java.awt.Color(153, 0, 0));
        Field_LastName.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        add(Field_LastName, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 330, 520, 30));

        Field_Username.setForeground(new java.awt.Color(153, 0, 0));
        Field_Username.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        add(Field_Username, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 370, 520, 30));

        Field_Password.setForeground(new java.awt.Color(153, 0, 0));
        Field_Password.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        add(Field_Password, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 410, 520, 30));

        Field_Email.setForeground(new java.awt.Color(153, 0, 0));
        Field_Email.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        add(Field_Email, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 450, 520, 30));

        Field_PhoneNumber.setForeground(new java.awt.Color(153, 0, 0));
        Field_PhoneNumber.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        add(Field_PhoneNumber, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 490, 520, 30));

        Button_Reset.setBackground(new java.awt.Color(34, 153, 68));
        Button_Reset.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        Button_Reset.setForeground(new java.awt.Color(255, 255, 255));
        Button_Reset.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Button_Reset.setText("Reset");
        Button_Reset.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Button_Reset.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        Button_Reset.setOpaque(true);
        Button_Reset.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                Button_ResetMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                Button_ResetMouseExited(evt);
            }
        });
        add(Button_Reset, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 530, 130, -1));

        Button_Save.setBackground(new java.awt.Color(34, 153, 68));
        Button_Save.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        Button_Save.setForeground(new java.awt.Color(255, 255, 255));
        Button_Save.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Button_Save.setText("Save");
        Button_Save.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Button_Save.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        Button_Save.setOpaque(true);
        Button_Save.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                Button_SaveMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                Button_SaveMouseExited(evt);
            }
        });
        add(Button_Save, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 530, 130, -1));

        Tab_NewAccount.setBackground(new java.awt.Color(255, 255, 255));
        Tab_NewAccount.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        Tab_NewAccount.setForeground(new java.awt.Color(156, 10, 13));
        Tab_NewAccount.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Tab_NewAccount.setText("New Account");
        Tab_NewAccount.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Tab_NewAccount.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        Tab_NewAccount.setOpaque(true);
        Tab_NewAccount.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Tab_NewAccountMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                Tab_NewAccountMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                Tab_NewAccountMouseExited(evt);
            }
        });
        add(Tab_NewAccount, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 110, 250, 40));

        Tab_ManageAccounts.setBackground(new java.awt.Color(156, 10, 13));
        Tab_ManageAccounts.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        Tab_ManageAccounts.setForeground(new java.awt.Color(255, 255, 255));
        Tab_ManageAccounts.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Tab_ManageAccounts.setText("Manage Accounts");
        Tab_ManageAccounts.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Tab_ManageAccounts.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        Tab_ManageAccounts.setOpaque(true);
        Tab_ManageAccounts.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Tab_ManageAccountsMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                Tab_ManageAccountsMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                Tab_ManageAccountsMouseExited(evt);
            }
        });
        add(Tab_ManageAccounts, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 110, 250, 40));

        Tab_LogOut.setBackground(new java.awt.Color(156, 10, 13));
        Tab_LogOut.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        Tab_LogOut.setForeground(new java.awt.Color(255, 255, 255));
        Tab_LogOut.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Tab_LogOut.setText("Log Out");
        Tab_LogOut.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Tab_LogOut.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        Tab_LogOut.setOpaque(true);
        Tab_LogOut.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Tab_LogOutMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                Tab_LogOutMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                Tab_LogOutMouseExited(evt);
            }
        });
        add(Tab_LogOut, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 110, 250, 40));

        Background.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        Background.setForeground(new java.awt.Color(153, 0, 0));
        Background.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Background.setIcon(new javax.swing.ImageIcon(getClass().getResource("/fys/Images/Background.png"))); // NOI18N
        Background.setOpaque(true);
        add(Background, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -30, 1280, 780));
    }// </editor-fold>//GEN-END:initComponents

    private void Tab_ManageAccountsMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Tab_ManageAccountsMouseEntered
        Tab_ManageAccounts.setBackground(new java.awt.Color(255, 255, 255));
        Tab_ManageAccounts.setForeground(new java.awt.Color(153, 0, 0));
    }//GEN-LAST:event_Tab_ManageAccountsMouseEntered

    private void Tab_ManageAccountsMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Tab_ManageAccountsMouseExited
        Tab_ManageAccounts.setBackground(new java.awt.Color(153, 0, 0));

        Tab_ManageAccounts.setForeground(new java.awt.Color(255, 255, 255));

    }//GEN-LAST:event_Tab_ManageAccountsMouseExited


    private void Button_ResetMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Button_ResetMouseEntered
        Button_Reset.setBackground(new java.awt.Color(51, 136, 68));
    }//GEN-LAST:event_Button_ResetMouseEntered

    private void Button_ResetMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Button_ResetMouseExited
        Button_Reset.setBackground(new java.awt.Color(34, 153, 68));
    }//GEN-LAST:event_Button_ResetMouseExited

    private void Radio_ApplicationManagerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Radio_ApplicationManagerActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Radio_ApplicationManagerActionPerformed

    private void Button_SaveMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Button_SaveMouseEntered
        Button_Save.setBackground(new java.awt.Color(51, 136, 68));

    }//GEN-LAST:event_Button_SaveMouseEntered

    private void Button_SaveMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Button_SaveMouseExited
        Button_Save.setBackground(new java.awt.Color(34, 153, 68));

    }//GEN-LAST:event_Button_SaveMouseExited

    private void Tab_LogOutMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Tab_LogOutMouseEntered
        Tab_LogOut.setBackground(new java.awt.Color(255, 255, 255));
        Tab_LogOut.setForeground(new java.awt.Color(153, 0, 0));     }//GEN-LAST:event_Tab_LogOutMouseEntered

    private void Tab_LogOutMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Tab_LogOutMouseExited
        Tab_LogOut.setBackground(new java.awt.Color(153, 0, 0));

        Tab_LogOut.setForeground(new java.awt.Color(255, 255, 255));    }//GEN-LAST:event_Tab_LogOutMouseExited

    private void Tab_NewAccountMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Tab_NewAccountMouseEntered
    }//GEN-LAST:event_Tab_NewAccountMouseEntered

    private void Tab_NewAccountMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Tab_NewAccountMouseExited

     }//GEN-LAST:event_Tab_NewAccountMouseExited

    private void Tab_ManageAccountsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Tab_ManageAccountsMouseClicked
        FYS.getInstance().showPage(new AppMan_ManageAccounts());
    }//GEN-LAST:event_Tab_ManageAccountsMouseClicked

    private void Tab_LogOutMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Tab_LogOutMouseClicked
        FYS.getInstance().showPage(new AppMan_LogOut());
    }//GEN-LAST:event_Tab_LogOutMouseClicked

    private void Tab_NewAccountMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Tab_NewAccountMouseClicked
        FYS.getInstance().showPage(new AppMan_NewAccount());
    }//GEN-LAST:event_Tab_NewAccountMouseClicked

    private void Radio_ServiceDeskEmployeeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Radio_ServiceDeskEmployeeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Radio_ServiceDeskEmployeeActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Background;
    private javax.swing.JLabel Button_Reset;
    private javax.swing.JLabel Button_Save;
    private javax.swing.JTextField Field_Email;
    private javax.swing.JTextField Field_FirstName;
    private javax.swing.JTextField Field_LastName;
    private javax.swing.JTextField Field_Password;
    private javax.swing.JTextField Field_PhoneNumber;
    private javax.swing.JTextField Field_Username;
    private javax.swing.JLabel Label_AccountType;
    private javax.swing.JLabel Label_Email;
    private javax.swing.JLabel Label_FirstName;
    private javax.swing.JLabel Label_LastName;
    private javax.swing.JLabel Label_Password;
    private javax.swing.JLabel Label_PhoneNumber;
    private javax.swing.JLabel Label_Username;
    private javax.swing.JRadioButton Radio_ApplicationManager;
    private javax.swing.JRadioButton Radio_Manager;
    private javax.swing.JRadioButton Radio_ServiceDeskEmployee;
    private javax.swing.JLabel Tab_LogOut;
    private javax.swing.JLabel Tab_ManageAccounts;
    private javax.swing.JLabel Tab_NewAccount;
    // End of variables declaration//GEN-END:variables
}
