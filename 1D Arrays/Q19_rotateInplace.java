
import java.util.Scanner;

public class Q19_rotateInplace {

    static void swap(int arr[], int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    static void reverseArray(int arr[], int i, int j) {

        while (i < j) {
            swap(arr, i, j);
            i++;
            j--;
        }
    }

    static void rotationInplace(int arr[], int k) {
        int n = arr.length;
        reverseArray(arr, n - k, n - 1);
        reverseArray(arr, 0, n - k - 1);
        reverseArray(arr, 0, n - 1);
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

        // Code to find its reverse
        System.out.print("Enter the value of k: ");
        int k = sc.nextInt();
        rotationInplace(arr, k);
        printArray(arr);
        sc.close();
    }

}
