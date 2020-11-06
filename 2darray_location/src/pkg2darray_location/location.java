/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg2darray_location;

import java.util.Scanner;

public class location 
{
   public static int no_of_rows;
    public static int no_of_cols;
    public static double maxValue=0;
 
 
public static double locatelargest (double [][]a)
    {     

 int c=0,r=0;
  
     
    for (  int i=0; i < a.length; i++) 
     {
    for ( int j=0 ; j <a.length; j++)
    {
       if (a[i][j] > maxValue)
        { 
            maxValue = a[i][j];
            c=i;
            r=j;
             
        }
      
      
}
      
          }
     System.out.printf("The location of element %.1f is at (%d,%d)",maxValue,c,r);
  

    
   return maxValue;
    }
  
}

