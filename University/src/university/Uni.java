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
public class Uni {

    String Name;
    String Location;
    Faculty[] frr;
    Student[] srr;
    Teachers[] trr;
    Scanner sc = new Scanner(System.in);
    Uni(int no_of_uni,String N, String Loc, int f, int s, int t) {
        Name = N;
        Location = Loc;

        System.out.printf("Name of University:%s\n",N);
        System.out.printf("Address of University:%s\n",Loc);
        frr = new Faculty[f];
        for (int i = 0; i < frr.length; i++) {
            System.out.print("Enter Faculty  Name: ");
            String name = sc.next();

            System.out.print("Enter no Dpt in each faculty: ");
            int no_of_dpt = sc.nextInt();

            frr[i] = new Faculty(name, no_of_dpt);
//            frr[i].AboutFaculty();
        }
       
        srr = new Student[s];
        for (int j = 0; j < srr.length; j++) {
            System.out.print("Enter  Student Name: ");
            String name = sc.next();

            System.out.print("Enter Seat No: ");
            int seat = sc.nextInt();

            System.out.print("Enter year");
            int year = sc.nextInt();

            System.out.print("Enter dpt");
            String dpt = sc.next();

            System.out.print("Enter GP");
            int GP = sc.nextInt();

            srr[j] = new Student(name, seat, year, dpt, GP);
            srr[j].AboutStudent();
        }

        trr = new Teachers[t];
        for (int k = 0; k < trr.length; k++) {
            System.out.print("Enter Teacher Name: ");
            String Name = sc.next();
            
            System.out.print("Enter Teacher_Id: ");
            int teacher_ID = sc.nextInt();
            
            System.out.print("Enter Teacher Dpt: ");
            String Dpt = sc.next();
            
            System.out.println("Enter Teacher's Designation:");
            String Designation = sc.next();
            
            System.out.println("Enter Experience: ");
            int Experience = sc.nextInt();

            trr[k] = new Teachers(Name, teacher_ID, Dpt, Designation, Experience);
            trr[k].AboutTeachers();
           
        }
    }
   
}