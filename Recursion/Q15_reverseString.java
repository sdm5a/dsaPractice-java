
import java.util.Scanner;

public class Q15_reverseString {

    static void reverse(String s, int i) {
        // base case
        int n = s.length();
        if (i == n) {
            return;
        }

        // recursive and self work
        reverse(s, i + 1);
        System.out.print(s.charAt(i));
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter any string: ");
        String s = sc.nextLine();

        // reverse the string
        reverse(s, 0);
        sc.close();
    }
}
