/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg2darray;

import java.util.Scanner;

/**
 *
 * @author Bilal
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {   Scanner sc=new Scanner(System.in);
   System.out.println("Enter rows");
    int row=sc.nextInt();
    System.out.println("Enter cols");
    int col=sc.nextInt();
   int maxValue=0;
int  twodArray[][]=new int[row][col];
                             
     for (int i = 0; i < twodArray.length; i++) 
     {
    for (int j = 0; j < twodArray.length; j++)
    {
       twodArray[i][j]=sc.nextInt();  
      
    }
     }
    for (int i = 0; i < twodArray.length; i++) 
     {
    for (int j = 0; j < twodArray.length; j++)
    {
       if (twodArray[i][j] > maxValue)
        { 
            maxValue = twodArray[i][j];
        }
      
}
     }
      System.out.println("great"+maxValue);
                       
                 

        
    }
}
    

