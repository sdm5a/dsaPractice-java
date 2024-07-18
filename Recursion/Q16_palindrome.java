
import java.util.Scanner;

public class Q16_palindrome {

    static String reverseString(String s, int i, int n) {
        // base case
        if (n <= i) {
            return "";
        }

        // recursive work
        String ans = "";
        ans += reverseString(s, i + 1, n);
        return ans;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter any string to check palindrome: ");
        String s = sc.nextLine();

        // chaeck whether the given string is palindrome or not
        int n = s.length();
        String rev = reverseString(s, 0, n);
        System.out.println(rev);
        sc.close();

    }
}
