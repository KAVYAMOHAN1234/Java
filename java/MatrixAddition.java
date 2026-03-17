import java.util.Scanner;

// class for matrix addition
public class MatrixAddition {
    public static void main(String[] args) {

        // creating Scanner object for input
        Scanner s = new Scanner(System.in);

        int r, c;  // variables for rows and columns

        // taking number of rows
        System.out.print("Enter number of rows: ");
        r = s.nextInt();

        // taking number of columns
        System.out.print("Enter number of columns: ");
        c = s.nextInt();

        // creating matrices A, B and SUM with same size
        int a[][] = new int[r][c];
        int b[][] = new int[r][c];
        int sum[][] = new int[r][c];

        // input elements for matrix A
        System.out.println("Enter elements of matrix A:");
        for (int i = 0; i < r; i++) {        // loop for rows
            for (int j = 0; j < c; j++) {    // loop for columns
                a[i][j] = s.nextInt();       // storing value in matrix A
            }
        }

        // input elements for matrix B
        System.out.println("Enter elements of matrix B:");
        for (int i = 0; i < r; i++) {        // loop for rows
            for (int j = 0; j < c; j++) {    // loop for columns
                b[i][j] = s.nextInt();       // storing value in matrix B
            }
        }

        // adding matrices A and B
        for (int i = 0; i < r; i++) {        // loop through rows
            for (int j = 0; j < c; j++) {    // loop through columns
                sum[i][j] = a[i][j] + b[i][j]; // add elements and store in sum
            }
        }

        // displaying the result matrix
        System.out.println("Sum Matrix:");
        for (int i = 0; i < r; i++) {        // loop for rows
            for (int j = 0; j < c; j++) {    // loop for columns
                System.out.print(sum[i][j] + " "); // print each element
            }
            System.out.println(); // move to next row
        }
    }
}
