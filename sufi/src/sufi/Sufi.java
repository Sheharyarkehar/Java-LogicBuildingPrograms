/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sufi;

import java.util.Scanner;

/**
 *
 * @author Bilal
 */
public class Sufi {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {Scanner input = new Scanner(System.in);
        RegularPolygon obj1 = new RegularPolygon();
        System.out.println("The perimeter of the 1st polygon is: "+obj1.getPerimeter());
        System.out.println("The area of the 1st polygon is: "+obj1.getArea());
        
        RegularPolygon obj2 = new RegularPolygon(4,5);
        System.out.println("The perimeter of the 2nd polygon is: "+obj2.getPerimeter());
        System.out.println("The area of the 2nd polygon is: "+obj2.getArea());
        
        RegularPolygon obj3 = new RegularPolygon(4,5,6,7);
        System.out.println("The perimeter of the 3rd polygon is: "+obj3.getPerimeter());
        System.out.println("The area of the 3rd polygon is: "+obj3.getArea());
        
        RegularPolygon obj4 = new RegularPolygon();
        System.out.println("Enter the number of sides of 4th Polygon: ");
        obj4.getN();
        System.out.println("Enter the length of sides of 4th Polygon: ");
        obj4.getSide();
        System.out.println("Enter the x-cordinate of sides of 4th Polygon: ");
        obj4.getX();
        System.out.println("Enter the y-cordinate of sides of 4th Polygon: ");
        obj4.getY();
        
        System.out.println("The perimeter of the 4th polygon is: "+obj4.getPerimeter());
        System.out.println("The area of the 2nd polygon is: "+obj4.getArea());
        
        
    }
    
}
