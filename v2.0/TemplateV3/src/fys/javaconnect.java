/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fys;

/**
 *
 * @author Doreen
 */
import java.awt.HeadlessException;
import java.sql.*;
import javax.swing.*;
public class javaconnect {
    
        Connection conn=null;
        public static Connection ConnecrDb() {
            
            try{
               Class.forName("org.sqlite.JDBC");
               Connection conn =DriverManager.getConnection("jdbc:mysql://localhost:3305/fysgroep?zeroDateTimeBehavior=convertToNull","root", "ginger8");
               //JOptionPane.showMessageDialog(null, "Connection Established");
                 return conn;
                }catch (ClassNotFoundException | SQLException | HeadlessException e) {
                    JOptionPane.showMessageDialog(null, e);
                    return null;
                }
            
        }
    
}
