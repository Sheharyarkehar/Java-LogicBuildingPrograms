/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package university;

/**
 *

 */
public class Teachers {

    String Name;
    int teacher_ID;
    String Dpt;
    String Designation;
    int Experience;

    Teachers(String N, int tId, String dpt, String Desig, int Exp) {
        Name = N;
        teacher_ID = tId;
        Dpt = dpt;
        Designation = Desig;
        Experience = Exp;
    }

    void AboutTeachers() {
        System.out.printf("Name of Teacher:%s\n",Name);
        System.out.printf("Teacher_ID:%d\n",teacher_ID);
        System.out.printf("Name of Dpt of teacher:%s\n",Dpt);
        System.out.printf("Designation:\n%s",Designation);
        System.out.printf("Experience:\n%d",Experience);
    }

}
