/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package method.overloading;

public class MethodOverloading {

    public static void main(String[] args) 
    {
         square s1=new square(2);
         System.out.println(square.no_of_obj);
         square s2=new square(3);
          System.out.println(square.no_of_obj);
      System.out.println(s1.CalcArea(0));
        System.out.println(s1.CalcArea());
        System.out.println(s2.CalcArea(0));
         square s3=new square(3);
         System.out.println(square.no_of_obj);
          
    }
       
    }
