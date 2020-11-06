/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package university;

import java.util.Scanner;

/**
 *
 */
public class Faculty {

    Department[] drr;
     //Faculty[] frr;
    //Student[] srr;
    //Teachers[] trr;
   // Uni []urr;
    //fu[]f;
  int No_of_students;
  static int sumofNos=0;
    Faculty(String Fn, int n) {
        Scanner sc = new Scanner(System.in);
          drr = new Department[n];
         // f=new fu[n];
        for (int i = 0; i < drr.length; i++) {
             System.out.printf("Faculty Name :%s\n",Fn);
            System.out.print("Enter Dpt Name: ");
            String name = sc.next();

            System.out.print("Enter no of Students:");
             No_of_students = sc.nextInt();
             sumofNos+=No_of_students;
            System.out.println("Courses");
            String Courses = sc.next();
            System.out.println("Enter no of teachers:");
            int no_of_teacher = sc.nextInt();
            drr[i] = new Department(name, No_of_students, Courses, no_of_teacher);
            drr[i].AboutDepartment();
            
        }
        



    }
    Faculty(){
    }       


}
