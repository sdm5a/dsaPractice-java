
import java.util.Scanner;

public class Q3_nFibbonacciNumber {

    static int nthFibbonacci(int n) {
        // base case
        if (n == 0 || n == 1) {
            return n;
        }

        // recursion work and self work
        return nthFibbonacci(n - 1) + nthFibbonacci(n - 2);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of n: ");
        int n = sc.nextInt();

        // n fibbonacci number
        for (int i = 0; i < n; i++) {
            int ans = nthFibbonacci(i);
            System.out.print(ans + " ");
        }

        sc.close();
    }
}
