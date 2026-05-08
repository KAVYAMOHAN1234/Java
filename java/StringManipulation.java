import java.util.Scanner;

public class StringManipulation {

    public static void main(String[] args) {

        // Scanner object for reading input
        Scanner sc = new Scanner(System.in);

        // -----------------------------------------
        // Reading first string from user
        // -----------------------------------------
        System.out.print("Enter a string: ");
        String str1 = sc.nextLine();

        // -----------------------------------------
        // Converting string to uppercase
        // -----------------------------------------
        System.out.println("Uppercase: " + str1.toUpperCase());

        // -----------------------------------------
        // Converting string to lowercase
        // -----------------------------------------
        System.out.println("Lowercase: " + str1.toLowerCase());

        // -----------------------------------------
        // Finding length of string
        // -----------------------------------------
        System.out.println("Length of string: " + str1.length());

        // -----------------------------------------
        // Reading another string for concatenation
        // -----------------------------------------
        System.out.print("Enter another string: ");
        String str2 = sc.nextLine();

        // -----------------------------------------
        // Concatenating two strings
        // -----------------------------------------
        String result = str1.concat(str2);

        // Display concatenated string
        System.out.println("Concatenated String: " + result);

        // Closing scanner
        sc.close();
    }
}