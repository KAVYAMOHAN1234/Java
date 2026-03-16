// Product class
public class Product {

    String pname, pcode;
    int price;

    // default constructor
    public Product() {}

    // parameterized constructor
    public Product(String pname, String pcode, int price) {
        this.pname = pname;
        this.pcode = pcode;
        this.price = price;
    }

    // method to get price
    public int getPrice() {
        return price;
    }

    // method to display product details
    public void display() {
        System.out.println("pcode:" + this.pcode);
        System.out.println("pname:" + this.pname);
        System.out.println("price:" + this.price + "\n");
    }
}


// main class
class Cars {

    public static void main(String[] args) {

        // creating first product
        Product p1 = new Product();
        p1.pcode = "car";
        p1.pname = "benz";
        p1.price = 1000;

        System.out.println("Displaying p1:");
        p1.display();

        // creating second product
        Product p2 = new Product("jaguar", "car426", 2500);
        System.out.println("Displaying p2");
        p2.display();

        // creating third product
        Product p3 = new Product("MARUTHI", "TYTT", 5500);
        System.out.println("Displaying p3");
        p3.display();

        // finding lowest price product
        Product p = p3.getPrice() < (p1.price < p2.price ? p1.price : p2.price)
                ? p3
                : (p1.price < p2.price ? p1 : p2);

        System.out.println("Displaying product with lowest price:");
        p.display();
    }
}