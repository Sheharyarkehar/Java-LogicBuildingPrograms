/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package static_public_private;
//static example
class Sq
{
   static double side;
     static double calcArea()
    {    
        return side*side;
        
    }
     
     }
    
    
    
   

public class Static_public_private 
{

  
    public static void main(String[] args) 
    {
       Sq.side=6;
       System.out.println(Sq.calcArea());
    }
    
}
