import java.util.Scanner;  // import Scanner class for taking input

// CPU class
class CPU {

    double price;        // variable to store CPU price
    double cache;        // variable to store processor cache
    double clockSpeed;   // variable to store RAM clock speed

    // method to display CPU details
    void display() {
        System.out.println("Processor Cache=" + cache);       // print cache value
        System.out.println("RAM clock speed=" + clockSpeed);  // print clock speed
        System.out.println("CPU Price = " + price);           // print price
    }
}

// main class
class CPUDetails {

    public static void main(String[] args) {

        // create Scanner object for input
        Scanner s = new Scanner(System.in);

        // create CPU object
        CPU cpu = new CPU();

        // take cache input from user
        System.out.print("Enter the cache of processor: ");
        cpu.cache = s.nextDouble();   // store input in cache

        // take clock speed input
        System.out.print("Enter the clock speed: ");
        cpu.clockSpeed = s.nextDouble();  // store input in clockSpeed

        // take CPU price input
        System.out.print("Enter the CPU price: ");
        cpu.price = s.nextDouble();   // store input in price

        // call display method to show output
        cpu.display();
    }
}