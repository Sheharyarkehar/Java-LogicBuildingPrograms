/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ass4;

import java.util.Scanner;


public class input_class 
{
    public input_class()
    {
     Scanner input=new Scanner(System.in);
        faculty f=new faculty();
        System.out.println("Enter Name:");
        String name=input.next();
        f.toString(name);
        System.out.println("Enter Email Address:");
        String Email_address=input.next();
        f.EmailAddress(Email_address);
        System.out.println("Enter Address:");
        String address=input.next();
        f.address(address);
        System.out.println("Enter Office Hours:");
        String office_hours=input.next();
        f.officehours(office_hours);
        System.out.println("Enter Office Name:");
        String office_name=input.next();
        f.officename(office_name);
        System.out.println("Enter Rank:");
        String rank=input.next();
        f.rank(rank);
        System.out.println("Enter Salary:");
        String salary=input.next();
        f.salary(salary);
        System.out.println("Enter year:");
        String year=input.next();
        System.out.println("Enter month:");
        String month=input.next();
        System.out.println("Enter day:");
        String day=input.next();
        f.hired_date(year,month,day);
    }
}
    

