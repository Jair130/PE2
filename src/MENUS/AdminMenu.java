/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package MENUS;

import java.util.Scanner;
import java.io.IOException;
import java.sql.SQLException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

/**
 *
 * @author JAIR 2021231
 */
public class AdminMenu {
   
    static Scanner scanner = new Scanner (System.in);
    String dbName = "Finalp";
    String DB_URL = "jdbc:mysql://localhost/" + dbName;
    String user = "CCT";
    String pass = "Dublin";
    Connection conn = null;
    Statement stmt = null;
    
    
  public static void main(String[] args) throws IOException {
        
  
  }
    public void Modify () throws SQLException{
       try{  
        
     conn = DriverManager.getConnection("jdbc:mysql://localhost/", user, pass);
     stmt = conn.createStatement();
    
       conn = DriverManager.getConnection (DB_URL,user,pass);
           
       stmt = conn.createStatement();
       
       String sql =("UPDATE Admin SET Admin_surname = 'Caballero'  WHERE Admin_id = A1");
       
       int rowsAffected = stmt.executeUpdate(sql);
       
       System.out.println("Rows affected: " + rowsAffected);
       System.out.println ("UPDATE COMPLETED!");
       
       
       
      } catch (SQLException ex){
       }finally {
           if (stmt != null){
               stmt.close();
           }
           if (conn != null){
               conn.close();
           }
       }
    }
        
    public void Access (){
        System.out.println("2. Access a list of all other users in the system");
    }

  public void Remove (){
        System.out.println("3.  Remove other users from the system");
    }     
            
    public void Review (){
        System.out.println("4.   Review the operations performed by other users");
    }         
            
            
            
}




