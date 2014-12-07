/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fys;

/**
 *
 * @author Caitlin
 */
public class Global {
    private static String currentUser;
    
    public static String getCurrentUser () {
        return Global.currentUser;
    }

    public static void setCurrentUser (String currentUser) {
        Global.currentUser = currentUser;
    }
}
