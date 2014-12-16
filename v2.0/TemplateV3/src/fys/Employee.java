package fys;

import java.awt.HeadlessException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 * It works for now, I guess...
 *
 * @author Floris
 */
public class Employee {

    public static String currentUsername;

    public int employeeID;
    public String firstName;
    public String lastName;
    public String username;
    public String password;
    public String emailAddress;
    public String phoneNumber;
    public String function;
    public String location;

    public Employee(int employeeID) {
        Connection conn = javaconnect.ConnecrDb();
        try {
            String sql = "select * from employee where employeeID=?";
            PreparedStatement pst = conn.prepareStatement(sql);
            pst.setString(1, "" + employeeID);
            ResultSet rs = pst.executeQuery();

            if (rs.next()) {
                this.employeeID = employeeID;
                this.firstName = rs.getString("firstName");
                this.lastName = rs.getString("lastName");
                this.username = rs.getString("username");
                this.password = rs.getString("password");
                this.emailAddress = rs.getString("emailAddress");
                this.phoneNumber = rs.getString("phoneNumber");
                this.function = rs.getString("function");
                this.location = rs.getString("location");
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
                this.firstName = rs.getString("firstName");
                this.lastName = rs.getString("lastName");
                this.username = rs.getString("username");
                this.password = rs.getString("password");
                this.emailAddress = rs.getString("emailAddress");
                this.phoneNumber = rs.getString("phoneNumber");
                this.function = rs.getString("function");
                this.location = rs.getString("location");
            }

        } catch (SQLException | HeadlessException e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }

    public static String getCurrentUser() {
        return Employee.currentUsername;
    }

    public static void setCurrentUser(String currentUsername) {
        Employee.currentUsername = currentUsername;
    }

    public String getFullName() {
        return firstName + " " + lastName;
    }

    // For testing
    @Override
    public String toString() {
        return employeeID + " " + firstName + " " + lastName + " " + username + " " + function;
    }
}
