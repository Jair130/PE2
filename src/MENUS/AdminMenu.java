/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package MENUS;

import static MENUS.Users_.userName;
import static MENUS.Users_.userSurname;
import static MENUS.Users_.resultsCollection;
import static MENUS.Users_.userId;
import java.util.Scanner;
import java.io.IOException;
import java.sql.SQLException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;


/**
 *
 * @author JAIR 2021231
 */
public class AdminMenu {
   
    static Scanner scanner = new Scanner (System.in);
    
    String DB_URL = "jdbc:mysql://localhost/finalp" ;
    String user = "root";
    String pass = "root";
   public Connection conn = null;
     public Statement stmt = null;
    
    Scanner in = new Scanner (System.in);
    
     Scanner myKB = new Scanner (System.in);
     
    
    
    
  public static void main(String[] args) throws IOException {
        
  
  }
    

    public void Modify () throws SQLException{
        
         System.out.println ("Welcome Admin Choose an option from the menu");
    System.out.println("1. Modify your name");
    
    System.out.println("2. Modify your surname");
    
    System.out.println("3. Modify your age ");
    
    int option = in.nextInt();
    
    switch (option){
        case 1:
            try{     
            System.out.println("TYPE YOUR ID");
             String id = myKB.nextLine();
              System.out.println("TYPE YOUR NEW NAME");
              String Newname = myKB.nextLine();
        
    conn = DriverManager.getConnection("jdbc:mysql://localhost" , user, pass);
     stmt = conn.createStatement();
    
       conn = DriverManager.getConnection (DB_URL,user,pass);
           
       stmt = conn.createStatement();
       
       
       String sql =("UPDATE admin SET admin_name = \"" + Newname + "\" WHERE admin_id =  \"" + id + "\";");
                 
       // Prepared statements
       
       int rowsAffected = stmt.executeUpdate(sql);
       
       System.out.println("Rows affected: " + rowsAffected );
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
            break;
        case 2:
            try{     
            System.out.println("TYPE YOUR ID");
             String id = myKB.nextLine();
              System.out.println("TYPE YOUR NEW SURNAME");
              String Newsurname = myKB.nextLine();
        
    conn = DriverManager.getConnection("jdbc:mysql://localhost" , user, pass);
     stmt = conn.createStatement();
    
       conn = DriverManager.getConnection (DB_URL,user,pass);
           
       stmt = conn.createStatement();
       
       
       String sql =("UPDATE admin SET admin_surname = \"" + Newsurname + "\" WHERE admin_id =  \"" + id + "\";");
                 
       // Prepared statements
       
       int rowsAffected = stmt.executeUpdate(sql);
       
       System.out.println("Rows affected: " + rowsAffected );
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
          
          break;
        case 3:
            try{     
            System.out.println("TYPE YOUR ID");
             String id = myKB.nextLine();
              System.out.println("TYPE YOUR NEW AGE");
              String Newsage = myKB.nextLine();
        
    conn = DriverManager.getConnection("jdbc:mysql://localhost" , user, pass);
     stmt = conn.createStatement();
    
       conn = DriverManager.getConnection (DB_URL,user,pass);
           
       stmt = conn.createStatement();
       
       
       String sql =("UPDATE admin SET admin_age = \"" + Newsage + "\" WHERE admin_id =  \"" + id + "\";");
                 
       // Prepared statements
       
       int rowsAffected = stmt.executeUpdate(sql);
       
       System.out.println("Rows affected: " + rowsAffected );
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
         
            
          break;
    }
     
    }
  
        
            public void Access () throws SQLException, ClassNotFoundException{
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
                conn = DriverManager.getConnection("jdbc:mysql://localhost" , user, pass);
     stmt = conn.createStatement();
    
       conn = DriverManager.getConnection (DB_URL,user,pass);
           
       stmt = conn.createStatement();
                String query="SELECT * from users";
                
               // Statement st = conn.createStatement(); is giving me an error 
                
                ResultSet rs = stmt.executeQuery(query);
                
                //dysplay result
                while(rs.next()){
                    int id = rs.getInt("userInfo");
                    String firstname = rs.getString("userName");
                    String lastname = rs.getString("userSurname");
                    String id = rs.getString("userID"); 
                   
                    System.out.format(userId, userName,userSurname);
                      }
                
                stmt.close();
         
    } catch (SQLException ex){
        System.out.println("not connected");
       }finally {
           if (stmt != null){
               stmt.close();
           }
           if (conn != null){
               conn.close();
           }
       } 
        
        
        
    }
 
        
        
        
   
        
        
   public void Remove () throws SQLException{
      try{   
            System.out.println("TYPE ID OF  THE USER WILL BE REMOVED");
             String id = myKB.nextLine();
              
          
    conn = DriverManager.getConnection("jdbc:mysql://localhost" , user, pass);
     stmt = conn.createStatement();
    
       conn = DriverManager.getConnection (DB_URL,user,pass);
           
       stmt = conn.createStatement();
       
       
       String sql =("DELETE FROM users WHERE user_id =  \"" + id + "\";");
                 
       // Prepared statements
       
       int rowsAffected = stmt.executeUpdate(sql);
       
       System.out.println("Rows affected: " + rowsAffected );
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
           
       
    public void Review (){
        System.out.println("4.   Review the operations performed by other users");
    }         
            
            
            
}




