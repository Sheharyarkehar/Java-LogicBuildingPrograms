/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package library.info;

public class Customer 
{
    String Id;
    String Name;
    String Address;
    String Contact_no;
    static int day;
    Customer()
    {
        
    }
    Customer(String Id,String name,String Address,String Contact_no,int day)
    { this.Id=Id;
      this.Name=name;
      this.Address=Address;
      this.Contact_no=Contact_no;
      this.day=day;
        
    }
    void PrintInfo()
    {
        System.out.println("Customer ID: "+Id);
        System.out.println(" Customer Name: "+Name);
        System.out.println("Customer Address: "+Address);
        System.out.println("Customer Contact no: "+Contact_no);
         System.out.println("Day : "+day);
        
    }
}
