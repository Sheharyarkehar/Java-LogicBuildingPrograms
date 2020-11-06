/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package library.info;

import java.util.Scanner;

/**
 *
 * @author Mudasir Nawaz
 */
public class LibraryInfo 
{ static int nob;

    public static void main(String[] args) 
    {
        Scanner input= new Scanner(System.in);
        System.out.println("Enter No Customers:");
        int noc=input.nextInt();
        System.out.println("Enter Quantity of Books:");
        nob=input.nextInt();
        Library l=new Library(noc,nob);
        if(nob>0)
        {
        l.Fine();
        }
        else
        {
            System.out.println("No book is borrowed");
        }
    }
    
}
