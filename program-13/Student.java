import java.util.Scanner;

class Student {
    int rollNo;
    int marks;

    void getStudent(int r, int m) {
        rollNo = r;
        marks = m;
    }

    void displayStudent() {
        System.out.println("Roll Number: " + rollNo);
        System.out.println("Academic Marks: " + marks);
    }
}

interface Sports {
    int sportsScore = 0;

    void getSports(int s);
    void displaySports();
}

class Result extends Student implements Sports {

    int score;

    public void getSports(int s) {
        score = s;
    }

    public void displaySports() {
        System.out.println("Sports Score: " + score);
    }

    void displayResult() {
        displayStudent();
        displaySports();
    }
}

class ResultDemo {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Result r = new Result();

        System.out.print("Enter Roll Number: ");
        int roll = sc.nextInt();

        System.out.print("Enter Academic Marks: ");
        int marks = sc.nextInt();

        System.out.print("Enter Sports Score: ");
        int sports = sc.nextInt();

        r.getStudent(roll, marks);
        r.getSports(sports);

        System.out.println("\nStudent Result");
        r.displayResult();

        sc.close();
    }
}
