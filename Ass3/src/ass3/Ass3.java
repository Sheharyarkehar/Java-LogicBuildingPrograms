/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ass3;

import java.util.Scanner;

/**
 *
 * @author Bilal
 */
public class Ass3 {

    
    public static void main(String[] args) 
    {  
        Scanner cordinate=new Scanner(System.in);
       System.out.println("Enter x-cordinate");
       double x=cordinate.nextDouble();
       System.out.println("Enter y-cordinate");
       double y=cordinate.nextDouble();
       System.out.println("Enter z-cordinate");
       double z=cordinate.nextDouble();
       
       ThreeDPoint p3d=new ThreeDPoint(x,y,z);
        p3d.Getx(x);
        p3d.Gety(y);
        p3d.Getz(z);
        System.out.println("The Distance between three points x,y,z is "+p3d.Distance());
        
       
    }
    
}
