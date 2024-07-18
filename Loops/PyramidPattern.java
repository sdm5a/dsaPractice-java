
import java.util.Scanner;

public class PyramidPattern {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of rows: ");
        int r = sc.nextInt();
        int k = 0;
        for (int i = 1; i <= r; i++, k = 0) {
            for (int j = 1; j <= r - i; ++j) {
                System.out.print("  ");
            }

            while (k != 2 * i - 1) {
                System.out.print("* ");
                ++k;
            }
            System.out.println();
        }
        sc.close();

    }
}
