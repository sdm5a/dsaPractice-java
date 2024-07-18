
import java.util.Scanner;

public class QuickSort7 {

    static int partition(int arr[], int st, int end) {
        int pivot = arr[st];
        int count = 0;

        for (int i = st + 1; i <= end; i++) {
            if (pivot >= arr[i]) {
                count++;
            }
        }
        int p_index = count + st;
        int temp = arr[st];
        arr[st] = arr[p_index];
        arr[p_index] = temp;

        int i = st;
        int j = end;
        while (i < p_index && j > p_index) {
            while (arr[i] <= pivot) {
                i++;
            }

            while (arr[j] > pivot) {
                j--;
            }

            if (i < p_index && j > p_index) {
                int temp2 = arr[i];
                arr[i] = arr[j];
                arr[j] = temp2;
                i++;
                j--;
            }
        }

        return p_index;
    }

    static void quickSort(int arr[], int st, int end) {
        // base case
        if (st >= end) {
            return;
        }

        int pi = partition(arr, st, end);
        quickSort(arr, st, pi - 1);
        quickSort(arr, pi + 1, end);
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

        // Quick sort code
        quickSort(arr, 0, n - 1);
        System.out.println("Sorted Array :::");
        printArray(arr);
        sc.close();
    }
}
