import java.util.Scanner;

public class MatrixAddition {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        int r, c;

        // taking size of matrices
        System.out.print("Enter number of rows: ");
        r = s.nextInt();

        System.out.print("Enter number of columns: ");
        c = s.nextInt();

        int a[][] = new int[r][c];
        int b[][] = new int[r][c];
        int sum[][] = new int[r][c];

        // input matrix A
        System.out.println("Enter elements of matrix A:");
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                a[i][j] = s.nextInt();
            }
        }

        // input matrix B
        System.out.println("Enter elements of matrix B:");
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                b[i][j] = s.nextInt();
            }
        }

        // addition
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                sum[i][j] = a[i][j] + b[i][j];
            }
        }

        // display result
        System.out.println("Sum Matrix:");
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                System.out.print(sum[i][j] + " ");
            }
            System.out.println();
        }
    }
}