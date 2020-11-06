
package pkgpublic;
class Sq
{
  private double side;

     public double calcArea()
    {    
        return side*side;
        
    }
     Sq(double s)
     {
         this.side=s;
     }
       
     }


public class Public 
{

   
    public static void main(String[] args) 
    {
       Sq s1=new Sq(5.3);
       
       
        System.out.println(s1.calcArea());
        
//       System.out.println(s1.calcArea());
       
        
    }
    
}
