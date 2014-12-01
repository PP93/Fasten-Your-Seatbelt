/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fys;

import java.awt.HeadlessException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import net.proteanit.sql.DbUtils;

/**
 *
 * @author Leslie Fellensiek
 */
public class SerDesEmp_AddBagage extends javax.swing.JPanel {

    Connection conn = null;
    ResultSet rs = null;
    PreparedStatement pst = null;

    public SerDesEmp_AddBagage() {
        initComponents();
        conn = javaconnect.ConnecrDb();
        Panel_Manual.setVisible(false);
        Panel_Manual.setEnabled(false);
    }

    private void Update_table() {
        try {
            String sql = "select * from bagage";
            pst = conn.prepareStatement(sql);
            rs = pst.executeQuery();
            Table_ExtraBaggage.setModel(DbUtils.resultSetToTableModel(rs));
        } catch (Exception e) {
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

        Label_CallManual = new javax.swing.JLabel();
        Panel_Manual = new javax.swing.JPanel();
        Label_ManualExit = new javax.swing.JLabel();
        Label_Title = new javax.swing.JLabel();
        Label_Info = new javax.swing.JLabel();
        Label_SearchClientID = new javax.swing.JLabel();
        Field_SearchClientID = new javax.swing.JTextField();
        ScrollPane_Cases = new javax.swing.JScrollPane();
        Table_ExtraBaggage = new javax.swing.JTable();
        Label_BaggageInformation = new javax.swing.JLabel();
        Label_FlightNumber = new javax.swing.JLabel();
        Label_Brand = new javax.swing.JLabel();
        Label_Color = new javax.swing.JLabel();
        Label_Weight = new javax.swing.JLabel();
        Label_Description = new javax.swing.JLabel();
        Field_FlightNumber = new javax.swing.JTextField();
        Field_Brand = new javax.swing.JTextField();
        Field_Color = new javax.swing.JTextField();
        Field_Weight = new javax.swing.JTextField();
        Field_Description = new javax.swing.JTextField();
        Button_AddToCase = new javax.swing.JLabel();
        Button_Reset = new javax.swing.JLabel();
        Tab_NewCase = new javax.swing.JLabel();
        Tab_UpdateCase = new javax.swing.JLabel();
        Tab_AddExtraBaggage = new javax.swing.JLabel();
        Tab_LogOut = new javax.swing.JLabel();
        Background = new javax.swing.JLabel();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

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

        Label_Title.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        Label_Title.setForeground(new java.awt.Color(153, 0, 0));
        Label_Title.setText("Manual");
        Panel_Manual.add(Label_Title, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 80, 30));

        Label_Info.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        Label_Info.setForeground(new java.awt.Color(153, 0, 0));
        Label_Info.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Label_Info.setText("<html>\nOn the left side of the screen, fill in a\nsearch term for the case to which you'd like\nto add baggage. This will generate a list of cases\nthat match your search term. From the table,\nchoose the case you wish to update.\n<br>\n<br>\nOnce you've chosen the case to update,\nfill in the new baggage data to the right.\nIf you wish to remove all the data you've filled in\nand restart, click the 'Reset' button. If \nall the data you've filled in is correct, click 'Add'\nto add the baggage case to the chosen existing case.");
        Label_Info.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        Panel_Manual.add(Label_Info, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 80, 250, 420));

        add(Panel_Manual, new org.netbeans.lib.awtextra.AbsoluteConstraints(980, 80, 290, 590));

