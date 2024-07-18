
import java.util.Scanner;

public class Q7_seriesSum {

    static int seriesSum(int n) {
        // base case 
        if (n == 0) {
            return 0;
        }

        if (n % 2 == 0) {
            return seriesSum(n - 1) - n;
        } else {
            return seriesSum(n - 1) + n;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of n: ");
        int n = sc.nextInt();

        // find the sum of series upto n --> 1-2+3-4+5-6....n
        int ans = seriesSum(n);
        System.out.printf("Total sum up to %d is: %d", n, ans);
        sc.close();
    }
}
