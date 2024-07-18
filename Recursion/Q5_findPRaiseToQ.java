
import java.util.Scanner;

public class Q5_findPRaiseToQ {

    static int findPRaiseToQ(int p, int q) {
        // base case 
        if (q == 1) {
            return p;
        }

        // Recursion calling
        return p * findPRaiseToQ(p, q - 1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of p: ");
        int p = sc.nextInt();
        System.out.print("Enter the value of q: ");
        int q = sc.nextInt();

        // code to find p^q
        int ans = findPRaiseToQ(p, q);
        System.out.printf("%d raise to %d is: %d", p, q, ans);
        sc.close();
    }
}
