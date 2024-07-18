
import java.util.Scanner;

public class Q4_searchX {

    public static int findX(int[] arr, int x) {
        for (int i = 0; i < arr.length; i++) {
            if (x == arr[i]) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of x to find: ");
        int x = sc.nextInt();
        int arr[] = {1, 2, 3, 4, 56, 7, 8, 23};
        int index = findX(arr, x);
        System.out.print("The given value " + x + " is find at index of " + index);
        sc.close();

    }
}
