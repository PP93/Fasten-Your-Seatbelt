package fys;

import javax.swing.ImageIcon;

public class StandBy extends javax.swing.JPanel {

    public StandBy() {
        initComponents();
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
        Label_Info = new javax.swing.JLabel();
        Label_CallManual = new javax.swing.JLabel();
        Button_Continue = new javax.swing.JLabel();
        Text = new javax.swing.JLabel();
        Tab_StandBy = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        jSeparator3 = new javax.swing.JSeparator();
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
        Label_Info.setText("<html>\nYou've been idle for too long. The system has \nautomatically logged you out. Click on 'Continue' \nto return to the login screen.");
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

        Button_Continue.setBackground(new java.awt.Color(34, 153, 68));
        Button_Continue.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        Button_Continue.setForeground(new java.awt.Color(255, 255, 255));
        Button_Continue.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Button_Continue.setText("Continue");
        Button_Continue.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Button_Continue.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        Button_Continue.setOpaque(true);
        Button_Continue.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                Button_ContinueMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                Button_ContinueMouseExited(evt);
            }
        });
        add(Button_Continue, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 430, 130, 30));

        Text.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        Text.setForeground(new java.awt.Color(153, 0, 0));
        Text.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Text.setText("<html><center>Your session timed out.<br>Click continue to log in.</center></html>");
        Text.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        add(Text, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 230, 650, 220));

        Tab_StandBy.setBackground(new java.awt.Color(255, 255, 255));
        Tab_StandBy.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        Tab_StandBy.setForeground(new java.awt.Color(153, 0, 0));
        Tab_StandBy.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Tab_StandBy.setText("Stand By");
        Tab_StandBy.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Tab_StandBy.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        Tab_StandBy.setOpaque(true);
        add(Tab_StandBy, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 110, 250, 40));
        add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 640, 1300, 70));
        add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 150, 1040, 20));
        add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 150, 10, 20));

        Background.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        Background.setForeground(new java.awt.Color(153, 0, 0));
        Background.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Background.setIcon(new javax.swing.ImageIcon(getClass().getResource("/fys/Images/Background.png"))); // NOI18N
        Background.setOpaque(true);
        add(Background, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -30, 1280, 780));
    }// </editor-fold>//GEN-END:initComponents


    private void Button_ContinueMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Button_ContinueMouseEntered
        Button_Continue.setBackground(new java.awt.Color(51, 136, 68));

    }//GEN-LAST:event_Button_ContinueMouseEntered

    private void Button_ContinueMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Button_ContinueMouseExited
        Button_Continue.setBackground(new java.awt.Color(34, 153, 68));

    }//GEN-LAST:event_Button_ContinueMouseExited

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
    private javax.swing.JLabel Button_Continue;
    private javax.swing.JLabel Label_CallManual;
    private javax.swing.JLabel Label_Info;
    private javax.swing.JLabel Label_ManualExit;
    private javax.swing.JPanel Manual_Panel;
    private javax.swing.JLabel Tab_StandBy;
    private javax.swing.JLabel Text;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    // End of variables declaration//GEN-END:variables
}
