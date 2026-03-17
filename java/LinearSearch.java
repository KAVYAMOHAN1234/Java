import java.util.Scanner;  // import Scanner class for user input

public class LinearSearch {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);  // create Scanner object

        // input size of array
        System.out.print("Enter number of elements: ");
        int n = s.nextInt();  // read number of elements

        int[] arr = new int[n];  // create array of size n

        // input elements into array
        System.out.println("Enter elements:");
        for (int i = 0; i < n; i++) {   // loop from 0 to n-1
            arr[i] = s.nextInt();      // store each element in array
        }

        // input value to search
        System.out.print("Enter value to search: ");
        int search = s.nextInt();  // read search value

        // variable to check if element is found
        boolean found = false;

        // linear search starts
        for (int i = 0; i < n; i++) {   // check each element
            if (arr[i] == search) {    // compare with search value
                
                // if found, print position (i+1 because index starts from 0)
                System.out.println("Element found at position " + (i + 1));
                
                found = true;  // mark as found
                break;         // stop loop
            }
        }

        // if element not found after loop
        if (!found) {
            System.out.println("Element not found");
        }
    }
}