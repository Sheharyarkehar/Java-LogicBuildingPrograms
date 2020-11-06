/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practise1;
class A
{
    int i=7;
    
    A()
    {
        setI(20);
        System.out.println("i frm A is="+i);
        
    }
    void setI(int i)
    {
        this.i=2*i;
    }
}

class B extends A
{   
    B()
    {
        System.out.println("i frm B is="+i);
        
    }
    void setI(int i)
    {
        this.i=3*i;
    }
    

}
public class Practise1 {

   
    public static void main(String[] args) 
    {
       
        new B();
        
    }
    
}
