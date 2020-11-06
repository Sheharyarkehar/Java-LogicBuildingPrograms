/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ass3;

public class ThreeDPoint extends Mypoint
{
   public  double x1,x2,z1,y1,y2,z2,z;
    public ThreeDPoint (double x,double y,double z){
    
    super.x2=x;
    
    super.y2=y;
    
   this.z2 =z;
    }
      public ThreeDPoint(){
    
    super.x1=0;
    super.y1=0;
    z1=0;
    }
    public double Getz(double z)
{
    this.z=z;
    return (z=z1-z2);

}
    @Override
 public double Distance()
{
        x=super.Getx(x);
        y=super.Gety(y);
      double distance = Math.sqrt((x*x)+(y*y)+(z*z)); 
      return distance;
}   
    
}
