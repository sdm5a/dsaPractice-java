
import java.util.Scanner;

public class Q10_sortedOrNot {

    public static void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of array: ");
        int n = sc.nextInt();
        int arr[] = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.printf("Enter element arr[%d]: ", i);
            arr[i] = sc.nextInt();
        }

        System.out.println("The given array is:");
        printArray(arr);

        for (int i = 1; i < arr.length; i++) {
            if (arr[i - 1] <= arr[i]) {
                if (i == arr.length - 1) {
                    System.out.println("Array is sorted.");
                }
            } else {
                System.out.println("This array is not sorted");
                break;
            }
            sc.close();
        }
    }
}
