package MENUS;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */




import java.io.IOException;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;
import java.sql.Connection;
import MENUS.connection;
import java.util.ArrayList;




/**
 *
 * @author JAIR 2021231
 */
public class StudentMenu {
    
    static Scanner scanner = new Scanner (System.in);
    
    String DB_URL = "jdbc:mysql://localhost/finalp" ;
    String user = "root";
    String pass = "root";
    java.sql.Connection conn = null;
    Statement stmt = null;
    
    
    Scanner in = new Scanner (System.in);
    
     Scanner myKB = new Scanner (System.in);
     
    
    public static void main(String[] args) throws IOException  {
      
        
        
}
    
    /**
     *
     * @throws SQLException
     */
    public void Modify() throws SQLException{
        
         System.out.println ("Welcome Choose an option from the menu");
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
       
       
       String sql =("UPDATE users SET user_name = \"" + Newname + "\" WHERE user_id =  \"" + id + "\";");
                 
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
       
       
       String sql =("UPDATE users SET user_surname = \"" + Newsurname + "\" WHERE user_id =  \"" + id + "\";");
                 
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
       
       
       String sql =("UPDATE users SET user_age = \"" + Newsage + "\" WHERE user_id =  \"" + id + "\";");
                 
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
    
    
    
   
     

   public void Save(){
           
        // Declare an array to store the computation
        int[] computation = new int[100];

        // Declare a variable to store the solution
        int solution = 0;

        // Perform the computation and store the result in the array
        for (int i = 0; i < 100; i++) {
        computation[i] = Results(i);
}

        // Calculate the final solution using the values in the computation array
        for (int i = 0; i < 100; i++) {
        solution += computation[i];
}

        // Print the solution
        System.out.println("The solution is: " + solution);

        
         // Create an ArrayList to store the results
           ArrayList<Integer> results = new ArrayList<>();

         // Perform the computation and add the result to the list
           results.add(performComputation());
           
          // Print the first result in the list
         System.out.println(results.get(0));
  
  }

            public static int performComputation() {
            // Perform the computation and return the result
            return 42;
  }

          private int Results(int i) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
         /** can also use a loop to iterate over all of the results in the list 
            for (int i = 0; i < results.size(); i++) {
            int result = Results.get(i);
            System.out.println(result);
}*/

    

        
        
        
        
        
    
   
    public void Equations1(){
        try{
        Scanner read = new Scanner (System.in);
        System.out.println("System of equations of two variables...........");
        int x1,x2; int y1,y2,t1,t2;
        x1=read.nextInt();
        y1=read.nextInt();
        t1=read.nextInt();
        
        x2=read.nextInt();
        y2=read.nextInt();
        t2=read.nextInt();
        System.out.println(" "+x1+"x "+y1+"y = "+t1+"\n "+x2+"x "+y2+"y = "+t2);
        long d =((x1*y2))-((x2*y1));   
        long d1 =((t1*y2)) - ((t2*y1));
        long d2 = ((x1*t2))- ((x2*t1));
       /* System.out.println("denominador = "+d);
        System.out.println("el d1 = "+d1+ "    \n el de d2 = "+d2); */
        long x=d1/d;      long y=d2/d;
        System.out.println("x = "+x+" y = "+y);
        
    }catch (Exception e){
        System.out.println("System with no solution");
    }
        
    }
        
      public void Equations2()  {
          try{
            Scanner read =new Scanner (System.in);
            //variables 
       int x1,x2,x3,y1,y2,y3,z1,z2,z3,t1,t2,t3;
        System.out.println("TYPE ALL THE VALUES.....");
        
        x1=read.nextInt();
        y1=read.nextInt();
        z1=read.nextInt();
        t1=read.nextInt();
        
        x2=read.nextInt();
        y2=read.nextInt();
        z2=read.nextInt();
        t2=read.nextInt();
        
        x3=read.nextInt();
        y3=read.nextInt();
        z3=read.nextInt();
        t3=read.nextInt();
        
        System.out.println("==============================");
        System.out.println(""+x1+"x "+y1+"y "+z1+"z = "+t1);
        System.out.println(""+x2+"x "+y2+"y "+z2+"z = "+t2);
        System.out.println(""+x3+"x "+y3+"y "+z3+"z = "+t3);
        System.out.println("==============================");
          
         long d=((x1*y2*z3) + (y1*x3*z2) + (z1*x2*y3))-((x3*y2*z1)+ (y3*z2*x1) + (z3*x2*y1));
         long d1=((t1*y2*z3) + (y1*z2*t3) + (z1*t2*y3)) - ((t3*y2*z1) + (y3*z2*t1) + (z3*t2*y1));
         long d2=((x1*t2*z3) + (t1*z2*x3) + (z1*x2*t3)) - ((x3*t2*z1) + (t3*z2*x1) + (z3*x2*t1));
         long d3=((x1*y2*t3) + (y1*t2*x3) + (t1*x2*y3)) - ((x3*y2*t1) + (y3*t2*x1) + (t3*x2*y1));
         // Determinants x y z
         System.out.println("determinant = "+d);
         System.out.println("determinant one "+d1);
         System.out.println("determinant two "+d2);
         System.out.println("determinant three "+d3);  
         long x=d1/d;   long y=d2/d; long z=d3/d;
         // Results x y z 
         System.out.println(" x =   "+d1+"/"+d+"      "+x);
         System.out.println(" y =   "+d2+"/"+d+"     "+y);
         System.out.println(" z =   "+d3+"/"+d+"       "+z);
    }catch (Exception e){
        System.out.println("System with no solution");  
        
        
    }
        
        
 }

    
}

        
        
        
        
        
        
        
    
    
    
    
    
    
    
    
    
    

