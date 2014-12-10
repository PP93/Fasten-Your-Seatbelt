/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fys;

import java.awt.Color;
import java.awt.Dimension;
import javax.swing.JPanel;
import org.jfree.chart.ChartPanel;
import org.jfree.ui.RefineryUtilities;
import java.awt.BasicStroke;
import java.awt.Dimension;
import java.awt.Paint;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JInternalFrame;
import javax.swing.JOptionPane;
import net.proteanit.sql.DbUtils;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.CategoryPlot;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.chart.renderer.category.CategoryItemRenderer;
import org.jfree.data.category.DefaultCategoryDataset;
import org.jfree.ui.ApplicationFrame;
import java.util.*;

/**
 *
 * @author Doreen
 */
public class Man_Graphs extends javax.swing.JPanel {

    private DefaultCategoryDataset dataset;
    Connection conn = null;
    ResultSet rs = null;
    PreparedStatement pst = null;
    private JFreeChart chart;

    /**
     * Creates new form Man_Graphs1
     */
    public Man_Graphs() {
        initComponents();
        conn = javaconnect.ConnecrDb();
        Manual_Panel.setVisible(false);
        Manual_Panel.setEnabled(false);
        Update_table();
    }

    private void Update_table() {
        try {
            String sql = "select baggageID, flightnumber, dateadded,dateretrieved,status,clientID from baggage";
            pst = conn.prepareStatement(sql);
            rs = pst.executeQuery();
            Table_Cases.setModel(DbUtils.resultSetToTableModel(rs));
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

        Label_Logo = new javax.swing.JLabel();
        Label_CallManual = new javax.swing.JLabel();
        Manual_Panel = new javax.swing.JPanel();
        Label_ManualExit = new javax.swing.JLabel();
        Label_Info = new javax.swing.JLabel();
        Label_Title = new javax.swing.JLabel();
        Button_GenerateGraph = new javax.swing.JLabel();
        Label_Timeframe = new javax.swing.JLabel();
        Label_CaseType = new javax.swing.JLabel();
        Label_CaseStatus = new javax.swing.JLabel();
        Box_TimeFrame = new javax.swing.JComboBox();
        Box_CaseType = new javax.swing.JComboBox();
        Box_CaseStatus = new javax.swing.JComboBox();
        Tab_GraphData = new javax.swing.JLabel();
        Tab_LogActivities = new javax.swing.JLabel();
        Tab_LogOut = new javax.swing.JLabel();
        Scrollpane_Cases = new javax.swing.JScrollPane();
        Table_Cases = new javax.swing.JTable();
        JPanel_Graph = new javax.swing.JPanel();
        Background = new javax.swing.JLabel();

        setMaximumSize(new java.awt.Dimension(1280, 720));
        setMinimumSize(new java.awt.Dimension(1280, 720));
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
        Label_Info.setText("<html>\nChoose the timeframe, case type, and case status\nby clicking using their respective drop down buttons. This will \ngenerate a list of cases based on the information you've\nchosen in the table below. \n<br>\n<br>\nTo view a graph of the data, click on 'Generate Graph'.");
        Label_Info.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        Manual_Panel.add(Label_Info, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 80, 250, 420));

        Label_Title.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        Label_Title.setForeground(new java.awt.Color(153, 0, 0));
        Label_Title.setText("Manual");
        Manual_Panel.add(Label_Title, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 80, 30));

        add(Manual_Panel, new org.netbeans.lib.awtextra.AbsoluteConstraints(980, 50, 290, 590));

