package fys;
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
    }
private void Update_table(){
    try{
    String sql = "select * from employee";
    pst=conn.prepareStatement(sql);
    rs=pst.executeQuery();
    table_accounts.setModel(DbUtils.resultSetToTableModel(rs));
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
        jSeparator3 = new javax.swing.JSeparator();
        Label_AccountType = new javax.swing.JLabel();
        Label_FirstName1 = new javax.swing.JLabel();
        Label_FirstName = new javax.swing.JLabel();
        Label_LastName = new javax.swing.JLabel();
        Label_Username = new javax.swing.JLabel();
        Label_Password = new javax.swing.JLabel();
        Label_Email = new javax.swing.JLabel();
        Label_PhoneNumber = new javax.swing.JLabel();
        Radio_ServiceDeskEmployee = new javax.swing.JRadioButton();
        Radio_Manager = new javax.swing.JRadioButton();
        Radio_ApplicationManager = new javax.swing.JRadioButton();
        Field_employeeID = new javax.swing.JTextField();
        Field_FirstName = new javax.swing.JTextField();
        Field_LastName = new javax.swing.JTextField();
        Field_Username = new javax.swing.JTextField();
        Field_Password = new javax.swing.JTextField();
        Field_Email = new javax.swing.JTextField();
        Field_PhoneNumber = new javax.swing.JTextField();
        Button_Cancel = new javax.swing.JLabel();
        Button_Save = new javax.swing.JLabel();
        Label_Search = new javax.swing.JLabel();
        Field_Search = new javax.swing.JTextField();
        Button_Delete = new javax.swing.JLabel();
        Tab_LogOut = new javax.swing.JLabel();
        Tab_ManageAccounts = new javax.swing.JLabel();
        Tab_NewAccount = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        table_accounts = new javax.swing.JTable();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        Background = new javax.swing.JLabel();

        setMaximumSize(new java.awt.Dimension(1280, 720));
        setMinimumSize(new java.awt.Dimension(1280, 720));
        setName(""); // NOI18N
        setPreferredSize(new java.awt.Dimension(1280, 720));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 150, 270, 10));

        Label_AccountType.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        Label_AccountType.setForeground(new java.awt.Color(153, 0, 0));
        Label_AccountType.setText("Account Type:");
        add(Label_AccountType, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 180, -1, -1));

        Label_FirstName1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        Label_FirstName1.setForeground(new java.awt.Color(153, 0, 0));
        Label_FirstName1.setText("Employee ID:");
        add(Label_FirstName1, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 290, -1, -1));

        Label_FirstName.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        Label_FirstName.setForeground(new java.awt.Color(153, 0, 0));
        Label_FirstName.setText("First Name:");
        add(Label_FirstName, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 330, -1, -1));

        Label_LastName.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        Label_LastName.setForeground(new java.awt.Color(153, 0, 0));
        Label_LastName.setText("Last Name:");
        add(Label_LastName, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 370, -1, -1));

        Label_Username.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        Label_Username.setForeground(new java.awt.Color(153, 0, 0));
        Label_Username.setText("Username:");
        add(Label_Username, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 410, -1, -1));

        Label_Password.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        Label_Password.setForeground(new java.awt.Color(153, 0, 0));
        Label_Password.setText("Password:");
        add(Label_Password, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 450, -1, -1));

        Label_Email.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        Label_Email.setForeground(new java.awt.Color(153, 0, 0));
        Label_Email.setText("Email:");
        add(Label_Email, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 490, -1, -1));

        Label_PhoneNumber.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        Label_PhoneNumber.setForeground(new java.awt.Color(153, 0, 0));
        Label_PhoneNumber.setText("Phone Number:");
        add(Label_PhoneNumber, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 530, -1, -1));

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
        add(Radio_ServiceDeskEmployee, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 210, -1, -1));

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
        add(Radio_Manager, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 180, -1, -1));

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
        add(Radio_ApplicationManager, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 240, -1, -1));

        Field_employeeID.setForeground(new java.awt.Color(153, 0, 0));
        Field_employeeID.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        add(Field_employeeID, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 290, 210, 30));

        Field_FirstName.setForeground(new java.awt.Color(153, 0, 0));
        Field_FirstName.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        add(Field_FirstName, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 330, 210, 30));

        Field_LastName.setForeground(new java.awt.Color(153, 0, 0));
        Field_LastName.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        add(Field_LastName, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 370, 210, 30));

        Field_Username.setForeground(new java.awt.Color(153, 0, 0));
        Field_Username.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        add(Field_Username, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 410, 210, 30));

        Field_Password.setForeground(new java.awt.Color(153, 0, 0));
        Field_Password.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        add(Field_Password, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 450, 210, 30));

        Field_Email.setForeground(new java.awt.Color(153, 0, 0));
        Field_Email.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        add(Field_Email, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 490, 210, 30));

        Field_PhoneNumber.setForeground(new java.awt.Color(153, 0, 0));
        Field_PhoneNumber.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        add(Field_PhoneNumber, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 530, 210, 30));

        Button_Cancel.setBackground(new java.awt.Color(34, 153, 68));
        Button_Cancel.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        Button_Cancel.setForeground(new java.awt.Color(255, 255, 255));
        Button_Cancel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Button_Cancel.setText("Reset");
        Button_Cancel.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Button_Cancel.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        Button_Cancel.setOpaque(true);
        Button_Cancel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Button_CancelMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                Button_CancelMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                Button_CancelMouseExited(evt);
            }
        });
        add(Button_Cancel, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 580, 110, -1));

        Button_Save.setBackground(new java.awt.Color(34, 153, 68));
        Button_Save.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        Button_Save.setForeground(new java.awt.Color(255, 255, 255));
        Button_Save.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Button_Save.setText("Save Changes");
        Button_Save.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Button_Save.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        Button_Save.setOpaque(true);
        Button_Save.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Button_SaveMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                Button_SaveMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                Button_SaveMouseExited(evt);
            }
        });
        add(Button_Save, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 580, 200, -1));

        Label_Search.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        Label_Search.setForeground(new java.awt.Color(153, 0, 0));
        Label_Search.setText("Search Employee ID:");
        add(Label_Search, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 220, -1, -1));

        Field_Search.setForeground(new java.awt.Color(153, 0, 0));
        Field_Search.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        Field_Search.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                Field_SearchKeyReleased(evt);
            }
        });
        add(Field_Search, new org.netbeans.lib.awtextra.AbsoluteConstraints(870, 220, 210, 30));

        Button_Delete.setBackground(new java.awt.Color(34, 153, 68));
        Button_Delete.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        Button_Delete.setForeground(new java.awt.Color(255, 255, 255));
        Button_Delete.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Button_Delete.setText("Delete");
        Button_Delete.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Button_Delete.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        Button_Delete.setOpaque(true);
        Button_Delete.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Button_DeleteMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                Button_DeleteMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                Button_DeleteMouseExited(evt);
            }
        });
        add(Button_Delete, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 580, 90, -1));

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

        jScrollPane1.setBackground(new java.awt.Color(255, 255, 255));

        table_accounts.setModel(new javax.swing.table.DefaultTableModel(
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
        table_accounts.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                table_accountsMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(table_accounts);
        if (table_accounts.getColumnModel().getColumnCount() > 0) {
            table_accounts.getColumnModel().getColumn(0).setResizable(false);
            table_accounts.getColumnModel().getColumn(1).setResizable(false);
            table_accounts.getColumnModel().getColumn(2).setResizable(false);
            table_accounts.getColumnModel().getColumn(3).setResizable(false);
        }

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 290, 690, 270));
        add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(-10, 640, 1320, 30));
        add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 150, 760, 10));

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

    private void Tab_NewAccountMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Tab_NewAccountMouseEntered
        Tab_NewAccount.setBackground(new java.awt.Color(255, 255, 255));
        Tab_NewAccount.setForeground(new java.awt.Color(153, 0, 0));
    }//GEN-LAST:event_Tab_NewAccountMouseEntered

    private void Tab_NewAccountMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Tab_NewAccountMouseExited
        Tab_NewAccount.setBackground(new java.awt.Color(153, 0, 0));
        Tab_NewAccount.setForeground(new java.awt.Color(255, 255, 255));
     }//GEN-LAST:event_Tab_NewAccountMouseExited

    private void Button_SaveMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Button_SaveMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_Button_SaveMouseEntered

    private void Button_SaveMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Button_SaveMouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_Button_SaveMouseExited

    private void Button_DeleteMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Button_DeleteMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_Button_DeleteMouseEntered

    private void Button_DeleteMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Button_DeleteMouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_Button_DeleteMouseExited

    private void Tab_NewAccountMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Tab_NewAccountMouseClicked
        FYS.getInstance().showPage(new AppMan_NewAccount());
    }//GEN-LAST:event_Tab_NewAccountMouseClicked

    private void Tab_ManageAccountsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Tab_ManageAccountsMouseClicked
        FYS.getInstance().showPage(new AppMan_ManageAccounts());
    }//GEN-LAST:event_Tab_ManageAccountsMouseClicked

    private void Tab_LogOutMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Tab_LogOutMouseClicked
        FYS.getInstance().showPage(new AppMan_LogOut());
    }//GEN-LAST:event_Tab_LogOutMouseClicked

    private void Radio_ServiceDeskEmployeeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Radio_ServiceDeskEmployeeActionPerformed
        accounttype="servicedesk employee";
    }//GEN-LAST:event_Radio_ServiceDeskEmployeeActionPerformed

    private void table_accountsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_table_accountsMouseClicked
       try {
           int row =table_accounts.getSelectedRow();
           String Table_click=(table_accounts.getModel().getValueAt(row, 0).toString());
           String sql ="select * from employee where employeeID='"+Table_click+"' ";
           pst=conn.prepareStatement(sql);
           rs=pst.executeQuery();
           if(rs.next()){
           
               String add1 =rs.getString("employeeID");
               Field_employeeID.setText(add1);
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
      
      
    }//GEN-LAST:event_table_accountsMouseClicked

    private void Button_DeleteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Button_DeleteMouseClicked
       int p = JOptionPane.showConfirmDialog(null, "Do you really want to delete this account?","Delete Account",JOptionPane.YES_NO_OPTION );
        if(p==0){
            
        
        String sql="delete from employee where employeeID=?";
        try{
            
            pst = conn.prepareStatement(sql); 
            
            pst.setString(1, Field_employeeID.getText());
            
            pst.execute();
            JOptionPane.showMessageDialog(null, "Deleted");
            
        }catch(Exception e){
            
           JOptionPane.showMessageDialog(null, e);
            
        }
        Update_table();
        }
    }//GEN-LAST:event_Button_DeleteMouseClicked

    private void Button_CancelMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Button_CancelMouseExited
        Button_Cancel.setBackground(new java.awt.Color(34, 153, 68));
    }//GEN-LAST:event_Button_CancelMouseExited

    private void Button_CancelMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Button_CancelMouseEntered
        Button_Cancel.setBackground(new java.awt.Color(51, 136, 68));
    }//GEN-LAST:event_Button_CancelMouseEntered

    private void Button_SaveMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Button_SaveMouseClicked
        try {
            

            String value1= Field_employeeID.getText();
            String value2= Field_FirstName.getText();
            String value3= Field_LastName.getText();
            String value4= Field_Username.getText();
            String value5= Field_Password.getText();
            String value6= Field_Email.getText();
            String value7= Field_PhoneNumber.getText();
            String value8= accounttype;
            
            String sql="update employee set employeeID='"+value1+"' ,name = '"+value2+"',lastname = '"+value3+"',username = '"+value4+"',password = '"+value5+"',email = '"+value6+"' ,phonenumber = '"+value7+"',function = '"+value8+"' where employeeID='"+value1+"' ";
            pst=conn.prepareStatement(sql);
            pst.execute();
            JOptionPane.showMessageDialog(null, "Updated"); 
            
            
        }catch(Exception e) {
            
            JOptionPane.showMessageDialog(null, e);    
        }
        Update_table();
    }//GEN-LAST:event_Button_SaveMouseClicked

    private void Button_CancelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Button_CancelMouseClicked
        Field_employeeID.setText("");
        Field_FirstName.setText("");
        Field_LastName.setText("");
        Field_Username.setText("");
        Field_Password.setText("");
        Field_Email.setText("");
        Field_PhoneNumber.setText("");
    }//GEN-LAST:event_Button_CancelMouseClicked

    private void Field_SearchKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_Field_SearchKeyReleased
        try{
                String sql ="select * from employee where employeeID=?";
                
                pst=conn.prepareStatement(sql);
                pst.setString(1, Field_Search.getText());
                
                rs=pst.executeQuery();
                if(rs.next()){
                    String add1=rs.getString("employeeID");
                    Field_employeeID.setText(add1);
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


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Background;
    private javax.swing.JLabel Button_Cancel;
    private javax.swing.JLabel Button_Delete;
    private javax.swing.JLabel Button_Save;
    private javax.swing.JTextField Field_Email;
    private javax.swing.JTextField Field_FirstName;
    private javax.swing.JTextField Field_LastName;
    private javax.swing.JTextField Field_Password;
    private javax.swing.JTextField Field_PhoneNumber;
    private javax.swing.JTextField Field_Search;
    private javax.swing.JTextField Field_Username;
    private javax.swing.JTextField Field_employeeID;
    private javax.swing.JLabel Label_AccountType;
    private javax.swing.JLabel Label_Email;
    private javax.swing.JLabel Label_FirstName;
    private javax.swing.JLabel Label_FirstName1;
    private javax.swing.JLabel Label_LastName;
    private javax.swing.JLabel Label_Password;
    private javax.swing.JLabel Label_PhoneNumber;
    private javax.swing.JLabel Label_Search;
    private javax.swing.JLabel Label_Username;
    private javax.swing.JRadioButton Radio_ApplicationManager;
    private javax.swing.JRadioButton Radio_Manager;
    private javax.swing.JRadioButton Radio_ServiceDeskEmployee;
    private javax.swing.JLabel Tab_LogOut;
    private javax.swing.JLabel Tab_ManageAccounts;
    private javax.swing.JLabel Tab_NewAccount;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JTable table_accounts;
    // End of variables declaration//GEN-END:variables

private String accounttype;

}
