/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package database;

import static database.DBConfig.DB_DRIVER;
import static database.DBConfig.DB_NAME;
import static database.DBConfig.DB_PASSWD;
import static database.DBConfig.DB_URL;
import static database.DBConfig.DB_USER;
import java.sql.Connection;
import java.sql.DriverManager;
import java.util.LinkedList;


public class DBConnectionPool implements DBConfig{
    
    private LinkedList<Connection> connections = new LinkedList<>();
    private final int MAX_CONNECTIONS = 150; 
    private int num_connections = 0; 
 
    private static DBConnectionPool theInstance = null;
    
    public static DBConnectionPool getInstance() throws ClassNotFoundException{
        if(theInstance == null){
            theInstance = new DBConnectionPool();
        }
        return theInstance;
    }

    
    private DBConnectionPool() throws ClassNotFoundException {
        
        Class.forName(DB_DRIVER);
    }
    
    public Connection getConnection() throws Exception{
        if(connections.isEmpty()){
            if(num_connections >= MAX_CONNECTIONS){ 
                throw new Exception("Maximum Number of Users reached - try again later");
            }
            Connection con = DriverManager.getConnection(DB_URL+DB_NAME, DB_USER, DB_PASSWD);
            num_connections ++;
            return con;
        }
        
        return connections.poll();
    }
    
    public void releaseConnection(Connection con){
        
        connections.offer(con);
       
    }
}