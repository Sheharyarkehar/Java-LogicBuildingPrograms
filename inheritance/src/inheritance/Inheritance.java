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
public class Inheritance {

 
    public static void main(String[] args) 
    {
        square sq=new square(3.2);
       triangle tri=new triangle(2.2,2.6);
        rectangle rec=new rectangle(3.1,3.9);
        circle cir=new circle(2.2);
        sq.area();
        tri.area();
        rec.area();
       cir.area();
        sq.isfilled();
        sq.changeColor();
         tri.isfilled();
        tri.changeColor();
         rec.isfilled();
        rec.changeColor();
         cir.isfilled();
        cir.changeColor();
        
    }
        
    
}
