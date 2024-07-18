
import java.util.Scanner;

public class Q1_print1toN {

    // Write a programme to print n natural number
    static void printNaturalNumber(int n) {
        // Base case
        if (n == 0) {
            return;
        }

        // Recursion
        printNaturalNumber(n - 1);

        // Self work
        System.out.print(n + " ");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of n: ");
        int n = sc.nextInt();
        printNaturalNumber(n);
        sc.close();

    }
}
