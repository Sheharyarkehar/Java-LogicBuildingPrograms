/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package library.info;
 class Books 
 
{
     String Author;
     String Title;
     String Edition;
     String Language;
     static int price;
     Books()
     {
         
     }
     Books(String Author,String Title,String Edition,String Language,int price)
     {
         this.Author=Author;
         this.Title=Title;
         this.Edition=Edition;
         this.Language=Language;
         this.price=price;
         
     }
     void PrintInfo()
     {
          System.out.println("Author: "+Author);
        System.out.println("Title: "+Title);
        System.out.println("Edition: "+Edition);
        System.out.println("Language: "+Language);
        System.out.println("Price: "+price);
        
     }
      
    
}
