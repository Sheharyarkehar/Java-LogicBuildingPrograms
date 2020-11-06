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
public class circle  extends shapes
{   public double radius;
      void area()
    {
        System.out.println(3.141*radius*radius);
    }
      circle()
      {
          
      }
      circle(double radius)
      {
           super(true,"orange");
          this.radius=radius;
          
      }
    
}
