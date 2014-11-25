package fys;

import java.awt.HeadlessException;
import java.sql.SQLException;
import java.sql.*;
import javax.swing.*;
import net.proteanit.sql.DbUtils;
import javax.swing.JOptionPane;

public class SerDesEmp_NewCase extends javax.swing.JPanel {
Connection conn=null;
ResultSet rs=null;
PreparedStatement pst=null;

    public SerDesEmp_NewCase() {
        initComponents();
        conn=javaconnect.ConnecrDb();
        Manual_Panel.setVisible(false);
        Manual_Panel.setEnabled(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Manual_Panel = new javax.swing.JPanel();
        Label_ManualExit = new javax.swing.JLabel();
        Label_CallManual = new javax.swing.JLabel();
        logo = new javax.swing.JLabel();
        employee_id = new javax.swing.JLabel();
        fname_field = new javax.swing.JTextField();
        first_name = new javax.swing.JLabel();
        lname_field = new javax.swing.JTextField();
        last_name = new javax.swing.JLabel();
        city_field = new javax.swing.JTextField();
        username = new javax.swing.JLabel();
        zipcode_field = new javax.swing.JTextField();
        password = new javax.swing.JLabel();
        street_field = new javax.swing.JTextField();
        email = new javax.swing.JLabel();
        shipcountry_field = new javax.swing.JTextField();
        reset_button = new javax.swing.JLabel();
        save_button = new javax.swing.JLabel();
        shipzipcode_field = new javax.swing.JTextField();
        phone_number2 = new javax.swing.JLabel();
        last_name1 = new javax.swing.JLabel();
        jCheckBox1 = new javax.swing.JCheckBox();
        password3 = new javax.swing.JLabel();
        username2 = new javax.swing.JLabel();
        country_field = new javax.swing.JTextField();
        shipcity_field = new javax.swing.JTextField();
        shipaddress_field = new javax.swing.JTextField();
        password2 = new javax.swing.JLabel();
        employee_id4 = new javax.swing.JLabel();
        emailadress_field = new javax.swing.JTextField();
        phone_field = new javax.swing.JTextField();
        newclientaccount_button = new javax.swing.JLabel();
        newbagageaccount_button = new javax.swing.JLabel();
        updatecase_button = new javax.swing.JLabel();
        LogOut_button4 = new javax.swing.JLabel();
        Background = new javax.swing.JLabel();
        Reset_button = new javax.swing.JLabel();

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

        add(Manual_Panel, new org.netbeans.lib.awtextra.AbsoluteConstraints(980, 80, 290, 590));

        Label_CallManual.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Label_CallManual.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Label_CallManualMouseClicked(evt);
            }
        });
        add(Label_CallManual, new org.netbeans.lib.awtextra.AbsoluteConstraints(1210, 20, 50, 50));

        logo.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        add(logo, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 290, 70));

        employee_id.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        employee_id.setForeground(new java.awt.Color(153, 0, 0));
        employee_id.setText("First name:");
        add(employee_id, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 250, -1, -1));

        fname_field.setForeground(new java.awt.Color(153, 0, 0));
        fname_field.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        add(fname_field, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 250, 320, 30));

        first_name.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        first_name.setForeground(new java.awt.Color(153, 0, 0));
        first_name.setText("Last name:");
        add(first_name, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 290, -1, -1));

        lname_field.setForeground(new java.awt.Color(153, 0, 0));
        lname_field.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        add(lname_field, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 290, 320, 30));

        last_name.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        last_name.setForeground(new java.awt.Color(153, 0, 0));
        last_name.setText("City:");
        add(last_name, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 370, -1, -1));

        city_field.setForeground(new java.awt.Color(153, 0, 0));
        city_field.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        add(city_field, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 370, 320, 30));

        username.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        username.setForeground(new java.awt.Color(153, 0, 0));
        username.setText("Zip Code:");
        add(username, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 410, -1, -1));

        zipcode_field.setForeground(new java.awt.Color(153, 0, 0));
        zipcode_field.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        add(zipcode_field, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 410, 320, 30));

        password.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        password.setForeground(new java.awt.Color(153, 0, 0));
        password.setText("Address:");
        add(password, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 450, -1, -1));

        street_field.setForeground(new java.awt.Color(153, 0, 0));
        street_field.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        add(street_field, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 450, 320, 30));

        email.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        email.setForeground(new java.awt.Color(153, 0, 0));
        email.setText("phone number:");
        add(email, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 490, -1, -1));

        shipcountry_field.setForeground(new java.awt.Color(153, 0, 0));
        shipcountry_field.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        add(shipcountry_field, new org.netbeans.lib.awtextra.AbsoluteConstraints(940, 290, 320, 30));

        reset_button.setBackground(new java.awt.Color(34, 153, 68));
        reset_button.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        reset_button.setForeground(new java.awt.Color(255, 255, 255));
        reset_button.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        reset_button.setText("Reset");
        reset_button.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        reset_button.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        reset_button.setOpaque(true);
        reset_button.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                reset_buttonMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                reset_buttonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                reset_buttonMouseExited(evt);
            }
        });
        add(reset_button, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 600, 130, -1));

        save_button.setBackground(new java.awt.Color(34, 153, 68));
        save_button.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        save_button.setForeground(new java.awt.Color(255, 255, 255));
        save_button.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        save_button.setText("Save");
        save_button.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        save_button.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        save_button.setOpaque(true);
        save_button.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                save_buttonMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                save_buttonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                save_buttonMouseExited(evt);
            }
        });
        add(save_button, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 600, 130, -1));

        shipzipcode_field.setForeground(new java.awt.Color(153, 0, 0));
        shipzipcode_field.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        add(shipzipcode_field, new org.netbeans.lib.awtextra.AbsoluteConstraints(940, 330, 320, 30));

        phone_number2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        phone_number2.setForeground(new java.awt.Color(153, 0, 0));
        phone_number2.setText("Shipping country:");
        add(phone_number2, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 290, -1, -1));

        last_name1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        last_name1.setForeground(new java.awt.Color(153, 0, 0));
        last_name1.setText("Country:");
        add(last_name1, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 330, -1, -1));

        jCheckBox1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jCheckBox1.setForeground(new java.awt.Color(153, 0, 0));
        jCheckBox1.setText("Shipping adress same as living adress");
        jCheckBox1.setOpaque(false);
        jCheckBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox1ActionPerformed(evt);
            }
        });
        add(jCheckBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 240, 330, 40));

        password3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        password3.setForeground(new java.awt.Color(153, 0, 0));
        password3.setText("Shipping City:");
        add(password3, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 410, -1, -1));

        username2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        username2.setForeground(new java.awt.Color(153, 0, 0));
        username2.setText("Shipping Zip Code:");
        add(username2, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 330, -1, -1));

        country_field.setForeground(new java.awt.Color(153, 0, 0));
        country_field.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        add(country_field, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 330, 320, 30));

        shipcity_field.setForeground(new java.awt.Color(153, 0, 0));
        shipcity_field.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        add(shipcity_field, new org.netbeans.lib.awtextra.AbsoluteConstraints(940, 410, 320, 30));

        shipaddress_field.setForeground(new java.awt.Color(153, 0, 0));
        shipaddress_field.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        add(shipaddress_field, new org.netbeans.lib.awtextra.AbsoluteConstraints(940, 370, 320, 30));

        password2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        password2.setForeground(new java.awt.Color(153, 0, 0));
        password2.setText("Shipping Address:");
        add(password2, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 370, -1, -1));

        employee_id4.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        employee_id4.setForeground(new java.awt.Color(153, 0, 0));
        employee_id4.setText("E-mail address:");
        add(employee_id4, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 530, -1, -1));

        emailadress_field.setForeground(new java.awt.Color(153, 0, 0));
        emailadress_field.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        add(emailadress_field, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 530, 320, 30));

        phone_field.setForeground(new java.awt.Color(153, 0, 0));
        phone_field.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        add(phone_field, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 490, 320, 30));

        newclientaccount_button.setBackground(new java.awt.Color(255, 255, 255));
        newclientaccount_button.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        newclientaccount_button.setForeground(new java.awt.Color(156, 10, 13));
        newclientaccount_button.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        newclientaccount_button.setText("New Client Case");
        newclientaccount_button.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        newclientaccount_button.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        newclientaccount_button.setOpaque(true);
        newclientaccount_button.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                newclientaccount_buttonMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                newclientaccount_buttonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                newclientaccount_buttonMouseExited(evt);
            }
        });
        add(newclientaccount_button, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 110, 250, 40));

        newbagageaccount_button.setBackground(new java.awt.Color(156, 0, 0));
        newbagageaccount_button.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        newbagageaccount_button.setForeground(new java.awt.Color(255, 255, 255));
        newbagageaccount_button.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        newbagageaccount_button.setText("New Bagage Case");
        newbagageaccount_button.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        newbagageaccount_button.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        newbagageaccount_button.setOpaque(true);
        newbagageaccount_button.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                newbagageaccount_buttonMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                newbagageaccount_buttonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                newbagageaccount_buttonMouseExited(evt);
            }
        });
        add(newbagageaccount_button, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 110, 250, 40));

        updatecase_button.setBackground(new java.awt.Color(156, 0, 0));
        updatecase_button.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        updatecase_button.setForeground(new java.awt.Color(255, 255, 255));
        updatecase_button.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        updatecase_button.setText("Update Case");
        updatecase_button.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        updatecase_button.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        updatecase_button.setOpaque(true);
        updatecase_button.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                updatecase_buttonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                updatecase_buttonMouseExited(evt);
            }
        });
        add(updatecase_button, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 110, 250, 40));

        LogOut_button4.setBackground(new java.awt.Color(156, 10, 13));
        LogOut_button4.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        LogOut_button4.setForeground(new java.awt.Color(255, 255, 255));
        LogOut_button4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        LogOut_button4.setText("Log Out");
        LogOut_button4.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        LogOut_button4.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        LogOut_button4.setOpaque(true);
        LogOut_button4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                LogOut_button4MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                LogOut_button4MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                LogOut_button4MouseExited(evt);
            }
        });
        add(LogOut_button4, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 110, 250, 40));

        Background.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        Background.setForeground(new java.awt.Color(153, 0, 0));
        Background.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Background.setIcon(new javax.swing.ImageIcon(getClass().getResource("/fys/Images/Background.png"))); // NOI18N
        Background.setOpaque(true);
        add(Background, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -30, 1280, 780));

        Reset_button.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        Reset_button.setForeground(new java.awt.Color(153, 0, 0));
        Reset_button.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Reset_button.setIcon(new javax.swing.ImageIcon(getClass().getResource("/fys/Images/Background.png"))); // NOI18N
        Reset_button.setOpaque(true);
        add(Reset_button, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -30, 1280, 780));
    }// </editor-fold>//GEN-END:initComponents


    private void reset_buttonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_reset_buttonMouseEntered
        reset_button.setBackground(new java.awt.Color(51, 136, 68));
    }//GEN-LAST:event_reset_buttonMouseEntered

    private void reset_buttonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_reset_buttonMouseExited
        reset_button.setBackground(new java.awt.Color(34, 153, 68));
    }//GEN-LAST:event_reset_buttonMouseExited

    private void save_buttonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_save_buttonMouseEntered
        save_button.setBackground(new java.awt.Color(51, 136, 68));

    }//GEN-LAST:event_save_buttonMouseEntered

    private void save_buttonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_save_buttonMouseExited
        save_button.setBackground(new java.awt.Color(34, 153, 68));

    }//GEN-LAST:event_save_buttonMouseExited

    private void jCheckBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jCheckBox1ActionPerformed

    private void save_buttonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_save_buttonMouseClicked
       try {
            
            
            String sql= "insert into client (name,lastname,country,city,zipcode,address,phonenumber,email,shippingcountry,shippingzipcode,shippingaddress,shippingcity)value(?,?,?,?,?,?,?,?,?,?,?,?)";
            pst=conn.prepareStatement(sql);
            
            pst.setString(1, fname_field.getText());
            pst.setString(2, lname_field.getText());
            pst.setString(3, country_field.getText());
            pst.setString(4, city_field.getText());
            pst.setString(5, zipcode_field.getText());
            pst.setString(6, street_field.getText());
            pst.setString(7, phone_field.getText());
            pst.setString(8, emailadress_field.getText());
            pst.setString(9, shipcountry_field.getText());
            pst.setString(10, shipzipcode_field.getText());
            pst.setString(11, shipaddress_field.getText());
            pst.setString(12, shipcity_field.getText());

               
            
            pst.execute();
            JOptionPane.showMessageDialog(null, "Saved"); 
            
            
        }catch(SQLException | HeadlessException e) {
            
            JOptionPane.showMessageDialog(null, e);    
        }
    }//GEN-LAST:event_save_buttonMouseClicked

    private void reset_buttonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_reset_buttonMouseClicked

                   fname_field.setText("");
                   lname_field.setText("");
                   city_field.setText("");
                   zipcode_field.setText("");
                   street_field.setText("");
                   phone_field.setText("");
                   emailadress_field.setText("");
                   shipcountry_field.setText("");
                   shipzipcode_field.setText("");
                   shipaddress_field.setText("");
                   shipcity_field.setText("");
           
    }//GEN-LAST:event_reset_buttonMouseClicked

    private void newclientaccount_buttonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_newclientaccount_buttonMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_newclientaccount_buttonMouseClicked

    private void newclientaccount_buttonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_newclientaccount_buttonMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_newclientaccount_buttonMouseEntered

    private void newclientaccount_buttonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_newclientaccount_buttonMouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_newclientaccount_buttonMouseExited

    private void newbagageaccount_buttonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_newbagageaccount_buttonMouseClicked
        FYS.getInstance().showPage(new SerDesEmp_NewCase());
    }//GEN-LAST:event_newbagageaccount_buttonMouseClicked

    private void newbagageaccount_buttonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_newbagageaccount_buttonMouseEntered

    }//GEN-LAST:event_newbagageaccount_buttonMouseEntered

    private void newbagageaccount_buttonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_newbagageaccount_buttonMouseExited

    }//GEN-LAST:event_newbagageaccount_buttonMouseExited

    private void updatecase_buttonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_updatecase_buttonMouseEntered
        updatecase_button.setBackground(new java.awt.Color(255, 255, 255));
        updatecase_button.setForeground(new java.awt.Color(153, 0, 0));
    }//GEN-LAST:event_updatecase_buttonMouseEntered

    private void updatecase_buttonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_updatecase_buttonMouseExited
        updatecase_button.setBackground(new java.awt.Color(153, 0, 0));

        updatecase_button.setForeground(new java.awt.Color(255, 255, 255));
    }//GEN-LAST:event_updatecase_buttonMouseExited

    private void LogOut_button4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LogOut_button4MouseClicked
        FYS.getInstance().showPage(new SerDesEmp_LogOut());
    }//GEN-LAST:event_LogOut_button4MouseClicked

    private void LogOut_button4MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LogOut_button4MouseEntered
        LogOut_button4.setBackground(new java.awt.Color(255, 255, 255));
    }//GEN-LAST:event_LogOut_button4MouseEntered

    private void LogOut_button4MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LogOut_button4MouseExited
        LogOut_button4.setBackground(new java.awt.Color(153, 0, 0));
    }//GEN-LAST:event_LogOut_button4MouseExited

    private void Label_ManualExitMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Label_ManualExitMouseClicked
        Manual_Panel.setVisible(false);
        Manual_Panel.setEnabled(false);
    }//GEN-LAST:event_Label_ManualExitMouseClicked

    private void Label_CallManualMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Label_CallManualMouseClicked
        Manual_Panel.setVisible(true);
        Manual_Panel.setEnabled(true);
    }//GEN-LAST:event_Label_CallManualMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Background;
    private javax.swing.JLabel Label_CallManual;
    private javax.swing.JLabel Label_ManualExit;
    private javax.swing.JLabel LogOut_button4;
    private javax.swing.JPanel Manual_Panel;
    private javax.swing.JLabel Reset_button;
    private javax.swing.JTextField city_field;
    private javax.swing.JTextField country_field;
    private javax.swing.JLabel email;
    private javax.swing.JTextField emailadress_field;
    private javax.swing.JLabel employee_id;
    private javax.swing.JLabel employee_id4;
    private javax.swing.JLabel first_name;
    private javax.swing.JTextField fname_field;
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JLabel last_name;
    private javax.swing.JLabel last_name1;
    private javax.swing.JTextField lname_field;
    private javax.swing.JLabel logo;
    private javax.swing.JLabel newbagageaccount_button;
    private javax.swing.JLabel newclientaccount_button;
    private javax.swing.JLabel password;
    private javax.swing.JLabel password2;
    private javax.swing.JLabel password3;
    private javax.swing.JTextField phone_field;
    private javax.swing.JLabel phone_number2;
    private javax.swing.JLabel reset_button;
    private javax.swing.JLabel save_button;
    private javax.swing.JTextField shipaddress_field;
    private javax.swing.JTextField shipcity_field;
    private javax.swing.JTextField shipcountry_field;
    private javax.swing.JTextField shipzipcode_field;
    private javax.swing.JTextField street_field;
    private javax.swing.JLabel updatecase_button;
    private javax.swing.JLabel username;
    private javax.swing.JLabel username2;
    private javax.swing.JTextField zipcode_field;
    // End of variables declaration//GEN-END:variables
}
