package fys;
import java.awt.HeadlessException;
import java.sql.*;
import javax.swing.*;
import net.proteanit.sql.DbUtils;

public class AppMan_ManageAccounts extends javax.swing.JPanel {
Connection conn=null;
ResultSet rs=null;
PreparedStatement pst=null;

    public AppMan_ManageAccounts() {
        initComponents();
        conn=javaconnect.ConnecrDb();
        Update_table();
        
        Panel_Manual.setVisible(false);
        Panel_Manual.setEnabled(false);
    }
private void Update_table(){
    try{
    String sql = "select * from employee";
    pst=conn.prepareStatement(sql);
    rs=pst.executeQuery();
    Table_Accounts.setModel(DbUtils.resultSetToTableModel(rs));
    }
    catch(Exception e){
        JOptionPane.showMessageDialog(null, e);
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

        buttonGroup1 = new javax.swing.ButtonGroup();
        Label_Logo = new javax.swing.JLabel();
        Label_CallManual = new javax.swing.JLabel();
        Panel_Manual = new javax.swing.JPanel();
        Label_ManualExit = new javax.swing.JLabel();
        Label_Info = new javax.swing.JLabel();
        Label_Title = new javax.swing.JLabel();
        Label_Search = new javax.swing.JLabel();
        Field_Search = new javax.swing.JTextField();
        ScrollPane_Accounts = new javax.swing.JScrollPane();
        Table_Accounts = new javax.swing.JTable();
        Button_DeleteAccount = new javax.swing.JLabel();
        Label_AccountType = new javax.swing.JLabel();
        Label_FirstName = new javax.swing.JLabel();
        Label_LastName = new javax.swing.JLabel();
        Label_Username = new javax.swing.JLabel();
        Label_Password = new javax.swing.JLabel();
        Label_EmailAddress = new javax.swing.JLabel();
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
        Button_SaveChanges = new javax.swing.JLabel();
        Button_ResetChanges = new javax.swing.JLabel();
        Tab_NewAccount = new javax.swing.JLabel();
        Tab_ManageAccounts = new javax.swing.JLabel();
        Tab_LogOut = new javax.swing.JLabel();
        Background = new javax.swing.JLabel();

        setMaximumSize(new java.awt.Dimension(1280, 720));
        setMinimumSize(new java.awt.Dimension(1280, 720));
        setName(""); // NOI18N
        setPreferredSize(new java.awt.Dimension(1280, 720));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Label_Logo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Label_LogoMouseClicked(evt);
            }
        });
        add(Label_Logo, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 320, 60));

        Label_CallManual.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Label_CallManual.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Label_CallManualMouseClicked(evt);
            }
        });
        add(Label_CallManual, new org.netbeans.lib.awtextra.AbsoluteConstraints(1210, 20, 50, 50));

        Panel_Manual.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        Panel_Manual.setEnabled(false);
        Panel_Manual.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Label_ManualExit.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Label_ManualExit.setText("X");
        Label_ManualExit.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Label_ManualExit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Label_ManualExitMouseClicked(evt);
            }
        });
        Panel_Manual.add(Label_ManualExit, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 0, 20, 20));

        Label_Info.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        Label_Info.setForeground(new java.awt.Color(153, 0, 0));
        Label_Info.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Label_Info.setText("<html> On the left side of the screen, you can search by employee ID for a particular account. Click on the desired account within the  generated list and you will be able to edit it using the list of fields to the right. You can delete the account entirely by using the 'Delete' button. You can reset any  changes back to their original status with the 'Reset' button, and you can permanently save any changes you've made with the 'Save Changes' button.");
        Label_Info.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        Panel_Manual.add(Label_Info, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 80, 250, 420));

        Label_Title.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        Label_Title.setForeground(new java.awt.Color(153, 0, 0));
        Label_Title.setText("Manual");
        Panel_Manual.add(Label_Title, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 80, 30));

        add(Panel_Manual, new org.netbeans.lib.awtextra.AbsoluteConstraints(980, 80, 290, 590));

        Label_Search.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        Label_Search.setForeground(new java.awt.Color(153, 0, 0));
        Label_Search.setText("Search Employee ID:");
        add(Label_Search, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 220, -1, -1));

        Field_Search.setForeground(new java.awt.Color(153, 0, 0));
        Field_Search.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        Field_Search.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                Field_SearchKeyReleased(evt);
            }
        });
        add(Field_Search, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 220, 210, 30));

        ScrollPane_Accounts.setBackground(new java.awt.Color(255, 255, 255));

        Table_Accounts.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        Table_Accounts.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Table_AccountsMouseClicked(evt);
            }
        });
        ScrollPane_Accounts.setViewportView(Table_Accounts);
        if (Table_Accounts.getColumnModel().getColumnCount() > 0) {
            Table_Accounts.getColumnModel().getColumn(0).setResizable(false);
            Table_Accounts.getColumnModel().getColumn(1).setResizable(false);
            Table_Accounts.getColumnModel().getColumn(2).setResizable(false);
            Table_Accounts.getColumnModel().getColumn(3).setResizable(false);
        }

        add(ScrollPane_Accounts, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 270, 690, 290));

        Button_DeleteAccount.setBackground(new java.awt.Color(34, 153, 68));
        Button_DeleteAccount.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        Button_DeleteAccount.setForeground(new java.awt.Color(255, 255, 255));
        Button_DeleteAccount.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Button_DeleteAccount.setText("Delete Account");
        Button_DeleteAccount.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Button_DeleteAccount.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        Button_DeleteAccount.setOpaque(true);
        Button_DeleteAccount.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Button_DeleteAccountMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                Button_DeleteAccountMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                Button_DeleteAccountMouseExited(evt);
            }
        });
        add(Button_DeleteAccount, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 580, 220, -1));

        Label_AccountType.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        Label_AccountType.setForeground(new java.awt.Color(153, 0, 0));
        Label_AccountType.setText("Account Type:");
        add(Label_AccountType, new org.netbeans.lib.awtextra.AbsoluteConstraints(840, 220, -1, -1));

        Label_FirstName.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        Label_FirstName.setForeground(new java.awt.Color(153, 0, 0));
        Label_FirstName.setText("First Name:");
        add(Label_FirstName, new org.netbeans.lib.awtextra.AbsoluteConstraints(840, 320, -1, -1));

        Label_LastName.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        Label_LastName.setForeground(new java.awt.Color(153, 0, 0));
        Label_LastName.setText("Last Name:");
        add(Label_LastName, new org.netbeans.lib.awtextra.AbsoluteConstraints(840, 360, -1, -1));

        Label_Username.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        Label_Username.setForeground(new java.awt.Color(153, 0, 0));
        Label_Username.setText("Username:");
        add(Label_Username, new org.netbeans.lib.awtextra.AbsoluteConstraints(840, 400, -1, -1));

        Label_Password.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        Label_Password.setForeground(new java.awt.Color(153, 0, 0));
        Label_Password.setText("Password:");
        add(Label_Password, new org.netbeans.lib.awtextra.AbsoluteConstraints(840, 440, -1, -1));

        Label_EmailAddress.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        Label_EmailAddress.setForeground(new java.awt.Color(153, 0, 0));
        Label_EmailAddress.setText("Email Address:");
        add(Label_EmailAddress, new org.netbeans.lib.awtextra.AbsoluteConstraints(840, 480, -1, -1));

        Label_PhoneNumber.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        Label_PhoneNumber.setForeground(new java.awt.Color(153, 0, 0));
        Label_PhoneNumber.setText("Phone Number:");
        add(Label_PhoneNumber, new org.netbeans.lib.awtextra.AbsoluteConstraints(840, 520, -1, -1));

        Radio_ServiceDeskEmployee.setBackground(new java.awt.Color(255, 255, 255));
        buttonGroup1.add(Radio_ServiceDeskEmployee);
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
        add(Radio_ServiceDeskEmployee, new org.netbeans.lib.awtextra.AbsoluteConstraints(1000, 220, -1, -1));

        Radio_Manager.setBackground(new java.awt.Color(255, 255, 255));
        buttonGroup1.add(Radio_Manager);
        Radio_Manager.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        Radio_Manager.setForeground(new java.awt.Color(153, 0, 0));
        Radio_Manager.setText("Manager");
        Radio_Manager.setBorder(null);
        Radio_Manager.setOpaque(false);
        Radio_Manager.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Radio_ManagerActionPerformed(evt);
            }
        });
        add(Radio_Manager, new org.netbeans.lib.awtextra.AbsoluteConstraints(1000, 250, -1, -1));

        Radio_ApplicationManager.setBackground(new java.awt.Color(255, 255, 255));
        buttonGroup1.add(Radio_ApplicationManager);
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
        add(Radio_ApplicationManager, new org.netbeans.lib.awtextra.AbsoluteConstraints(1000, 280, -1, -1));

        Field_FirstName.setForeground(new java.awt.Color(153, 0, 0));
        Field_FirstName.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        add(Field_FirstName, new org.netbeans.lib.awtextra.AbsoluteConstraints(1000, 320, 210, 30));

        Field_LastName.setForeground(new java.awt.Color(153, 0, 0));
        Field_LastName.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        add(Field_LastName, new org.netbeans.lib.awtextra.AbsoluteConstraints(1000, 360, 210, 30));

        Field_Username.setForeground(new java.awt.Color(153, 0, 0));
        Field_Username.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        add(Field_Username, new org.netbeans.lib.awtextra.AbsoluteConstraints(1000, 400, 210, 30));

        Field_Password.setForeground(new java.awt.Color(153, 0, 0));
        Field_Password.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        add(Field_Password, new org.netbeans.lib.awtextra.AbsoluteConstraints(1000, 440, 210, 30));

        Field_Email.setForeground(new java.awt.Color(153, 0, 0));
        Field_Email.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        add(Field_Email, new org.netbeans.lib.awtextra.AbsoluteConstraints(1000, 480, 210, 30));

        Field_PhoneNumber.setForeground(new java.awt.Color(153, 0, 0));
        Field_PhoneNumber.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        add(Field_PhoneNumber, new org.netbeans.lib.awtextra.AbsoluteConstraints(1000, 520, 210, 30));

        Button_SaveChanges.setBackground(new java.awt.Color(34, 153, 68));
        Button_SaveChanges.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        Button_SaveChanges.setForeground(new java.awt.Color(255, 255, 255));
        Button_SaveChanges.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Button_SaveChanges.setText("Save Changes");
        Button_SaveChanges.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Button_SaveChanges.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        Button_SaveChanges.setOpaque(true);
        Button_SaveChanges.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Button_SaveChangesMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                Button_SaveChangesMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                Button_SaveChangesMouseExited(evt);
            }
        });
        add(Button_SaveChanges, new org.netbeans.lib.awtextra.AbsoluteConstraints(840, 580, 170, -1));

        Button_ResetChanges.setBackground(new java.awt.Color(34, 153, 68));
        Button_ResetChanges.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        Button_ResetChanges.setForeground(new java.awt.Color(255, 255, 255));
        Button_ResetChanges.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Button_ResetChanges.setText("Reset Changes");
        Button_ResetChanges.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Button_ResetChanges.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        Button_ResetChanges.setOpaque(true);
        Button_ResetChanges.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Button_ResetChangesMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                Button_ResetChangesMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                Button_ResetChangesMouseExited(evt);
            }
        });
        add(Button_ResetChanges, new org.netbeans.lib.awtextra.AbsoluteConstraints(1030, 580, 180, -1));

        Tab_NewAccount.setBackground(new java.awt.Color(156, 10, 13));
        Tab_NewAccount.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        Tab_NewAccount.setForeground(new java.awt.Color(255, 255, 255));
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

        Tab_ManageAccounts.setBackground(new java.awt.Color(255, 255, 255));
        Tab_ManageAccounts.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        Tab_ManageAccounts.setForeground(new java.awt.Color(156, 10, 13));
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

    }//GEN-LAST:event_Tab_ManageAccountsMouseEntered

    private void Tab_ManageAccountsMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Tab_ManageAccountsMouseExited

    }//GEN-LAST:event_Tab_ManageAccountsMouseExited


    private void Radio_ApplicationManagerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Radio_ApplicationManagerActionPerformed
        accounttype="application manager";
    }//GEN-LAST:event_Radio_ApplicationManagerActionPerformed

    private void Tab_LogOutMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Tab_LogOutMouseEntered
        Tab_LogOut.setBackground(new java.awt.Color(255, 255, 255));
        Tab_LogOut.setForeground(new java.awt.Color(153, 0, 0));     }//GEN-LAST:event_Tab_LogOutMouseEntered

    private void Tab_LogOutMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Tab_LogOutMouseExited
        Tab_LogOut.setBackground(new java.awt.Color(153, 0, 0));
        Tab_LogOut.setForeground(new java.awt.Color(255, 255, 255));    }//GEN-LAST:event_Tab_LogOutMouseExited

    private void Button_SaveChangesMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Button_SaveChangesMouseEntered
        Button_SaveChanges.setBackground(new java.awt.Color(51, 136, 68));
    }//GEN-LAST:event_Button_SaveChangesMouseEntered

    private void Button_SaveChangesMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Button_SaveChangesMouseExited
        Button_SaveChanges.setBackground(new java.awt.Color(34, 153, 68));
    }//GEN-LAST:event_Button_SaveChangesMouseExited

    private void Button_DeleteAccountMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Button_DeleteAccountMouseEntered
        Button_DeleteAccount.setBackground(new java.awt.Color(51, 136, 68));
    }//GEN-LAST:event_Button_DeleteAccountMouseEntered

    private void Button_DeleteAccountMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Button_DeleteAccountMouseExited
        Button_DeleteAccount.setBackground(new java.awt.Color(34, 153, 68));
    }//GEN-LAST:event_Button_DeleteAccountMouseExited

    private void Tab_ManageAccountsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Tab_ManageAccountsMouseClicked
        FYS.getInstance().showPage(new AppMan_ManageAccounts());
    }//GEN-LAST:event_Tab_ManageAccountsMouseClicked

    private void Tab_LogOutMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Tab_LogOutMouseClicked
        FYS.getInstance().showPage(new AppMan_LogOut());
    }//GEN-LAST:event_Tab_LogOutMouseClicked

    private void Radio_ServiceDeskEmployeeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Radio_ServiceDeskEmployeeActionPerformed
        accounttype="servicedesk employee";
    }//GEN-LAST:event_Radio_ServiceDeskEmployeeActionPerformed

    private void Table_AccountsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Table_AccountsMouseClicked
       try {
           int row =Table_Accounts.getSelectedRow();
           String Table_click=(Table_Accounts.getModel().getValueAt(row, 0).toString());
           String sql ="select * from employee where employeeID='"+Table_click+"' ";
           pst=conn.prepareStatement(sql);
           rs=pst.executeQuery();
           if(rs.next()){

               String add2 =rs.getString("name");
               Field_FirstName.setText(add2);
               String add3 =rs.getString("lastname");
               Field_LastName.setText(add3);
               String add4 =rs.getString("username");
               Field_Username.setText(add4);
               String add5 =rs.getString("password");
               Field_Password.setText(add5);
               String add6 =rs.getString("email");
               Field_Email.setText(add6);
               String add7 =rs.getString("phonenumber");
               Field_PhoneNumber.setText(add7);
               
           }
       }catch(Exception e){
           
           JOptionPane.showMessageDialog(null, e);
           
       }
      
      
    }//GEN-LAST:event_Table_AccountsMouseClicked

    private void Button_DeleteAccountMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Button_DeleteAccountMouseClicked
       int p = JOptionPane.showConfirmDialog(null, "Do you really want to delete this account?","Delete Account",JOptionPane.YES_NO_OPTION );
        if(p==0){
            
        
        String sql="delete from employee where employeeID=?";
        try{
            
            pst = conn.prepareStatement(sql); 
            
            pst.setString(1, Field_FirstName.getText());
            
            pst.execute();
            JOptionPane.showMessageDialog(null, "Deleted");
            
        }catch(SQLException | HeadlessException e){
            
           JOptionPane.showMessageDialog(null, e);
            
        }
        Update_table();
        }
    }//GEN-LAST:event_Button_DeleteAccountMouseClicked

    private void Button_ResetChangesMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Button_ResetChangesMouseExited
        Button_ResetChanges.setBackground(new java.awt.Color(34, 153, 68));
    }//GEN-LAST:event_Button_ResetChangesMouseExited

    private void Button_ResetChangesMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Button_ResetChangesMouseEntered
        Button_ResetChanges.setBackground(new java.awt.Color(51, 136, 68));
    }//GEN-LAST:event_Button_ResetChangesMouseEntered

    private void Button_SaveChangesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Button_SaveChangesMouseClicked
        try {
            

            
            String value2= Field_FirstName.getText();
            String value3= Field_LastName.getText();
            String value4= Field_Username.getText();
            String value5= Field_Password.getText();
            String value6= Field_Email.getText();
            String value7= Field_PhoneNumber.getText();
            String value8= accounttype;
            
            String sql="update employee set name = '"+value2+"',lastname = '"+value3+"',username = '"+value4+"',password = '"+value5+"',email = '"+value6+"' ,phonenumber = '"+value7+"',function = '"+value8+"' where employeeID='"+value2+"' ";
            pst=conn.prepareStatement(sql);
            pst.execute();
            JOptionPane.showMessageDialog(null, "Updated"); 
            
            
        }catch(Exception e) {
            
            JOptionPane.showMessageDialog(null, e);    
        }
        Update_table();
    }//GEN-LAST:event_Button_SaveChangesMouseClicked

    private void Button_ResetChangesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Button_ResetChangesMouseClicked
        
        Field_FirstName.setText("");
        Field_LastName.setText("");
        Field_Username.setText("");
        Field_Password.setText("");
        Field_Email.setText("");
        Field_PhoneNumber.setText("");
    }//GEN-LAST:event_Button_ResetChangesMouseClicked

    private void Field_SearchKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_Field_SearchKeyReleased
        try{
                String sql ="select * from employee where employeeID=?";
                
                pst=conn.prepareStatement(sql);
                pst.setString(1, Field_Search.getText());
                
                rs=pst.executeQuery();
                if(rs.next()){
                    String add1=rs.getString("employeeID");
                    
                    String add2=rs.getString("name");
                    Field_FirstName.setText(add2);
                    String add3=rs.getString("lastname");
                    Field_LastName.setText(add3);
                    String add4=rs.getString("username");
                    Field_Username.setText(add4);
                    String add5=rs.getString("password");
                    Field_Password.setText(add5);
                    String add6=rs.getString("email");
                    Field_Email.setText(add6);
                    String add7=rs.getString("phonenumber");
                    Field_PhoneNumber.setText(add7);
                }
        }
        catch(Exception e){
            
            JOptionPane.showMessageDialog(null, e);
        }      
          
    }//GEN-LAST:event_Field_SearchKeyReleased

    private void Radio_ManagerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Radio_ManagerActionPerformed
      accounttype="manager";
    }//GEN-LAST:event_Radio_ManagerActionPerformed

    private void Label_CallManualMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Label_CallManualMouseClicked
        Panel_Manual.setVisible(true);
        Panel_Manual.setEnabled(true);
    }//GEN-LAST:event_Label_CallManualMouseClicked

    private void Label_ManualExitMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Label_ManualExitMouseClicked
        Panel_Manual.setVisible(false);
        Panel_Manual.setEnabled(false);
    }//GEN-LAST:event_Label_ManualExitMouseClicked

    private void Tab_NewAccountMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Tab_NewAccountMouseExited
        Tab_NewAccount.setBackground(new java.awt.Color(153, 0, 0));
        Tab_NewAccount.setForeground(new java.awt.Color(255, 255, 255));
    }//GEN-LAST:event_Tab_NewAccountMouseExited

    private void Tab_NewAccountMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Tab_NewAccountMouseEntered
        Tab_NewAccount.setBackground(new java.awt.Color(255, 255, 255));
        Tab_NewAccount.setForeground(new java.awt.Color(153, 0, 0));
    }//GEN-LAST:event_Tab_NewAccountMouseEntered

    private void Tab_NewAccountMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Tab_NewAccountMouseClicked
        FYS.getInstance().showPage(new AppMan_NewAccount());
    }//GEN-LAST:event_Tab_NewAccountMouseClicked

    private void Label_LogoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Label_LogoMouseClicked
        FYS.getInstance().showPage(new AppMan_Home());
    }//GEN-LAST:event_Label_LogoMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Background;
    private javax.swing.JLabel Button_DeleteAccount;
    private javax.swing.JLabel Button_ResetChanges;
    private javax.swing.JLabel Button_SaveChanges;
    private javax.swing.JTextField Field_Email;
    private javax.swing.JTextField Field_FirstName;
    private javax.swing.JTextField Field_LastName;
    private javax.swing.JTextField Field_Password;
    private javax.swing.JTextField Field_PhoneNumber;
    private javax.swing.JTextField Field_Search;
    private javax.swing.JTextField Field_Username;
    private javax.swing.JLabel Label_AccountType;
    private javax.swing.JLabel Label_CallManual;
    private javax.swing.JLabel Label_EmailAddress;
    private javax.swing.JLabel Label_FirstName;
    private javax.swing.JLabel Label_Info;
    private javax.swing.JLabel Label_LastName;
    private javax.swing.JLabel Label_Logo;
    private javax.swing.JLabel Label_ManualExit;
    private javax.swing.JLabel Label_Password;
    private javax.swing.JLabel Label_PhoneNumber;
    private javax.swing.JLabel Label_Search;
    private javax.swing.JLabel Label_Title;
    private javax.swing.JLabel Label_Username;
    private javax.swing.JPanel Panel_Manual;
    private javax.swing.JRadioButton Radio_ApplicationManager;
    private javax.swing.JRadioButton Radio_Manager;
    private javax.swing.JRadioButton Radio_ServiceDeskEmployee;
    private javax.swing.JScrollPane ScrollPane_Accounts;
    private javax.swing.JLabel Tab_LogOut;
    private javax.swing.JLabel Tab_ManageAccounts;
    private javax.swing.JLabel Tab_NewAccount;
    private javax.swing.JTable Table_Accounts;
    private javax.swing.ButtonGroup buttonGroup1;
    // End of variables declaration//GEN-END:variables

private String accounttype;

}
