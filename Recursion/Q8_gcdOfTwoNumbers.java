
import java.util.Scanner;

public class Q8_gcdOfTwoNumbers {

    static int gcdOfTwoNumbers(int a, int b) {
        // base case
        if (a == 0) {
            return b;
        }

        // recursive and self work
        return gcdOfTwoNumbers(b % a, a);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value a: ");
        int a = sc.nextInt();
        System.out.print("Enter the vlaue of b: ");
        int b = sc.nextInt();

        // code to find gcd of a and b eucllid's method
        int ans = gcdOfTwoNumbers(a, b);
        System.out.printf("GCD of %d and %d is: %d", a, b, ans);
        sc.close();

    }
}
