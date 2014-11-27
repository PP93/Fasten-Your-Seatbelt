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
        Manual_Panel.setVisible(false);
        Manual_Panel.setEnabled(false);
    }

    private void Update_table() {
        try {
            String sql = "select * from bagage";
            pst = conn.prepareStatement(sql);
            rs = pst.executeQuery();
            addbagage_table.setModel(DbUtils.resultSetToTableModel(rs));
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

        Manual_Panel = new javax.swing.JPanel();
        Label_ManualExit = new javax.swing.JLabel();
        Label_Title = new javax.swing.JLabel();
        Label_Info = new javax.swing.JLabel();
        Label_CallManual = new javax.swing.JLabel();
        weight_label = new javax.swing.JLabel();
        weight_field = new javax.swing.JTextField();
        description_label = new javax.swing.JLabel();
        newcase_button = new javax.swing.JLabel();
        description_field = new javax.swing.JTextField();
        updatecase_button = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        addbagage_table = new javax.swing.JTable();
        addbagage_button = new javax.swing.JLabel();
        logout_button = new javax.swing.JLabel();
        search_label = new javax.swing.JLabel();
        brand_label = new javax.swing.JLabel();
        flightnmr_field = new javax.swing.JTextField();
        search_field = new javax.swing.JTextField();
        brand_field = new javax.swing.JTextField();
        add_button = new javax.swing.JLabel();
        color_label = new javax.swing.JLabel();
        color_field = new javax.swing.JTextField();
        brand_label1 = new javax.swing.JLabel();
        reset_button1 = new javax.swing.JLabel();
        background = new javax.swing.JLabel();

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
        Label_Info.setText("<html>\nOn the left side of the screen, fill in a\nsearch term for the case to which you'd like\nto add baggage. This will generate a list of cases\nthat match your search term. From the table,\nchoose the case you wish to update.\n<br>\n<br>\nOnce you've chosen the case to update,\nfill in the new baggage data to the right.\nIf you wish to remove all the data you've filled in\nand restart, click the 'Reset' button. If \nall the data you've filled in is correct, click 'Add'\nto add the baggage case to the chosen existing case.");
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

        weight_label.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        weight_label.setForeground(new java.awt.Color(153, 0, 0));
        weight_label.setText("Weight:");
        add(weight_label, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 370, -1, -1));

        weight_field.setForeground(new java.awt.Color(153, 0, 0));
        weight_field.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        add(weight_field, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 370, 230, 30));

        description_label.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        description_label.setForeground(new java.awt.Color(153, 0, 0));
        description_label.setText("Description:");
        add(description_label, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 410, -1, -1));

        newcase_button.setBackground(new java.awt.Color(156, 0, 0));
        newcase_button.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        newcase_button.setForeground(new java.awt.Color(255, 255, 255));
        newcase_button.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        newcase_button.setText("New Case");
        newcase_button.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        newcase_button.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        newcase_button.setOpaque(true);
        newcase_button.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                newcase_buttonMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                newcase_buttonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                newcase_buttonMouseExited(evt);
            }
        });
        add(newcase_button, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 110, 250, 40));

        description_field.setForeground(new java.awt.Color(153, 0, 0));
        description_field.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        add(description_field, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 410, 230, 40));

        updatecase_button.setBackground(new java.awt.Color(156, 0, 0));
        updatecase_button.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        updatecase_button.setForeground(new java.awt.Color(255, 255, 255));
        updatecase_button.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        updatecase_button.setText("Update Case");
        updatecase_button.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        updatecase_button.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        updatecase_button.setOpaque(true);
        updatecase_button.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                updatecase_buttonMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                updatecase_buttonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                updatecase_buttonMouseExited(evt);
            }
        });
        add(updatecase_button, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 110, 250, 40));

        addbagage_table.setModel(new javax.swing.table.DefaultTableModel(
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
        addbagage_table.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                addbagage_tableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(addbagage_table);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 250, 590, 300));

        addbagage_button.setBackground(new java.awt.Color(255, 255, 255));
        addbagage_button.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        addbagage_button.setForeground(new java.awt.Color(156, 10, 13));
        addbagage_button.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        addbagage_button.setText("Add Bagage");
        addbagage_button.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        addbagage_button.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        addbagage_button.setOpaque(true);
        addbagage_button.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                addbagage_buttonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                addbagage_buttonMouseExited(evt);
            }
        });
        add(addbagage_button, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 110, 250, 40));

        logout_button.setBackground(new java.awt.Color(156, 0, 0));
        logout_button.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        logout_button.setForeground(new java.awt.Color(255, 255, 255));
        logout_button.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        logout_button.setText("Log Out");
        logout_button.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        logout_button.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        logout_button.setOpaque(true);
        logout_button.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                logout_buttonMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                logout_buttonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                logout_buttonMouseExited(evt);
            }
        });
        add(logout_button, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 110, 250, 40));

        search_label.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        search_label.setForeground(new java.awt.Color(153, 0, 0));
        search_label.setText("Search:");
        add(search_label, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 210, -1, 30));

        brand_label.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        brand_label.setForeground(new java.awt.Color(153, 0, 0));
        brand_label.setText("Flight number:");
        add(brand_label, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 260, -1, -1));

        flightnmr_field.setForeground(new java.awt.Color(153, 0, 0));
        flightnmr_field.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        add(flightnmr_field, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 250, 230, 30));

        search_field.setForeground(new java.awt.Color(153, 0, 0));
        search_field.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        search_field.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                search_fieldActionPerformed(evt);
            }
        });
        search_field.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                search_fieldKeyReleased(evt);
            }
        });
        add(search_field, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 210, 210, 30));

        brand_field.setForeground(new java.awt.Color(153, 0, 0));
        brand_field.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        add(brand_field, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 290, 230, 30));

        add_button.setBackground(new java.awt.Color(34, 153, 68));
        add_button.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        add_button.setForeground(new java.awt.Color(255, 255, 255));
        add_button.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        add_button.setText("Add");
        add_button.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        add_button.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        add_button.setOpaque(true);
        add_button.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                add_buttonMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                add_buttonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                add_buttonMouseExited(evt);
            }
        });
        add(add_button, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 470, 80, -1));

        color_label.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        color_label.setForeground(new java.awt.Color(153, 0, 0));
        color_label.setText("Color:");
        add(color_label, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 332, -1, 30));

        color_field.setForeground(new java.awt.Color(153, 0, 0));
        color_field.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        add(color_field, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 330, 230, 30));

        brand_label1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        brand_label1.setForeground(new java.awt.Color(153, 0, 0));
        brand_label1.setText("Brand:");
        add(brand_label1, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 300, -1, -1));

        reset_button1.setBackground(new java.awt.Color(34, 153, 68));
        reset_button1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        reset_button1.setForeground(new java.awt.Color(255, 255, 255));
        reset_button1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        reset_button1.setText("Reset");
        reset_button1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        reset_button1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        reset_button1.setOpaque(true);
        reset_button1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                reset_button1MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                reset_button1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                reset_button1MouseExited(evt);
            }
        });
        add(reset_button1, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 470, 80, -1));

        background.setIcon(new javax.swing.ImageIcon(getClass().getResource("/fys/Images/Background.png"))); // NOI18N
        add(background, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1280, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void updatecase_buttonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_updatecase_buttonMouseEntered
        updatecase_button.setBackground(new java.awt.Color(255, 255, 255));
        updatecase_button.setForeground(new java.awt.Color(153, 0, 0));
    }//GEN-LAST:event_updatecase_buttonMouseEntered

    private void updatecase_buttonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_updatecase_buttonMouseExited
        updatecase_button.setBackground(new java.awt.Color(153, 0, 0));
        updatecase_button.setForeground(new java.awt.Color(255, 255, 255));
    }//GEN-LAST:event_updatecase_buttonMouseExited

    private void addbagage_buttonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_addbagage_buttonMouseEntered
        addbagage_button.setBackground(new java.awt.Color(255, 255, 255));
        addbagage_button.setForeground(new java.awt.Color(153, 0, 0));
    }//GEN-LAST:event_addbagage_buttonMouseEntered

    private void addbagage_buttonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_addbagage_buttonMouseExited
        addbagage_button.setBackground(new java.awt.Color(153, 0, 0));

        addbagage_button.setForeground(new java.awt.Color(255, 255, 255));
    }//GEN-LAST:event_addbagage_buttonMouseExited

    private void logout_buttonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_logout_buttonMouseClicked
        FYS.getInstance().showPage(new SerDesEmp_LogOut());
        logout_button.setForeground(new java.awt.Color(153,0,0));
        logout_button.setBackground(new java.awt.Color(255,255,255));
    }//GEN-LAST:event_logout_buttonMouseClicked

    private void logout_buttonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_logout_buttonMouseEntered
        logout_button.setBackground(new java.awt.Color(255, 255, 255));
        logout_button.setForeground(new java.awt.Color(153, 0, 0));
    }//GEN-LAST:event_logout_buttonMouseEntered

    private void logout_buttonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_logout_buttonMouseExited
        logout_button.setBackground(new java.awt.Color(153, 0, 0));
        logout_button.setForeground(new java.awt.Color(255, 255, 255));
    }//GEN-LAST:event_logout_buttonMouseExited

    private void add_buttonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_add_buttonMouseEntered
        add_button.setBackground(new java.awt.Color(51, 136, 68));
    }//GEN-LAST:event_add_buttonMouseEntered

    private void add_buttonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_add_buttonMouseExited
        add_button.setBackground(new java.awt.Color(34, 153, 68));
    }//GEN-LAST:event_add_buttonMouseExited

    private void newcase_buttonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_newcase_buttonMouseExited
        newcase_button.setBackground(new java.awt.Color(153, 0, 0));
        newcase_button.setForeground(new java.awt.Color(255, 255, 255));
    }//GEN-LAST:event_newcase_buttonMouseExited

    private void newcase_buttonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_newcase_buttonMouseEntered
        newcase_button.setBackground(new java.awt.Color(255, 255, 255));
        newcase_button.setForeground(new java.awt.Color(153, 0, 0));
    }//GEN-LAST:event_newcase_buttonMouseEntered

    private void newcase_buttonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_newcase_buttonMouseClicked
        FYS.getInstance().showPage(new SerDesEmp_NewCase());
    }//GEN-LAST:event_newcase_buttonMouseClicked

    private void updatecase_buttonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_updatecase_buttonMouseClicked
        FYS.getInstance().showPage(new SerDesEmp_UpdateCase());
    }//GEN-LAST:event_updatecase_buttonMouseClicked

    private void add_buttonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_add_buttonMouseClicked
        try {

            String sql = "insert into bagage (flightnumber,brand,color,weight,description)value(?,?,?,?,?)";
            pst = conn.prepareStatement(sql);
            pst.setString(1, flightnmr_field.getText());
            pst.setString(2, brand_field.getText());
            pst.setString(3, color_field.getText());
            pst.setString(4, weight_field.getText());
            pst.setString(5, description_field.getText());

            pst.execute();
            JOptionPane.showMessageDialog(null, "Saved");

        } catch (SQLException | HeadlessException e) {

            JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_add_buttonMouseClicked

    private void search_fieldKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_search_fieldKeyReleased
        try {
            String sql = "select * from bagage where bagageID=?";

            pst = conn.prepareStatement(sql);
            pst.setString(1, search_field.getText());

            rs = pst.executeQuery();
            if (rs.next()) {
                String add1 = rs.getString("brand");
                brand_field.setText(add1);
                String add2 = rs.getString("color");
                color_field.setText(add2);
                String add3 = rs.getString("weight");
                weight_field.setText(add3);
                String add4 = rs.getString("description");
                description_field.setText(add4);

            }
        } catch (Exception e) {

            JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_search_fieldKeyReleased

    private void search_fieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_search_fieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_search_fieldActionPerformed

    private void addbagage_tableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_addbagage_tableMouseClicked
        try {
            int row = addbagage_table.getSelectedRow();
            String Table_click = (addbagage_table.getModel().getValueAt(row, 0).toString());
            String sql = "select * from bagage where bagageID='" + Table_click + "' ";
            pst = conn.prepareStatement(sql);
            rs = pst.executeQuery();
            if (rs.next()) {
                String add1 = rs.getString("flightnumber");
                brand_field.setText(add1);
                String add2 = rs.getString("brand");
                brand_field.setText(add2);
                String add3 = rs.getString("color");
                color_field.setText(add3);
                String add4 = rs.getString("weight");
                weight_field.setText(add4);
                String add5 = rs.getString("description");
                description_field.setText(add5);

            }
        } catch (Exception e) {

            JOptionPane.showMessageDialog(null, e);

        }
    }//GEN-LAST:event_addbagage_tableMouseClicked

    private void reset_button1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_reset_button1MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_reset_button1MouseClicked

    private void reset_button1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_reset_button1MouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_reset_button1MouseEntered

    private void reset_button1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_reset_button1MouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_reset_button1MouseExited

    private void Label_ManualExitMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Label_ManualExitMouseClicked
        Manual_Panel.setVisible(false);
        Manual_Panel.setEnabled(false);
    }//GEN-LAST:event_Label_ManualExitMouseClicked

    private void Label_CallManualMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Label_CallManualMouseClicked
        Manual_Panel.setVisible(true);
        Manual_Panel.setEnabled(true);
    }//GEN-LAST:event_Label_CallManualMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Label_CallManual;
    private javax.swing.JLabel Label_Info;
    private javax.swing.JLabel Label_ManualExit;
    private javax.swing.JLabel Label_Title;
    private javax.swing.JPanel Manual_Panel;
    private javax.swing.JLabel add_button;
    private javax.swing.JLabel addbagage_button;
    private javax.swing.JTable addbagage_table;
    private javax.swing.JLabel background;
    private javax.swing.JTextField brand_field;
    private javax.swing.JLabel brand_label;
    private javax.swing.JLabel brand_label1;
    private javax.swing.JTextField color_field;
    private javax.swing.JLabel color_label;
    private javax.swing.JTextField description_field;
    private javax.swing.JLabel description_label;
    private javax.swing.JTextField flightnmr_field;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel logout_button;
    private javax.swing.JLabel newcase_button;
    private javax.swing.JLabel reset_button1;
    private javax.swing.JTextField search_field;
    private javax.swing.JLabel search_label;
    private javax.swing.JLabel updatecase_button;
    private javax.swing.JTextField weight_field;
    private javax.swing.JLabel weight_label;
    // End of variables declaration//GEN-END:variables
}
