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
import MENUS.connection;

/**
 *
 * @author JAIR 2021231
 */
public class AdminMenu {
   
    static Scanner scanner = new Scanner (System.in);
    
    String DB_URL = "jdbc:mysql://localhost/finalp" ;
    String user = "root";
    String pass = "root";
    Connection conn = null;
    Statement stmt = null;
    
    
    
  public static void main(String[] args) throws IOException {
        
  
  }
    public void Modify () throws SQLException{
        
         System.out.println ("Welcome Admin Choose an option from the menu");
    System.out.println("1. Modify your name");
    System.out.println("2. Modify your surname");
    System.out.println("3. Modify your age ");
    int option;
    Scanner in = new Scanner (System.in);
    option = in.nextInt();
     Scanner myKB = new Scanner (System.in);
     
    switch (option){
        case 1:
             try{   
            System.out.println("TYPE YOUR ID");
             String id = myKB.nextLine();
              System.out.println("TYPE YOUR NEW NAME");
              String Newname = myKB.nextLine();
          
//     conn = DriverManager.getConnection("jdbc:mysql://localhost" , user, pass);
//     stmt = conn.createStatement();
    
       conn = DriverManager.getConnection (DB_URL,user,pass);
           
       stmt = conn.createStatement();
       
       
       String sql =("UPDATE admin SET admin_name = \"" + Newname + "\" WHERE admin_id =  \"" + id + "\";");
                 System.out.println("UPDATE admin SET admin_name = " + Newname + " WHERE admin_id =  " + id );
                 System.out.println("UPDATE admin SET admin_name = \"" + Newname + "\" WHERE admin_id =  \"" + id + "\";");
       // Prepared statements
       
       int rowsAffected = stmt.executeUpdate(sql);
       
       System.out.println("Rows affected: " + rowsAffected );
       System.out.println ("UPDATE COMPLETED!");
       
       
       
    } catch (SQLException ex){
                 ex.printStackTrace();
       }finally {
           if (stmt != null){
               stmt.close();
           }
           if (conn != null){
               conn.close();
           }
       }
     
     
     
     
         break;
        case 2:
          
          break;
        case 3:
            
          break;
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




