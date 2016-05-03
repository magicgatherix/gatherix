/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package database;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
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

    public void getCard(Connection con) {
        Statement stmt = null;
        String query = "";
        try {
            stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery(query);
            while (rs.next()) {
                String cardname = rs.getString("NAME");
                String edition = rs.getString("ED");
                String type = rs.getString("TYPE");
                int manaCost = rs.getInt("MANA COST");
                String rarity = rs.getString("R");
                
            }
            stmt.close();
        } catch (SQLException e) {
            e.toString();
        } finally {
            if (stmt != null) {
                
            }
        }
    }
}


