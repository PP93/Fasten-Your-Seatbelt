/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package fys;

import java.awt.Color;
import javax.swing.JPanel;

/**
 *
 * @author Alternate
 */
public class Graphmaking  {
    
    
    public void makeGraphToday(JPanel Container) {
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
        graphMakerMethod(graphname, totalResolved, today, totalUnresolved, totalPermanentlyLost, Resolved, PermanentlyLost, Unresolved, timeFrameGraph, Container);

    }

    public void makeGraphWeek(JPanel Container) {
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
        graphMakerMethod(graphname, totalResolved, week, totalUnresolved, totalPermanentlyLost, Resolved, PermanentlyLost, Unresolved, timeFrameGraph, Container);

    }

    public void makeGraphMonth(JPanel Container) {
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
        graphMakerMethod(graphname, totalResolved, month, totalUnresolved, totalPermanentlyLost, Resolved, PermanentlyLost, Unresolved, timeFrameGraph, Container);

    }

    public void makeGraphYear(JPanel Container) {
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
        graphMakerMethod(graphname, totalResolved, year, totalUnresolved, totalPermanentlyLost, Resolved, PermanentlyLost, Unresolved, timeFrameGraph, Container);

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
