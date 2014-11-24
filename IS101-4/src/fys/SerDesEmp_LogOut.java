package fys;

public class SerDesEmp_LogOut extends javax.swing.JPanel {

    public SerDesEmp_LogOut() {
        initComponents();

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Label_AccountType = new javax.swing.JLabel();
        Button_No = new javax.swing.JLabel();
        Button_Yes = new javax.swing.JLabel();
        Tab_NewCase = new javax.swing.JLabel();
        Tab_UpdateCase = new javax.swing.JLabel();
        Tab_LogOut = new javax.swing.JLabel();
        Background = new javax.swing.JLabel();

        setMaximumSize(new java.awt.Dimension(1280, 720));
        setMinimumSize(new java.awt.Dimension(1280, 720));
        setName(""); // NOI18N
        setPreferredSize(new java.awt.Dimension(1280, 720));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Label_AccountType.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        Label_AccountType.setForeground(new java.awt.Color(153, 0, 0));
        Label_AccountType.setText("Are you sure you want to log out of our fabulous fucking app?");
        add(Label_AccountType, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 320, -1, -1));

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
        add(Button_No, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 400, 130, -1));

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
        add(Button_Yes, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 400, 130, -1));

        Tab_NewCase.setBackground(new java.awt.Color(156, 10, 13));
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

        Tab_UpdateCase.setBackground(new java.awt.Color(156, 10, 13));
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

        Tab_LogOut.setBackground(new java.awt.Color(255, 255, 255));
        Tab_LogOut.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        Tab_LogOut.setForeground(new java.awt.Color(156, 10, 13));
        Tab_LogOut.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Tab_LogOut.setText("Log Out");
        Tab_LogOut.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Tab_LogOut.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        Tab_LogOut.setOpaque(true);
        add(Tab_LogOut, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 110, 250, 40));

        Background.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        Background.setForeground(new java.awt.Color(153, 0, 0));
        Background.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Background.setIcon(new javax.swing.ImageIcon(getClass().getResource("/fys/Images/Background.png"))); // NOI18N
        Background.setOpaque(true);
        add(Background, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -30, 1280, 780));
    }// </editor-fold>//GEN-END:initComponents

    private void Tab_UpdateCaseMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Tab_UpdateCaseMouseEntered
        Tab_UpdateCase.setBackground(new java.awt.Color(255, 255, 255));
        Tab_UpdateCase.setForeground(new java.awt.Color(153, 0, 0));
    }//GEN-LAST:event_Tab_UpdateCaseMouseEntered

    private void Tab_UpdateCaseMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Tab_UpdateCaseMouseExited
        Tab_UpdateCase.setBackground(new java.awt.Color(153, 0, 0));
        Tab_UpdateCase.setForeground(new java.awt.Color(255, 255, 255));
    }//GEN-LAST:event_Tab_UpdateCaseMouseExited

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

    private void Tab_NewCaseMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Tab_NewCaseMouseEntered
        Tab_NewCase.setBackground(new java.awt.Color(255, 255, 255));
        Tab_NewCase.setForeground(new java.awt.Color(153, 0, 0));
    }//GEN-LAST:event_Tab_NewCaseMouseEntered

    private void Tab_NewCaseMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Tab_NewCaseMouseExited
        Tab_NewCase.setBackground(new java.awt.Color(153, 0, 0));
        Tab_NewCase.setForeground(new java.awt.Color(255, 255, 255));
     }//GEN-LAST:event_Tab_NewCaseMouseExited

    private void Tab_UpdateCaseMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Tab_UpdateCaseMouseClicked
        FYS.getInstance().showPage(new SerDesEmp_UpdateCase());
    }//GEN-LAST:event_Tab_UpdateCaseMouseClicked

    private void Tab_NewCaseMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Tab_NewCaseMouseClicked
        FYS.getInstance().showPage(new SerDesEmp_NewCase());
    }//GEN-LAST:event_Tab_NewCaseMouseClicked

    private void Button_YesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Button_YesMouseClicked
        FYS.getInstance().showPage(new Login());
    }//GEN-LAST:event_Button_YesMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Background;
    private javax.swing.JLabel Button_No;
    private javax.swing.JLabel Button_Yes;
    private javax.swing.JLabel Label_AccountType;
    private javax.swing.JLabel Tab_LogOut;
    private javax.swing.JLabel Tab_NewCase;
    private javax.swing.JLabel Tab_UpdateCase;
    // End of variables declaration//GEN-END:variables
}
