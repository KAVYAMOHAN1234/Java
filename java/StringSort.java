import java.util.Arrays;   // import Arrays class for sorting and printing (Because we need a place to store multiple strings.)
import java.util.Scanner;  // import Scanner for user input

class StringSort {
    public static void main(String[] args) { //This is where the program begins execution.

        Scanner s = new Scanner(System.in); // create Scanner object, This line allows you to type input while running the program.

        // take number of strings from user
        System.out.print("Enter number of strings: ");
        int count = s.nextInt();  // read integer value
        s.nextLine(); // clear buffer (important after nextInt)

        // create array to store strings
        String strlist[] = new String[count];

        // input strings from user
        System.out.println("Enter strings:");
        for (int i = 0; i < count; i++) {   // loop for each string
            strlist[i] = s.nextLine();      // store string in array
        }

        // display menu
        System.out.println("Choose option:");
        System.out.println("1: In-built sort");   // option 1
        System.out.println("2: User-defined sort"); // option 2

        int choice = s.nextInt(); // take user choice

        // switch case to choose sorting method
        switch (choice) {

            case 1:
                // in-built sorting using Arrays class
                Arrays.sort(strlist);  // sorts array in ascending order
                break;

            case 2:
                // manual sorting using compareTo()
                for (int i = 0; i < count - 1; i++) {   // outer loop
                    for (int j = i + 1; j < count; j++) { // inner loop
                        
                        // compare two strings
                        if (strlist[i].compareTo(strlist[j]) > 0) {
                            
                            // swap strings if they are in wrong order
                            String temp = strlist[i];
                            strlist[i] = strlist[j];
                            strlist[j] = temp;
                        }
                    }
                }
                break;

            default:
                // if invalid choice
                System.out.println("Invalid choice");
                return; // exit program
        }

        // display sorted strings
        System.out.println("Sorted strings:");
        System.out.println(Arrays.toString(strlist)); // print array
    }
}
