/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package polymorphism;

/**
 *
 * @author Bilal
 */
public class Polymorphism 
{


    public static void main(String[] args)
    {
        A obj1=new E();  
        A obj2=new D();
        A obj3=new C();   
        D obj4=new E();
        D obj5=new D();
        obj1.function2();
         obj2.function2();
          obj3.function2();
         obj4.function2();
            obj5.function2();
        
    }
    
}
