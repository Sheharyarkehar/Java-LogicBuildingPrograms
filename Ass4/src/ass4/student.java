/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ass4;

/**
 *
 * @author Bilal
 */
public class student extends person{
    
    
    public void status(String status){
    
        System.out.println("status" +status);
    
    }
    
    @Override
    public void toString(String name){
    
        System.out.println("student name is "+name);
    }
}