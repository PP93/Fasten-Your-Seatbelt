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

        Manual_Panel = new javax.swing.JPanel();
        Label_ManualExit = new javax.swing.JLabel();
        Label_Title = new javax.swing.JLabel();
        Label_CallManual = new javax.swing.JLabel();
        Label_AccountType = new javax.swing.JLabel();
        Button_No = new javax.swing.JLabel();
        Button_Yes = new javax.swing.JLabel();
        newcase_button = new javax.swing.JLabel();
        addbagage_button = new javax.swing.JLabel();
        LogOut_button4 = new javax.swing.JLabel();
        updatecase_button = new javax.swing.JLabel();
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

        add(Manual_Panel, new org.netbeans.lib.awtextra.AbsoluteConstraints(980, 80, 290, 590));

        Label_CallManual.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Label_CallManual.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Label_CallManualMouseClicked(evt);
            }
        });
        add(Label_CallManual, new org.netbeans.lib.awtextra.AbsoluteConstraints(1210, 20, 50, 50));

        Label_AccountType.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        Label_AccountType.setForeground(new java.awt.Color(153, 0, 0));
        Label_AccountType.setText("Are you sure you want to log out?");
        add(Label_AccountType, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 320, -1, -1));

        Button_No.setBackground(new java.awt.Color(34, 153, 68));
        Button_No.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        Button_No.setForeground(new java.awt.Color(255, 255, 255));
        Button_No.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Button_No.setText("No");
        Button_No.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Button_No.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        Button_No.setOpaque(true);
        Button_No.addMouseListener(new java.awt.event.MouseAdapter() {
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

        addbagage_button.setBackground(new java.awt.Color(156, 0, 0));
        addbagage_button.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        addbagage_button.setForeground(new java.awt.Color(255, 255, 255));
        addbagage_button.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        addbagage_button.setText("Add Bagage");
        addbagage_button.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        addbagage_button.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        addbagage_button.setOpaque(true);
        addbagage_button.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                addbagage_buttonMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                addbagage_buttonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                addbagage_buttonMouseExited(evt);
            }
        });
        add(addbagage_button, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 110, 250, 40));

        LogOut_button4.setBackground(new java.awt.Color(255, 255, 255));
        LogOut_button4.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        LogOut_button4.setForeground(new java.awt.Color(156, 0, 0));
        LogOut_button4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        LogOut_button4.setText("Log Out");
        LogOut_button4.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        LogOut_button4.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        LogOut_button4.setOpaque(true);
        LogOut_button4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                LogOut_button4MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                LogOut_button4MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                LogOut_button4MouseExited(evt);
            }
        });
        add(LogOut_button4, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 110, 250, 40));

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

    private void newcase_buttonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_newcase_buttonMouseClicked
        FYS.getInstance().showPage(new SerDesEmp_NewCase());
    }//GEN-LAST:event_newcase_buttonMouseClicked

    private void newcase_buttonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_newcase_buttonMouseEntered
        newcase_button.setBackground(new java.awt.Color(255, 255, 255));
        newcase_button.setForeground(new java.awt.Color(153, 0, 0));
    }//GEN-LAST:event_newcase_buttonMouseEntered

    private void newcase_buttonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_newcase_buttonMouseExited
        newcase_button.setBackground(new java.awt.Color(153, 0, 0));
        newcase_button.setForeground(new java.awt.Color(255, 255, 255));
    }//GEN-LAST:event_newcase_buttonMouseExited

    private void addbagage_buttonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_addbagage_buttonMouseEntered
        addbagage_button.setBackground(new java.awt.Color(255, 255, 255));
        addbagage_button.setForeground(new java.awt.Color(153, 0, 0));
    }//GEN-LAST:event_addbagage_buttonMouseEntered

    private void addbagage_buttonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_addbagage_buttonMouseExited
        addbagage_button.setBackground(new java.awt.Color(153, 0, 0));

        addbagage_button.setForeground(new java.awt.Color(255, 255, 255));
    }//GEN-LAST:event_addbagage_buttonMouseExited

    private void LogOut_button4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LogOut_button4MouseClicked
      
    }//GEN-LAST:event_LogOut_button4MouseClicked

    private void LogOut_button4MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LogOut_button4MouseEntered

    }//GEN-LAST:event_LogOut_button4MouseEntered

    private void LogOut_button4MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LogOut_button4MouseExited

    }//GEN-LAST:event_LogOut_button4MouseExited

    private void updatecase_buttonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_updatecase_buttonMouseEntered
        updatecase_button.setBackground(new java.awt.Color(255, 255, 255));
        updatecase_button.setForeground(new java.awt.Color(153, 0, 0));
    }//GEN-LAST:event_updatecase_buttonMouseEntered

    private void updatecase_buttonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_updatecase_buttonMouseExited
        updatecase_button.setBackground(new java.awt.Color(153, 0, 0));
        updatecase_button.setForeground(new java.awt.Color(255, 255, 255));
    }//GEN-LAST:event_updatecase_buttonMouseExited

    private void addbagage_buttonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_addbagage_buttonMouseClicked
       FYS.getInstance().showPage(new SerDesEmp_AddBagage());
               addbagage_button.setForeground(new java.awt.Color(153,0,0));
        addbagage_button.setBackground(new java.awt.Color(255,255,255));
    }//GEN-LAST:event_addbagage_buttonMouseClicked

    private void updatecase_buttonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_updatecase_buttonMouseClicked
        FYS.getInstance().showPage(new SerDesEmp_UpdateCase());
    }//GEN-LAST:event_updatecase_buttonMouseClicked

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
    private javax.swing.JLabel Button_No;
    private javax.swing.JLabel Button_Yes;
    private javax.swing.JLabel Label_AccountType;
    private javax.swing.JLabel Label_CallManual;
    private javax.swing.JLabel Label_ManualExit;
    private javax.swing.JLabel Label_Title;
    private javax.swing.JLabel LogOut_button4;
    private javax.swing.JPanel Manual_Panel;
    private javax.swing.JLabel addbagage_button;
    private javax.swing.JLabel newcase_button;
    private javax.swing.JLabel updatecase_button;
    // End of variables declaration//GEN-END:variables
}
