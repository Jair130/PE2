/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author JAIR 2021231
 */
import java.util.Scanner;
import MENUS.AdminMenu;




public class Interface  {

    

   
    
    public static void main(String[] args) {
        
        AdminMenu AM = new AdminMenu();

        System.out.println("WELCOME USER PLEASE TYPE YOUR USERNAME AND PASSWORD");

        Scanner input = new Scanner(System.in);
        String user, pass;
        

        System.out.println("ENTER YOUR USERNAME");
        user = input.nextLine();
        

        System.out.println("ENTER YOUR PASSWORD");
        pass = input.nextLine();
        
        Scanner in = new Scanner (System.in);

        int option;
 
        if (user.equals("CCT") && pass.equals("Dublin")) {
        System.out.println ("Welcome Admin Choose an option from the menu");
    System.out.println("1. Modify your profile");
    System.out.println("2. Access a list of all other users in the system");
    System.out.println("3. Remove other users from the system");
    System.out.println("4. Review the operations performed by other users");
    
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
        if (user.equals("Student") && pass.equals("Pass1234")) {
            System.out.println("OKies");
        } else {
            System.out.println("UserName or Password incorrect");
        }

    }
   

}
