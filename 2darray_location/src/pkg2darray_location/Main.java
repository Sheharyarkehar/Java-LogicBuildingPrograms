/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg2darray_location;

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
    {   
       int i;
       int j;
         Scanner sc=new Scanner(System.in);
         System.out.println("Enter no of rows");
        location.no_of_rows=sc.nextInt();
        System.out.println("Enter no of cols");
         location.no_of_cols=sc.nextInt();
        double [][]a=new double[location.no_of_rows][location.no_of_cols];
   
     for ( i=0; i < a.length; i++) 
     {
    for (  j=0; j <a.length; j++)
    {   System.out.println("Enter value");
       a[i][j]=sc.nextDouble();  
      
    }
     }
         location.locatelargest(a);
    }
}