        Label_SearchClientID.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        Label_SearchClientID.setForeground(new java.awt.Color(153, 0, 0));
        Label_SearchClientID.setText("Search Client ID:");
        add(Label_SearchClientID, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 220, -1, 30));

        Field_SearchClientID.setForeground(new java.awt.Color(153, 0, 0));
        Field_SearchClientID.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        Field_SearchClientID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Field_SearchClientIDActionPerformed(evt);
            }
        });
        Field_SearchClientID.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                Field_SearchClientIDKeyReleased(evt);
            }
        });
        add(Field_SearchClientID, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 220, 250, 30));

        Table_ExtraBaggage.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        Table_ExtraBaggage.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Table_ExtraBaggageMouseClicked(evt);
            }
        });
        ScrollPane_Cases.setViewportView(Table_ExtraBaggage);

        add(ScrollPane_Cases, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 260, 530, 310));

        Label_BaggageInformation.setFont(new java.awt.Font("Tahoma", 1, 17)); // NOI18N
        Label_BaggageInformation.setForeground(new java.awt.Color(153, 0, 0));
        Label_BaggageInformation.setText("Baggage Information:");
        add(Label_BaggageInformation, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 230, -1, -1));

        Label_FlightNumber.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        Label_FlightNumber.setForeground(new java.awt.Color(153, 0, 0));
        Label_FlightNumber.setText("Flight number:");
        add(Label_FlightNumber, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 270, -1, -1));

        Label_Brand.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        Label_Brand.setForeground(new java.awt.Color(153, 0, 0));
        Label_Brand.setText("Brand:");
        add(Label_Brand, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 310, -1, -1));

        Label_Color.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        Label_Color.setForeground(new java.awt.Color(153, 0, 0));
        Label_Color.setText("Color:");
        add(Label_Color, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 350, -1, 20));

        Label_Weight.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        Label_Weight.setForeground(new java.awt.Color(153, 0, 0));
        Label_Weight.setText("Weight:");
        add(Label_Weight, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 390, -1, -1));

        Label_Description.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        Label_Description.setForeground(new java.awt.Color(153, 0, 0));
        Label_Description.setText("Description:");
        add(Label_Description, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 430, -1, -1));

        Field_FlightNumber.setForeground(new java.awt.Color(153, 0, 0));
        Field_FlightNumber.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        add(Field_FlightNumber, new org.netbeans.lib.awtextra.AbsoluteConstraints(870, 270, 260, 30));

        Field_Brand.setForeground(new java.awt.Color(153, 0, 0));
        Field_Brand.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        add(Field_Brand, new org.netbeans.lib.awtextra.AbsoluteConstraints(870, 310, 260, 30));

        Field_Color.setForeground(new java.awt.Color(153, 0, 0));
        Field_Color.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        add(Field_Color, new org.netbeans.lib.awtextra.AbsoluteConstraints(870, 350, 260, 30));

        Field_Weight.setForeground(new java.awt.Color(153, 0, 0));
        Field_Weight.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        add(Field_Weight, new org.netbeans.lib.awtextra.AbsoluteConstraints(870, 390, 260, 30));

        Field_Description.setForeground(new java.awt.Color(153, 0, 0));
        Field_Description.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        add(Field_Description, new org.netbeans.lib.awtextra.AbsoluteConstraints(870, 430, 260, 100));

        Button_AddToCase.setBackground(new java.awt.Color(34, 153, 68));
        Button_AddToCase.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        Button_AddToCase.setForeground(new java.awt.Color(255, 255, 255));
        Button_AddToCase.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Button_AddToCase.setText("Add To Case");
        Button_AddToCase.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Button_AddToCase.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        Button_AddToCase.setOpaque(true);
        Button_AddToCase.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Button_AddToCaseMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                Button_AddToCaseMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                Button_AddToCaseMouseExited(evt);
            }
        });
        add(Button_AddToCase, new org.netbeans.lib.awtextra.AbsoluteConstraints(870, 540, 150, -1));

        Button_Reset.setBackground(new java.awt.Color(34, 153, 68));
        Button_Reset.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        Button_Reset.setForeground(new java.awt.Color(255, 255, 255));
        Button_Reset.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Button_Reset.setText("Reset");
        Button_Reset.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Button_Reset.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        Button_Reset.setOpaque(true);
        Button_Reset.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Button_ResetMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                Button_ResetMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                Button_ResetMouseExited(evt);
            }
        });
        add(Button_Reset, new org.netbeans.lib.awtextra.AbsoluteConstraints(1030, 540, 100, -1));

        Tab_NewCase.setBackground(new java.awt.Color(156, 0, 0));
        Tab_NewCase.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        Tab_NewCase.setForeground(new java.awt.Color(255, 255, 255));
        Tab_NewCase.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Tab_NewCase.setText("New Case");
        Tab_NewCase.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Tab_NewCase.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        Tab_NewCase.setOpaque(true);
        Tab_NewCase.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Tab_NewCaseMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                Tab_NewCaseMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                Tab_NewCaseMouseExited(evt);
            }
        });
        add(Tab_NewCase, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 110, 250, 40));

        Tab_UpdateCase.setBackground(new java.awt.Color(156, 0, 0));
        Tab_UpdateCase.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        Tab_UpdateCase.setForeground(new java.awt.Color(255, 255, 255));
        Tab_UpdateCase.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Tab_UpdateCase.setText("Update Case");
        Tab_UpdateCase.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Tab_UpdateCase.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        Tab_UpdateCase.setOpaque(true);
        Tab_UpdateCase.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Tab_UpdateCaseMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                Tab_UpdateCaseMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                Tab_UpdateCaseMouseExited(evt);
            }
        });
        add(Tab_UpdateCase, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 110, 250, 40));

        Tab_AddExtraBaggage.setBackground(new java.awt.Color(255, 255, 255));
        Tab_AddExtraBaggage.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        Tab_AddExtraBaggage.setForeground(new java.awt.Color(156, 10, 13));
        Tab_AddExtraBaggage.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Tab_AddExtraBaggage.setText("Add Extra Baggage");
        Tab_AddExtraBaggage.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Tab_AddExtraBaggage.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        Tab_AddExtraBaggage.setOpaque(true);
        Tab_AddExtraBaggage.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                Tab_AddExtraBaggageMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                Tab_AddExtraBaggageMouseExited(evt);
            }
        });
        add(Tab_AddExtraBaggage, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 110, 250, 40));

        Tab_LogOut.setBackground(new java.awt.Color(156, 0, 0));
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
        add(Tab_LogOut, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 110, 250, 40));

        Background.setIcon(new javax.swing.ImageIcon(getClass().getResource("/fys/Images/Background.png"))); // NOI18N
        add(Background, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1280, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void Tab_UpdateCaseMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Tab_UpdateCaseMouseEntered
        Tab_UpdateCase.setBackground(new java.awt.Color(255, 255, 255));
        Tab_UpdateCase.setForeground(new java.awt.Color(153, 0, 0));
    }//GEN-LAST:event_Tab_UpdateCaseMouseEntered

    private void Tab_UpdateCaseMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Tab_UpdateCaseMouseExited
        Tab_UpdateCase.setBackground(new java.awt.Color(153, 0, 0));
        Tab_UpdateCase.setForeground(new java.awt.Color(255, 255, 255));
    }//GEN-LAST:event_Tab_UpdateCaseMouseExited

    private void Tab_AddExtraBaggageMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Tab_AddExtraBaggageMouseEntered

    }//GEN-LAST:event_Tab_AddExtraBaggageMouseEntered

    private void Tab_AddExtraBaggageMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Tab_AddExtraBaggageMouseExited

    }//GEN-LAST:event_Tab_AddExtraBaggageMouseExited

    private void Tab_LogOutMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Tab_LogOutMouseClicked
        FYS.getInstance().showPage(new SerDesEmp_LogOut());
        Tab_LogOut.setForeground(new java.awt.Color(153,0,0));
        Tab_LogOut.setBackground(new java.awt.Color(255,255,255));
    }//GEN-LAST:event_Tab_LogOutMouseClicked

    private void Tab_LogOutMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Tab_LogOutMouseEntered
        Tab_LogOut.setBackground(new java.awt.Color(255, 255, 255));
        Tab_LogOut.setForeground(new java.awt.Color(153, 0, 0));
    }//GEN-LAST:event_Tab_LogOutMouseEntered

    private void Tab_LogOutMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Tab_LogOutMouseExited
        Tab_LogOut.setBackground(new java.awt.Color(153, 0, 0));
        Tab_LogOut.setForeground(new java.awt.Color(255, 255, 255));
    }//GEN-LAST:event_Tab_LogOutMouseExited

    private void Button_AddToCaseMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Button_AddToCaseMouseEntered
        Button_AddToCase.setBackground(new java.awt.Color(51, 136, 68));
    }//GEN-LAST:event_Button_AddToCaseMouseEntered

    private void Button_AddToCaseMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Button_AddToCaseMouseExited
        Button_AddToCase.setBackground(new java.awt.Color(34, 153, 68));
    }//GEN-LAST:event_Button_AddToCaseMouseExited

    private void Tab_NewCaseMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Tab_NewCaseMouseExited
        Tab_NewCase.setBackground(new java.awt.Color(153, 0, 0));
        Tab_NewCase.setForeground(new java.awt.Color(255, 255, 255));
    }//GEN-LAST:event_Tab_NewCaseMouseExited

    private void Tab_NewCaseMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Tab_NewCaseMouseEntered
        Tab_NewCase.setBackground(new java.awt.Color(255, 255, 255));
        Tab_NewCase.setForeground(new java.awt.Color(153, 0, 0));
    }//GEN-LAST:event_Tab_NewCaseMouseEntered

    private void Tab_NewCaseMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Tab_NewCaseMouseClicked
        FYS.getInstance().showPage(new SerDesEmp_NewCase());
    }//GEN-LAST:event_Tab_NewCaseMouseClicked

    private void Tab_UpdateCaseMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Tab_UpdateCaseMouseClicked
        FYS.getInstance().showPage(new SerDesEmp_UpdateCase());
    }//GEN-LAST:event_Tab_UpdateCaseMouseClicked

    private void Button_AddToCaseMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Button_AddToCaseMouseClicked
        try {

            String sql = "insert into baggage (flightnumber,brand,color,weight,description)value(?,?,?,?,?)";
            pst = conn.prepareStatement(sql);
            pst.setString(1, Field_FlightNumber.getText());
            pst.setString(2, Field_Brand.getText());
            pst.setString(3, Field_Color.getText());
            pst.setString(4, Field_Weight.getText());
            pst.setString(5, Field_Description.getText());

            pst.execute();
            JOptionPane.showMessageDialog(null, "Saved");

        } catch (SQLException | HeadlessException e) {

            JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_Button_AddToCaseMouseClicked

    private void Field_SearchClientIDKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_Field_SearchClientIDKeyReleased
        try {
            String sql = "select * from baggage where baggageID=?";

            pst = conn.prepareStatement(sql);
            pst.setString(1, Field_SearchClientID.getText());

            rs = pst.executeQuery();
            if (rs.next()) {
                String add1 = rs.getString("brand");
                Field_Brand.setText(add1);
                String add2 = rs.getString("color");
                Field_Color.setText(add2);
                String add3 = rs.getString("weight");
                Field_Weight.setText(add3);
                String add4 = rs.getString("description");
                Field_Description.setText(add4);

            }
        } catch (Exception e) {

            JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_Field_SearchClientIDKeyReleased

    private void Field_SearchClientIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Field_SearchClientIDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Field_SearchClientIDActionPerformed

    private void Table_ExtraBaggageMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Table_ExtraBaggageMouseClicked
        try {
            int row = Table_ExtraBaggage.getSelectedRow();
            String Table_click = (Table_ExtraBaggage.getModel().getValueAt(row, 0).toString());
            String sql = "select * from baggage where bagaggeID='" + Table_click + "' ";
            pst = conn.prepareStatement(sql);
            rs = pst.executeQuery();
            if (rs.next()) {
                String add1 = rs.getString("flightnumber");
                Field_FlightNumber.setText(add1);
                String add2 = rs.getString("brand");
                Field_Brand.setText(add2);
                String add3 = rs.getString("color");
                Field_Color.setText(add3);
                String add4 = rs.getString("weight");
                Field_Weight.setText(add4);
                String add5 = rs.getString("description");
                Field_Description.setText(add5);

            }
        } catch (Exception e) {

            JOptionPane.showMessageDialog(null, e);

        }
    }//GEN-LAST:event_Table_ExtraBaggageMouseClicked

    private void Button_ResetMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Button_ResetMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_Button_ResetMouseClicked

    private void Button_ResetMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Button_ResetMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_Button_ResetMouseEntered

    private void Button_ResetMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Button_ResetMouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_Button_ResetMouseExited

    private void Label_ManualExitMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Label_ManualExitMouseClicked
        Panel_Manual.setVisible(false);
        Panel_Manual.setEnabled(false);
    }//GEN-LAST:event_Label_ManualExitMouseClicked

    private void Label_CallManualMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Label_CallManualMouseClicked
        Panel_Manual.setVisible(true);
        Panel_Manual.setEnabled(true);
    }//GEN-LAST:event_Label_CallManualMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Background;
    private javax.swing.JLabel Button_AddToCase;
    private javax.swing.JLabel Button_Reset;
    private javax.swing.JTextField Field_Brand;
    private javax.swing.JTextField Field_Color;
    private javax.swing.JTextField Field_Description;
    private javax.swing.JTextField Field_FlightNumber;
    private javax.swing.JTextField Field_SearchClientID;
    private javax.swing.JTextField Field_Weight;
    private javax.swing.JLabel Label_BaggageInformation;
    private javax.swing.JLabel Label_Brand;
    private javax.swing.JLabel Label_CallManual;
    private javax.swing.JLabel Label_Color;
    private javax.swing.JLabel Label_Description;
    private javax.swing.JLabel Label_FlightNumber;
    private javax.swing.JLabel Label_Info;
    private javax.swing.JLabel Label_ManualExit;
    private javax.swing.JLabel Label_SearchClientID;
    private javax.swing.JLabel Label_Title;
    private javax.swing.JLabel Label_Weight;
    private javax.swing.JPanel Panel_Manual;
    private javax.swing.JScrollPane ScrollPane_Cases;
    private javax.swing.JLabel Tab_AddExtraBaggage;
    private javax.swing.JLabel Tab_LogOut;
    private javax.swing.JLabel Tab_NewCase;
    private javax.swing.JLabel Tab_UpdateCase;
    private javax.swing.JTable Table_ExtraBaggage;
    // End of variables declaration//GEN-END:variables
}
