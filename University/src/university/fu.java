/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package university;

import java.util.Scanner;

/**
 *
 * @author Bilal
 */
public class fu {
    Faculty[] frr;
   // Student[] srr;
   // Teachers[] trr;
    Uni []urr;
   // fu[]f;
    int s;
    int fac_of_university;
    int std_of_university;
    int t_of_university;
            fu(){          
            Scanner sc=new Scanner(System.in);
   
   System.out.println("Enter No OF Universities:");
      int no_of_university=sc.nextInt();
         urr=new Uni[no_of_university];
  for(int i=0;i<urr.length;i++)
      
  {   
      System.out.println("Enter Name OF Universiy:");
      String name_of_university=sc.next();
       System.out.println("Enter Location OF University:");
      String loc_of_university=sc.next();
           System.out.println("Enter No OF Faculties:");
      fac_of_university=sc.nextInt();
           System.out.println("Enter No OF Students In University:");
       std_of_university=sc.nextInt();
      System.out.println("Enter No OF Teachers In University");
       t_of_university=sc.nextInt();
      urr[i]=new Uni(no_of_university,name_of_university,loc_of_university,fac_of_university, std_of_university,t_of_university);
       s=std_of_university;
            aboutuni(i);
//       frr[i]=new Faculty();
         // System.out.println((urr[i].frr[i].drr[i].No_of_students)+ "   ajksdhasjkdsa ");
          
   

            }
  }  
             
      
void aboutuni(int i){

      if(Faculty.sumofNos == s)
      {
      

            System.out.println(" \nSuccess!,Your entries are correct\n ");  
  }
        else
      {                          
          System.out.println(" These Students are not valid please enter the correct no students in university ");
      }

}
    
         
}

    

