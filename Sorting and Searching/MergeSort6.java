
import java.util.Scanner;

public class MergeSort6 {

    static void merge(int arr[], int l, int mid, int r) {
        int n1 = mid - l + 1;
        int n2 = r - mid;

        int left[] = new int[n1];
        int right[] = new int[n2];

        for (int i = 0; i < n1; i++) {
            left[i] = arr[l + i];
        }
        for (int i = 0; i < n2; i++) {
            right[i] = arr[mid + 1 + i];
        }

        int i = 0, j = 0, k = l;
        while (i < n1 && j < n2) {
            if (left[i] < right[j]) {
                arr[k++] = left[i++];
            } else {
                arr[k++] = right[j++];
            }
        }

        while (i < n1) {
            arr[k++] = left[i++];
        }

        while (i < n2) {
            arr[k++] = right[j++];
        }
    }

    static void mergeSort(int arr[], int l, int r) {
        // base case
        if (l >= r) {
            return;
        }

        // recursive work
        int mid = (l + r) / 2;
        mergeSort(arr, l, mid);
        mergeSort(arr, mid + 1, r);

        // merging method
        merge(arr, l, mid, r);
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

        // Merge sort code
        mergeSort(arr, 0, n - 1);
        System.out.println("Sorted Array :::");
        printArray(arr);
        sc.close();
    }
}
