
import java.util.Scanner;

public class Q15_firstRepeatedNumber {

    static int firstRepeatedNumber(int arr[]) {
        int ans = -1;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    ans = arr[i];
                    return ans;
                }
            }
        }
        return ans;
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

        // Code to find the firt repeated value if not found return -1.
        int ans = firstRepeatedNumber(arr);
        System.out.println("The first repeated value is: " + ans);
        sc.close();
    }
}
