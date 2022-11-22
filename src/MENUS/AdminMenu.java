/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package MENUS;

import java.util.Scanner;
import java.io.IOException;

/**
 *
 * @author JAIR 2021231
 */
public class AdminMenu {
   
    static Scanner scanner = new Scanner (System.in);
    
     
    
  public static void main(String[] args) throws IOException {
        
  
  }
    public void Modify (){
        System.out.println("1. Modify your profile");
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




