
import java.util.Scanner;

public class MoveZeroes4 {

    static void moveZeroes(int arr[]) {
        int n = arr.length;

        for (int i = 0; i < n - 1; i++) {
            if (arr[i] == 0) {
                for (int j = i; j < n - 1; j++) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
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

        // move all zeroes to the end of array without changing the relative order of other elements
        moveZeroes(arr);
        System.out.println("Resultant Array :::");
        printArray(arr);
        sc.close();
    }
}
