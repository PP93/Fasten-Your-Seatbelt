/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fys;

import java.awt.Color;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author Alternate
 */
public class Graphmaking {

    private String status;
    Connection conn = null;
    ResultSet rs = null;
    PreparedStatement pst = null;

    public void makeGraphToday(JPanel Container) {
        String graphname = "Graph Name Test";
        String[] timeFramePoints = {"1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24"};
        String timeFrameGraph = "Hour";
        int Resolved = 0;
        int Unresolved = 0;
        int PermanentlyLost = 0;
        String ResolvedString = "resolved";
        String UnresolvedString = "unresolved";
        String PermanentlyLostString = "permanentlylost";
        int[] totalResolved = new int[timeFramePoints.length];
        int[] totalUnresolved = new int[timeFramePoints.length];
        int[] totalPermanentlyLost = new int[timeFramePoints.length];

        forLoopSetInfoInArrayFromDatabaseForGraph(timeFramePoints, totalResolved, totalUnresolved, totalPermanentlyLost, ResolvedString, UnresolvedString, PermanentlyLostString);
        graphMakerMethod(graphname, totalResolved, timeFramePoints, totalUnresolved, totalPermanentlyLost, Resolved, PermanentlyLost, Unresolved, timeFrameGraph, Container);

    }

    public void makeGraphWeek(JPanel Container) {
        String graphname = "Graph Name Test";
        String[] timeFramePoints = {"1", "2", "3", "4", "5", "6", "7",};
        String timeFrameGraph = "Week Day";

        int Resolved = 0;
        int Unresolved = 0;
        int PermanentlyLost = 0;
        String ResolvedString = "resolved";
        String UnresolvedString = "unresolved";
        String PermanentlyLostString = "permanentlylost";
        int[] totalResolved = new int[timeFramePoints.length];
        int[] totalUnresolved = new int[timeFramePoints.length];
        int[] totalPermanentlyLost = new int[timeFramePoints.length];

        forLoopSetInfoInArrayFromDatabaseForGraph(timeFramePoints, totalResolved, totalUnresolved, totalPermanentlyLost, ResolvedString, UnresolvedString, PermanentlyLostString);
        graphMakerMethod(graphname, totalResolved, timeFramePoints, totalUnresolved, totalPermanentlyLost, Resolved, PermanentlyLost, Unresolved, timeFrameGraph, Container);

    }

    public void makeGraphMonth(JPanel Container) {
        String graphname = "Graph Name Test";
        String[] timeFramePoints = {"1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31"};
        String timeFrameGraph = "Month Day";

        int Resolved = 0;
        int Unresolved = 0;
        int PermanentlyLost = 0;
        String ResolvedString = "resolved";
        String UnresolvedString = "unresolved";
        String PermanentlyLostString = "permanentlylost";
        int[] totalResolved = new int[timeFramePoints.length];
        int[] totalUnresolved = new int[timeFramePoints.length];
        int[] totalPermanentlyLost = new int[timeFramePoints.length];

        forLoopSetInfoInArrayFromDatabaseForGraph(timeFramePoints, totalResolved, totalUnresolved, totalPermanentlyLost, ResolvedString, UnresolvedString, PermanentlyLostString);
        graphMakerMethod(graphname, totalResolved, timeFramePoints, totalUnresolved, totalPermanentlyLost, Resolved, PermanentlyLost, Unresolved, timeFrameGraph, Container);

    }

    public void makeGraphYear(JPanel Container) {
        String graphname = "Graph Name Test";
        String[] timeFramePoints = {"Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec"};
        String timeFrameGraph = "Month";

        int Resolved = 0;
        int Unresolved = 0;
        int PermanentlyLost = 0;

        String ResolvedString = "resolved";
        String UnresolvedString = "unresolved";
        String PermanentlyLostString = "permanentlylost";
        int[] totalResolved = new int[timeFramePoints.length];
        int[] totalUnresolved = new int[timeFramePoints.length];
        int[] totalPermanentlyLost = new int[timeFramePoints.length];

        //deze loop moet een database connectie worden.
        //SELECT COUNT (*) FROM baggage WHERE status == Resolved and date is jan
        forLoopSetInfoInArrayFromDatabaseForGraph(timeFramePoints, totalResolved, totalUnresolved, totalPermanentlyLost, ResolvedString, UnresolvedString, PermanentlyLostString);
        graphMakerMethod(graphname, totalResolved, timeFramePoints, totalUnresolved, totalPermanentlyLost, Resolved, PermanentlyLost, Unresolved, timeFrameGraph, Container);

    }

    private void graphMakerMethod(String graphname, int[] totalResolved, String[] today, int[] totalUnresolved, int[] totalPermanentlyLost, int Resolved, int PermanentlyLost, int Unresolved, String timeFrameGraph, JPanel JPanel_Graph) {
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

    private void forLoopSetInfoInArrayFromDatabaseForGraph(String[] timeFramePoints, int[] totalResolved, int[] totalUnresolved, int[] totalPermanentlyLost, String Resolved, String Unresolved, String PermanentlyLost) {
        //deze loop moet een database connectie worden.

        //SELECT COUNT (*) FROM baggage WHERE status = ? and date = ?
        for (int i = 0; i < timeFramePoints.length; i++) {
            totalResolved[i] = fromdatabaseintforloop(i, Resolved);
            //SELECT COUNT (*) FROM baggage WHERE status = ? and date = ?
        }
        for (int i = 0; i < timeFramePoints.length; i++) {
            totalUnresolved[i] = fromdatabaseintforloop(i, Unresolved);
            //SELECT COUNT (*) FROM baggage WHERE status = ? and date = ?
        }
        for (int i = 0; i < timeFramePoints.length; i++) {
            totalPermanentlyLost[i] = fromdatabaseintforloop(i, PermanentlyLost);
            //SELECT COUNT (*) FROM baggage WHERE status = ? and date = ?
        }
    }

    public int fromdatabaseintforloop(int timeFramePointData, String Status) {
        conn = javaconnect.ConnecrDb();

        try {
            String sql = "SELECT count(*) FROM baggage";

            pst = conn.prepareStatement(sql);
            pst.setString(1, Status);

            rs = pst.executeQuery();

        } catch (SQLException e) {

            JOptionPane.showMessageDialog(null, e);
        }

        return timeFramePointData;
    }

}
