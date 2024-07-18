
import java.util.Scanner;

public class Q14_secondLargest {

    static int largestNumber(int arr[]) {
        int max = Integer.MIN_VALUE;

        for (int i = 0; i < arr.length; i++) {
            if (max < arr[i]) {
                max = arr[i];
            }
        }
        return max;
    }

    static int secondLargestNumber(int arr[]) {
        int max = largestNumber(arr);
        for (int i = 0; i < arr.length; i++) {
            if (max == arr[i]) {
                arr[i] = -1;
            }
        }

        return largestNumber(arr);
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

        // Code second largest element
        int ans = secondLargestNumber(arr);
        System.out.println("The second largest number is : " + ans);
        sc.close();
    }
}
