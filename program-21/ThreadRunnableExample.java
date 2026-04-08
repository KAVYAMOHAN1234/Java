//define 2 classes;one fibonacci numbers and other for displaying even no. in a giver range.implement using thread(runnable interface)

class FibonacciRunnable implements Runnable {
    int n;

    FibonacciRunnable(int n) {
        this.n = n;
    }

    public void run() {
        System.out.println("Fibonacci Series up to " + n + " terms:");
        int a = 0, b = 1;

        for (int i = 1; i <= n; i++) {
            System.out.print(a + " ");
            int next = a + b;
            a = b;
            b = next;
        }
        System.out.println();
    }
}

class EvenRunnable implements Runnable {
    int start, end;

    EvenRunnable(int start, int end) {
        this.start = start;
        this.end = end;
    }

    public void run() {
        System.out.println("Even numbers from " + start + " to " + end + ":");

        for (int i = start; i <= end; i++) {
            if (i % 2 == 0) {
                System.out.print(i + " ");
            }
        }
        System.out.println();
    }
}

public class ThreadRunnableExample {
    public static void main(String[] args) {
        FibonacciRunnable fib = new FibonacciRunnable(10);
        EvenRunnable even = new EvenRunnable(1, 20);

        Thread t1 = new Thread(fib);
        Thread t2 = new Thread(even);

        t1.start();
        t2.start();
    }
}