        Button_GenerateGraph.setBackground(new java.awt.Color(34, 153, 68));
        Button_GenerateGraph.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        Button_GenerateGraph.setForeground(new java.awt.Color(255, 255, 255));
        Button_GenerateGraph.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Button_GenerateGraph.setText("Generate Graph");
        Button_GenerateGraph.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        Button_GenerateGraph.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Button_GenerateGraph.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        Button_GenerateGraph.setOpaque(true);
        Button_GenerateGraph.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Button_GenerateGraphMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                Button_GenerateGraphMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                Button_GenerateGraphMouseExited(evt);
            }
        });
        add(Button_GenerateGraph, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 570, 200, 40));

        Label_Timeframe.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        Label_Timeframe.setForeground(new java.awt.Color(156, 10, 13));
        Label_Timeframe.setText("Timeframe:");
        add(Label_Timeframe, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 160, -1, -1));

        Label_CaseType.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        Label_CaseType.setForeground(new java.awt.Color(156, 10, 13));
        Label_CaseType.setText("Case Type:");
        add(Label_CaseType, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 200, -1, -1));

        Label_CaseStatus.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        Label_CaseStatus.setForeground(new java.awt.Color(156, 10, 13));
        Label_CaseStatus.setText("Case Status:");
        Label_CaseStatus.setToolTipText("");
        add(Label_CaseStatus, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 240, -1, 20));

        Box_TimeFrame.setForeground(new java.awt.Color(156, 10, 13));
        Box_TimeFrame.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Today", "Week", "Month", "Year" }));
        add(Box_TimeFrame, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 160, 120, 20));

        Box_CaseType.setForeground(new java.awt.Color(156, 10, 13));
        Box_CaseType.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Client", "Baggage" }));
        add(Box_CaseType, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 200, 120, 20));

        Box_CaseStatus.setForeground(new java.awt.Color(156, 10, 13));
        Box_CaseStatus.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Unresolved", "Resolved", "Permanently lost" }));
        add(Box_CaseStatus, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 240, 120, 20));

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
        add(Tab_GraphData, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 110, 250, 40));

        Tab_LogActivities.setBackground(new java.awt.Color(156, 10, 13));
        Tab_LogActivities.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        Tab_LogActivities.setForeground(new java.awt.Color(255, 255, 255));
        Tab_LogActivities.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Tab_LogActivities.setText("Log Activities");
        Tab_LogActivities.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Tab_LogActivities.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        Tab_LogActivities.setOpaque(true);
        Tab_LogActivities.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Tab_LogActivitiesMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                Tab_LogActivitiesMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                Tab_LogActivitiesMouseExited(evt);
            }
        });
        add(Tab_LogActivities, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 110, 250, 40));

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
        Table_Cases.setEnabled(false);
        Scrollpane_Cases.setViewportView(Table_Cases);

        add(Scrollpane_Cases, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 270, 510, 280));

        JPanel_Graph.setBackground(new java.awt.Color(255, 255, 255));
        JPanel_Graph.setLayout(new java.awt.BorderLayout());
        add(JPanel_Graph, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 180, 760, 400));

        Background.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        Background.setIcon(new javax.swing.ImageIcon(getClass().getResource("/fys/Images/Background.png"))); // NOI18N
        Background.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        add(Background, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1560, 720));
    }// </editor-fold>//GEN-END:initComponents

    private void Label_ManualExitMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Label_ManualExitMouseClicked
        Manual_Panel.setVisible(false);
        Manual_Panel.setEnabled(false);
    }//GEN-LAST:event_Label_ManualExitMouseClicked

    private void Label_CallManualMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Label_CallManualMouseClicked
        Manual_Panel.setVisible(true);
        Manual_Panel.setEnabled(true);
    }//GEN-LAST:event_Label_CallManualMouseClicked

    private void Button_GenerateGraphMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Button_GenerateGraphMouseEntered
        Button_GenerateGraph.setBackground(new java.awt.Color(51, 136, 68));
    }//GEN-LAST:event_Button_GenerateGraphMouseEntered

    private void Button_GenerateGraphMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Button_GenerateGraphMouseExited
        Button_GenerateGraph.setBackground(new java.awt.Color(34, 153, 68));
    }//GEN-LAST:event_Button_GenerateGraphMouseExited

    private void Tab_GraphDataMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Tab_GraphDataMouseEntered

    }//GEN-LAST:event_Tab_GraphDataMouseEntered

    private void Tab_GraphDataMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Tab_GraphDataMouseExited

    }//GEN-LAST:event_Tab_GraphDataMouseExited

    private void Tab_LogActivitiesMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Tab_LogActivitiesMouseEntered
        Tab_LogActivities.setBackground(new java.awt.Color(255, 255, 255));
        Tab_LogActivities.setForeground(new java.awt.Color(156, 10, 13));
    }//GEN-LAST:event_Tab_LogActivitiesMouseEntered

    private void Tab_LogActivitiesMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Tab_LogActivitiesMouseExited
        Tab_LogActivities.setBackground(new java.awt.Color(156, 10, 13));

        Tab_LogActivities.setForeground(new java.awt.Color(255, 255, 255));
    }//GEN-LAST:event_Tab_LogActivitiesMouseExited

    private void Tab_LogOutMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Tab_LogOutMouseClicked
        FYS.getInstance().showPage(new Man_LogOut());
    }//GEN-LAST:event_Tab_LogOutMouseClicked

    private void Tab_LogOutMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Tab_LogOutMouseEntered
        Tab_LogOut.setBackground(new java.awt.Color(255, 255, 255));
        Tab_LogOut.setForeground(new java.awt.Color(156, 10, 13));
    }//GEN-LAST:event_Tab_LogOutMouseEntered

    private void Tab_LogOutMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Tab_LogOutMouseExited
        Tab_LogOut.setBackground(new java.awt.Color(156, 10, 13));
        Tab_LogOut.setForeground(new java.awt.Color(255, 255, 255));
    }//GEN-LAST:event_Tab_LogOutMouseExited

    private void Tab_LogActivitiesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Tab_LogActivitiesMouseClicked
        FYS.getInstance().showPage(new Man_LogActivities());
    }//GEN-LAST:event_Tab_LogActivitiesMouseClicked

    private void Label_LogoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Label_LogoMouseClicked
        FYS.getInstance().showPage(new Man_Home());
    }//GEN-LAST:event_Label_LogoMouseClicked

    private void Button_GenerateGraphMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Button_GenerateGraphMouseClicked

        int timeFrame = Box_TimeFrame.getSelectedIndex();
        switch (timeFrame) {
            case 0:
                makeGraphToday();
                break;
            case 1:
                makeGraphWeek();
                break;
            case 2:
                makeGraphMonth();
                break;
            case 3:
                makeGraphYear();
                break;
        }
    }//GEN-LAST:event_Button_GenerateGraphMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Background;
    private javax.swing.JComboBox Box_CaseStatus;
    private javax.swing.JComboBox Box_CaseType;
    private javax.swing.JComboBox Box_TimeFrame;
    private javax.swing.JLabel Button_GenerateGraph;
    private javax.swing.JPanel JPanel_Graph;
    private javax.swing.JLabel Label_CallManual;
    private javax.swing.JLabel Label_CaseStatus;
    private javax.swing.JLabel Label_CaseType;
    private javax.swing.JLabel Label_Info;
    private javax.swing.JLabel Label_Logo;
    private javax.swing.JLabel Label_ManualExit;
    private javax.swing.JLabel Label_Timeframe;
    private javax.swing.JLabel Label_Title;
    private javax.swing.JPanel Manual_Panel;
    private javax.swing.JScrollPane Scrollpane_Cases;
    private javax.swing.JLabel Tab_GraphData;
    private javax.swing.JLabel Tab_LogActivities;
    private javax.swing.JLabel Tab_LogOut;
    private javax.swing.JTable Table_Cases;
    // End of variables declaration//GEN-END:variables
