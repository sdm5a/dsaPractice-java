
import java.util.Scanner;

public class Q11_findX {

    static int findX(int arr[], int index, int x) {
        // base case
        int n = arr.length;
        if (index == n) {
            return -1;
        }

        // recursive and self work
        int ans = -1;
        if (x == arr[index]) {
            ans = index;
            return ans;
        }

        return findX(arr, index + 1, x);

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[] = {23, 5, 7, 4, 9, 24, 16, 99, 34};
        System.out.print("Given Array: ");
        for (int i : arr) {
            System.out.print(i + " ");
        }
        System.out.println();

        System.out.print("Enter the value of x: ");
        int x = sc.nextInt();

        // code to find x is present or not
        int ans = findX(arr, 0, x);
        if (ans > 0) {
            System.out.printf("Yes %d is present at index of %d.", x, ans);
        } else {
            System.out.printf("%d is not found.", x);
        }

        sc.close();

    }
}
