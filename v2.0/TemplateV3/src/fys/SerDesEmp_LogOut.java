package fys;

public class SerDesEmp_LogOut extends javax.swing.JPanel {

    public SerDesEmp_LogOut() {
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

        Label_Logo = new javax.swing.JLabel();
        Label_CallManual = new javax.swing.JLabel();
        Manual_Panel = new javax.swing.JPanel();
        Label_ManualExit = new javax.swing.JLabel();
        Label_Title = new javax.swing.JLabel();
        Label_Info = new javax.swing.JLabel();
        Label_Message = new javax.swing.JLabel();
        Button_No = new javax.swing.JLabel();
        Button_Yes = new javax.swing.JLabel();
        Tab_NewCase = new javax.swing.JLabel();
        Tag_UpdateCase = new javax.swing.JLabel();
        Tab_AddExtraBaggage = new javax.swing.JLabel();
        Tab_LogOut = new javax.swing.JLabel();
        Background = new javax.swing.JLabel();

        setMaximumSize(new java.awt.Dimension(1280, 720));
        setMinimumSize(new java.awt.Dimension(1280, 720));
        setName(""); // NOI18N
        setPreferredSize(new java.awt.Dimension(1280, 720));
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

        Label_Title.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        Label_Title.setForeground(new java.awt.Color(153, 0, 0));
        Label_Title.setText("Manual");
        Manual_Panel.add(Label_Title, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 80, 30));

