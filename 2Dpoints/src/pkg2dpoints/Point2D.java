/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg2dpoints;
import java.lang.Math;
public class Point2D 
{    public double x,y;
    public double distance(double x,double y)
    {
        double distance=Math.sqrt(x*x+y*y);
        return(distance);
    }

    Point2D()
    {
        
    }
     Point2D(double x,double y)
    {
        this.x=x;
        this.y=y;
    }
         public double distance()
    {   
        Point2D p=new Point2D();
     return(p.distance(x,y));
    }
    public void ToString()
     {
         System.out.printf("Point 2D [x=%s y=%s]\n",x,y);
     }
    public double getX()
     {
         return(x);
     }
     public double getY()
     {
          return(y);
     }
     
     }
    

