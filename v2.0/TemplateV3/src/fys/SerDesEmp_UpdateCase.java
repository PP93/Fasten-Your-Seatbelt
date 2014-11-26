package fys;

import javax.swing.ImageIcon;

public class SerDesEmp_UpdateCase extends javax.swing.JPanel {

    public SerDesEmp_UpdateCase() {
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

        logo = new javax.swing.JLabel();
        addbagage_button = new javax.swing.JLabel();
        reset_button = new javax.swing.JLabel();
        save_button = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        LogOut_button = new javax.swing.JLabel();
        newcase_button = new javax.swing.JLabel();
        updatecase_button = new javax.swing.JLabel();
        email_label = new javax.swing.JLabel();
        email_field = new javax.swing.JTextField();
        phone_field = new javax.swing.JTextField();
        phone_label = new javax.swing.JLabel();
        adress_label = new javax.swing.JLabel();
        adress_field = new javax.swing.JTextField();
        zipcode_field = new javax.swing.JTextField();
        zipcode_label = new javax.swing.JLabel();
        city_label = new javax.swing.JLabel();
        city_field = new javax.swing.JTextField();
        country_field = new javax.swing.JTextField();
        country_label = new javax.swing.JLabel();
        lname_label = new javax.swing.JLabel();
        lname_field = new javax.swing.JTextField();
        fname_field = new javax.swing.JTextField();
        fname_label = new javax.swing.JLabel();
        Date_label = new javax.swing.JLabel();
        Date_field = new javax.swing.JTextField();
        clientinformation = new javax.swing.JLabel();
        shippingCheckBox = new javax.swing.JCheckBox();
        shippingcountry_label = new javax.swing.JLabel();
        shippinzip_label = new javax.swing.JLabel();
        shippingadress_label = new javax.swing.JLabel();
        shippingcity_label = new javax.swing.JLabel();
        shipcity_field = new javax.swing.JTextField();
        shipaddress_field = new javax.swing.JTextField();
        shipzipcode_field = new javax.swing.JTextField();
        shipcountry_field = new javax.swing.JTextField();
        description_label = new javax.swing.JLabel();
        weight_label = new javax.swing.JLabel();
        color_label = new javax.swing.JLabel();
        brand_label = new javax.swing.JLabel();
        flightnmr_label = new javax.swing.JLabel();
        bagageinfo = new javax.swing.JLabel();
        description_field = new javax.swing.JTextField();
        weight_field = new javax.swing.JTextField();
        color_field = new javax.swing.JTextField();
        brand_field = new javax.swing.JTextField();
        flightnmr_field = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        update_table = new javax.swing.JTable();
        field_Search = new javax.swing.JTextField();
        search_label = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox();
        Background = new javax.swing.JLabel();

        setMaximumSize(new java.awt.Dimension(1280, 720));
        setMinimumSize(new java.awt.Dimension(1280, 720));
        setName(""); // NOI18N
        setPreferredSize(new java.awt.Dimension(1280, 720));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        logo.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        add(logo, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 290, 70));

        addbagage_button.setBackground(new java.awt.Color(156, 10, 13));
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

