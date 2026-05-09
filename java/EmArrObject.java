import java.util.Scanner;

class Employee {
    int id, salary;
    String name;

    // Constructor
    Employee(int id, String name, int salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    // Display employee details
    void showData() {
        System.out.println("EmId = " + id + " name= " + name + " Salary=" + salary);
    }
}

public class EmArrObject {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter number of employee: ");
        int n = sc.nextInt();

        Employee[] employees = new Employee[n];

        // Input employee details
        for (int i = 0; i < n; i++) {

            System.out.println("Enter " + i + " employee details..");

            System.out.println("Enter employee id (integer):");
            int id = sc.nextInt();

            System.out.println("Enter employee name (String)");
            String name = sc.next();

            System.out.println("Enter employee salary (integer)");
            int salary = sc.nextInt();

            employees[i] = new Employee(id, name, salary);
        }

        // Display all employees
        System.out.println("Employees are:\n");

        for (Employee e : employees) {
            e.showData();
        }

        // Search employee
        System.out.println("Enter employee to search: ");
        int searchId = sc.nextInt();

        boolean found = false;

        for (Employee e : employees) {
            if (e.id == searchId) {
                found = true;
                System.out.println("Employee found.");
                e.showData();
                break;
            }
        }

        if (!found) {
            System.out.println("Employee not found");
        }

        sc.close();
    }
}