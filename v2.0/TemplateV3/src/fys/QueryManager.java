package fys;

import java.awt.HeadlessException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import net.proteanit.sql.DbUtils;

public class QueryManager {

    Connection conn = javaconnect.ConnecrDb();
    PreparedStatement pst;
    ResultSet rs;

    // -------------------------------- LOG QUERIES --------------------------------------
    
    /**
     * Returns logs from the database based on the chosen search terms.
     * @param searchTerm
     * @param toDate
     * @param searchType
     * @return rs to be processed by the updateTable method
     */
    public ResultSet getLogData(String searchTerm, String toDate, String searchType) {
  
        String getLog = "";

        switch (searchType) {
            case "username":
                getLog = "SELECT * FROM log WHERE username = ? ORDER BY date DESC LIMIT 1000";
                break;
            case "date":
                getLog = "SELECT * FROM log WHERE date BETWEEN ? AND ? ORDER BY date DESC LIMIT 1000";
                break;
        }

        try {
            switch (searchType) {
                case "username":
                    pst = conn.prepareStatement(getLog);
                    pst.setString(1, searchTerm);
                    break;
                case "date":
                    pst = conn.prepareStatement(getLog);
                    pst.setString(1, searchTerm);
                    pst.setString(2, toDate);
                    break;
            }

            rs = pst.executeQuery();

        } catch (SQLException ex) {
            Logger.getLogger(QueryManager.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, "An error occured retrieving user log data from the database.", "Database Error", JOptionPane.INFORMATION_MESSAGE);
        }

        return rs;
    }

    /**
     * Returns the most recent 1000 logs from the database.
     * @return rs to be processed by the updateTable method
     */
    public ResultSet getAllLogs() {
        try {

            String getAllLogs = "SELECT * FROM log ORDER BY date DESC LIMIT 1000";

            pst = conn.prepareStatement(getAllLogs);
            rs = pst.executeQuery();

        } catch (SQLException ex) {
            Logger.getLogger(QueryManager.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, "An error occured retrieving user log data from the database.", "Database Error", JOptionPane.INFORMATION_MESSAGE);
        }

        return rs;
    }

    /**
     * Creates a log in the database based on the passed arguments.
     * @param username
     * @param page
     * @param action 
     */
    public void createLog(String username, String page, String action) {
        String createLog = "INSERT INTO log (username, page, action) VALUES (?, ?, ?)";

        try {

            pst = conn.prepareStatement(createLog);
            pst.setString(1, username);
            pst.setString(2, page);
            pst.setString(3, action);

            pst.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(QueryManager.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, "An error occured logging this action.", "Logging Error", JOptionPane.INFORMATION_MESSAGE);
        }
    }

