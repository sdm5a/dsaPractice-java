
import java.util.Scanner;

public class SelectionSort2 {

    static void selectionSort(int arr[]) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            int min = i;
            for (int j = i + 1; j < n; j++) {
                if (arr[j] < arr[min]) {
                    min = j;
                }
            }
            int temp = arr[i];
            arr[i] = arr[min];
            arr[min] = temp;
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

        // Selection sort code
        selectionSort(arr);
        System.out.println("Sorted Array :::");
        printArray(arr);
        sc.close();
    }
}
