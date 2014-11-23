package fys;

import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;

public class FYS {

    private JFrame container;
    private static final FYS instance = new FYS();
    public static final int FRAME_WIDTH = 1290;
    public static final int FRAME_HEIGHT = 760;
    public static final String NAME = "FYS Application";
    //private Dbmanager dbManager;
    //private QueryManager queryManager;

    public static void main(String[] args) {

        final FYS application = FYS.getInstance();

        SwingUtilities.invokeLater(new Runnable() {

            @Override
            public void run() {
                try {
                    //application.initialize();
                    application.start();
                } catch (Exception e) {
                    System.out.println("Application FYS failed to launch.");
                }
            }
        });
    }

    public void start() {

        container = new JFrame(NAME);
        container.setSize(FRAME_WIDTH, FRAME_HEIGHT);

        container.getContentPane();
        showPage(new AppMan_NewAccount());

        container.setVisible(true);

        container.addWindowListener(new WindowAdapter() {

            @Override
            public void windowClosing(WindowEvent event) {
                shutdown();
            }
        });
    }

    public void showPage(JPanel panel) {
        container.getContentPane().removeAll();
        container.getContentPane().add(panel);
        container.getContentPane().validate();
        container.getContentPane().repaint();
    }

    public static FYS getInstance() {
        return instance;
    }

    public void exit() {
        container.setVisible(false);
        shutdown();
    }

    private void shutdown() {
        container.dispose();
        //dbManager.closeConnection();
    }

    /*public void initialize() {
     dbManager = new Dbmanager();
     dbManager.openConnection();
     queryManager = new QueryManager(dbManager);
     }*/
}
