//Create an interface having prototypes of functions area() and perimeter(). 
//Create two classes Circle and Rectangle which implements the above interface. 
//Create a menu driven program to find area and perimeter of objects.



import java.util.Scanner;

public class SimpleShapes {

    static double circleArea(double r) {
        return 3.14 * r * r;
    }

    static double circlePerimeter(double r) {
        return 2 * 3.14 * r;
    }

    static double rectangleArea(double l, double b) {
        return l * b;
    }

    static double rectanglePerimeter(double l, double b) {
        return 2 * (l + b);
    }

    static double squareArea(double a) {
        return a * a;
    }

    static double squarePerimeter(double a) {
        return 4 * a;
    }

    static double trianglePerimeter(double a, double b, double c) {
        return a + b + c;
    }

    static double triangleArea(double a, double b, double c) {
        double s = (a + b + c) / 2;
        return Math.sqrt(s * (s - a) * (s - b) * (s - c));
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int ch;

        while (true) {
            System.out.println("\n1.Circle Area");
            System.out.println("2.Rectangle Area");
            System.out.println("3.Circle Perimeter");
            System.out.println("4.Rectangle Perimeter");
            System.out.println("5.Square Area");
            System.out.println("6.Square Perimeter");
            System.out.println("7.Triangle Area");
            System.out.println("8.Triangle Perimeter");
            System.out.println("9.Exit");

            System.out.print("Enter choice: ");
            ch = sc.nextInt();

            switch (ch) {
                case 1:
                    System.out.print("Enter radius: ");
                    double r = sc.nextDouble();
                    System.out.println("Area = " + circleArea(r));
                    break;

                case 2:
                    System.out.print("Enter length and breadth: ");
                    double l = sc.nextDouble();
                    double b = sc.nextDouble();
                    System.out.println("Area = " + rectangleArea(l, b));
                    break;

                case 3:
                    System.out.print("Enter radius: ");
                    r = sc.nextDouble();
                    System.out.println("Perimeter = " + circlePerimeter(r));
                    break;

                case 4:
                    System.out.print("Enter length and breadth: ");
                    l = sc.nextDouble();
                    b = sc.nextDouble();
                    System.out.println("Perimeter = " + rectanglePerimeter(l, b));
                    break;

                case 5:
                    System.out.print("Enter side: ");
                    double a = sc.nextDouble();
                    System.out.println("Area = " + squareArea(a));
                    break;

                case 6:
                    System.out.print("Enter side: ");
                    a = sc.nextDouble();
                    System.out.println("Perimeter = " + squarePerimeter(a));
                    break;

                case 7:
                    System.out.print("Enter 3 sides: ");
                    double x = sc.nextDouble();
                    double y = sc.nextDouble();
                    double z = sc.nextDouble();
                    System.out.println("Area = " + triangleArea(x, y, z));
                    break;

                case 8:
                    System.out.print("Enter 3 sides: ");
                    x = sc.nextDouble();
                    y = sc.nextDouble();
                    z = sc.nextDouble();
                    System.out.println("Perimeter = " + trianglePerimeter(x, y, z));
                    break;

                case 9:
                    System.out.println("Exiting...");
                    return;

                default:
                    System.out.println("Invalid choice");
            }
        }
    }
}
