/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package MENUS;

/**
 *
 * @author jairp
 * 
 */

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;


public class DataWriter {
    String dbName = "Finalp";
    String DB_URL = "jdbc:mysql://localhost/" + dbName;
    String user = "CCT";
    String pass = "Dublin";
    
    public boolean setupDB(){
    try {
    Connection conn = DriverManager.getConnection("jdbc:mysql://localhost/", user, pass);
    Statement stmt = conn.createStatement();
    
    stmt.execute("CREATE SCHEMA IF NOT EXISTS" + dbName + ";");
    stmt.execute("USE finalp;");
    
    /*
    users_id int PRIMARY KEY
    user_name VARCHAR(45)
    user_surname VARCHAR(45)
    user_age VARCHAR(45)
    user_sex  VARCHAR(45)
    
   
    */
    
    
    
    
    stmt.execute(
                    "CREATE TABLE IF NOT EXISTS finalp ("
                            + "users_id INT (10) NOT NULL PRIMARY KEY,"
                            + "user_name VARCHAR(45) NOT NULL,"
                            + "user_surname VARCHAR(45) NOT NULL,"
                            + "user_age VARCHAR(45) NOT NULL,"
                            + "user_sex  VARCHAR(45);"
            
    );
    return true;
   } catch (SQLException e){
    e.printStackTrace();
    return false;
}
}
    
    public boolean dumpData(List<Users> userList) {
        try(Connection conn = DriverManager.getConnection(DB_URL,user,pass);
            Statement stmt = conn.createStatement();
        ) {
            stmt.execute("USE `finalp`;");
            String sql;
            for (Users users : userList) {
                sql = String.format("INSERT INTO finalp (user_id, user_name, user_surname, user_age, user_sex) "
                        + "VALUES(\"%s\", %d, \"%s\", \"%s\", \"%s\") ON DUPLICATE KEY UPDATE user_id=%d, user_name=\"%s\", user_surname=\"%s\", user_age=\"%s\", user_sex=\"%s\"",
                        users.getUsersId(), users.getUserName(), users.getUserSurname(), users.getUserAge(), users.getUserSex(),
                        users.getUsersId(), users.getUserName(), users.getUserSurname(), users.getUserAge(), users.getUserSex());
                stmt.executeUpdate(sql);
            } 
        return true;
        } catch (SQLException e) {
            e.printStackTrace();  
            return false;
        }         
    
    
    
    
    
    
    
    
    
    
    
}
}

    

