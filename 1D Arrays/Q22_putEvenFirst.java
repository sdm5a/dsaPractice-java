
import java.util.Scanner;

public class Q22_putEvenFirst {

    static void swap(int arr[], int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    static void putEvenFirst(int arr[]) {
        int n = arr.length;
        int i = 0;
        int j = n - 1;

        while (i < j) {
            if (arr[i] % 2 != 0 && arr[j] % 2 == 0) {
                swap(arr, i, j);
                i++;
                j--;
            }

            if (arr[i] % 2 == 0) {
                i++;
            }

            if (arr[j] % 2 != 0) {
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

        // Code for placing even element first
        putEvenFirst(arr);
        System.out.println("Rearranged Array:");
        printArray(arr);
        sc.close();
    }
}
