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
import java.sql.*;
import javax.swing.*;
public class javaconnect {
    
    
    Connection conn=null;
    public static Connection ConnecrDb(){
       
        try{
            Class.forName("com.mysql.jdbc.Driver");
            Connection conn =DriverManager.getConnection("jdbc:mysql://localhost:3306/fys?zeroDateTimeBehavior=convertToNull","root", " ");
            JOptionPane.showMessageDialog(null, "Connection Established");        
            return conn;
             }catch (ClassNotFoundException | SQLException e) {
                 JOptionPane.showMessageDialog(null, e);
                 return null;
             }
    
    }
    
}
