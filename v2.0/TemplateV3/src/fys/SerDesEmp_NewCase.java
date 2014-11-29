package fys;

import java.awt.HeadlessException;
import java.sql.SQLException;
import java.sql.*;
import javax.swing.*;
import net.proteanit.sql.DbUtils;
import javax.swing.JOptionPane;

public class SerDesEmp_NewCase extends javax.swing.JPanel {

    Connection conn = null;
    ResultSet rs = null;
    PreparedStatement pst = null;

    public SerDesEmp_NewCase() {
        initComponents();
        conn = javaconnect.ConnecrDb();
        Panel_Manual.setVisible(false);
        Panel_Manual.setEnabled(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        employee_id = new javax.swing.JLabel();
        Label_CallManual = new javax.swing.JLabel();
        Panel_Manual = new javax.swing.JPanel();
        Label_ManualExit = new javax.swing.JLabel();
        Label_Title = new javax.swing.JLabel();
        Label_Info = new javax.swing.JLabel();
        Label_Date = new javax.swing.JLabel();
        Field_Date = new javax.swing.JTextField();
        Label_ClientInformation = new javax.swing.JLabel();
        Label_FirstName = new javax.swing.JLabel();
        Label_LastName = new javax.swing.JLabel();
        Label_EmailAddress = new javax.swing.JLabel();
        Label_PhoneNumber = new javax.swing.JLabel();
        Label_ZipCode = new javax.swing.JLabel();
        Label_Address = new javax.swing.JLabel();
        Label_City = new javax.swing.JLabel();
        Label_Country = new javax.swing.JLabel();
        Field_FirstName = new javax.swing.JTextField();
        Field_LastName = new javax.swing.JTextField();
        Field_EmailAddress = new javax.swing.JTextField();
        Field_PhoneNumber = new javax.swing.JTextField();
        Field_ZipCode = new javax.swing.JTextField();
        Field_Address = new javax.swing.JTextField();
        Field_City = new javax.swing.JTextField();
        Field_Country = new javax.swing.JTextField();
        Checkbox_CopyAddressInfo = new javax.swing.JCheckBox();
        Label_ShippingZipCode = new javax.swing.JLabel();
        Label_ShippingAddress = new javax.swing.JLabel();
        Label_ShippingCity = new javax.swing.JLabel();
        Label_ShippingCountry = new javax.swing.JLabel();
        Field_ShippingZipCode = new javax.swing.JTextField();
        Field_ShippingAddress = new javax.swing.JTextField();
        Field_ShippingCity = new javax.swing.JTextField();
        Field_ShippingCountry = new javax.swing.JTextField();
        Label_BaggageInformation = new javax.swing.JLabel();
        Label_FlightNumber = new javax.swing.JLabel();
        Label_Brand = new javax.swing.JLabel();
        Label_Color = new javax.swing.JLabel();
        Label_Weight = new javax.swing.JLabel();
        Label_Description = new javax.swing.JLabel();
        Field_FlightNumber = new javax.swing.JTextField();
        Field_Brand = new javax.swing.JTextField();
        Field_Color = new javax.swing.JTextField();
        Field_Weight = new javax.swing.JTextField();
        Field_Description = new javax.swing.JTextField();
        Button_Save = new javax.swing.JLabel();
        Button_Reset = new javax.swing.JLabel();
        Tab_NewCase = new javax.swing.JLabel();
        Tab_UpdateCase = new javax.swing.JLabel();
        Tab_AddBaggage = new javax.swing.JLabel();
        Tab_LogOut = new javax.swing.JLabel();
        Button_PDF = new javax.swing.JLabel();
        Background = new javax.swing.JLabel();

        employee_id.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        employee_id.setForeground(new java.awt.Color(153, 0, 0));
        employee_id.setText("Client Information:");

        setMaximumSize(new java.awt.Dimension(1280, 720));
        setMinimumSize(new java.awt.Dimension(1280, 720));
        setName(""); // NOI18N
        setPreferredSize(new java.awt.Dimension(1280, 720));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Label_CallManual.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Label_CallManual.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Label_CallManualMouseClicked(evt);
            }
        });
        add(Label_CallManual, new org.netbeans.lib.awtextra.AbsoluteConstraints(1210, 20, 50, 50));

        Panel_Manual.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        Panel_Manual.setEnabled(false);
        Panel_Manual.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Label_ManualExit.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Label_ManualExit.setText("X");
        Label_ManualExit.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Label_ManualExit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Label_ManualExitMouseClicked(evt);
            }
        });
        Panel_Manual.add(Label_ManualExit, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 0, 20, 20));

        Label_Title.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        Label_Title.setForeground(new java.awt.Color(153, 0, 0));
        Label_Title.setText("Manual");
        Panel_Manual.add(Label_Title, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 80, 30));

        Label_Info.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        Label_Info.setForeground(new java.awt.Color(153, 0, 0));
        Label_Info.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Label_Info.setText("<html>\nTo create a new case, fill in all the known and necessary\ndata in the given fields. If you need to start over from \nscratch, click the 'Reset' button to clear all fields and\nbegin again. Once all the needed fields have been filled,\nclick 'Save' to create and save the new case.");
        Label_Info.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        Panel_Manual.add(Label_Info, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 80, 250, 420));

        add(Panel_Manual, new org.netbeans.lib.awtextra.AbsoluteConstraints(980, 80, 290, 590));

        Label_Date.setFont(new java.awt.Font("Tahoma", 0, 17)); // NOI18N
        Label_Date.setForeground(new java.awt.Color(153, 0, 0));
        Label_Date.setText("Registration Date:");
        add(Label_Date, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 250, -1, -1));

        Field_Date.setForeground(new java.awt.Color(153, 0, 0));
        Field_Date.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        add(Field_Date, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 280, 230, 30));

        Label_ClientInformation.setFont(new java.awt.Font("Tahoma", 1, 17)); // NOI18N
        Label_ClientInformation.setForeground(new java.awt.Color(153, 0, 0));
        Label_ClientInformation.setText("Client Information:");
        add(Label_ClientInformation, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 210, -1, -1));

        Label_FirstName.setFont(new java.awt.Font("Tahoma", 0, 17)); // NOI18N
        Label_FirstName.setForeground(new java.awt.Color(153, 0, 0));
        Label_FirstName.setText("First Name:");
        add(Label_FirstName, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 240, -1, -1));

        Label_LastName.setFont(new java.awt.Font("Tahoma", 0, 17)); // NOI18N
        Label_LastName.setForeground(new java.awt.Color(153, 0, 0));
        Label_LastName.setText("Last Name:");
        add(Label_LastName, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 280, -1, -1));

        Label_EmailAddress.setFont(new java.awt.Font("Tahoma", 0, 17)); // NOI18N
        Label_EmailAddress.setForeground(new java.awt.Color(153, 0, 0));
        Label_EmailAddress.setText("Email Address:");
        add(Label_EmailAddress, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 320, -1, -1));

        Label_PhoneNumber.setFont(new java.awt.Font("Tahoma", 0, 17)); // NOI18N
        Label_PhoneNumber.setForeground(new java.awt.Color(153, 0, 0));
        Label_PhoneNumber.setText("Phone Number:");
        add(Label_PhoneNumber, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 360, -1, -1));

        Label_ZipCode.setFont(new java.awt.Font("Tahoma", 0, 17)); // NOI18N
        Label_ZipCode.setForeground(new java.awt.Color(153, 0, 0));
        Label_ZipCode.setText("Zip Code:");
        add(Label_ZipCode, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 400, -1, -1));

        Label_Address.setFont(new java.awt.Font("Tahoma", 0, 17)); // NOI18N
        Label_Address.setForeground(new java.awt.Color(153, 0, 0));
        Label_Address.setText("Address:");
        add(Label_Address, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 440, -1, -1));

        Label_City.setFont(new java.awt.Font("Tahoma", 0, 17)); // NOI18N
        Label_City.setForeground(new java.awt.Color(153, 0, 0));
        Label_City.setText("City:");
        add(Label_City, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 480, -1, -1));

        Label_Country.setFont(new java.awt.Font("Tahoma", 0, 17)); // NOI18N
        Label_Country.setForeground(new java.awt.Color(153, 0, 0));
        Label_Country.setText("Country:");
        add(Label_Country, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 520, -1, -1));

        Field_FirstName.setForeground(new java.awt.Color(153, 0, 0));
        Field_FirstName.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        add(Field_FirstName, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 240, 230, 30));

        Field_LastName.setForeground(new java.awt.Color(153, 0, 0));
        Field_LastName.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        add(Field_LastName, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 280, 230, 30));

        Field_EmailAddress.setForeground(new java.awt.Color(153, 0, 0));
        Field_EmailAddress.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        Field_EmailAddress.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Field_EmailAddressActionPerformed(evt);
            }
        });
        add(Field_EmailAddress, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 320, 230, 30));

        Field_PhoneNumber.setForeground(new java.awt.Color(153, 0, 0));
        Field_PhoneNumber.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        add(Field_PhoneNumber, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 360, 230, 30));

        Field_ZipCode.setForeground(new java.awt.Color(153, 0, 0));
        Field_ZipCode.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        add(Field_ZipCode, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 400, 230, 30));

        Field_Address.setForeground(new java.awt.Color(153, 0, 0));
        Field_Address.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        add(Field_Address, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 440, 230, 30));

        Field_City.setForeground(new java.awt.Color(153, 0, 0));
        Field_City.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        add(Field_City, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 480, 230, 30));

        Field_Country.setForeground(new java.awt.Color(153, 0, 0));
        Field_Country.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        add(Field_Country, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 520, 230, 30));

        Checkbox_CopyAddressInfo.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        Checkbox_CopyAddressInfo.setForeground(new java.awt.Color(153, 0, 0));
        Checkbox_CopyAddressInfo.setText("Shipping address same as living address");
        Checkbox_CopyAddressInfo.setContentAreaFilled(false);
        Checkbox_CopyAddressInfo.setFocusPainted(false);
        Checkbox_CopyAddressInfo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Checkbox_CopyAddressInfoActionPerformed(evt);
            }
        });
        add(Checkbox_CopyAddressInfo, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 350, 350, 40));

        Label_ShippingZipCode.setFont(new java.awt.Font("Tahoma", 0, 17)); // NOI18N
        Label_ShippingZipCode.setForeground(new java.awt.Color(153, 0, 0));
        Label_ShippingZipCode.setText("Shipping Zip Code:");
        add(Label_ShippingZipCode, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 400, -1, -1));

        Label_ShippingAddress.setFont(new java.awt.Font("Tahoma", 0, 17)); // NOI18N
        Label_ShippingAddress.setForeground(new java.awt.Color(153, 0, 0));
        Label_ShippingAddress.setText("Shipping Address:");
        add(Label_ShippingAddress, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 440, -1, -1));

        Label_ShippingCity.setFont(new java.awt.Font("Tahoma", 0, 17)); // NOI18N
        Label_ShippingCity.setForeground(new java.awt.Color(153, 0, 0));
        Label_ShippingCity.setText("Shipping City:");
        add(Label_ShippingCity, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 480, -1, -1));

        Label_ShippingCountry.setFont(new java.awt.Font("Tahoma", 0, 17)); // NOI18N
        Label_ShippingCountry.setForeground(new java.awt.Color(153, 0, 0));
        Label_ShippingCountry.setText("Shipping Country:");
        add(Label_ShippingCountry, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 520, -1, -1));

        Field_ShippingZipCode.setForeground(new java.awt.Color(153, 0, 0));
        Field_ShippingZipCode.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        add(Field_ShippingZipCode, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 400, 230, 30));

        Field_ShippingAddress.setForeground(new java.awt.Color(153, 0, 0));
        Field_ShippingAddress.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        add(Field_ShippingAddress, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 440, 230, 30));

        Field_ShippingCity.setForeground(new java.awt.Color(153, 0, 0));
        Field_ShippingCity.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        Field_ShippingCity.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Field_ShippingCityActionPerformed(evt);
            }
        });
        add(Field_ShippingCity, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 480, 230, 30));

        Field_ShippingCountry.setForeground(new java.awt.Color(153, 0, 0));
        Field_ShippingCountry.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        add(Field_ShippingCountry, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 520, 230, 30));

        Label_BaggageInformation.setFont(new java.awt.Font("Tahoma", 1, 17)); // NOI18N
        Label_BaggageInformation.setForeground(new java.awt.Color(153, 0, 0));
        Label_BaggageInformation.setText("Baggage Information:");
        add(Label_BaggageInformation, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 210, -1, -1));

        Label_FlightNumber.setFont(new java.awt.Font("Tahoma", 0, 17)); // NOI18N
        Label_FlightNumber.setForeground(new java.awt.Color(153, 0, 0));
        Label_FlightNumber.setText("Flight Number:");
        add(Label_FlightNumber, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 240, -1, -1));

        Label_Brand.setFont(new java.awt.Font("Tahoma", 0, 17)); // NOI18N
        Label_Brand.setForeground(new java.awt.Color(153, 0, 0));
        Label_Brand.setText("Brand:");
        add(Label_Brand, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 280, -1, -1));

        Label_Color.setFont(new java.awt.Font("Tahoma", 0, 17)); // NOI18N
        Label_Color.setForeground(new java.awt.Color(153, 0, 0));
        Label_Color.setText("Color:");
        add(Label_Color, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 320, -1, -1));

        Label_Weight.setFont(new java.awt.Font("Tahoma", 0, 17)); // NOI18N
        Label_Weight.setForeground(new java.awt.Color(153, 0, 0));
        Label_Weight.setText("Weight:");
        add(Label_Weight, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 360, -1, -1));

        Label_Description.setFont(new java.awt.Font("Tahoma", 0, 17)); // NOI18N
        Label_Description.setForeground(new java.awt.Color(153, 0, 0));
        Label_Description.setText("Description:");
        add(Label_Description, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 400, -1, -1));

        Field_FlightNumber.setForeground(new java.awt.Color(153, 0, 0));
        Field_FlightNumber.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        add(Field_FlightNumber, new org.netbeans.lib.awtextra.AbsoluteConstraints(960, 240, 230, 30));

        Field_Brand.setForeground(new java.awt.Color(153, 0, 0));
        Field_Brand.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        add(Field_Brand, new org.netbeans.lib.awtextra.AbsoluteConstraints(960, 280, 230, 30));

        Field_Color.setForeground(new java.awt.Color(153, 0, 0));
        Field_Color.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        add(Field_Color, new org.netbeans.lib.awtextra.AbsoluteConstraints(960, 320, 230, 30));

        Field_Weight.setForeground(new java.awt.Color(153, 0, 0));
        Field_Weight.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        add(Field_Weight, new org.netbeans.lib.awtextra.AbsoluteConstraints(960, 360, 230, 30));

        Field_Description.setForeground(new java.awt.Color(153, 0, 0));
        Field_Description.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        add(Field_Description, new org.netbeans.lib.awtextra.AbsoluteConstraints(960, 400, 230, 150));

        Button_Save.setBackground(new java.awt.Color(34, 153, 68));
        Button_Save.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        Button_Save.setForeground(new java.awt.Color(255, 255, 255));
        Button_Save.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Button_Save.setText("Save");
        Button_Save.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Button_Save.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        Button_Save.setOpaque(true);
        Button_Save.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Button_SaveMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                Button_SaveMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                Button_SaveMouseExited(evt);
            }
        });
        add(Button_Save, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 600, 130, -1));

        Button_Reset.setBackground(new java.awt.Color(34, 153, 68));
        Button_Reset.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        Button_Reset.setForeground(new java.awt.Color(255, 255, 255));
        Button_Reset.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Button_Reset.setText("Reset");
        Button_Reset.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Button_Reset.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        Button_Reset.setOpaque(true);
        Button_Reset.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Button_ResetMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                Button_ResetMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                Button_ResetMouseExited(evt);
            }
        });
        add(Button_Reset, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 600, 130, -1));

        Tab_NewCase.setBackground(new java.awt.Color(255, 255, 255));
        Tab_NewCase.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        Tab_NewCase.setForeground(new java.awt.Color(156, 10, 13));
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

        Tab_AddBaggage.setBackground(new java.awt.Color(156, 0, 0));
        Tab_AddBaggage.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        Tab_AddBaggage.setForeground(new java.awt.Color(255, 255, 255));
        Tab_AddBaggage.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Tab_AddBaggage.setText("Add Extra Baggage");
        Tab_AddBaggage.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Tab_AddBaggage.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        Tab_AddBaggage.setOpaque(true);
        Tab_AddBaggage.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Tab_AddBaggageMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                Tab_AddBaggageMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                Tab_AddBaggageMouseExited(evt);
            }
        });
        add(Tab_AddBaggage, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 110, 250, 40));

        Tab_LogOut.setBackground(new java.awt.Color(156, 0, 0));
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

        Button_PDF.setBackground(new java.awt.Color(34, 153, 68));
        Button_PDF.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        Button_PDF.setForeground(new java.awt.Color(255, 255, 255));
        Button_PDF.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Button_PDF.setText("Make PDF");
        Button_PDF.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Button_PDF.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        Button_PDF.setOpaque(true);
        Button_PDF.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Button_PDFMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                Button_PDFMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                Button_PDFMouseExited(evt);
            }
        });
        add(Button_PDF, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 600, 130, -1));

        Background.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        Background.setForeground(new java.awt.Color(153, 0, 0));
        Background.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Background.setIcon(new javax.swing.ImageIcon(getClass().getResource("/fys/Images/Background.png"))); // NOI18N
        Background.setOpaque(true);
        add(Background, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -30, 1280, 780));
    }// </editor-fold>//GEN-END:initComponents


    private void Button_ResetMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Button_ResetMouseEntered
        Button_Reset.setBackground(new java.awt.Color(51, 136, 68));
    }//GEN-LAST:event_Button_ResetMouseEntered

    private void Button_ResetMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Button_ResetMouseExited
        Button_Reset.setBackground(new java.awt.Color(34, 153, 68));
    }//GEN-LAST:event_Button_ResetMouseExited

    private void Button_SaveMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Button_SaveMouseEntered
        Button_Save.setBackground(new java.awt.Color(51, 136, 68));

    }//GEN-LAST:event_Button_SaveMouseEntered

    private void Button_SaveMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Button_SaveMouseExited
        Button_Save.setBackground(new java.awt.Color(34, 153, 68));

    }//GEN-LAST:event_Button_SaveMouseExited

    private void Checkbox_CopyAddressInfoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Checkbox_CopyAddressInfoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Checkbox_CopyAddressInfoActionPerformed

    private void Button_SaveMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Button_SaveMouseClicked

        try {

            String sql = "insert into client (name,lastname,country,city,zipcode,address,phonenumber,email,shippingcountry,shippingzipcode,shippingaddress,shippingcity)value(?,?,?,?,?,?,?,?,?,?,?,?)";
            pst = conn.prepareStatement(sql);

            pst.setString(1, Field_FirstName.getText());
            pst.setString(2, Field_LastName.getText());
            pst.setString(3, Field_Country.getText());
            pst.setString(4, Field_City.getText());
            pst.setString(5, Field_ZipCode.getText());
            pst.setString(6, Field_Address.getText());
            pst.setString(7, Field_PhoneNumber.getText());
            pst.setString(8, Field_EmailAddress.getText());
            pst.setString(9, Field_ShippingCountry.getText());
            pst.setString(10, Field_ShippingZipCode.getText());
            pst.setString(11, Field_ShippingAddress.getText());
            pst.setString(12, Field_ShippingCity.getText());

            pst.execute();
            JOptionPane.showMessageDialog(null, "Saved");

        } catch (SQLException | HeadlessException e) {

            JOptionPane.showMessageDialog(null, e);
        }


    }//GEN-LAST:event_Button_SaveMouseClicked


    private void Button_ResetMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Button_ResetMouseClicked

        Field_Date.setText("");
        Field_LastName.setText("");
        Field_City.setText("");
        Field_ZipCode.setText("");
        Field_Address.setText("");
        Field_PhoneNumber.setText("");
        Field_EmailAddress.setText("");
        Field_ShippingCountry.setText("");
        Field_ShippingZipCode.setText("");
        Field_ShippingAddress.setText("");
        Field_ShippingCity.setText("");
        Field_FlightNumber.setText("");
        Field_Brand.setText("");
        Field_Color.setText("");
        Field_Weight.setText("");
        Field_Description.setText("");

    }//GEN-LAST:event_Button_ResetMouseClicked

    private void Tab_NewCaseMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Tab_NewCaseMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_Tab_NewCaseMouseClicked

    private void Tab_NewCaseMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Tab_NewCaseMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_Tab_NewCaseMouseEntered

    private void Tab_NewCaseMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Tab_NewCaseMouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_Tab_NewCaseMouseExited

    private void Tab_AddBaggageMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Tab_AddBaggageMouseEntered
        Tab_AddBaggage.setBackground(new java.awt.Color(255, 255, 255));
        Tab_AddBaggage.setForeground(new java.awt.Color(153, 0, 0));
    }//GEN-LAST:event_Tab_AddBaggageMouseEntered

    private void Tab_AddBaggageMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Tab_AddBaggageMouseExited
        Tab_AddBaggage.setBackground(new java.awt.Color(153, 0, 0));
        Tab_AddBaggage.setForeground(new java.awt.Color(255, 255, 255));
    }//GEN-LAST:event_Tab_AddBaggageMouseExited

    private void Tab_LogOutMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Tab_LogOutMouseClicked
        FYS.getInstance().showPage(new SerDesEmp_LogOut());
        Tab_LogOut.setForeground(new java.awt.Color(153, 0, 0));
        Tab_LogOut.setBackground(new java.awt.Color(255, 255, 255));
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

    private void Field_EmailAddressActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Field_EmailAddressActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Field_EmailAddressActionPerformed

    private void Field_ShippingCityActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Field_ShippingCityActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Field_ShippingCityActionPerformed

    private void Tab_UpdateCaseMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Tab_UpdateCaseMouseClicked
        FYS.getInstance().showPage(new SerDesEmp_UpdateCase());
        Tab_UpdateCase.setBackground(new java.awt.Color(255, 255, 255));
        Tab_UpdateCase.setForeground(new java.awt.Color(153, 0, 0));
    }//GEN-LAST:event_Tab_UpdateCaseMouseClicked

    private void Tab_AddBaggageMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Tab_AddBaggageMouseClicked
        FYS.getInstance().showPage(new SerDesEmp_AddBagage());
        Tab_AddBaggage.setForeground(new java.awt.Color(153, 0, 0));
        Tab_AddBaggage.setBackground(new java.awt.Color(255, 255, 255));
    }//GEN-LAST:event_Tab_AddBaggageMouseClicked

    private void Label_ManualExitMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Label_ManualExitMouseClicked
        Panel_Manual.setVisible(false);
        Panel_Manual.setEnabled(false);
    }//GEN-LAST:event_Label_ManualExitMouseClicked

    private void Label_CallManualMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Label_CallManualMouseClicked
        Panel_Manual.setVisible(true);
        Panel_Manual.setEnabled(true);
    }//GEN-LAST:event_Label_CallManualMouseClicked

    private void Button_PDFMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Button_PDFMouseClicked

        //alles uit het updatecase screen 
        int date = 0;
        String firstname = "x";
        String lastname = "x";
        String country = "x";
        String city = "x";
        String zipcode = "x";
        String address = "x";
        String phonenumber = "x";
        String emailaddress = "x";
        String shippingcountry = "x";
        String shippingzipcode = "x";
        String shippingaddress = "x";
        String shippingcity = "x";
        String flightnumber = "x";
        String brand = "x";
        String color = "x";
        int weight = 0;
        String description = "x";

        //description  generate and save pdf
        PDFGenerator pdf = new PDFGenerator();
        pdf.generate(date, firstname, lastname, country, city, zipcode, address, phonenumber, emailaddress, shippingcountry, shippingzipcode, shippingaddress, shippingcity, flightnumber, brand, color, weight, description);

        //  moet aangepast worden zodra doreen klaar heeft wat er in gevuld moet worden
        pdf.save("CaseNR + Firstname + Date.pdf");

     }//GEN-LAST:event_Button_PDFMouseClicked

    private void Button_PDFMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Button_PDFMouseEntered
        Button_Save.setBackground(new java.awt.Color(51, 136, 68));
    }//GEN-LAST:event_Button_PDFMouseEntered

    private void Button_PDFMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Button_PDFMouseExited
        Button_Reset.setBackground(new java.awt.Color(34, 153, 68));
    }//GEN-LAST:event_Button_PDFMouseExited


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Background;
    private javax.swing.JLabel Button_PDF;
    private javax.swing.JLabel Button_Reset;
    private javax.swing.JLabel Button_Save;
    private javax.swing.JCheckBox Checkbox_CopyAddressInfo;
    private javax.swing.JTextField Field_Address;
    private javax.swing.JTextField Field_Brand;
    private javax.swing.JTextField Field_City;
    private javax.swing.JTextField Field_Color;
    private javax.swing.JTextField Field_Country;
    private javax.swing.JTextField Field_Date;
    private javax.swing.JTextField Field_Description;
    private javax.swing.JTextField Field_EmailAddress;
    private javax.swing.JTextField Field_FirstName;
    private javax.swing.JTextField Field_FlightNumber;
    private javax.swing.JTextField Field_LastName;
    private javax.swing.JTextField Field_PhoneNumber;
    private javax.swing.JTextField Field_ShippingAddress;
    private javax.swing.JTextField Field_ShippingCity;
    private javax.swing.JTextField Field_ShippingCountry;
    private javax.swing.JTextField Field_ShippingZipCode;
    private javax.swing.JTextField Field_Weight;
    private javax.swing.JTextField Field_ZipCode;
    private javax.swing.JLabel Label_Address;
    private javax.swing.JLabel Label_BaggageInformation;
    private javax.swing.JLabel Label_Brand;
    private javax.swing.JLabel Label_CallManual;
    private javax.swing.JLabel Label_City;
    private javax.swing.JLabel Label_ClientInformation;
    private javax.swing.JLabel Label_Color;
    private javax.swing.JLabel Label_Country;
    private javax.swing.JLabel Label_Date;
    private javax.swing.JLabel Label_Description;
    private javax.swing.JLabel Label_EmailAddress;
    private javax.swing.JLabel Label_FirstName;
    private javax.swing.JLabel Label_FlightNumber;
    private javax.swing.JLabel Label_Info;
    private javax.swing.JLabel Label_LastName;
    private javax.swing.JLabel Label_ManualExit;
    private javax.swing.JLabel Label_PhoneNumber;
    private javax.swing.JLabel Label_ShippingAddress;
    private javax.swing.JLabel Label_ShippingCity;
    private javax.swing.JLabel Label_ShippingCountry;
    private javax.swing.JLabel Label_ShippingZipCode;
    private javax.swing.JLabel Label_Title;
    private javax.swing.JLabel Label_Weight;
    private javax.swing.JLabel Label_ZipCode;
    private javax.swing.JPanel Panel_Manual;
    private javax.swing.JLabel Tab_AddBaggage;
    private javax.swing.JLabel Tab_LogOut;
    private javax.swing.JLabel Tab_NewCase;
    private javax.swing.JLabel Tab_UpdateCase;
    private javax.swing.JLabel employee_id;
    // End of variables declaration//GEN-END:variables
}
