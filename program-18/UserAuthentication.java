import java.util.Scanner;

class InvalidLogicException extends Exception {
    public InvalidLogicException(String message) {
        super(message);
    }
}

public class UserAuthentication {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String username, password;

        System.out.println("Enter username:");
        username = sc.next();

        System.out.println("Enter passwd:");
        password = sc.next();

        try {
            if (username.equals("admin") && password.equals("1234")) {
                System.out.println("login successful");
            } else {
                throw new InvalidLogicException("Invalid username or password");
            }
        } catch (InvalidLogicException e) {
            System.out.println("Exception: " + e.getMessage());
        }
    }
}