        Label_Info.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        Label_Info.setForeground(new java.awt.Color(153, 0, 0));
        Label_Info.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Label_Info.setText("<html>\nIf you wish to log out, please click\n'Yes'. Otherwise click 'No' and you \nwill be returned to the home page.\nYou can also click the menu buttons\non the upper left corner to navigate\nto other pages without logging out.\n<br>\n<br>\nIf you choose to log out, you will be \nreturned to the login page.");
        Label_Info.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        Manual_Panel.add(Label_Info, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 80, 250, 420));

        add(Manual_Panel, new org.netbeans.lib.awtextra.AbsoluteConstraints(980, 80, 290, 590));

        Label_Message.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        Label_Message.setForeground(new java.awt.Color(153, 0, 0));
        Label_Message.setText("Are you sure you want to log out?");
        add(Label_Message, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 320, -1, -1));

        Button_No.setBackground(new java.awt.Color(34, 153, 68));
        Button_No.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        Button_No.setForeground(new java.awt.Color(255, 255, 255));
        Button_No.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Button_No.setText("No");
        Button_No.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Button_No.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        Button_No.setOpaque(true);
        Button_No.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Button_NoMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                Button_NoMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                Button_NoMouseExited(evt);
            }
        });
        add(Button_No, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 400, 130, -1));

        Button_Yes.setBackground(new java.awt.Color(34, 153, 68));
        Button_Yes.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        Button_Yes.setForeground(new java.awt.Color(255, 255, 255));
        Button_Yes.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Button_Yes.setText("Yes");
        Button_Yes.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Button_Yes.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        Button_Yes.setOpaque(true);
        Button_Yes.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Button_YesMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                Button_YesMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                Button_YesMouseExited(evt);
            }
        });
        add(Button_Yes, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 400, 130, -1));

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

        Tag_UpdateCase.setBackground(new java.awt.Color(156, 0, 0));
        Tag_UpdateCase.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        Tag_UpdateCase.setForeground(new java.awt.Color(255, 255, 255));
        Tag_UpdateCase.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Tag_UpdateCase.setText("Update Case");
        Tag_UpdateCase.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Tag_UpdateCase.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        Tag_UpdateCase.setOpaque(true);
        Tag_UpdateCase.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Tag_UpdateCaseMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                Tag_UpdateCaseMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                Tag_UpdateCaseMouseExited(evt);
            }
        });
        add(Tag_UpdateCase, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 110, 250, 40));

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

        Tab_LogOut.setBackground(new java.awt.Color(255, 255, 255));
        Tab_LogOut.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        Tab_LogOut.setForeground(new java.awt.Color(156, 0, 0));
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

    private void Button_NoMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Button_NoMouseEntered
        Button_No.setBackground(new java.awt.Color(51, 136, 68));
    }//GEN-LAST:event_Button_NoMouseEntered

    private void Button_NoMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Button_NoMouseExited
        Button_No.setBackground(new java.awt.Color(34, 153, 68));
    }//GEN-LAST:event_Button_NoMouseExited

    private void Button_YesMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Button_YesMouseEntered
        Button_Yes.setBackground(new java.awt.Color(51, 136, 68));
    }//GEN-LAST:event_Button_YesMouseEntered

    private void Button_YesMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Button_YesMouseExited
        Button_Yes.setBackground(new java.awt.Color(34, 153, 68));
    }//GEN-LAST:event_Button_YesMouseExited

    private void Button_YesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Button_YesMouseClicked
        FYS.getInstance().showPage(new Login());
    }//GEN-LAST:event_Button_YesMouseClicked

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
      
    }//GEN-LAST:event_Tab_LogOutMouseClicked

    private void Tab_LogOutMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Tab_LogOutMouseEntered

    }//GEN-LAST:event_Tab_LogOutMouseEntered

    private void Tab_LogOutMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Tab_LogOutMouseExited

    }//GEN-LAST:event_Tab_LogOutMouseExited

    private void Tag_UpdateCaseMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Tag_UpdateCaseMouseEntered
        Tag_UpdateCase.setBackground(new java.awt.Color(255, 255, 255));
        Tag_UpdateCase.setForeground(new java.awt.Color(153, 0, 0));
    }//GEN-LAST:event_Tag_UpdateCaseMouseEntered

    private void Tag_UpdateCaseMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Tag_UpdateCaseMouseExited
        Tag_UpdateCase.setBackground(new java.awt.Color(153, 0, 0));
        Tag_UpdateCase.setForeground(new java.awt.Color(255, 255, 255));
    }//GEN-LAST:event_Tag_UpdateCaseMouseExited

    private void Tab_AddExtraBaggageMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Tab_AddExtraBaggageMouseClicked
       FYS.getInstance().showPage(new SerDesEmp_AddBagage());
               Tab_AddExtraBaggage.setForeground(new java.awt.Color(153,0,0));
        Tab_AddExtraBaggage.setBackground(new java.awt.Color(255,255,255));
    }//GEN-LAST:event_Tab_AddExtraBaggageMouseClicked

    private void Tag_UpdateCaseMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Tag_UpdateCaseMouseClicked
        FYS.getInstance().showPage(new SerDesEmp_UpdateCase());
    }//GEN-LAST:event_Tag_UpdateCaseMouseClicked

    private void Label_ManualExitMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Label_ManualExitMouseClicked
        Manual_Panel.setVisible(false);
        Manual_Panel.setEnabled(false);
    }//GEN-LAST:event_Label_ManualExitMouseClicked

    private void Label_CallManualMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Label_CallManualMouseClicked
        Manual_Panel.setVisible(true);
        Manual_Panel.setEnabled(true);
    }//GEN-LAST:event_Label_CallManualMouseClicked

    private void Label_LogoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Label_LogoMouseClicked
        FYS.getInstance().showPage(new SerDesEmp_Home());
    }//GEN-LAST:event_Label_LogoMouseClicked

    private void Button_NoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Button_NoMouseClicked
        FYS.getInstance().showPage(new SerDesEmp_Home());
    }//GEN-LAST:event_Button_NoMouseClicked

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Background;
    private javax.swing.JLabel Button_No;
    private javax.swing.JLabel Button_Yes;
    private javax.swing.JLabel Label_CallManual;
    private javax.swing.JLabel Label_Info;
    private javax.swing.JLabel Label_Logo;
    private javax.swing.JLabel Label_ManualExit;
    private javax.swing.JLabel Label_Message;
    private javax.swing.JLabel Label_Title;
    private javax.swing.JPanel Manual_Panel;
    private javax.swing.JLabel Tab_AddExtraBaggage;
    private javax.swing.JLabel Tab_LogOut;
    private javax.swing.JLabel Tab_NewCase;
    private javax.swing.JLabel Tag_UpdateCase;
    // End of variables declaration//GEN-END:variables
}
