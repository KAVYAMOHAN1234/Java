import java.util.Scanner;

// Interface
interface AP {
    void area();
    void perimeter();
}

// Circle
class Circle implements AP {
    double r;
    Circle(double r) { this.r = r; }

    public void area() {
        System.out.println("Area of Circle = " + (3.14 * r * r));
    }

    public void perimeter() {
        System.out.println("Perimeter of Circle = " + (2 * 3.14 * r));
    }
}

// Rectangle
class Rectangle implements AP {
    double l, b;
    Rectangle(double l, double b) { this.l = l; this.b = b; }

    public void area() {
        System.out.println("Area of Rectangle = " + (l * b));
    }

    public void perimeter() {
        System.out.println("Perimeter of Rectangle = " + (2 * (l + b)));
    }
}

// Square
class Square implements AP {
    double a;
    Square(double a) { this.a = a; }

    public void area() {
        System.out.println("Area of Square = " + (a * a));
    }

    public void perimeter() {
        System.out.println("Perimeter of Square = " + (4 * a));
    }
}

// Triangle
class Triangle implements AP {
    double a, b, c;
    Triangle(double a, double b, double c) {
        this.a = a; this.b = b; this.c = c;
    }

    public void area() {
        double s = (a + b + c) / 2;
        double area = Math.sqrt(s * (s - a) * (s - b) * (s - c));
        System.out.println("Area of Triangle = " + area);
    }

    public void perimeter() {
        System.out.println("Perimeter of Triangle = " + (a + b + c));
    }
}

// Main class
public class newinterface {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int ch;

        while (true) {

            // YOUR REQUIRED MENU FORMAT ✅
            System.out.println("\n1:Area of circle");
            System.out.println("2:Area of Rectangle");
            System.out.println("3:Perimeter of Circle");
            System.out.println("4:Perimeter of Rectangle");
            System.out.println("5:Area of Square");
            System.out.println("6:Perimeter of Square");
            System.out.println("7:Area of Triangle");
            System.out.println("8:Perimeter of Triangle");
            System.out.println("9:Exit");

            System.out.print("Enter your choice: ");
            ch = sc.nextInt();

            switch (ch) {
                case 1:
                    System.out.print("Enter radius: ");
                    Circle c = new Circle(sc.nextDouble());
                    c.area();
                    break;

                case 2:
                    System.out.print("Enter length & breadth: ");
                    Rectangle r = new Rectangle(sc.nextDouble(), sc.nextDouble());
                    r.area();
                    break;

                case 3:
                    System.out.print("Enter radius: ");
                    c = new Circle(sc.nextDouble());
                    c.perimeter();
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
                    return;

                default:
                    System.out.println("Invalid choice");
            }
        }
    }
}