public void makeGraphToday() {
        String graphname = "Graph Name Test";
        String[] today = {"Morning", "Afternoon", "Evening", "Night"};
        String timeFrameGraph = "Time of Day";
        int Resolved = 0;
        int Unresolved = 0;
        int PermanentlyLost = 0;
        int[] totalResolved = new int[today.length];
        int[] totalUnresolved = new int[today.length];
        int[] totalPermanentlyLost = new int[today.length];

        forLoopSetInfoInArrayFromDatabaseForGraph(today, totalResolved, totalUnresolved, totalPermanentlyLost);
        graphMakerMethod(graphname, totalResolved, today, totalUnresolved, totalPermanentlyLost, Resolved, PermanentlyLost, Unresolved, timeFrameGraph);

    }

    public void makeGraphWeek() {
        String graphname = "Graph Name Test";
        String[] week = {"1", "2", "3", "4", "5", "6", "7",};
        String timeFrameGraph = "Week Day";

        int Resolved = 0;
        int Unresolved = 0;
        int PermanentlyLost = 0;
        int[] totalResolved = new int[week.length];
        int[] totalUnresolved = new int[week.length];
        int[] totalPermanentlyLost = new int[week.length];

        forLoopSetInfoInArrayFromDatabaseForGraph(week, totalResolved, totalUnresolved, totalPermanentlyLost);
        graphMakerMethod(graphname, totalResolved, week, totalUnresolved, totalPermanentlyLost, Resolved, PermanentlyLost, Unresolved, timeFrameGraph);

    }

    public void makeGraphMonth() {
        String graphname = "Graph Name Test";
        String[] month = {"1", "2", "3", "4", "5", "6", "7", "8", "9", "10"};
        String timeFrameGraph = "Part of the Month";

        int Resolved = 0;
        int Unresolved = 0;
        int PermanentlyLost = 0;
        int[] totalResolved = new int[month.length];
        int[] totalUnresolved = new int[month.length];
        int[] totalPermanentlyLost = new int[month.length];

        forLoopSetInfoInArrayFromDatabaseForGraph(month, totalResolved, totalUnresolved, totalPermanentlyLost);
        graphMakerMethod(graphname, totalResolved, month, totalUnresolved, totalPermanentlyLost, Resolved, PermanentlyLost, Unresolved, timeFrameGraph);

    }

    public void makeGraphYear() {
        String graphname = "Graph Name Test";
        String[] year = {"Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec"};
        String timeFrameGraph = "Month";

        int Resolved = 0;
        int Unresolved = 0;
        int PermanentlyLost = 0;
        int[] totalResolved = new int[year.length];
        int[] totalUnresolved = new int[year.length];
        int[] totalPermanentlyLost = new int[year.length];

        //deze loop moet een database connectie worden.
        //SELECT COUNT (*) FROM baggage WHERE status == Resolved and date is jan
        forLoopSetInfoInArrayFromDatabaseForGraph(year, totalResolved, totalUnresolved, totalPermanentlyLost);
        graphMakerMethod(graphname, totalResolved, year, totalUnresolved, totalPermanentlyLost, Resolved, PermanentlyLost, Unresolved, timeFrameGraph);

    }

    private void graphMakerMethod(String graphname, int[] totalResolved, String[] today, int[] totalUnresolved, int[] totalPermanentlyLost, int Resolved, int PermanentlyLost, int Unresolved, String timeFrameGraph) {
        Graph baggageGraph = new Graph(graphname);
        baggageGraph.addSeries(totalResolved, "Resolved", today);
        baggageGraph.addSeries(totalUnresolved, "Unresolved", today);
        baggageGraph.addSeries(totalPermanentlyLost, "PermanentlyLost", today);
        baggageGraph.createChart("Baggage Overview", timeFrameGraph, "Number", 760, 400, Color.WHITE, JPanel_Graph);
        baggageGraph.setSeriesThickness(Resolved, 2);
        baggageGraph.setSeriesThickness(PermanentlyLost, 2);
        baggageGraph.setSeriesThickness(Unresolved, 2);
        baggageGraph.setSeriesColor(Resolved, Color.GREEN);
        baggageGraph.setSeriesColor(PermanentlyLost, Color.RED);
        baggageGraph.setSeriesColor(Unresolved, Color.YELLOW);
        baggageGraph.setGraphBackgroudColors(Color.WHITE, Color.GRAY);
        baggageGraph.setVisible(true);
    }

    private void forLoopSetInfoInArrayFromDatabaseForGraph(String[] timeFramePoints, int[] totalResolved, int[] totalUnresolved, int[] totalPermanentlyLost) {
        //deze loop moet een database connectie worden.
        
        //SELECT COUNT (*) FROM baggage WHERE status = ? and date = ?
        
        for (int i = 0; i < timeFramePoints.length; i++) {
            totalResolved[i] = (int) (Math.random() * 9) + 1;
        //SELECT COUNT (*) FROM baggage WHERE status = ? and date = ?
        }
        for (int i = 0; i < timeFramePoints.length; i++) {
            totalUnresolved[i] = (int) (Math.random() * 9) + 1;
        //SELECT COUNT (*) FROM baggage WHERE status = ? and date = ?
        }
        for (int i = 0; i < timeFramePoints.length; i++) {
            totalPermanentlyLost[i] = (int) (Math.random() * 9) + 1;
        //SELECT COUNT (*) FROM baggage WHERE status = ? and date = ?
        }
    }
}
