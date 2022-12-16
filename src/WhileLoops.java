import java.util.Scanner;
public class WhileLoops {
    private final static Scanner s = new Scanner(System.in);

    public static void eoCount() {
        System.out.println("Enter numbers followed by enter, press anything else to determine how many odd & even: ");
        int evenCount = 0;
        int oddCount = 0;
        while (true) {
            if (s.nextInt() %2 == 0) {
                evenCount++;
            }
            else {
                oddCount++;
            }
            System.out.println("Even count: " + evenCount);
            System.out.println("Odd count: " + oddCount);
        }
    }

    public static void mean() {
        int meanInt = 0;
        int meanCount = 0;
        while (true) {
            if (s.nextLine().equals("break")) {
            }
            meanInt += s.nextInt();
            meanCount ++;
            System.out.println("The mean of the numbers collected is:" + meanInt / meanCount + "\n");
        }
    }

    public static void main(String[] args) {
        eoCount();
        mean();
    }
}