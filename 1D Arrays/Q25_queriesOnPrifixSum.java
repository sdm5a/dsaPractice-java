
import java.util.Scanner;

public class Q25_queriesOnPrifixSum {

    static void prifixSum(int arr[]) {
        int n = arr.length;

        for (int i = 2; i < n; i++) {
            arr[i] = arr[i] + arr[i - 1];
        }
    }

    public static void printArray(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        // Array size and its declration
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of array: ");
        int n = sc.nextInt();
        int arr[] = new int[n + 1];

        // Array input
        System.out.println("Enter the elements of array: ");
        for (int i = 1; i < arr.length; i++) {
            System.out.printf("a[%d]: ", i);
            arr[i] = sc.nextInt();
        }

        // Printing of original array
        System.out.println("The given array--> ");
        printArray(arr);

        // Code for queries on prifix sum array to find the sum bitween two indices
        prifixSum(arr);
        System.out.println("Enter the number of queries: ");
        int q = sc.nextInt();

        while (q-- > 0) {
            System.out.print("Enter the first index: ");
            int l = sc.nextInt();
            System.out.print("Enter the second index: ");
            int r = sc.nextInt();

            System.out.printf("Sum bitween index %d and %d is: %d", l, r, arr[r] - arr[l - 1]);
            System.out.println();

        }

        sc.close();
    }
}
