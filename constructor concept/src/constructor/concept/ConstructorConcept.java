/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package constructor.concept;

public class ConstructorConcept 
{

    
    public static void main(String[] args) 
    {
       square s1=new square(2);
       square s2=new square(4.5);
      System.out.println(s1.CalcArea());
        System.out.println(s2.CalcArea());
    }
    
}
