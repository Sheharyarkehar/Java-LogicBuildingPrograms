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
public class rectangle  extends shapes
{
    public double length,breadth;
      void area()
    {
        System.out.println(length*breadth);
    }
      rectangle()
      {
          
      }
       rectangle( double length,double breadth)
      {
          super(true);
          this.length=length;
          this.breadth=breadth;
      }
    
}
