/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inheritance;
public class shapes 
{
    
   public boolean isfill;
   public String color;
    void changeColor()
    {
        System.out.println(color);
    }
     void isfilled()
    {
        
         System.out.println(isfill);
    }
     shapes()
     {
         
     }
      shapes(boolean isfill,String color)
     {
         this.isfill=isfill;
          this.color=color;
         
         
     }
            shapes(boolean isfill)
     {
         this.isfill=isfill;
          
         
     }
          shapes(String color)
     {
         this.color=color;
          
         
     }
}
