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

    public void logIn(String username, String password) {
        String sql = "SELECT * FROM employee WHERE username=? AND password=?";
        try {
            pst = conn.prepareStatement(sql);
            pst.setString(1, username);
            pst.setString(2, password);

            rs = pst.executeQuery();

            if (rs.next()) {
                Employee.setCurrentUser(username);
                FYS.getQueryManager().createLog(username, "Login", "Logged in.");

                String employeeFunction = rs.getString("function");

                switch (employeeFunction) {
                    case "application manager":
                        FYS.getInstance().showPage(new AppMan_Home());
                        break;
                    case "manager":
                        FYS.getInstance().showPage(new Man_Home());
                        break;
                    case "service desk employee":
                        FYS.getInstance().showPage(new SerDesEmp_Home());
                        break;
                    default:
                        break;
                }
            } else {
                JOptionPane.showMessageDialog(null, "Username and Password is not correct");
            }
        } catch (SQLException | HeadlessException e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }

    // -------------------------------- LOG QUERIES --------------------------------------
    /**
     * Returns logs from the database based on the chosen search terms.
     *
     * @param searchTerm
     * @param toDate
     * @param searchType
     * @return rs to be processed by the updateTable method
     */
    public ResultSet getLogData(String searchTerm, String toDate, String searchType) {

        String getLog = "";

        switch (searchType) {
            case "username":
                getLog = "SELECT * FROM log WHERE username = ? ORDER BY timestamp DESC LIMIT 1000";
                break;
            case "date":
                getLog = "SELECT * FROM log WHERE timestamp BETWEEN ? AND ? ORDER BY timestamp DESC LIMIT 1000";
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
     *
     * @return rs to be processed by the updateTable method
     */
    public ResultSet getAllLogs() {
        try {

            String getAllLogs = "SELECT * FROM log ORDER BY timestamp DESC LIMIT 1000";

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
     *
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

    public void updateAccount(String employeeID, String firstName, String lastName, String username, String password, String emailAddress, String phoneNumber, String function, String location) {
        String sql = "UPDATE employee SET firstName = ?, lastName = ?, username = ?, password = ?, emailAddress = ?, phoneNumber = ?, function = ?, location = ? WHERE employeeID = ?";
        try {
            pst = conn.prepareStatement(sql);
            pst.setString(1, firstName);
            pst.setString(2, lastName);
            pst.setString(3, username);
            pst.setString(4, password);
            pst.setString(5, emailAddress);
            pst.setString(6, phoneNumber);
            pst.setString(7, function);
            pst.setString(8, location);
            pst.setString(9, employeeID);

            pst.execute();
            JOptionPane.showMessageDialog(null, "The case has been updated.");
        } catch (SQLException ex) {
            Logger.getLogger(QueryManager.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, "An error occurred and the account could not be updated.");
        }
    }

    public void createAccount(String firstName, String lastName, String username, String password, String emailAddress, String phoneNumber, String function, String location) {
        String sql = "INSERT INTO employee (firstName, lastName, username, password, emailAddress, phoneNumber, function, location) VALUES (?, ?, ?, ?, ?, ?, ?, ?)";

        try {
            pst = conn.prepareStatement(sql);
            pst.setString(1, firstName);
            pst.setString(2, lastName);
            pst.setString(3, username);
            pst.setString(4, password);
            pst.setString(5, emailAddress);
            pst.setString(6, phoneNumber);
            pst.setString(7, function);
            pst.setString(8, location);

            pst.executeUpdate();
            JOptionPane.showMessageDialog(null, "The account has been saved.");
        } catch (SQLException ex) {
            Logger.getLogger(QueryManager.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, "An error occurred and the account could not be saved.");
        }
    }

// ------------------------------ SERVICE DESK EMPLOYEE QUERIES -------------------------
    public void updateClientTable(JTable jTable) {
        try {
            String sql = "SELECT clientID, firstName, lastName FROM client";
            pst = conn.prepareStatement(sql);
            rs = pst.executeQuery();
            jTable.setModel(DbUtils.resultSetToTableModel(rs));
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }

    public void updateBaggageTable(JTable jTable) {
        try {
            String sql = "SELECT baggageID, clientID, status FROM baggage";
            pst = conn.prepareStatement(sql);
            rs = pst.executeQuery();
            jTable.setModel(DbUtils.resultSetToTableModel(rs));
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }

    public ResultSet loadCase(JTable jTable) {
        try {
            int row = jTable.getSelectedRow();
            String Table_click = (jTable.getModel().getValueAt(row, 0).toString());

            String sql = "SELECT * FROM client INNER JOIN baggage ON client.clientID = "
                    + "baggage.clientID WHERE client.clientID = '" + Table_click + "'";

            pst = conn.prepareStatement(sql);
            rs = pst.executeQuery();

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }

        return rs;
    }

    public void createCase(String flightNumber, String firstName, String lastName,
            String emailAddress, String phoneNumber, String zipCode, String address, String city,
            String country, String shippingZipCode, String shippingAddress, String shippingCity,
            String shippingCountry, String location, String brand, String color, String weight,
            String description, int status) {

        try {
            //Insert client-info into the fys.client table
            String insertClient = "INSERT INTO client (flightNumber, firstName, lastName, "
                    + "emailAddress, phoneNumber, zipCode, address, city, country, "
                    + "shippingZipCode, shippingAddress, shippingCity, shippingCountry) VALUE "
                    + "(?,?,?,?,?,?,?,?,?,?,?,?,?)";
            pst = conn.prepareStatement(insertClient);

            pst.setString(1, flightNumber);
            pst.setString(2, firstName);
            pst.setString(3, lastName);
            pst.setString(4, emailAddress);
            pst.setString(5, phoneNumber);
            pst.setString(6, zipCode);
            pst.setString(7, address);
            pst.setString(8, city);
            pst.setString(9, country);
            pst.setString(10, shippingZipCode);
            pst.setString(11, shippingAddress);
            pst.setString(12, shippingCity);
            pst.setString(13, shippingCountry);

            pst.execute();

            createLog(Employee.getCurrentUser(), "SerDesEmp_NewCase", "Created new case for "
                    + firstName + " " + lastName + " at " + location);

            //Get the clientID we just generated (Can't this be easier D: ? This could go wrong!)
            String getClientID = "SELECT clientID FROM client WHERE flightNumber = '" + flightNumber
                    + "' AND firstName = '" + firstName + "' AND lastName = '" + lastName + "'";
            pst = conn.prepareStatement(getClientID);
            rs = pst.executeQuery();

            if (rs.next()) {
                //Insert baggage-info into the fys.baggage table
                String insertBaggage = "INSERT INTO baggage (location, brand, color, weight, "
                        + "description, status, startDate, clientID) VALUE "
                        + "(?,?,?,?,?,?,now(),?)";
                pst = conn.prepareStatement(insertBaggage);

                pst.setString(1, location);
                pst.setString(2, brand);
                pst.setString(3, color);
                pst.setString(4, weight);
                pst.setString(5, description);
                pst.setString(6, "" + status);
                pst.setString(7, rs.getString("clientID"));

                pst.execute();

                JOptionPane.showMessageDialog(null, "Saved");
            }

        } catch (SQLException | HeadlessException e) {

            JOptionPane.showMessageDialog(null, e);
        }
    }

    public void createClientCase(String flightNumber, String firstName, String lastName,
            String emailAddress, String phoneNumber, String zipCode, String address, String city,
            String country, String shippingZipCode, String shippingAddress, String shippingCity,
            String shippingCountry) {

        try {
            //Insert client-info into the fys.client table
            String insertClient = "INSERT INTO client (flightNumber, firstName, lastName, "
                    + "emailAddress, phoneNumber, zipCode, address, city, country, "
                    + "shippingZipCode, shippingAddress, shippingCity, shippingCountry) VALUE "
                    + "(?,?,?,?,?,?,?,?,?,?,?,?,?)";
            pst = conn.prepareStatement(insertClient);

            pst.setString(1, flightNumber);
            pst.setString(2, firstName);
            pst.setString(3, lastName);
            pst.setString(4, emailAddress);
            pst.setString(5, phoneNumber);
            pst.setString(6, zipCode);
            pst.setString(7, address);
            pst.setString(8, city);
            pst.setString(9, country);
            pst.setString(10, shippingZipCode);
            pst.setString(11, shippingAddress);
            pst.setString(12, shippingCity);
            pst.setString(13, shippingCountry);

            pst.execute();

            createLog(Employee.getCurrentUser(), "SerDesEmp_NewCase", "Created new client-case for "
                    + firstName + " " + lastName);

            //Get the clientID we just generated (Can't this be easier D: ?)
            String getClientID = "SELECT clientID FROM client WHERE firstName = '" + firstName
                    + "' AND lastName = '" + lastName + "' AND zipCode = '" + zipCode + "'";
            pst = conn.prepareStatement(getClientID);
            rs = pst.executeQuery();

            if (rs.next()) {
                //Make sure a status and startDate is created so we have perfect and detailed graphs
                String insertBaggage = "INSERT INTO baggage (status, startDate, clientID) VALUE "
                        + "(?,now(),?)";
                pst = conn.prepareStatement(insertBaggage);

                pst.setString(1, "0");
                pst.setString(2, rs.getString("clientID"));

                pst.execute();

                JOptionPane.showMessageDialog(null, "Saved");
            }

        } catch (SQLException | HeadlessException e) {

            JOptionPane.showMessageDialog(null, e);
        }
    }

    public void createBaggageCase(String location, String brand, String color, String weight,
            String description, int status) {
        try {
            String insertBaggage = "INSERT INTO baggage (location, brand, color, weight, "
                    + "description, status, startDate) VALUE (?,?,?,?,?,?,now())";
            pst = conn.prepareStatement(insertBaggage);

            pst.setString(1, location);
            pst.setString(2, brand);
            pst.setString(3, color);
            pst.setString(4, weight);
            pst.setString(5, description);
            pst.setString(6, "" + status);

            pst.execute();

            createLog(Employee.getCurrentUser(), "SerDesEmp_NewCase", "Created new baggage-case"
                    + " at " + location);

            JOptionPane.showMessageDialog(null, "Saved");

        } catch (SQLException | HeadlessException e) {

            JOptionPane.showMessageDialog(null, e);
        }
    }

    public void updateCase(String flightNumber, String firstName, String lastName,
            String emailAddress, String phoneNumber, String zipCode, String address, String city,
            String country, String shippingZipCode, String shippingAddress, String shippingCity,
            String shippingCountry, String location, String brand, String color, String weight,
            String description, String entryDate, String retrievalDate, String status) {
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

            String sql = "update client set flightNumber =  '" + value1 + "', name = '" + value2
                    + "',lastname = '" + value3 + "',email = '" + value4 + "',phonenumber = '"
                    + value5 + "',zipcode = '" + value6
                    + "' ,address = '" + value7 + "',city = '" + value8 + "' ,country = '"
                    + value9 + "',shippingzipcode = '" + value10 + "',shippingaddress = '"
                    + value11 + "',shippingcity = '" + value12
                    + "',shippingcountry = '" + value13 + "'where clientID='" + value1 + "' ";
            pst = conn.prepareStatement(sql);
            pst.execute();

            String sql2 = "UPDATE baggage SET location = '" + value14 + "',brand = '" + value15
                    + "',color = '" + value16 + "',weight = '" + value17 + "',description = '"
                    + value18 + "',dateadded = '" + value19 + "',dateretrieved = '" + value20
                    + "',status = '" + value21 + "' WHERE baggageID = '" + 1 + "'";
            pst = conn.prepareStatement(sql2);
            pst.execute();
            JOptionPane.showMessageDialog(null, "Updated");

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }

    public void updateClientCase(String flightNumber, String firstName, String lastName,
            String emailAddress, String phoneNumber, String zipCode, String address, String city,
            String country, String shippingZipCode, String shippingAddress, String shippingCity,
            String shippingCountry) {
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

            String sql = "update client set flightNumber = '" + value1 + "', name = '" + value2
                    + "',lastname = '" + value3 + "',email = '" + value4 + "',phonenumber = '"
                    + value5 + "',zipcode = '" + value6 + "' ,address = '" + value7
                    + "',city = '" + value8 + "' ,country = '" + value9 + "',shippingzipcode = '"
                    + value10 + "',shippingaddress = '" + value11 + "',shippingcity = '"
                    + value12 + "',shippingcountry = '" + value13 + "'where ClientID='" + value1
                    + "' ";

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

    public void addToCase(String clientID, String flightNumber, String brand, String color, String weight, String description) {
        try {
// vragen Floris
            String sql = "insert into baggage (clientID,flightnumber,brand,color,weight,description)value(?,?,?,?,?,?)";
            pst = conn.prepareStatement(sql);

            pst.setString(1, clientID);
            pst.setString(2, flightNumber);
            pst.setString(3, brand);
            pst.setString(4, color);
            pst.setString(5, weight);
            pst.setString(6, description);

            pst.execute();
            JOptionPane.showMessageDialog(null, "Saved");

        } catch (SQLException | HeadlessException e) {

            JOptionPane.showMessageDialog(null, e);
        }
    }
}
