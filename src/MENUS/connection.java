/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package MENUS;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author jairp
 */
public class connection {
    public static void main(String[] args) {
     connection dbp = new connection();
      dbp.createConnection();
    }
     void createConnection(){
         try{
             Class.forName("com.mysql.jdbc.Driver");
             Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/finalp","root","root");
             System.out.println("Database Connection Success");
         }catch(ClassNotFoundException ex){
             Logger.getLogger(connection.class.getName()).log(Level.SEVERE,null,ex);
         }catch(SQLException ex){
             Logger.getLogger(connection.class.getName()).log(Level.SEVERE,null,ex);
     }
     }
}
