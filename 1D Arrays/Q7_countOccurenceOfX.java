
import java.util.Scanner;

public class Q7_countOccurenceOfX {

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
        System.out.print("Enter the value of x: ");
        int x = sc.nextInt();

        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (x == arr[i]) {
                count++;
            }
        }

        System.out.println("The total number of occurence of " + x + " is " + count);
        sc.close();
    }
}
