
import java.util.Scanner;

public class Q4_sumOfDigits {

    static int sumOfDigits(int n) {
        // Base case
        if (0 <= n && n <= 9) {
            return n;
        }

        // recursion
        return n % 10 + sumOfDigits(n / 10);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter any number: ");
        int n = sc.nextInt();

        // code to find sum of digits
        int ans = sumOfDigits(n);
        System.out.printf("Total sum of digits of %d is: %d", n, ans);

        sc.close();
    }
}
