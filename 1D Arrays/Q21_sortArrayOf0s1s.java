
import java.util.Scanner;

public class Q21_sortArrayOf0s1s {

    static void swap(int arr[], int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    static void sortArrayOf0s1s(int arr[]) {
        int n = arr.length;
        int i = 0;
        int j = n - 1;

        while (i < j) {
            if (arr[i] == 1 && arr[j] == 0) {
                swap(arr, i, j);
                i++;
                j--;
            }

            if (arr[i] == 0) {
                i++;
            }

            if (arr[j] == 1) {
                j--;
            }
        }
    }

    public static void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        // Array size and its declration
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of array: ");
        int n = sc.nextInt();
        int arr[] = new int[n];

        // Array input
        System.out.println("Enter the elements of array: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.printf("a[%d]: ", i);
            arr[i] = sc.nextInt();
        }

        // Printing of original array
        System.out.println("The given array--> ");
        printArray(arr);

        // Code for sorting of array contains only os and 1s as element
        sortArrayOf0s1s(arr);
        System.out.println("Sorted Array:");
        printArray(arr);

        sc.close();
    }
}
