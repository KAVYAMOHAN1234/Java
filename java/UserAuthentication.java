//Write a user defined exception class to authenticate the user name and password.

import java.util.Scanner; // Import Scanner class for taking user input

// Custom exception class

class InvalidLogicException extends Exception {   // Constructor that accepts an error message
    public InvalidLogicException(String message) {
        super(message);                            // Call parent (Exception) constructor with message
    }
}



// Main class
public class UserAuthentication {
    public static void main(String[] args) {            // Entry point of the program

        Scanner sc = new Scanner(System.in);           // Create Scanner object for input

        String username, password;                     // Declare variables for username and password

        System.out.println("Enter username:");         // Ask user to enter username
        username = sc.next();                         // Read username input (single word)

        System.out.println("Enter passwd:");          // Ask user to enter password
        password = sc.next();                         // Read password input (single word)

        try {                                            // Start try block (for exception handling)

            // Check if username and password are correct
            if (username.equals("admin") && password.equals("1234")) {
                System.out.println("login successful");                  // If correct, print success message
            } else {
                                                                    // If incorrect, throw custom exception
                throw new InvalidLogicException("Invalid username or password");
            }

        } catch (InvalidLogicException e) {                          // Catch the custom exception
                                                                // Print exception message
            System.out.println("Exception: " + e.getMessage());
        }
    }
}