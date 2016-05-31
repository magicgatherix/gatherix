/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package database;

import beans.Card;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.LinkedList;
import java.util.logging.Level;
import java.util.logging.Logger;

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
    
    public void addUser(String username, String email, String password)
    {
        try {
            Connection con = conPool.getConnection();
            
            PreparedStatement ps = con.prepareStatement("insert into nuser (username,password,email) values(?,?,?)");
            
            
            
            ps.setString(1, username);
            ps.setString(2, password);
            ps.setString(3, email);
            int i = ps.executeUpdate();
            
            if (i > 0) {
                System.out.println("You are sucessfully registered");
            }
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
                Card card = new Card(cardname,edition,type,manaCost,rarity);
                
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


