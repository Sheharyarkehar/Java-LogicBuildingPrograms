/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sufi;
import java.lang.Math;
public class RegularPolygon 
{
    
    
    private int n;
    private double side;
    private double x;
    private double y;
    
    RegularPolygon ()
    {
        n=3;
        side=1;
        x=0;
        y=0;   
    }
    
    RegularPolygon(int n,double side)
    {
        x=0;
        y=0;
        this.n=n;
        this.side=side;
    }
    
    RegularPolygon (int n,double side,double x,double y)
    {
        this.n=n;
        this.side=side;
        this.x=x;
        this.y=y;
    }
    void setN(int n)
    {
        this.n=n;
    }
    int getN()
    {
       return n;
    }
    
    void setSide(int side)
    {
        this.side=side;
    }
    double getSide()
    {
       return side;
    }
    
    void setX(int x)
    {
        this.x=x;
    }
    double getX()
    {
       return x;
    }
    
    void setY(int y)
    {
        this.y=y;
    }
    double getY()
    {
       return y;
    }
    
    double getPerimeter()
    {
        return side*n;
    }
    double getArea()
    {
        double area = n*side*side;
        area=area/4;
        area=area/java.lang.Math.tan((3.142)/n);
        return area;
    }
}

