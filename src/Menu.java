/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author jairp
 */
import java.util.Scanner;

public class Menu {

    public static void main(String[] args) {

        System.out.println("WELCOME USER PLEASE TYPE YOUR USERNAME AND PASSWORD");

        Scanner input = new Scanner(System.in);
        String user, pass;
        

        System.out.println("ENTER YOUR USERNAME");
        user = input.nextLine();
        

        System.out.println("ENTER YOUR PASSWORD");
        pass = input.nextLine();
        
        

        
        

        if (user.equals("CCT") && pass.equals("Dublin")) {
            System.out.println(AdminMenu);
        }
        if (user.equals("Student") && pass.equals("Pass1234")) {
            System.out.println("OKies");
        } else {
            System.out.println("UserName or Password incorrect");
        }

    }

}