        reset_button.setBackground(new java.awt.Color(34, 153, 68));
        reset_button.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        reset_button.setForeground(new java.awt.Color(255, 255, 255));
        reset_button.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        reset_button.setText("Reset");
        reset_button.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        reset_button.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        reset_button.setOpaque(true);
        reset_button.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                reset_buttonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                reset_buttonMouseExited(evt);
            }
        });
        add(reset_button, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 600, 130, -1));

        save_button.setBackground(new java.awt.Color(34, 153, 68));
        save_button.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        save_button.setForeground(new java.awt.Color(255, 255, 255));
        save_button.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        save_button.setText("Save");
        save_button.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        save_button.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        save_button.setOpaque(true);
        save_button.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                save_buttonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                save_buttonMouseExited(evt);
            }
        });
        add(save_button, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 600, 130, -1));
        add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 640, 1280, 20));

        LogOut_button.setBackground(new java.awt.Color(156, 10, 13));
        LogOut_button.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        LogOut_button.setForeground(new java.awt.Color(255, 255, 255));
        LogOut_button.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        LogOut_button.setText("Log Out");
        LogOut_button.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        LogOut_button.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        LogOut_button.setOpaque(true);
        LogOut_button.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                LogOut_buttonMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                LogOut_buttonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                LogOut_buttonMouseExited(evt);
            }
        });
        add(LogOut_button, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 110, 250, 40));

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

        updatecase_button.setBackground(new java.awt.Color(255, 255, 255));
        updatecase_button.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        updatecase_button.setForeground(new java.awt.Color(156, 0, 0));
        updatecase_button.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        updatecase_button.setText("Update Case");
        updatecase_button.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        updatecase_button.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        updatecase_button.setOpaque(true);
        updatecase_button.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                updatecase_buttonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                updatecase_buttonMouseExited(evt);
            }
        });
        add(updatecase_button, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 110, 250, 40));

        email_label.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        email_label.setForeground(new java.awt.Color(153, 0, 0));
        email_label.setText("E-mail address:");
        add(email_label, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 530, -1, -1));

        email_field.setForeground(new java.awt.Color(153, 0, 0));
        email_field.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        email_field.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                email_fieldActionPerformed(evt);
            }
        });
        add(email_field, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 530, 230, 30));

        phone_field.setForeground(new java.awt.Color(153, 0, 0));
        phone_field.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        add(phone_field, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 490, 230, 30));

        phone_label.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        phone_label.setForeground(new java.awt.Color(153, 0, 0));
        phone_label.setText("phone number:");
        add(phone_label, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 490, -1, -1));

        adress_label.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        adress_label.setForeground(new java.awt.Color(153, 0, 0));
        adress_label.setText("Address:");
        add(adress_label, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 450, -1, -1));

        adress_field.setForeground(new java.awt.Color(153, 0, 0));
        adress_field.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        add(adress_field, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 450, 230, 30));

        zipcode_field.setForeground(new java.awt.Color(153, 0, 0));
        zipcode_field.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        add(zipcode_field, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 410, 230, 30));

        zipcode_label.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        zipcode_label.setForeground(new java.awt.Color(153, 0, 0));
        zipcode_label.setText("Zip Code:");
        add(zipcode_label, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 410, -1, -1));

        city_label.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        city_label.setForeground(new java.awt.Color(153, 0, 0));
        city_label.setText("City:");
        add(city_label, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 370, -1, -1));

        city_field.setForeground(new java.awt.Color(153, 0, 0));
        city_field.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        add(city_field, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 370, 230, 30));

        country_field.setForeground(new java.awt.Color(153, 0, 0));
        country_field.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        add(country_field, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 330, 230, 30));

        country_label.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        country_label.setForeground(new java.awt.Color(153, 0, 0));
        country_label.setText("Country:");
        add(country_label, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 330, -1, -1));

        lname_label.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lname_label.setForeground(new java.awt.Color(153, 0, 0));
        lname_label.setText("Last name:");
        add(lname_label, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 290, -1, -1));

        lname_field.setForeground(new java.awt.Color(153, 0, 0));
        lname_field.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        add(lname_field, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 290, 230, 30));

        fname_field.setForeground(new java.awt.Color(153, 0, 0));
        fname_field.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        add(fname_field, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 250, 230, 30));

        fname_label.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        fname_label.setForeground(new java.awt.Color(153, 0, 0));
        fname_label.setText("First name:");
        add(fname_label, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 250, -1, -1));

        Date_label.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        Date_label.setForeground(new java.awt.Color(153, 0, 0));
        Date_label.setText("Date:");
        add(Date_label, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 210, -1, -1));

        Date_field.setForeground(new java.awt.Color(153, 0, 0));
        Date_field.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        add(Date_field, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 210, 230, 30));

        clientinformation.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        clientinformation.setForeground(new java.awt.Color(153, 0, 0));
        clientinformation.setText("Client Information:");
        add(clientinformation, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 180, -1, -1));

        shippingCheckBox.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        shippingCheckBox.setForeground(new java.awt.Color(153, 0, 0));
        shippingCheckBox.setText("Shipping adress same as living adress");
        shippingCheckBox.setOpaque(false);
        shippingCheckBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                shippingCheckBoxActionPerformed(evt);
            }
        });
        add(shippingCheckBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 170, 330, 40));

        shippingcountry_label.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        shippingcountry_label.setForeground(new java.awt.Color(153, 0, 0));
        shippingcountry_label.setText("Shipping country:");
        add(shippingcountry_label, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 210, -1, -1));

        shippinzip_label.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        shippinzip_label.setForeground(new java.awt.Color(153, 0, 0));
        shippinzip_label.setText("Shipping Zip Code:");
        add(shippinzip_label, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 250, -1, -1));

        shippingadress_label.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        shippingadress_label.setForeground(new java.awt.Color(153, 0, 0));
        shippingadress_label.setText("Shipping Address:");
        add(shippingadress_label, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 290, -1, -1));

        shippingcity_label.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        shippingcity_label.setForeground(new java.awt.Color(153, 0, 0));
        shippingcity_label.setText("Shipping City:");
        add(shippingcity_label, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 330, -1, -1));

        shipcity_field.setForeground(new java.awt.Color(153, 0, 0));
        shipcity_field.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        shipcity_field.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                shipcity_fieldActionPerformed(evt);
            }
        });
        add(shipcity_field, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 330, 230, 30));

        shipaddress_field.setForeground(new java.awt.Color(153, 0, 0));
        shipaddress_field.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        add(shipaddress_field, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 290, 230, 30));

        shipzipcode_field.setForeground(new java.awt.Color(153, 0, 0));
        shipzipcode_field.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        add(shipzipcode_field, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 250, 230, 30));

        shipcountry_field.setForeground(new java.awt.Color(153, 0, 0));
        shipcountry_field.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        add(shipcountry_field, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 210, 230, 30));

        description_label.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        description_label.setForeground(new java.awt.Color(153, 0, 0));
        description_label.setText("Description:");
        add(description_label, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 550, -1, -1));

        weight_label.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        weight_label.setForeground(new java.awt.Color(153, 0, 0));
        weight_label.setText("Weight:");
        add(weight_label, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 510, -1, -1));

        color_label.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        color_label.setForeground(new java.awt.Color(153, 0, 0));
        color_label.setText("Color:");
        add(color_label, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 470, -1, -1));

        brand_label.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        brand_label.setForeground(new java.awt.Color(153, 0, 0));
        brand_label.setText("Brand:");
        add(brand_label, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 430, -1, -1));

        flightnmr_label.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        flightnmr_label.setForeground(new java.awt.Color(153, 0, 0));
        flightnmr_label.setText("Flight number:");
        add(flightnmr_label, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 390, -1, -1));

        bagageinfo.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        bagageinfo.setForeground(new java.awt.Color(153, 0, 0));
        bagageinfo.setText("Bagage Information:");
        add(bagageinfo, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 360, -1, -1));

        description_field.setForeground(new java.awt.Color(153, 0, 0));
        description_field.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        add(description_field, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 550, 230, 30));

        weight_field.setForeground(new java.awt.Color(153, 0, 0));
        weight_field.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        add(weight_field, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 510, 230, 30));

        color_field.setForeground(new java.awt.Color(153, 0, 0));
        color_field.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        add(color_field, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 470, 230, 30));

        brand_field.setForeground(new java.awt.Color(153, 0, 0));
        brand_field.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        add(brand_field, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 430, 230, 30));

        flightnmr_field.setForeground(new java.awt.Color(153, 0, 0));
        flightnmr_field.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        add(flightnmr_field, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 390, 230, 30));

        update_table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane2.setViewportView(update_table);

        add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 210, -1, 380));

        field_Search.setForeground(new java.awt.Color(153, 0, 0));
        field_Search.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        field_Search.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                field_SearchKeyReleased(evt);
            }
        });
        add(field_Search, new org.netbeans.lib.awtextra.AbsoluteConstraints(890, 170, 210, 30));

        search_label.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        search_label.setForeground(new java.awt.Color(153, 0, 0));
        search_label.setText("Search:");
        add(search_label, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 170, -1, 30));

        jComboBox1.setForeground(new java.awt.Color(156, 10, 13));
        jComboBox1.setMaximumRowCount(2);
        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Open", "Closed" }));
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });
        add(jComboBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 210, 70, 30));

        Background.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        Background.setForeground(new java.awt.Color(153, 0, 0));
        Background.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Background.setIcon(new javax.swing.ImageIcon(getClass().getResource("/fys/Images/Background.png"))); // NOI18N
        Background.setOpaque(true);
        add(Background, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -30, 1280, 780));
    }// </editor-fold>//GEN-END:initComponents

    private void addbagage_buttonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_addbagage_buttonMouseEntered
        addbagage_button.setBackground(new java.awt.Color(255, 255, 255));
        addbagage_button.setForeground(new java.awt.Color(153, 0, 0));
    }//GEN-LAST:event_addbagage_buttonMouseEntered

    private void addbagage_buttonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_addbagage_buttonMouseExited
        addbagage_button.setBackground(new java.awt.Color(153, 0, 0));

        addbagage_button.setForeground(new java.awt.Color(255, 255, 255));

    }//GEN-LAST:event_addbagage_buttonMouseExited


    private void reset_buttonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_reset_buttonMouseEntered
        reset_button.setBackground(new java.awt.Color(51, 136, 68));
    }//GEN-LAST:event_reset_buttonMouseEntered

    private void reset_buttonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_reset_buttonMouseExited
        reset_button.setBackground(new java.awt.Color(34, 153, 68));
    }//GEN-LAST:event_reset_buttonMouseExited

    private void save_buttonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_save_buttonMouseEntered
        save_button.setBackground(new java.awt.Color(51, 136, 68));

    }//GEN-LAST:event_save_buttonMouseEntered

    private void save_buttonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_save_buttonMouseExited
        save_button.setBackground(new java.awt.Color(34, 153, 68));

    }//GEN-LAST:event_save_buttonMouseExited

    private void LogOut_buttonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LogOut_buttonMouseClicked
        FYS.getInstance().showPage(new SerDesEmp_LogOut());
    }//GEN-LAST:event_LogOut_buttonMouseClicked

    private void LogOut_buttonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LogOut_buttonMouseEntered
        LogOut_button.setBackground(new java.awt.Color(255, 255, 255));
            LogOut_button.setForeground(new java.awt.Color(153, 10, 13));
    }//GEN-LAST:event_LogOut_buttonMouseEntered

    private void LogOut_buttonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LogOut_buttonMouseExited
        LogOut_button.setBackground(new java.awt.Color(153, 10, 13));
        LogOut_button.setForeground(new java.awt.Color(255, 255, 255));
    }//GEN-LAST:event_LogOut_buttonMouseExited

    private void newcase_buttonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_newcase_buttonMouseClicked
       FYS.getInstance().showPage(new SerDesEmp_NewCase());
    }//GEN-LAST:event_newcase_buttonMouseClicked

    private void newcase_buttonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_newcase_buttonMouseEntered
   newcase_button.setBackground(new java.awt.Color(255, 255, 255));
            newcase_button.setForeground(new java.awt.Color(153, 10, 13));
    }//GEN-LAST:event_newcase_buttonMouseEntered

    private void newcase_buttonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_newcase_buttonMouseExited
        newcase_button.setBackground(new java.awt.Color(153, 10, 13));
        newcase_button.setForeground(new java.awt.Color(255, 255, 255));
    }//GEN-LAST:event_newcase_buttonMouseExited

    private void updatecase_buttonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_updatecase_buttonMouseEntered
       updatecase_button.setBackground(new java.awt.Color(255, 255, 255));
            updatecase_button.setForeground(new java.awt.Color(153, 10, 13));
    }//GEN-LAST:event_updatecase_buttonMouseEntered

    private void updatecase_buttonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_updatecase_buttonMouseExited
 updatecase_button.setBackground(new java.awt.Color(153, 10, 13));
        updatecase_button.setForeground(new java.awt.Color(255, 255, 255));
    }//GEN-LAST:event_updatecase_buttonMouseExited

    private void email_fieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_email_fieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_email_fieldActionPerformed

    private void shippingCheckBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_shippingCheckBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_shippingCheckBoxActionPerformed

    private void shipcity_fieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_shipcity_fieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_shipcity_fieldActionPerformed

    private void field_SearchKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_field_SearchKeyReleased
        try{
            String sql ="select * from employee where employeeID=?";

            pst=conn.prepareStatement(sql);
            pst.setString(1, field_Search.getText());

            rs=pst.executeQuery();
            if(rs.next()){
                String add1=rs.getString("employeeID");
                Field_employeeID.setText(add1);
                String add2=rs.getString("name");
                Field_FirstName.setText(add2);
                String add3=rs.getString("lastname");
                Field_LastName.setText(add3);
                String add4=rs.getString("username");
                Field_Username.setText(add4);
                String add5=rs.getString("password");
                Field_Password.setText(add5);
                String add6=rs.getString("email");
                Field_Email.setText(add6);
                String add7=rs.getString("phonenumber");
                Field_PhoneNumber.setText(add7);
            }
        }
        catch(Exception e){

            JOptionPane.showMessageDialog(null, e);
        }

    }//GEN-LAST:event_field_SearchKeyReleased

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox1ActionPerformed

    private void addbagage_buttonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_addbagage_buttonMouseClicked
     FYS.getInstance().showPage(new SerDesEmp_AddBagage());
    }//GEN-LAST:event_addbagage_buttonMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Background;
    private javax.swing.JTextField Date_field;
    private javax.swing.JLabel Date_label;
    private javax.swing.JLabel LogOut_button;
    private javax.swing.JLabel addbagage_button;
    private javax.swing.JTextField adress_field;
    private javax.swing.JLabel adress_label;
    private javax.swing.JLabel bagageinfo;
    private javax.swing.JTextField brand_field;
    private javax.swing.JLabel brand_label;
    private javax.swing.JTextField city_field;
    private javax.swing.JLabel city_label;
    private javax.swing.JLabel clientinformation;
    private javax.swing.JTextField color_field;
    private javax.swing.JLabel color_label;
    private javax.swing.JTextField country_field;
    private javax.swing.JLabel country_label;
    private javax.swing.JTextField description_field;
    private javax.swing.JLabel description_label;
    private javax.swing.JTextField email_field;
    private javax.swing.JLabel email_label;
    private javax.swing.JTextField field_Search;
    private javax.swing.JTextField flightnmr_field;
    private javax.swing.JLabel flightnmr_label;
    private javax.swing.JTextField fname_field;
    private javax.swing.JLabel fname_label;
    private javax.swing.JComboBox jComboBox1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTextField lname_field;
    private javax.swing.JLabel lname_label;
    private javax.swing.JLabel logo;
    private javax.swing.JLabel newcase_button;
    private javax.swing.JTextField phone_field;
    private javax.swing.JLabel phone_label;
    private javax.swing.JLabel reset_button;
    private javax.swing.JLabel save_button;
    private javax.swing.JLabel search_label;
    private javax.swing.JTextField shipaddress_field;
    private javax.swing.JTextField shipcity_field;
    private javax.swing.JTextField shipcountry_field;
    private javax.swing.JCheckBox shippingCheckBox;
    private javax.swing.JLabel shippingadress_label;
    private javax.swing.JLabel shippingcity_label;
    private javax.swing.JLabel shippingcountry_label;
    private javax.swing.JLabel shippinzip_label;
    private javax.swing.JTextField shipzipcode_field;
    private javax.swing.JTable update_table;
    private javax.swing.JLabel updatecase_button;
    private javax.swing.JTextField weight_field;
    private javax.swing.JLabel weight_label;
    private javax.swing.JTextField zipcode_field;
    private javax.swing.JLabel zipcode_label;
    // End of variables declaration//GEN-END:variables
}