    // ------------------------------ APPLICATION MANAGER QUERIES -------------------------
    public void updateAccountTable(JTable table) {
        try {
            String sql = "select * from employee";
            pst = conn.prepareStatement(sql);
            rs = pst.executeQuery();
            table.setModel(DbUtils.resultSetToTableModel(rs));
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }

    public ResultSet searchAccounts(String searchTerm) {
        try {
            String sql = "select * from employee where employeeID=? OR firstName=? OR lastName=? OR username=? ";

            pst = conn.prepareStatement(sql);
            pst.setString(1, searchTerm);
            pst.setString(2, searchTerm);
            pst.setString(3, searchTerm);
            pst.setString(4, searchTerm);

            rs = pst.executeQuery();

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
        return rs;
    }

    public ResultSet getFromTable(String tableClick) {
        try {
            String sql = "select * from employee where employeeID= ?";
            pst = conn.prepareStatement(sql);
            pst.setString(1, tableClick);
            rs = pst.executeQuery();
        } catch (SQLException ex) {
            Logger.getLogger(QueryManager.class.getName()).log(Level.SEVERE, null, ex);
        }
        return rs;
    }

    public void deleteAccount(String employeeID) {
        String sql = "delete from employee where employeeID=?";
        try {

            pst = conn.prepareStatement(sql);
            pst.setString(1, employeeID);
            pst.execute();
            JOptionPane.showMessageDialog(null, "Deleted");

        } catch (SQLException | HeadlessException e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }

    public void updateAccount(String employeeID, String firstName, String lastName, String username, String password, String emailAddress, String phoneNumber, String function) {
        String sql = "UPDATE employee SET (firstName, lastName, username, password, emailAddress, phoneNumber, function) VALUES (?, ?, ?, ?, ?, ?, ?, ?) WHERE employeeID = ?";
        try {
            pst = conn.prepareStatement(sql);
            pst.setString(1, firstName);
            pst.setString(2, lastName);
            pst.setString(3, username);
            pst.setString(4, password);
            pst.setString(5, emailAddress);
            pst.setString(6, phoneNumber);
            pst.setString(7, function);
            pst.setString(8, employeeID);

            pst.execute();
            JOptionPane.showMessageDialog(null, "Updated");
        } catch (SQLException ex) {
            Logger.getLogger(QueryManager.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void createAccount(String firstName, String lastName, String username, String password, String emailAddress, String phoneNumber, String function) {
        String sql = "INSERT INTO employee (firstName, lastName, username, password, emailAddress, phoneNumber, function) VALUES (?, ?, ?, ?, ?, ?, ?)";

        try {
            pst = conn.prepareStatement(sql);
            pst.setString(1, firstName);
            pst.setString(2, lastName);
            pst.setString(3, username);
            pst.setString(4, password);
            pst.setString(5, emailAddress);
            pst.setString(6, phoneNumber);
            pst.setString(7, function);

            pst.executeUpdate();
            JOptionPane.showMessageDialog(null, "Saved");
        } catch (SQLException ex) {
            Logger.getLogger(QueryManager.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

// ------------------------------ SERVICE DESK EMPLOYEE QUERIES -------------------------
    public void updateClientTable(JTable jTable) {
        try {
            String sql = "select clientID, firstName, lastName from client";
            pst = conn.prepareStatement(sql);
            rs = pst.executeQuery();
            jTable.setModel(DbUtils.resultSetToTableModel(rs));
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }

    public void createCase(String flightNumber, String firstName, String lastName, String emailAddress, String phoneNumber, String zipCode, String address, String city, String country, String shippingCountry,
            String shippingZipCode, String shippingAddress, String shippingCity, String location, String brand, String color, String weight, String description, String startDate) {
        try {

            String sql = "insert into client (flightNumber, firstName,lastName,emailAddress,phoneNumber,zipCode,address,city,country,shippingCountry,shippingZipCode,shippingAddress,shippingCity) value(?,?,?,?,?,?,?,?,?,?,?,?,?) ";
            pst = conn.prepareStatement(sql);

            pst.setString(1, flightNumber);
            pst.setString(2, firstName);
            pst.setString(3, lastName);
            pst.setString(4, emailAddress);
            pst.setString(5, phoneNumber);
            pst.setString(6, zipCode);
            pst.setString(7, address);
            pst.setString(8, city);
            pst.setString(9, country);
            pst.setString(10, shippingCountry);
            pst.setString(11, shippingZipCode);
            pst.setString(12, shippingAddress);
            pst.setString(13, shippingCity);

            pst.execute();
            
            //Moet client-/baggageID in de log? Lijkt me wel, maar is moeilijk
            Employee currentEmployee = new Employee(Employee.getCurrentUser());
            String fullName = firstName + " " + lastName;
            createLog("" + currentEmployee.employeeID, "SerDesEmp_NewCase", "Created new case for "
                    + firstName + " " + lastName + " at " + currentEmployee.location);

            String sql2 = "SELECT clientID FROM client where name = '" + firstName + "' AND lastname = '" + lastName + "'";
            pst = conn.prepareStatement(sql2);
            rs = pst.executeQuery();

            if (rs.next()) {
                String clientID = rs.getString("clientID");

                String addBaggage = "insert into baggage (location, brand, color, weight, description, status, startDate, clientID)value(?,?,?,?,?,?,?,?)";
                pst = conn.prepareStatement(addBaggage);

                pst.setString(1, location);
                pst.setString(2, brand);
                pst.setString(3, color);
                pst.setString(4, weight);
                pst.setString(5, description);
                pst.setString(6, "unresolved");
                pst.setString(7, startDate);
                pst.setString(8, clientID);

                pst.execute();

                JOptionPane.showMessageDialog(null, "Saved");

            }

        } catch (SQLException | HeadlessException e) {

            JOptionPane.showMessageDialog(null, e);
        }

    }

    public void createClientCase(String flightNumber, String firstName, String lastName, String emailAddress, String phoneNumber, String zipCode, String address, String city, String country, String shippingCountry,
            String shippingZipCode, String shippingAddress, String shippingCity) {

        try {
            String sql = "insert into client (flightNumber, firstName,lastName,emailAddress,phoneNumber,zipCode,address,city,country,shippingCountry,shippingZipCode,shippingAddress,shippingCity) value(?,?,?,?,?,?,?,?,?,?,?,?,?)";
            pst = conn.prepareStatement(sql);

            pst.setString(1, flightNumber);
            pst.setString(2, firstName);
            pst.setString(3, lastName);
            pst.setString(4, emailAddress);
            pst.setString(5, phoneNumber);
            pst.setString(6, zipCode);
            pst.setString(7, address);
            pst.setString(8, city);
            pst.setString(9, country);
            pst.setString(10, shippingCountry);
            pst.setString(11, shippingZipCode);
            pst.setString(12, shippingAddress);
            pst.setString(13, shippingCity);

            pst.execute();
            
            //Moet client-/baggageID in de log? Lijkt me wel, maar is moeilijk
            Employee currentEmployee = new Employee(Employee.getCurrentUser());
            createLog("" + currentEmployee.employeeID, "SerDesEmp_NewCase", "Created new case for "
                    + firstName + " " + lastName + " at " + currentEmployee.location);
            
            JOptionPane.showMessageDialog(null, "Saved");

        } catch (SQLException | HeadlessException e) {

            JOptionPane.showMessageDialog(null, e);
        }

    }

    public void createBaggageCase(String location, String brand, String color, String weight, String description, String startDate) {
        try {

            String sql = "insert into baggage (location, brand, color, weight, description, status, startDate)value(?,?,?,?,?,?,?)";
            pst = conn.prepareStatement(sql);

            pst.setString(1, location);
            pst.setString(2, brand);
            pst.setString(3, color);
            pst.setString(4, weight);
            pst.setString(5, description);
            pst.setString(6, "unresolved");
            pst.setString(7, startDate);

            pst.execute();

            JOptionPane.showMessageDialog(null, "Saved");

        } catch (SQLException | HeadlessException e) {

            JOptionPane.showMessageDialog(null, e);
        }
    }

    public void updateCase(String flightNumber, String firstName, String lastName, String emailAddress, String phoneNumber, String zipCode, String address, String city, String country, String shippingZipCode,
            String shippingAddress, String shippingCity, String shippingCountry, String location, String brand, String color, String weight, String description, String entryDate, String retrievalDate, String status) {
        try {

            String value1 = flightNumber;
            String value2 = firstName;
            String value3 = lastName;
            String value4 = emailAddress;
            String value5 = phoneNumber;
            String value6 = zipCode;
            String value7 = address;
            String value8 = city;
            String value9 = country;
            String value10 = shippingZipCode;
            String value11 = shippingAddress;
            String value12 = shippingCity;
            String value13 = shippingCountry;
            String value14 = location;
            String value15 = brand;
            String value16 = color;
            String value17 = weight;
            String value18 = description;
            String value19 = entryDate;
            String value20 = retrievalDate;
            String value21 = status;

            String sql = "update client set flightNumber =  '" + value1 + "', name = '" + value2 + "',lastname = '" + value3 + "',email = '" + value4 + "',phonenumber = '" + value5 + "',zipcode = '" + value6
                    + "' ,address = '" + value7 + "',city = '" + value8 + "' ,country = '" + value9 + "',shippingzipcode = '" + value10 + "',shippingaddress = '" + value11 + "',shippingcity = '" + value12
                    + "',shippingcountry = '" + value13 + "'where clientID='" + value1 + "' ";// vrage Floris hoe ik clientID krijg
            pst = conn.prepareStatement(sql);
            pst.execute();

            String sql2 = "UPDATE baggage SET location = '" + value14 + "',brand = '" + value15 + "',color = '" + value16 + "',weight = '" + value17 + "',description = '" + value18 + "',dateadded = '" + value19
                    + "',dateretrieved = '" + value20 + "',status = '" + value21 + "' WHERE baggageID = '" + 1 + "'";// vrage Floris hoe ik baggageID krijg
            pst = conn.prepareStatement(sql2);
            pst.execute();
            JOptionPane.showMessageDialog(null, "Updated");

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }

    public void updateClientCase(String flightNumber, String firstName, String lastName, String emailAddress, String phoneNumber, String zipCode, String address, String city, String country, String shippingZipCode,
            String shippingAddress, String shippingCity, String shippingCountry) {
        try {

            String value1 = flightNumber;
            String value2 = firstName;
            String value3 = lastName;
            String value4 = emailAddress;
            String value5 = phoneNumber;
            String value6 = zipCode;
            String value7 = address;
            String value8 = city;
            String value9 = country;
            String value10 = shippingZipCode;
            String value11 = shippingAddress;
            String value12 = shippingCity;
            String value13 = shippingCountry;

            String sql = "update client set flightNumber =  '" + value1 + "', name = '" + value2 + "',lastname = '" + value3 + "',email = '" + value4 + "',phonenumber = '" + value5 + "',zipcode = '" + value6 + "' ,address = '" + value7
                    + "',city = '" + value8 + "' ,country = '" + value9 + "',shippingzipcode = '" + value10 + "',shippingaddress = '" + value11 + "',shippingcity = '" + value12 + "',shippingcountry = '" + value13
                    + "'where ClientID='" + value1 + "' ";
//Floris vragen naar ClientID
//Floris: Ik denk dat we dan toch een Client.java moeten maken? OVERLEGGEN
            pst = conn.prepareStatement(sql);
            pst.execute();
            JOptionPane.showMessageDialog(null, "Updated");

        } catch (Exception e) {

            JOptionPane.showMessageDialog(null, e);
        }
    }

    public void updateBaggageCase(String location, String brand, String color, String weight, String description, String entryDate, String retrievalDate, String status) {
        try {

            String value1 = location;
            String value2 = brand;
            String value3 = color;
            String value4 = weight;
            String value5 = description;
            String value6 = entryDate;
            String value7 = retrievalDate;
            String value8 = status;

            String sql = "update baggage set location = '" + value1 + "',brand = '" + value2 + "',color = '" + value3 + "',weight = '" + value4 + "',description = '" + value5 + "',dateadded = '" + value6 + "',dateretrieved = '" + value7 
                    + "',status = '" + value8 + "' where baggageID='" + value1 + "' ";
//Floris vragen voor baggage ID
            pst = conn.prepareStatement(sql);
            pst.execute();
            JOptionPane.showMessageDialog(null, "Updated");

        } catch (Exception e) {

            JOptionPane.showMessageDialog(null, e);
        }
    }
}
