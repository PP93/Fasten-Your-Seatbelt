/*package fys;

import java.awt.*;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.*;

public class Man_Graphs extends javax.swing.JPanel {
Connection conn=null;
ResultSet rs=null;
PreparedStatement  pst=null;
    public Man_Graphs() {
        initComponents();
        conn=javaconnect.ConnecrDb();
        Manual_Panel.setVisible(false);
        Manual_Panel.setEnabled(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     *
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Manual_Panel = new javax.swing.JPanel();
        Label_ManualExit = new javax.swing.JLabel();
        Label_Info = new javax.swing.JLabel();
        Label_Title = new javax.swing.JLabel();
        Label_CallManual = new javax.swing.JLabel();
        Button_GenerateGraph = new javax.swing.JLabel();
        Label_Timeframe = new javax.swing.JLabel();
        Radio_Today = new javax.swing.JRadioButton();
        Radio_Week = new javax.swing.JRadioButton();
        Radio_Month = new javax.swing.JRadioButton();
        Radio_Year = new javax.swing.JRadioButton();
        Label_CaseType = new javax.swing.JLabel();
        Radio_Client = new javax.swing.JRadioButton();
        Radio_Baggage = new javax.swing.JRadioButton();
        Label_CaseStatus = new javax.swing.JLabel();
        Radio_NotFound = new javax.swing.JRadioButton();
        Radio_Found = new javax.swing.JRadioButton();
        Radio_Returned = new javax.swing.JRadioButton();
        Scrollpane_Cases = new javax.swing.JScrollPane();
        Table_Cases = new javax.swing.JTable();
        Tab_GraphData = new javax.swing.JLabel();
        Tab_BaggageData = new javax.swing.JLabel();
        Tab_LogOut = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
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

        Label_Info.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        Label_Info.setForeground(new java.awt.Color(153, 0, 0));
        Label_Info.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Label_Info.setText("<html>\nChoose the timeframe, case type, and case status\nby clicking their respective radio buttons. This will \ngenerate a list of cases based on the information you've\nchosen in the table below. \n<br>\n<br>\nTo view a graph of the data, click on 'Generate Graph'.");
        Label_Info.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        Manual_Panel.add(Label_Info, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 80, 250, 420));

        Label_Title.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        Label_Title.setForeground(new java.awt.Color(153, 0, 0));
        Label_Title.setText("Manual");
        Manual_Panel.add(Label_Title, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 80, 30));

        add(Manual_Panel, new org.netbeans.lib.awtextra.AbsoluteConstraints(980, 80, 290, 590));

        Label_CallManual.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Label_CallManual.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Label_CallManualMouseClicked(evt);
            }
        });
        add(Label_CallManual, new org.netbeans.lib.awtextra.AbsoluteConstraints(1210, 20, 50, 50));

        Button_GenerateGraph.setBackground(new java.awt.Color(34, 153, 68));
        Button_GenerateGraph.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        Button_GenerateGraph.setForeground(new java.awt.Color(255, 255, 255));
        Button_GenerateGraph.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Button_GenerateGraph.setText("Generate Graph");
        Button_GenerateGraph.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Button_GenerateGraph.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        Button_GenerateGraph.setOpaque(true);
        Button_GenerateGraph.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                Button_GenerateGraphMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                Button_GenerateGraphMouseExited(evt);
            }
        });
        add(Button_GenerateGraph, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 590, 200, 40));

        Label_Timeframe.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        Label_Timeframe.setForeground(new java.awt.Color(156, 10, 13));
        Label_Timeframe.setText("Timeframe:");
        add(Label_Timeframe, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 180, -1, -1));

        Radio_Today.setBackground(new java.awt.Color(255, 255, 255));
        Radio_Today.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        Radio_Today.setForeground(new java.awt.Color(156, 10, 13));
        Radio_Today.setText("Today");
        add(Radio_Today, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 180, -1, -1));

        Radio_Week.setBackground(new java.awt.Color(255, 255, 255));
        Radio_Week.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        Radio_Week.setForeground(new java.awt.Color(156, 10, 13));
        Radio_Week.setText("Week");
        add(Radio_Week, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 180, -1, -1));

        Radio_Month.setBackground(new java.awt.Color(255, 255, 255));
        Radio_Month.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        Radio_Month.setForeground(new java.awt.Color(156, 10, 13));
        Radio_Month.setText("Month");
        add(Radio_Month, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 180, -1, -1));

        Radio_Year.setBackground(new java.awt.Color(255, 255, 255));
        Radio_Year.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        Radio_Year.setForeground(new java.awt.Color(156, 10, 13));
        Radio_Year.setText("Year");
        add(Radio_Year, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 180, -1, -1));

        Label_CaseType.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        Label_CaseType.setForeground(new java.awt.Color(156, 10, 13));
        Label_CaseType.setText("Case Type:");
        add(Label_CaseType, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 210, -1, -1));

        Radio_Client.setBackground(new java.awt.Color(255, 255, 255));
        Radio_Client.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        Radio_Client.setForeground(new java.awt.Color(156, 10, 13));
        Radio_Client.setText("Client");
        add(Radio_Client, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 210, -1, -1));

        Radio_Baggage.setBackground(new java.awt.Color(255, 255, 255));
        Radio_Baggage.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        Radio_Baggage.setForeground(new java.awt.Color(156, 10, 13));
        Radio_Baggage.setText("Baggage");
        Radio_Baggage.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Radio_BaggageActionPerformed(evt);
            }
        });
        add(Radio_Baggage, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 210, -1, -1));

        Label_CaseStatus.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        Label_CaseStatus.setForeground(new java.awt.Color(156, 10, 13));
        Label_CaseStatus.setText("Case Status:");
        Label_CaseStatus.setToolTipText("");
        add(Label_CaseStatus, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 240, -1, 20));

        Radio_NotFound.setBackground(new java.awt.Color(255, 255, 255));
        Radio_NotFound.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        Radio_NotFound.setForeground(new java.awt.Color(156, 10, 13));
        Radio_NotFound.setText("Not Found");
        add(Radio_NotFound, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 240, -1, -1));

        Radio_Found.setBackground(new java.awt.Color(255, 255, 255));
        Radio_Found.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        Radio_Found.setForeground(new java.awt.Color(156, 10, 13));
        Radio_Found.setText("Found");
        add(Radio_Found, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 240, -1, -1));

        Radio_Returned.setBackground(new java.awt.Color(255, 255, 255));
        Radio_Returned.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        Radio_Returned.setForeground(new java.awt.Color(156, 10, 13));
        Radio_Returned.setText("Returned");
        add(Radio_Returned, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 240, -1, -1));

        Table_Cases.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Found", "Not Found", "Returned"
            }
        ));
        Scrollpane_Cases.setViewportView(Table_Cases);

        add(Scrollpane_Cases, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 280, -1, 280));

        Tab_GraphData.setBackground(new java.awt.Color(255, 255, 255));
        Tab_GraphData.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        Tab_GraphData.setForeground(new java.awt.Color(156, 10, 13));
        Tab_GraphData.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Tab_GraphData.setText("Graph Data");
        Tab_GraphData.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Tab_GraphData.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        Tab_GraphData.setOpaque(true);
        Tab_GraphData.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                Tab_GraphDataMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                Tab_GraphDataMouseExited(evt);
            }
        });
        add(Tab_GraphData, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 110, 250, 40));

        Tab_BaggageData.setBackground(new java.awt.Color(156, 10, 13));
        Tab_BaggageData.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        Tab_BaggageData.setForeground(new java.awt.Color(255, 255, 255));
        Tab_BaggageData.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Tab_BaggageData.setText("Baggage Data");
        Tab_BaggageData.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Tab_BaggageData.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        Tab_BaggageData.setOpaque(true);
        Tab_BaggageData.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                Tab_BaggageDataMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                Tab_BaggageDataMouseExited(evt);
            }
        });
        add(Tab_BaggageData, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 110, 250, 40));

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
        add(Tab_LogOut, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 110, 250, 40));
        add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 640, 1280, 30));

        Background.setIcon(new javax.swing.ImageIcon(getClass().getResource("/fys/Images/Background.png"))); // NOI18N
        Background.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        add(Background, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1560, 720));
    }// </editor-fold>//GEN-END:initComponents

    private void Tab_BaggageDataMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Tab_BaggageDataMouseEntered
        ManageAccounts_button.setBackground(new java.awt.Color(255, 255, 255));
        ManageAccounts_button.setForeground(new java.awt.Color(153, 0, 0));
    }//GEN-LAST:event_Tab_BaggageDataMouseEntered

    private void Tab_BaggageDataMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Tab_BaggageDataMouseExited
        ManageAccounts_button.setBackground(new java.awt.Color(153, 0, 0));

        ManageAccounts_button.setForeground(new java.awt.Color(255, 255, 255));

    }//GEN-LAST:event_Tab_BaggageDataMouseExited


    private void Tab_LogOutMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Tab_LogOutMouseEntered
        LogOut_button2.setBackground(new java.awt.Color(255, 255, 255));
        LogOut_button2.setForeground(new java.awt.Color(153, 0, 0));     }//GEN-LAST:event_Tab_LogOutMouseEntered

    private void Tab_LogOutMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Tab_LogOutMouseExited
        LogOut_button2.setBackground(new java.awt.Color(153, 0, 0));

        LogOut_button2.setForeground(new java.awt.Color(255, 255, 255));    }//GEN-LAST:event_Tab_LogOutMouseExited

    private void Tab_GraphDataMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Tab_GraphDataMouseEntered
    }//GEN-LAST:event_Tab_GraphDataMouseEntered

    private void Tab_GraphDataMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Tab_GraphDataMouseExited

     }//GEN-LAST:event_Tab_GraphDataMouseExited

    private void Button_GenerateGraphMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Button_GenerateGraphMouseEntered
        chart_button1.setBackground(new java.awt.Color(51, 136, 68));
    }//GEN-LAST:event_Button_GenerateGraphMouseEntered

    private void Button_GenerateGraphMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Button_GenerateGraphMouseExited
        chart_button1.setBackground(new java.awt.Color(34, 153, 68));
    }//GEN-LAST:event_Button_GenerateGraphMouseExited

    private void Radio_BaggageActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Radio_BaggageActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Radio_BaggageActionPerformed

    private void Tab_LogOutMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Tab_LogOutMouseClicked
        FYS.getInstance().showPage(new Man_LogOut());
    }//GEN-LAST:event_Tab_LogOutMouseClicked

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
    private javax.swing.JLabel Button_GenerateGraph;
    private javax.swing.JLabel Label_CallManual;
    private javax.swing.JLabel Label_CaseStatus;
    private javax.swing.JLabel Label_CaseType;
    private javax.swing.JLabel Label_Info;
    private javax.swing.JLabel Label_ManualExit;
    private javax.swing.JLabel Label_Timeframe;
    private javax.swing.JLabel Label_Title;
    private javax.swing.JPanel Manual_Panel;
    private javax.swing.JRadioButton Radio_Baggage;
    private javax.swing.JRadioButton Radio_Client;
    private javax.swing.JRadioButton Radio_Found;
    private javax.swing.JRadioButton Radio_Month;
    private javax.swing.JRadioButton Radio_NotFound;
    private javax.swing.JRadioButton Radio_Returned;
    private javax.swing.JRadioButton Radio_Today;
    private javax.swing.JRadioButton Radio_Week;
    private javax.swing.JRadioButton Radio_Year;
    private javax.swing.JScrollPane Scrollpane_Cases;
    private javax.swing.JLabel Tab_BaggageData;
    private javax.swing.JLabel Tab_GraphData;
    private javax.swing.JLabel Tab_LogOut;
    private javax.swing.JTable Table_Cases;
    private javax.swing.JSeparator jSeparator1;
    // End of variables declaration//GEN-END:variables
}*/