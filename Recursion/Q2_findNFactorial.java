
import java.util.Scanner;

public class Q2_findNFactorial {

    static int factorialN(int n) {
        // Base case
        if (n == 0 || n == 1) {
            return 1;
        }
        // Recursion work
        int ans = factorialN(n - 1);

        // Self work
        return ans * n;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of n: ");
        int n = sc.nextInt();

        // print n!
        int ans = factorialN(n);
        System.out.printf("Factorial of %d is: %d", n, ans);
        sc.close();
    }
}
