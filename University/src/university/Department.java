/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package university;

/**
 *

 */
public class Department {
    String name;
     int No_of_students;
    String Courses;
    int no_of_teacher;
    
    Department(String N, int nos, String Crs, int not){
        name = N;
        No_of_students = nos;
        Courses = Crs;
        no_of_teacher = not;
    }
    
    public void AboutDepartment(){
        System.out.printf("Department Name:%s\n",name);
        System.out.printf("No of Students:%d\n",No_of_students);
        System.out.printf("No of Courses:%s\n",Courses);
        System.out.printf("No of Teachers in each depart:%d\n",no_of_teacher);
        
    }
}
