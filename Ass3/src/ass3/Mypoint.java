/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ass3;

/**
 *
 * @author Bilal
 */
public class Mypoint 
{
   public double x1,x2,y1,y2;
   public double x,y;
public Mypoint(int x,int y)

{
x2=x;
y2=y;

}
public Mypoint()

{
x1=0;
y1=0;
}

public double  Getx(double x)
{
return(x=x2-x1); 

}

public double Gety(double y)
{

return (y=y2-y1);

}
public double Distance()
{
      double distance = Math.sqrt((x*x)+(y*y)); 
      return distance;
}
}