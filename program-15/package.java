import java.util.ArrayList;
import java.util.Scanner;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

class Product {
    int id;
    String name;
    int quantity;
    double price;

    Product(int id, String name, int quantity, double price) {
        this.id = id;
        this.name = name;
        this.quantity = quantity;
        this.price = price;
    }

    double getTotal() {
        return quantity * price;
    }
}

class PackageBill {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Product> products = new ArrayList<>();

       
        LocalDateTime now = LocalDateTime.now();
        DateTimeFormatter format = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
        String dateTime = now.format(format);

        System.out.print("Enter number of products: ");
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            System.out.println("\nEnter details for product " + (i + 1));

            System.out.print("Product ID: ");
            int id = sc.nextInt();

            sc.nextLine(); 
            System.out.print("Product Name: ");
            String name = sc.nextLine();

            System.out.print("Quantity: ");
            int qty = sc.nextInt();

            System.out.print("Price: ");
            double price = sc.nextDouble();

            products.add(new Product(id, name, qty, price));
        }

        double grandTotal = 0;

       
        System.out.println("\n----------------------------------------");
        System.out.println("              PACKAGE BILL");
        System.out.println("------------------------------------------");
        System.out.println("Date & Time: " + dateTime);
        System.out.println("------------------------------------------");

        System.out.printf("%-10s %-12s %-5s %-8s %-8s\n", 
                          "ID", "Name", "Qty", "Price", "Total");
        System.out.println("------------------------------------------");

        for (Product p : products) {
            double total = p.getTotal();
            grandTotal += total;

            System.out.printf("%-10d %-12s %-5d %-8.2f %-8.2f\n",
                    p.id, p.name, p.quantity, p.price, total);
        }

        System.out.println("------------------------------------------");
        System.out.printf("Grand Total: %.2f\n", grandTotal);
        System.out.println("------------------------------------------");

        sc.close();
    }
}
