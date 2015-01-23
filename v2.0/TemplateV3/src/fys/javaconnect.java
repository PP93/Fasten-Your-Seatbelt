package fys;

import java.awt.HeadlessException;
import java.sql.*;
import javax.swing.*;

/**
 * @author Floris van Lent (500717249)
 * @version 1.0
 */
public class javaconnect {

    Connection conn = null;

    public static Connection ConnecrDb() {

        try {
            Class.forName("org.sqlite.JDBC");
            Connection conn = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/fys?zeroDateTimeBehavior=convertToNull", "root",
                    "Pindakaas");
            return conn;

        } catch (ClassNotFoundException | SQLException | HeadlessException e) {
            JOptionPane.showMessageDialog(null, e);
            return null;
        }
    }
}
