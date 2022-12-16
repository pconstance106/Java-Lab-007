import java.util.Scanner;

public class ForLoops {
    private final static Scanner s = new Scanner(System.in);

    public static void forSum() {
        System.out.print("Enter a number: ");
        int n = s.nextInt();
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += i;
        }
        System.out.println("Sum: " + sum);
    }

    public static void rangeSum() {
        System.out.print("Enter the first number in the range: ");
        int a = s.nextInt();
        System.out.print("Enter the second number in the range: ");
        int b = s.nextInt();
        int start = Math.min(a, b);
        int end = Math.max(a, b);
        int sum = 0;
        for (int i = start; i <= end; i++) {
            sum += i;
        }
        System.out.println("Range: " + start + "-" + end);
        System.out.println("Sum: " + sum);
    }

    public static void factorial() {
        System.out.print("Enter a number: ");
        int n = s.nextInt();
        int factorial = 1;
        for (int i = 1; i <= n; i++) {
            factorial *= i;
        }
        System.out.println("Factorial: " + factorial);
    }


    public static void main(String[] args) {
        forSum();
        rangeSum();
        factorial();
    }
}
