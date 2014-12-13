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

    // ----------------------------- LOG QUERIES ----------------------------------------
    public void createLog(String employeeID) {
        try {
            String sql = "INSERT INTO log (employeeID, action, tab)value(?,?,?)";
            pst = conn.prepareStatement(sql);

            pst.setString(1, employeeID);
            pst.setString(2, "Logged in");
            pst.setString(3, "LogIn");

            pst.execute();
        } catch (SQLException | HeadlessException e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }

    public void createLog() {
        try {
            String sql1 = "select * from employee where username=?";
            pst = conn.prepareStatement(sql1);
            pst.setString(1, Global.getCurrentUser());
            rs = pst.executeQuery();

            if (rs.next()) {
                String employeeID = rs.getString("employeeID");

                String sql2 = "INSERT INTO log (employeeID, action, tab)value(?,?,?)";
                pst = conn.prepareStatement(sql2);

                pst.setString(1, employeeID);
                pst.setString(2, "Logged out");
                pst.setString(3, "AppMan_LogOut");

                pst.execute();
            }
        } catch (SQLException | HeadlessException e1) {
            JOptionPane.showMessageDialog(null, e1);
        }
    }
    
     private void createLog(String newAccountEmployeeID, String newAccountFunction) {
        try {
            String sql1 = "select * from employee where username=?";
            pst = conn.prepareStatement(sql1);
            pst.setString(1, Global.getCurrentUser());
            rs = pst.executeQuery();

            if (rs.next()) {
                String employeeID = rs.getString("employeeID");

                String sql2 = "INSERT INTO log (employeeID, action, tab)value(?,?,?)";
                pst = conn.prepareStatement(sql2);

                pst.setString(1, employeeID);
                pst.setString(2, "Created new " + newAccountFunction + " " + newAccountEmployeeID);
                pst.setString(3, "AppMan_NewAccount");

                pst.execute();
            }
        } catch (SQLException | HeadlessException e1) {
            JOptionPane.showMessageDialog(null, e1);
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
            String sql = "select * from employee where employeeID=? OR name=? OR lastname=? OR username=? ";

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

    public void updateAccount(String employeeID, String name, String lastname, String username, String password, String email, String phonenumber, String function) {
       String sql = "UPDATE employee SET (name, lastname, username, password, email, phonenumber, function) VALUES (?, ?, ?, ?, ?, ?, ?, ?) WHERE employeeID = ?";
        try {          
            pst = conn.prepareStatement(sql);
            pst.setString(1, name);
            pst.setString(2, lastname);
            pst.setString(3, username);
            pst.setString(4, password);
            pst.setString(5, email);
            pst.setString(6, phonenumber);
            pst.setString(7, function);
            pst.setString(8, employeeID);
            
            pst.execute();
            JOptionPane.showMessageDialog(null, "Updated");
        } catch (SQLException ex) {
            Logger.getLogger(QueryManager.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void createAccount(String name, String lastname, String username, String password, String email, String phonenumber, String function) {
        String sql = "INSERT INTO employee (name, lastname, username, password, email, phonenumber, function) VALUES (?, ?, ?, ?, ?, ?, ?)";
        
        try {
            pst = conn.prepareStatement(sql);
            pst.setString(1, name);
            pst.setString(2, lastname);
            pst.setString(3, username);
            pst.setString(4, password);
            pst.setString(5, email);
            pst.setString(6, phonenumber);
            pst.setString(7, function);
            
            pst.executeUpdate();
            JOptionPane.showMessageDialog(null, "Saved");
        } catch (SQLException ex) {
            Logger.getLogger(QueryManager.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

// ------------------------------ SERVICE DESK EMPLOYEE QUERIES -------------------------
    
    public void updateClientTable(JTable jTable){
        try {
            String sql = "select clientID, firstName, lastName from client";
            pst = conn.prepareStatement(sql);
            rs = pst.executeQuery();
            jTable.setModel(DbUtils.resultSetToTableModel(rs));
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }
    
    public void createCase(){
        
    }
    
    public void createClientCase(String firstName, String lastName, String emailAddress, String phoneNumber, String zipCode, String address, 
            String city, String country, String shippingCountry, String shippingZipCode, String shippingAddress, String shippingCity){
        
        try{
         String sql = "insert into client (firstName,lastName,emailAddress,phoneNumber,zipCode,address,city,country,shippingCountry,shippingZipCode,shippingAddress,shippingCity) value(?,?,?,?,?,?,?,?,?,?,?,?)";
                       pst = conn.prepareStatement(sql);

                        pst.setString(1, firstName);
                        pst.setString(2, lastName);
                        pst.setString(3, emailAddress);
                        pst.setString(4, phoneNumber);                     
                        pst.setString(5, zipCode);
                        pst.setString(6, address);
                        pst.setString(7, city);
                        pst.setString(8, country);           
                        pst.setString(9,  shippingCountry);
                        pst.setString(10, shippingZipCode);
                        pst.setString(11, shippingAddress);
                        pst.setString(12, shippingCity);
                        
                        pst.execute();
                                                String fullName = firstName + " " + lastName;
                      createLogNewCase(fullName);
                        JOptionPane.showMessageDialog(null, "Saved");

                    } catch (SQLException | HeadlessException e) {

                        JOptionPane.showMessageDialog(null, e);
                    }
                

    }
    // shit vragen aan floris
    public void createBaggageCase(String location, String brand, String color, String weight, String description, String status,java.sql.Date startDate, java.sql.Date resolvedDate){
           try {

                        String sql = "insert into baggage (location, brand, color, weight, description, status, startDate)value(?,?,?,?,?,?,?)";
                        pst = conn.prepareStatement(sql);

                        pst.setString(1, location);
                        pst.setString(2, brand);
                        pst.setString(3, color);
                        pst.setString(4, weight);
                        pst.setString(5, description);
                        pst.setString(6, "unresolved");
//                        pst.setString(6,((JTextField)Field_DateAdded.getDateEditor().getUiComponent()).getText());
                 
                        
                        pst.execute();
                        
                        //Floris: This isn't perfect yet but neither is this huge ass block of 
                        //if-else-statements :P When we have a class for getting all info of a piece
                        //of baggage and other classes for employees and clients, I'll make this
                        //better :D
                        
                        //vrage wat er moet gebeuren met deze
                      //createLogNewCase(Field_FlightNumber.getText());
                        
                        JOptionPane.showMessageDialog(null, "Saved");

                    } catch (SQLException | HeadlessException e) {

                        JOptionPane.showMessageDialog(null, e);
                    }
                }

    
    public void createLogNewCase(String clientName) {
        try {
            String sql1 = "select * from employee where username=?";
            pst = conn.prepareStatement(sql1);
            pst.setString(1, Employee.getCurrentUser());
            rs = pst.executeQuery();
            
            if (rs.next()) {
                String employeeID = rs.getString("employeeID");
                
                String sql2 = "INSERT INTO log (employeeID, action, tab)value(?,?,?)";
                pst = conn.prepareStatement(sql2);
// Log voor Bagage navrage
                pst.setString(1, employeeID);
                pst.setString(2, "Created new case for " + clientName);
                pst.setString(3, "SerDesEmp_NewCase");

                pst.execute();
            }
        } catch (SQLException | HeadlessException e1) {
            JOptionPane.showMessageDialog(null, e1);
        }
    }

}
