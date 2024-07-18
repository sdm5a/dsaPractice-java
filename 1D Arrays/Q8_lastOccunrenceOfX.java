
import java.util.Scanner;

public class Q8_lastOccunrenceOfX {

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

        int occur = 0;
        for (int i = 0; i < arr.length; i++) {
            if (x == arr[i]) {
                occur = i;
            }
        }

        System.out.println("The last occunrence of " + x + " is at index of " + occur);
        sc.close();
    }
}
