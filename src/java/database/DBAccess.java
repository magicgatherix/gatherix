/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package database;

import java.util.LinkedList;

/**
 *
 * @author Nico
 */
public class DBAccess {
    
    private static DBAccess theInstance = null;
    private DBConnectionPool conPool = null;

    public static DBAccess getInstance() throws ClassNotFoundException {
        if (theInstance == null) {
            theInstance = new DBAccess();
        }
        return theInstance;
    }

    private DBAccess() throws ClassNotFoundException {
        conPool = DBConnectionPool.getInstance();
    }
    
    public static void main(String[] args) {

        try {
            DBAccess dba = DBAccess.getInstance();
            

            

           
        } catch (ClassNotFoundException ex) {
            System.out.println(ex.toString());
        } catch (Exception ex) {
            System.out.println(ex.toString());
        }

    }
    
}
