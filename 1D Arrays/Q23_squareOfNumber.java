
import java.util.Scanner;

public class Q23_squareOfNumber {

    static void swap(int arr[], int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    static void squareOfNumber(int arr[]) {
        int n = arr.length;
        int i = 0;
        int j = n - 1;

        while (i < j) {
            if (Math.abs(arr[i]) > Math.abs(arr[j])) {
                swap(arr, i, j);
                // arr[i] *= arr[i];
                arr[j] *= arr[j];
                // i++;
                j--;
            }

            if (Math.abs(arr[i]) < Math.abs(arr[j])) {
                // arr[i] *= arr[i];
                arr[j] *= arr[j];
                // i++;
                j--;
            }

            if (Math.abs(arr[i]) == Math.abs(arr[j])) {
                arr[j] *= arr[j];
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

        // Code for getting the square of non-decrreasing numbers
        squareOfNumber(arr);
        System.out.println("Resultant array of square of numbers: ");
        printArray(arr);
        sc.close();
    }
}
