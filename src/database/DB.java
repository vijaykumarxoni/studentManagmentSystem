/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package database;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author Vijay kumar
 */
public class DB {
      
    private static String url="jdbc:mysql://localhost/login";
    private static String user="root";
    private static String password="";
    public static Connection con;
 
    
    
        public static void load() {
    try { 
    con=DriverManager.getConnection(url, user, password);
        System.out.println("Load");
    
    
    }
    catch(Exception e){
    
    
        System.out.println("Error in Load");
        e.printStackTrace();
    }
    
        }}
