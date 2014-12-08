package fys;

import java.awt.*;
import java.awt.event.KeyEvent;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.*;

public class Login extends javax.swing.JPanel {

    Connection conn = null;
    ResultSet rs = null;
    PreparedStatement pst = null;
    String employeeFunction;

    public Login() {
        initComponents();
        conn = javaconnect.ConnecrDb();

        Manual_Panel.setVisible(false);
        Manual_Panel.setEnabled(false);
    }

    public void close() {
        this.setVisible(false);
    }

    /**
     * This method is called from within the constructor to initialize the form. WARNING: Do NOT
     * modify this code. The content of this method is always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Manual_Panel = new javax.swing.JPanel();
        Label_ManualExit = new javax.swing.JLabel();
        Label_Title = new javax.swing.JLabel();
        Label_Info = new javax.swing.JLabel();
        Label_CallManual = new javax.swing.JLabel();
        Label_Username = new javax.swing.JLabel();
        Label_Password = new javax.swing.JLabel();
        Field_Username = new javax.swing.JTextField();
        Field_Password = new javax.swing.JPasswordField();
        Button_LogIn = new javax.swing.JLabel();
        Tab_LogIn = new javax.swing.JLabel();
        Background = new javax.swing.JLabel();

        setMaximumSize(new java.awt.Dimension(1280, 720));
        setMinimumSize(new java.awt.Dimension(1280, 720));
        setName(""); // NOI18N
        setPreferredSize(new java.awt.Dimension(1280, 720));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Manual_Panel.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        Manual_Panel.setEnabled(false);
        Manual_Panel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Label_ManualExit.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Label_ManualExit.setText("X");
        Label_ManualExit.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Label_ManualExit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Label_ManualExitMouseClicked(evt);
            }
        });
        Manual_Panel.add(Label_ManualExit, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 0, 20, 20));

        Label_Title.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        Label_Title.setForeground(new java.awt.Color(153, 0, 0));
        Label_Title.setText("Manual");
        Manual_Panel.add(Label_Title, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 80, 30));

        Label_Info.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        Label_Info.setForeground(new java.awt.Color(153, 0, 0));
        Label_Info.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Label_Info.setText("<html>\nPlease fill in your username and<br>\npassword, then click on 'Log In'.<br>\n<br>\nIf you've forgotten your login<br>\ndetails or are otherwise having<br>\ntrouble logging in, please contact<br>\nthe application manager.");
        Label_Info.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        Manual_Panel.add(Label_Info, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 80, 250, 420));

        add(Manual_Panel, new org.netbeans.lib.awtextra.AbsoluteConstraints(980, 80, 290, 590));

        Label_CallManual.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Label_CallManual.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Label_CallManualMouseClicked(evt);
            }
        });
        add(Label_CallManual, new org.netbeans.lib.awtextra.AbsoluteConstraints(1210, 20, 50, 50));

        Label_Username.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        Label_Username.setForeground(new java.awt.Color(153, 0, 0));
        Label_Username.setText("Username:");
        add(Label_Username, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 290, -1, -1));

        Label_Password.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        Label_Password.setForeground(new java.awt.Color(153, 0, 0));
        Label_Password.setText("Password:");
        add(Label_Password, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 330, -1, -1));

        Field_Username.setForeground(new java.awt.Color(153, 0, 0));
        Field_Username.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        add(Field_Username, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 290, 520, 30));

        Field_Password.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        Field_Password.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                Field_PasswordKeyPressed(evt);
            }
        });
        add(Field_Password, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 330, 520, 30));

        Button_LogIn.setBackground(new java.awt.Color(34, 153, 68));
        Button_LogIn.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        Button_LogIn.setForeground(new java.awt.Color(255, 255, 255));
        Button_LogIn.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Button_LogIn.setText("Log In");
        Button_LogIn.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        Button_LogIn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Button_LogIn.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        Button_LogIn.setOpaque(true);
        Button_LogIn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Button_LogInMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                Button_LogInMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                Button_LogInMouseExited(evt);
            }
        });
        Button_LogIn.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                Button_LogInKeyPressed(evt);
            }
        });
        add(Button_LogIn, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 390, 130, 30));

        Tab_LogIn.setBackground(new java.awt.Color(255, 255, 255));
        Tab_LogIn.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        Tab_LogIn.setForeground(new java.awt.Color(153, 0, 0));
        Tab_LogIn.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Tab_LogIn.setText("Log In");
        Tab_LogIn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Tab_LogIn.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        Tab_LogIn.setOpaque(true);
        add(Tab_LogIn, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 110, 250, 40));

        Background.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        Background.setForeground(new java.awt.Color(153, 0, 0));
        Background.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Background.setIcon(new javax.swing.ImageIcon(getClass().getResource("/fys/Images/Background.png"))); // NOI18N
        Background.setOpaque(true);
        add(Background, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -30, 1280, 780));
    }// </editor-fold>//GEN-END:initComponents


    private void Button_LogInMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Button_LogInMouseEntered
        Button_LogIn.setBackground(new java.awt.Color(51, 136, 68));
    }//GEN-LAST:event_Button_LogInMouseEntered

    private void Button_LogInMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Button_LogInMouseExited
        Button_LogIn.setBackground(new java.awt.Color(34, 153, 68));
    }//GEN-LAST:event_Button_LogInMouseExited

    private void Button_LogInMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Button_LogInMouseClicked
        logIn();
    }//GEN-LAST:event_Button_LogInMouseClicked

    private void Label_ManualExitMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Label_ManualExitMouseClicked
        Manual_Panel.setVisible(false);
        Manual_Panel.setEnabled(false);
    }//GEN-LAST:event_Label_ManualExitMouseClicked

    private void Label_CallManualMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Label_CallManualMouseClicked
        Manual_Panel.setVisible(true);
        Manual_Panel.setEnabled(true);
    }//GEN-LAST:event_Label_CallManualMouseClicked

    private void Button_LogInKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_Button_LogInKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_Button_LogInKeyPressed

    private void Field_PasswordKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_Field_PasswordKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            logIn();
        }
    }//GEN-LAST:event_Field_PasswordKeyPressed

    private void logIn() {
        String sql = "select * from employee where username=? and password=?";
        try {
            pst = conn.prepareStatement(sql);
            pst.setString(1, Field_Username.getText());
            pst.setString(2, Field_Password.getText());

            rs = pst.executeQuery();

            if (rs.next()) {
                createLog(rs.getString("employeeID"));
                Employee.setCurrentUser(Field_Username.getText());

                employeeFunction = rs.getString("function");

                switch (employeeFunction) {
                    case "application manager":
                        FYS.getInstance().showPage(new AppMan_Home());
                        break;
                    case "manager":
                        FYS.getInstance().showPage(new Man_Home());
                        break;
                    case "service desk employee":
                        FYS.getInstance().showPage(new SerDesEmp_Home());
                        break;
                    default:
                        break;
                }
                
                rs.close();
                pst.close();
                close();

            } else {
                JOptionPane.showMessageDialog(null, "Username and Password is not correct");
            }
        } catch (SQLException | HeadlessException e) {

            JOptionPane.showMessageDialog(null, e);
        }
    }
    
    private void createLog(String employeeID) {
        try {
            String sql = "INSERT INTO log (employeeID, action, tab)value(?,?,?)";
            pst = conn.prepareStatement(sql);

            pst.setString(1, employeeID);
            pst.setString(2, "Logged in");
            pst.setString(3, "LogIn");

            pst.execute();
        } catch (SQLException | HeadlessException e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Background;
    private javax.swing.JLabel Button_LogIn;
    private javax.swing.JPasswordField Field_Password;
    private javax.swing.JTextField Field_Username;
    private javax.swing.JLabel Label_CallManual;
    private javax.swing.JLabel Label_Info;
    private javax.swing.JLabel Label_ManualExit;
    private javax.swing.JLabel Label_Password;
    private javax.swing.JLabel Label_Title;
    private javax.swing.JLabel Label_Username;
    private javax.swing.JPanel Manual_Panel;
    private javax.swing.JLabel Tab_LogIn;
    // End of variables declaration//GEN-END:variables
}
