package javaapplication1;

import java.util.Scanner;

class Square
    {
        public double side;
        public double CalcArea()
        {
            return side * side;
        }


    }
public class JavaApplication1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)
    {  
        Scanner sc=new Scanner(System.in);
        Square sq1 = new Square();
            sq1.side = sc.nextInt();
            System.out.println(sq1.CalcArea());
            
            Square sq2 = new Square();
            sq2.side = 6;
           System.out.println(sq2.CalcArea());

    }
    
}
