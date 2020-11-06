/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inheritance;

/**
 *
 * @author Bilal
 */
public class triangle extends shapes
{ public double Altitude,Base;
    void area()
    {
        System.out.println(0.5*(Altitude*Base));
    }
    triangle()
    {
        
    }
      triangle(double Altitude,double Base)
    {
         super("white");
        this.Altitude=Altitude;
        this.Base=Base;
    }
    
    
}
