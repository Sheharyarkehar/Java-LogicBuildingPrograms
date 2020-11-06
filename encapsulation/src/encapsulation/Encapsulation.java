/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package encapsulation;
    class Sq
{
         public string ID { get; set; }  
        public string Name { get; set; }  
        public string Email { get; set; } 
        
  private double side;

    
   public double calcArea()
    {    
        return side*side;
        
    }
     Sq()
     {
       
     }
double get()
{
    return this.side;
}
void set(double s)
{
    this.side=s;
}
    

public class Encapsulation {

    public static void main(String[] args) 
    {
       
        Sq s1=new Sq();
        s1.set(5.5);
        System.out.println(s1.get());
        s1.
        
    }
    

}
