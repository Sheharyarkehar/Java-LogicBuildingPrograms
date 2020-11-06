/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ass4;

public class employee extends person {
    
    public void officename(String offf){
        System.out.println("office name "+offf);
    
    }
    
    public void salary(String salary){
        System.out.println("salary is "+salary);
    }
    
    public void hired_date(String year ,String month,String day  )
    {
    new MyDate(year, month, day);
       
    }
    
      @Override
    public void toString(String name){
    
        System.out.println("Employee name is "+name);
    }
    
    
}
