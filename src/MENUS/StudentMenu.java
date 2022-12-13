package MENUS;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */




import java.util.Scanner;




/**
 *
 * @author JAIR 2021231
 */
public class StudentMenu {
    
    
    
    public static void main(String[] args)  {
      
        
        
        
        
    }
    
    public void Modify(){
        
        
        
        
    }
    
    
    public void Save(){
        
        
        
        
        
        
    }
   
    public void Equations1(){
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
        
    }
        
      public void Equations2()  {
            Scanner read =new Scanner (System.in);
            //variables 
       int x1,x2,x3,y1,y2,y3,z1,z2,z3,t1,t2,t3;
        System.out.println("ingrese todos los nuumero.....");
        
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
         System.out.println("determinant is = "+d);
         System.out.println("determinant one "+d1);
         System.out.println("determinant two "+d2);
         System.out.println("determinant three "+d3);  
         long x=d1/d;   long y=d2/d; long z=d3/d;
         // Results x y z 
         System.out.println(" x =   "+d1+"/"+d+"      "+x);
         System.out.println(" y =   "+d2+"/"+d+"     "+y);
         System.out.println(" z =   "+d3+"/"+d+"       "+z);
    }  
        
        
        
        
        
        
        
}

        
        
        
        
        
        
        
    
    
    
    
    
    
    
    
    
    

