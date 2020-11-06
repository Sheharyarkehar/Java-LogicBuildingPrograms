/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package method.overloading;

public class square
{ 
   public static int no_of_obj=0;
    public double side;
    square(int m)
    {
        side=m;
        no_of_obj++;
    }
    double CalcArea()
    {
      return side*side;   
        
    }
    double CalcArea(double s)
    {
        return side;
    }
    }
    

