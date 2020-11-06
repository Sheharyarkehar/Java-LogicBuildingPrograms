
package pkg3classes;
import java.util.Scanner;

class Square
    {
        public double side;
        public double CalcArea()
        {
            return side * side;
        }
        public double CalcPerimeter()
        {
            return 4 * side;
        }
    }
    class Triangle
    {
        public double side1, side2, side3, Base, height;
        public double CalcArea()
        {
            return Base * height / 2;
        }
        public double CalcPerimeter()
        {
            return side1 + side2 + side3;
        }

    }
    class Rectangle
    {
        public double length, width;
        public double CalcArea()
        {
            return length * width;
        }
        public double CalcPerimeter()
        {
            return 2 * (length + width);
        }

    }

public class Main {

 
    public static void main(String[] args) 
    {  Scanner sc=new Scanner(System.in);
       System.out.println("Enter a Option 1 for Square 2 for triangle and 3 for rectangle");

    int option=sc.nextInt();
         if (option == 1)
            {
        Square sq1 = new Square();
            sq1.side = 5;
            System.out.println("Area of Square");
               System.out.println(sq1.CalcArea());
            Square peri = new Square();
            peri.side = 4;
              System.out.println("Perimeter of Square");
             System.out.println(peri.CalcPerimeter());
            }
          if(option == 2)
          {
            Triangle tri1 = new Triangle();
            tri1.Base = 5;
            tri1.height = 4;
              System.out.println("Area of Triangle");
           System.out.println(tri1.CalcArea());
            Triangle perit = new Triangle();
            perit.side1 = 5;
            perit.side2 = 6;
           perit.side3 = 7;
            System.out.println("Perimeter of Triangle");
           System.out.println(perit.CalcPerimeter());
    }
           if (option == 3){
           Rectangle rec1 = new Rectangle();
           rec1.length = 7;
           rec1.width = 8;
         System.out.println("Area of Rectangle");
         System.out.println(rec1.CalcArea());
           Rectangle peric = new Rectangle();
           peric.length = 5;
           peric.width = 8;
         System.out.println("Perimeter of Rectangle");
            System.out.println(peric.CalcPerimeter());
           }

        
    }
    
}
