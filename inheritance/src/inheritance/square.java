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
public class square  extends shapes
{
    public double side;
    void area()
    {
        System.out.println(side*side);
    }
    square()
    {
       
    }
      square(double side)
    {
        super();
       this.side=side;
    }
    
}
