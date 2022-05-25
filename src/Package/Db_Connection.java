/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Package;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import javax.swing.JOptionPane;

/**
 *
 * @author A
 */
public class Db_Connection {
  // Connection conn;
   ResultSet res;
  // prepareStatement pst;
   
   public static void main(String args[]) {
       Db_Connection.ConnectDB();
   }
   
    public static Connection ConnectDB(){
     
        try{ //org.apache.derby.jdbc.ClientDriver-- com.mysql.cj.jdbc.Driver
        Class.forName("com.mysql.jdbc.Driver");
        Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/Exercises_2022","root","root");
 System.out.println("Connected to Database.");
            return conn;
            
        }catch (Exception e){
            JOptionPane.showMessageDialog(null, "can't connect");
        }
        return null;
        
    }
    
}

