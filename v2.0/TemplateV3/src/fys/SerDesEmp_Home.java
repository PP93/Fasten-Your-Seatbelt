package fys;

public class SerDesEmp_Home extends javax.swing.JPanel {

    public SerDesEmp_Home() {
        initComponents();
        Manual_Panel.setVisible(false);
        Manual_Panel.setEnabled(false);

        Employee currentEmployee = new Employee(Employee.getCurrentUser());
        Label_WelcomeText.setText("Welcome " + currentEmployee.getFullName() + ".");
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
        Label_Home = new javax.swing.JLabel();
        Label_WelcomeText = new javax.swing.JLabel();
        Label_CallManual = new javax.swing.JLabel();
        Tab_NewCase = new javax.swing.JLabel();
        Tab_UpdateCase = new javax.swing.JLabel();
        Tab_AddExtraBaggage = new javax.swing.JLabel();
        Tab_LogOut = new javax.swing.JLabel();
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
        Label_Info.setText("<html>Click on one of the menu buttons to navigate to the desired page.");
        Label_Info.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        Manual_Panel.add(Label_Info, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 80, 250, 420));

        add(Manual_Panel, new org.netbeans.lib.awtextra.AbsoluteConstraints(980, 80, 290, 590));

        Label_Home.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        Label_Home.setForeground(new java.awt.Color(153, 0, 0));
        Label_Home.setText("Home");
        add(Label_Home, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 230, 120, 70));

        Label_WelcomeText.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        Label_WelcomeText.setForeground(new java.awt.Color(153, 0, 0));
        Label_WelcomeText.setText("Welcome, serdesemp1");
        add(Label_WelcomeText, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 320, -1, -1));

        Label_CallManual.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Label_CallManual.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Label_CallManualMouseClicked(evt);
            }
        });
        add(Label_CallManual, new org.netbeans.lib.awtextra.AbsoluteConstraints(1210, 20, 50, 50));

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

        Tab_AddExtraBaggage.setBackground(new java.awt.Color(156, 0, 0));
        Tab_AddExtraBaggage.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        Tab_AddExtraBaggage.setForeground(new java.awt.Color(255, 255, 255));
        Tab_AddExtraBaggage.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Tab_AddExtraBaggage.setText("Add Extra Baggage");
        Tab_AddExtraBaggage.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Tab_AddExtraBaggage.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        Tab_AddExtraBaggage.setOpaque(true);
        Tab_AddExtraBaggage.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Tab_AddExtraBaggageMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                Tab_AddExtraBaggageMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                Tab_AddExtraBaggageMouseExited(evt);
            }
        });
        add(Tab_AddExtraBaggage, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 110, 250, 40));

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
        add(Tab_LogOut, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 110, 250, 40));

        Background.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        Background.setForeground(new java.awt.Color(153, 0, 0));
        Background.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Background.setIcon(new javax.swing.ImageIcon(getClass().getResource("/fys/Images/Background.png"))); // NOI18N
        Background.setOpaque(true);
        add(Background, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -30, 1280, 780));
    }// </editor-fold>//GEN-END:initComponents

    private void Tab_NewCaseMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Tab_NewCaseMouseClicked
        FYS.getInstance().showPage(new SerDesEmp_NewCase());
    }//GEN-LAST:event_Tab_NewCaseMouseClicked

    private void Tab_NewCaseMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Tab_NewCaseMouseEntered
        Tab_NewCase.setBackground(new java.awt.Color(255, 255, 255));
        Tab_NewCase.setForeground(new java.awt.Color(153, 0, 0));
    }//GEN-LAST:event_Tab_NewCaseMouseEntered

    private void Tab_NewCaseMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Tab_NewCaseMouseExited
        Tab_NewCase.setBackground(new java.awt.Color(153, 0, 0));
        Tab_NewCase.setForeground(new java.awt.Color(255, 255, 255));
    }//GEN-LAST:event_Tab_NewCaseMouseExited

    private void Tab_AddExtraBaggageMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Tab_AddExtraBaggageMouseEntered
        Tab_AddExtraBaggage.setBackground(new java.awt.Color(255, 255, 255));
        Tab_AddExtraBaggage.setForeground(new java.awt.Color(153, 0, 0));
    }//GEN-LAST:event_Tab_AddExtraBaggageMouseEntered

    private void Tab_AddExtraBaggageMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Tab_AddExtraBaggageMouseExited
        Tab_AddExtraBaggage.setBackground(new java.awt.Color(153, 0, 0));
        Tab_AddExtraBaggage.setForeground(new java.awt.Color(255, 255, 255));
    }//GEN-LAST:event_Tab_AddExtraBaggageMouseExited

    private void Tab_LogOutMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Tab_LogOutMouseClicked
       FYS.getInstance().showPage(new SerDesEmp_LogOut());
    }//GEN-LAST:event_Tab_LogOutMouseClicked

    private void Tab_LogOutMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Tab_LogOutMouseEntered
        Tab_LogOut.setBackground(new java.awt.Color(255, 255, 255));
        Tab_LogOut.setForeground(new java.awt.Color(153, 0, 0));
    }//GEN-LAST:event_Tab_LogOutMouseEntered

    private void Tab_LogOutMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Tab_LogOutMouseExited
        Tab_LogOut.setBackground(new java.awt.Color(153, 0, 0));
        Tab_LogOut.setForeground(new java.awt.Color(255, 255, 255));
    }//GEN-LAST:event_Tab_LogOutMouseExited

    private void Tab_UpdateCaseMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Tab_UpdateCaseMouseEntered
        Tab_UpdateCase.setBackground(new java.awt.Color(255, 255, 255));
        Tab_UpdateCase.setForeground(new java.awt.Color(153, 0, 0));
    }//GEN-LAST:event_Tab_UpdateCaseMouseEntered

    private void Tab_UpdateCaseMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Tab_UpdateCaseMouseExited
        Tab_UpdateCase.setBackground(new java.awt.Color(153, 0, 0));
        Tab_UpdateCase.setForeground(new java.awt.Color(255, 255, 255));
    }//GEN-LAST:event_Tab_UpdateCaseMouseExited

    private void Tab_AddExtraBaggageMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Tab_AddExtraBaggageMouseClicked
        FYS.getInstance().showPage(new SerDesEmp_AddBagage());
    }//GEN-LAST:event_Tab_AddExtraBaggageMouseClicked

    private void Tab_UpdateCaseMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Tab_UpdateCaseMouseClicked
        FYS.getInstance().showPage(new SerDesEmp_UpdateCase());
    }//GEN-LAST:event_Tab_UpdateCaseMouseClicked

    private void Label_ManualExitMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Label_ManualExitMouseClicked
        Manual_Panel.setVisible(false);
        Manual_Panel.setEnabled(false);
    }//GEN-LAST:event_Label_ManualExitMouseClicked

    private void Label_CallManualMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Label_CallManualMouseClicked
        if (Manual_Panel.isVisible()) {
            Manual_Panel.setVisible(false);
            Manual_Panel.setEnabled(false);
        } else {
            Manual_Panel.setVisible(true);
            Manual_Panel.setEnabled(true);

        }
        
    }//GEN-LAST:event_Label_CallManualMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Background;
    private javax.swing.JLabel Label_CallManual;
    private javax.swing.JLabel Label_Home;
    private javax.swing.JLabel Label_Info;
    private javax.swing.JLabel Label_ManualExit;
    private javax.swing.JLabel Label_Title;
    private javax.swing.JLabel Label_WelcomeText;
    private javax.swing.JPanel Manual_Panel;
    private javax.swing.JLabel Tab_AddExtraBaggage;
    private javax.swing.JLabel Tab_LogOut;
    private javax.swing.JLabel Tab_NewCase;
    private javax.swing.JLabel Tab_UpdateCase;
    // End of variables declaration//GEN-END:variables
}
