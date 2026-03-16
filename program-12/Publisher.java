import java.util.Scanner;

class Publisher {
    String publisherName;

    void getPublisher(String p) {
        publisherName = p;
    }

    void displayPublisher() {
        System.out.println("Publisher: " + publisherName);
    }
}

class Book extends Publisher {
    String title;
    String author;
    double price;

    void getBook(String t, String a, double pr) {
        title = t;
        author = a;
        price = pr;
    }

    void displayBook() {
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Price: " + price);
        displayPublisher();
    }
}

class Literature extends Book {
    void showLiterature() {
        System.out.println("\nLiterature Book Details");
        displayBook();
    }
}

class Fiction extends Book {
    void showFiction() {
        System.out.println("\nFiction Book Details");
        displayBook();
    }
}

class LibraryDemo {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Publisher Name: ");
        String pub = sc.nextLine();

        System.out.print("Enter Book Title: ");
        String title = sc.nextLine();

        System.out.print("Enter Author Name: ");
        String author = sc.nextLine();

        System.out.print("Enter Price: ");
        double price = sc.nextDouble();

        System.out.print("Enter Category (1-Literature 2-Fiction): ");
        int ch = sc.nextInt();

        if (ch == 1) {
            Literature l = new Literature();
            l.getPublisher(pub);
            l.getBook(title, author, price);
            l.showLiterature();
        } 
        else if (ch == 2) {
            Fiction f = new Fiction();
            f.getPublisher(pub);
            f.getBook(title, author, price);
            f.showFiction();
        } 
        else {
            System.out.println("Invalid Choice");
        }

        sc.close();
    }
}
