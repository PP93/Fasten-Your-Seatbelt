package fys;

import java.awt.HeadlessException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 * It works for now. But we need a perfect database first
 * 
 * @author Floris
 */
public class Employee {
    public int employeeID;
    public String firstName;
    public String lastName;
    public String username;
    public String password;
    public String emailAddress;
    public String phoneNumber;
    public String function;

    public Employee(int employeeID) {
        Connection conn = javaconnect.ConnecrDb();
        try {
            String sql = "select * from employee where employeeID=?";
            PreparedStatement pst = conn.prepareStatement(sql);
            pst.setString(1, "" + employeeID);
            ResultSet rs = pst.executeQuery();

            if (rs.next()) {
                this.employeeID  = employeeID;
                this.firstName   = rs.getString("name");
                this.lastName    = rs.getString("lastname");
                this.username    = rs.getString("username");
                this.password    = rs.getString("password");
                this.phoneNumber = rs.getString("phonenumber");
                this.function    = rs.getString("function");

            } else {
                System.out.println("THIS WENT WRONG");
            }

        } catch (SQLException | HeadlessException e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }
    
    public Employee(String username) {
        Connection conn = javaconnect.ConnecrDb();
        try {
            String sql = "select * from employee where username=?";
            PreparedStatement pst = conn.prepareStatement(sql);
            pst.setString(1, username);
            ResultSet rs = pst.executeQuery();

            if (rs.next()) {
                try {
                    this.employeeID = Integer.parseInt(rs.getString("employeeID"));
                } catch (NumberFormatException e) {
                    JOptionPane.showMessageDialog(null, e);
                }
                this.firstName   = rs.getString("name");
                this.lastName    = rs.getString("lastname");
                this.username    = username;
                this.password    = rs.getString("password");
                this.phoneNumber = rs.getString("phonenumber");
                this.function    = rs.getString("function");

            } else {
                System.out.println("THIS WENT WRONG");
            }

        } catch (SQLException | HeadlessException e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }
    
    @Override
    public String toString() {
        return employeeID + " " + firstName + " " + lastName + " " + username + " " + function;
    }
}
