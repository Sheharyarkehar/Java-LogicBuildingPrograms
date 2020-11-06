/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package library.info;

import java.util.Scanner;

public class Library
{
  Customer []c;
  Books []b;
  int fine;
 int inputer;
//  int price;
//  static int day;
 Library(int lengthC,int lengthb)
 {  String ID;
 String name;
 String address;
 String Contact;
  String Author;
     String Title;
     String Edition;
     String Language;
     Scanner input=new Scanner(System.in);
     c=new Customer[lengthC];
     for(int i=0;i<c.length;i++)
     {   System.out.println("Enter Customer ID:");
         ID=input.nextLine();
          System.out.println("Enter Customer Name:");
         name=input.nextLine();
          System.out.println("Enter Customer Address:");
         address=input.nextLine();
          System.out.println("Enter Contact ID:");
         Contact=input.nextLine();
          System.out.println("Enter Day:");
        int day=input.nextInt();
          inputer=LibraryInfo.nob;
         c[i]=new Customer(ID,name,address,Contact,day);
         c[i].PrintInfo();
       
     }
     b=new Books[lengthC];
     if(LibraryInfo.nob>=1)
     {
     for(int j=0;j<b.length;j++)
   
     {
          System.out.println("Enter Author:");
        Author=input.next();
         System.out.println("Enter Title :");
     Title=input.next();
      System.out.println("Enter Edition :");
      Edition=input.next();
       System.out.println("Enter Language :");
     Language=input.next();
  System.out.println("Enter Price :");
  int price=input.nextInt();
        b[j]=new Books(Author,Title,Edition,Language,price);
        b[j].PrintInfo();
     }
     }
         
     
     
//     this.price=price;
//     this.day=day;
 }
  
  void Fine()
  { int days;
//  Books b=new Books();
   if(LibraryInfo.nob>=1)
   {
      for(int i=1;i<=7;i++)
      {   
           days=i;
           System.out.println("Day="+days);
           if(days>=7)
           {
               for(int j=1;j<=30;j++)
               {       j=Customer.day;
                    if((Customer.day==1)&&(Books.price<1000))
                            { 
                                if(LibraryInfo.nob==2)
                            {
                               fine=50;
                               for(int k=1;k<=LibraryInfo.nob;k++)
                               {
                                System.out.println("Fine is : "+fine);
                                 
                               }
                               break;
                               
                            }else
                                {
                                    fine=50;
                                System.out.println("Fine is : "+fine);
                                
                                }
                                
                            }
                    else if((Customer.day==2)&&((Books.price>=1000)&&(Books.price<2500)))
                            {
                               fine=100;
                                System.out.println("Fine is : "+fine);
                                break;
                            }
                     else if((Customer.day==3)&&((Books.price>=2500)&&(Books.price<5000)))
                            {
                               fine=150;
                                System.out.println("Fine is : "+fine);
                                break;
                            }
                     else if((Customer.day==4)&&(Books.price<=5000))
                            {
                               fine=500;
                                System.out.println("Fine is : "+fine);
                                break;
                            }
                     else if((Customer.day==15)&&(Books.price>=1000))
                     {
                          System.out.println("You are suspended membership is cancelled :");
                     }
                     else if((Customer.day==30)&&(Books.price>=2500))
                     {
                          System.out.println("You are suspended membership is cancelled :");
                     }
                      else if((Customer.day>30)&&(Books.price>=5000))
                     {
                          System.out.println("You are suspended membership is cancelled :");
                     }
                    
                    
                   
                   
                   
                   
                   
               }
               }
           }
          
      }
  }
}