package cycle3new;
import java.util.Scanner;
class FibonacciGenerator implements Runnable {
    private int limit;
    public FibonacciGenerator(int limit) {
        this.limit = limit;
    }
    @Override
    public void run() {
        int n1 = 0, n2 = 1, n3;
        System.out.println("Fibonacci Series up to " + limit + ":");
        System.out.print(n1 + " " + n2);
        for (int i = 2; i < limit; ++i) {
            n3 = n1 + n2;
            System.out.print(" " + n3);
            n1 = n2;
            n2 = n3;
            try {
                Thread.sleep(100); // Introduce a small delay to see interleaving
            } catch (InterruptedException e) {
                System.out.println("Fibonacci generation interrupted.");
                return;
            }
        }
        System.out.println();
    }
}
class EvenNumberDisplayer implements Runnable {
    private int start;
    private int end;
    public EvenNumberDisplayer(int start, int end) {
        this.start = start;
        this.end = end;
    }
    @Override
    public void run() {
        System.out.println("Even numbers in the range [" + start + ", " + end + "]:");
        for (int i = start; i <= end; i++) {
            if (i % 2 == 0) {
                System.out.print(i + " ");
                try {
                    Thread.sleep(150); // Introduce a small delay
                } catch (InterruptedException e) {
                    System.out.println("Even number display interrupted.");
                    return;
                }
            }
        }
        System.out.println();
    }
}
public class java24 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the limit for Fibonacci series: ");
        int fibonacciLimit = scanner.nextInt();
        System.out.print("Enter the starting range for even numbers: ");
        int evenStart = scanner.nextInt();
        System.out.print("Enter the ending range for even numbers: ");
        int evenEnd = scanner.nextInt();
        FibonacciGenerator fibonacciTask = new FibonacciGenerator(fibonacciLimit);
        EvenNumberDisplayer evenTask = new EvenNumberDisplayer(evenStart, evenEnd);
        Thread fibonacciThread = new Thread(fibonacciTask);
        Thread evenThread = new Thread(evenTask);
        fibonacciThread.start();
        evenThread.start();
        try {
            fibonacciThread.join();
            evenThread.join();
            System.out.println("Both threads have finished.");
        } catch (InterruptedException e) {
            System.out.println("Main thread interrupted.");
        } finally {
            scanner.close();
        }
    }
}