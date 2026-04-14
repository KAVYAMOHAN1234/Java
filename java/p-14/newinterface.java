//Create an interface having prototypes of functions area() and perimeter().
//Create two classes Circle and Rectangle which implements the above interface.
//Create a menu driven program to find area and perimeter of objects.

import java.util.Scanner;  // Import Scanner for input

// Interface with method declarations (no body)
interface AP {
    void area();        // method to calculate area
    void perimeter();   // method to calculate perimeter
}

// Circle class implementing AP interface
class Circle implements AP {
    double r;   // radius

    // Constructor to initialize radius
    Circle(double r) { 
        this.r = r; 
    }

    // Method to calculate area
    public void area() {
        System.out.println("Area of Circle = " + (3.14 * r * r));
    }

    // Method to calculate perimeter
    public void perimeter() {
        System.out.println("Perimeter of Circle = " + (2 * 3.14 * r));
    }
}

// Rectangle class implementing AP interface
class Rectangle implements AP {
    double l, b;   // length and breadth

    // Constructor
    Rectangle(double l, double b) { 
        this.l = l; 
        this.b = b; 
    }

    // Area calculation
    public void area() {
        System.out.println("Area of Rectangle = " + (l * b));
    }

    // Perimeter calculation
    public void perimeter() {
        System.out.println("Perimeter of Rectangle = " + (2 * (l + b)));
    }
}

// Square class (extra, not required in question)
class Square implements AP {
    double a;   // side

    Square(double a) { 
        this.a = a; 
    }

    public void area() {
        System.out.println("Area of Square = " + (a * a));
    }

    public void perimeter() {
        System.out.println("Perimeter of Square = " + (4 * a));
    }
}

// Triangle class (extra, not required in question)
class Triangle implements AP {
    double a, b, c;   // sides

    Triangle(double a, double b, double c) {
        this.a = a; 
        this.b = b; 
        this.c = c;
    }

    // Area using Heron's formula
    public void area() {
        double s = (a + b + c) / 2;   // semi-perimeter
        double area = Math.sqrt(s * (s - a) * (s - b) * (s - c));
        System.out.println("Area of Triangle = " + area);
    }

    // Perimeter
    public void perimeter() {
        System.out.println("Perimeter of Triangle = " + (a + b + c));
    }
}

// Main class
public class newinterface {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);  // Scanner object
        int ch;   // variable for choice

        // Infinite loop for menu
        while (true) {

            // Display menu
            System.out.println("\n1:Area of circle");
            System.out.println("2:Area of Rectangle");
            System.out.println("3:Perimeter of Circle");
            System.out.println("4:Perimeter of Rectangle");
            System.out.println("5:Area of Square");
            System.out.println("6:Perimeter of Square");
            System.out.println("7:Area of Triangle");
            System.out.println("8:Perimeter of Triangle");
            System.out.println("9:Exit");

            // Take user input
            System.out.print("Enter your choice: ");
            ch = sc.nextInt();

            // Switch case for menu operations
            switch (ch) {

                case 1:
                    System.out.print("Enter radius: ");
                    Circle c = new Circle(sc.nextDouble()); // create object
                    c.area();  // call area method
                    break;

                case 2:
                    System.out.print("Enter length & breadth: ");
                    Rectangle r = new Rectangle(sc.nextDouble(), sc.nextDouble());
                    r.area();
                    break;

                case 3:
                    System.out.print("Enter radius: ");
                    c = new Circle(sc.nextDouble());
                    c.perimeter();  // call perimeter
                    break;

                case 4:
                    System.out.print("Enter length & breadth: ");
                    r = new Rectangle(sc.nextDouble(), sc.nextDouble());
                    r.perimeter();
                    break;

                case 5:
                    System.out.print("Enter side: ");
                    Square sq = new Square(sc.nextDouble());
                    sq.area();
                    break;

                case 6:
                    System.out.print("Enter side: ");
                    sq = new Square(sc.nextDouble());
                    sq.perimeter();
                    break;

                case 7:
                    System.out.print("Enter 3 sides: ");
                    Triangle t = new Triangle(sc.nextDouble(), sc.nextDouble(), sc.nextDouble());
                    t.area();
                    break;

                case 8:
                    System.out.print("Enter 3 sides: ");
                    t = new Triangle(sc.nextDouble(), sc.nextDouble(), sc.nextDouble());
                    t.perimeter();
                    break;

                case 9:
                    System.out.println("Exiting...");
                    return;   // exit program

                default:
                    System.out.println("Invalid choice");  // wrong input
            }
        }
    }
}
