
package trycatch;

import java.util.Scanner;


public class Trycatch 
{

    public static void main(String[] args) 
    {  Scanner sc=new Scanner(System.in);
        int a=6,b=6,d=sc.nextInt(),c=0;
        try
        {
            c=a+b/d;
            
        }
        catch(Exception e)
        {
            System.out.println("division is not allowed");
        }
        
        finally
        {
            System.out.println(d);
        }
       
    }
    
}
