/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package university;

/**
 *
 *
 */
public class Student {
    String name;
    int seat_no;
    int year;
    String Dpt;
    int GP;
    
    Student(String N, int seat, int y, String dpt, int gp){
        name = N;
        seat_no = seat;
        year = y;
        Dpt = dpt;
        GP = gp;
    }
    
    void AboutStudent(){
        System.out.printf("Name of Student:%s\n",name);
        System.out.printf("Seat no of Student:%d\n",seat_no);
        System.out.printf("Year:%d\n",year);
        System.out.printf("Department of Student:%s\n",Dpt);
        System.out.printf("Gp of Student:%d\n",GP);
    }
    
}
