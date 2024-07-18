
import java.util.Scanner;

public class Q26_prifixSumEqualsToSuffixSum {

    static void prifixSum(int arr[]) {
        int n = arr.length;

        for (int i = 1; i < n; i++) {
            arr[i] = arr[i] + arr[i - 1];
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

        // Code for 26.	Check if we can partition an array into two sub arrays of equal sum. More formally, check that the prefix sum of a part of array is equal to the suffix sum of the rest of the array. 
        prifixSum(arr);
        int totalSum = arr[n - 1];

        int count = 0;
        for (int i = 0; i < n; i++) {
            if (arr[i] == totalSum - arr[i]) {
                System.out.printf("We have a pair from index 0 to %d and %d to %d.", i, i + 1, n - 1);
                System.out.println();
                count++;
            }
        }
        System.out.println("Total number of pairs is: " + count);
        sc.close();
    }
}
