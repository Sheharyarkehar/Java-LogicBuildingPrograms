/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg2dpoints;

import java.util.Scanner;

/**
 *
 * @author Bilal
 */
public class Main {

    
    public static void main(String[] args) 
    {
              Scanner input = new Scanner(System.in);
 System.out.print("Enter point1's x-, y-coordinates: ");
double x1 = input.nextDouble();
 double y1 = input.nextDouble();
 System.out.print("Enter point2's x-, y-coordinates: ");
 double x2 = input.nextDouble();
 double y2 = input.nextDouble();
        Point2D p1=new Point2D(x1,y1);
        Point2D p2=new Point2D(x2,y2);
        
     System.out.print("The p1 is ");  
     p1.ToString();
      System.out.print("The p2 is ");  
 p2.ToString();
 System.out.println("The distance between p1 and p2 is "+p1.distance(x2, y2));
        
    }
    
}
