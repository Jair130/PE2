


/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */

/**
 *
 * @author jairp
 */

import java.util.Scanner;
import MENUS.AdminMenu;
import MENUS.StudentMenu;
import java.sql.SQLException;
import MENUS.connection;
import java.util.ArrayList;



public interface INT {
  
    /**
     *
     * @param args
     * @throws SQLException
     * @throws java.lang.ClassNotFoundException
     * @throws java.lang.InstantiationException
     * @throws java.lang.IllegalAccessException
     */
    public static void main(String[] args) throws SQLException, ClassNotFoundException, InstantiationException, IllegalAccessException {
        
        AdminMenu AM = new AdminMenu();
        StudentMenu SM = new StudentMenu();
        Scanner in = new Scanner (System.in);
        int option = 0;
        
       
    do{
        System.out.println("WELCOME USER PLEASE TYPE YOUR USERNAME AND PASSWORD");

        Scanner input = new Scanner(System.in);
        String user, pass;
        

        System.out.println("ENTER YOUR USERNAME");
        user = input.nextLine();
        
        

        System.out.println("ENTER YOUR PASSWORD");
        pass = input.nextLine();
        
        
 
        if (user.equals("CCT") && pass.equals("Dublin")) {
        System.out.println ("Welcome Admin Choose an option from the menu");
    System.out.println("1. Modify your profile");
    System.out.println("2. Access a list of all other users in the system");
    System.out.println("3. Remove other users from the system");
    System.out.println("4. Review the operations performed by other users");
    System.out.println("5. Exit");
    
   option = in.nextInt();
     
    switch (option){
        case 1:
           AM.Modify();
         break;
        case 2:
          AM.Access();
          break;
        case 3:
            AM.Remove();
          break;
        case 4:
            AM.Review();
         break;
        case 5:
            System.exit(0);
        default:
            System.out.println ("PLEASE TYPE A VALID OPTION");
    }     
    }
           
       else if (user.equals("Student") && pass.equals("Pass1234")) {
            System.out.println("Welcome User Choose an option from the menu");
            System.out.println("1. Modify your profile");
            System.out.println("2. Solve system of equations of two variables");
            System.out.println("3. Solve system of equations of three variables");
            System.out.println("4. Save and see solutions");
            System.out.println("5. Exit");
        
    option = in.nextInt();
     
    switch (option){
        case 1:
           SM.Modify();
         break;
        case 2:
          SM.Equations1();
          break;
        case 3:
            SM.Equations2();
          break;
        case 4:

            SM.Save();
            
         break;
        case 5:
            System.exit(0);
        default:
            System.out.println ("PLEASE TYPE A VALID OPTION");
        
    }
    }else  {
            System.out.println("UserName or Password incorrect");
        }
        

    
    }while (option !=5);         
    
        
        
        }
}

    


       

