
import java.util.Scanner;

public class InsertionSort3 {

    static void insertionSort(int arr[]) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            while (arr[i] > arr[i + 1]) {
                int temp = arr[i];
                arr[i] = arr[i + 1];
                arr[i + 1] = temp;
                if (i > 0) {
                    i--;
                }
            }
        }
    }

    static void printArray(int arr[]) {
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of array: ");
        int n = sc.nextInt();
        int arr[] = new int[n];

        // taking array as input
        System.out.println("Enter the elements of array: ");
        for (int i = 0; i < n; i++) {
            System.out.printf("arr[%d]: ", i);
            arr[i] = sc.nextInt();
        }

        // print array
        System.out.println("Given Array :::");
        printArray(arr);

        // Insertion sort code
        insertionSort(arr);
        System.out.println("Sorted Array :::");
        printArray(arr);
        sc.close();
    }
}
