
import java.util.Scanner;

public class Q6_findKMultipleOfN {

    static void kMultilplesOfN(int n, int k) {
        // base case 
        if (k == 0) {
            return;
        }

        // recursive work
        kMultilplesOfN(n, k - 1);

        // self work
        System.out.print(n * k + " ");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of n: ");
        int n = sc.nextInt();
        System.out.print("Enter the value of k: ");
        int k = sc.nextInt();

        // code to find k multiples of n
        kMultilplesOfN(n, k);
        sc.close();
    }
}
