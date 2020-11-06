/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package wrappper;

import java.util.Scanner;

/**
 *
 * @author Bilal
 */

 class QuotientWithException {
  public static int quotient(int number1, int number2) {
  if (number2 == 0)
 throw new ArithmeticException("Divisor cannot be zero");
 
  return number1 / number2;
  
  }
 }
public abstract class Wrappper  {

    /**
     * @param args the command line arguments
     */


    public static void main(String[] args) 
    {
try {
method();
 }
catch (ArithmeticException ex) {
 System.out.println("ArithmeticException");
 }
catch (RuntimeException ex) {
 System.out.println("RuntimeException");
 }
catch (Exception ex) {
 System.out.println("Exception");

    }
    }
static void method() throws Exception {
 System.out.println(1 / 0);
 }

    
}
    

