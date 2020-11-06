/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package java_prc1;

import java.util.Scanner;

/**
 *
 * @author Bilal
 */
public class Java_prc1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
       Scanner sc=new Scanner(System.in);
       int a,b,c,d,sum,first_fraction,Second_fraction;
       a=sc.nextInt();
       b=sc.nextInt();
       c=sc.nextInt();
       d=sc.nextInt();
       first_fraction=a/b;
       Second_fraction=c/d;
       sum=(a*d)+(b*c);
       System.out.printf("Enter First Fraction:%d/%d\n",a,b);
      System.out.printf("Enter Second Fraction:%d/%d\n",c,d);
     System.out.printf("sum:%d/%d",sum,d*c);
     int ans=2;
     ans*=10;
      System.out.printf("\n%d\n",ans);
      ans-=1;
       System.out.printf("%d",ans);
     
    }
    
}
