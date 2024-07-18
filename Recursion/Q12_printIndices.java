
import java.util.Scanner;

public class Q12_printIndices {

    static void printIndex(int arr[], int index, int x) {
        // base case
        int n = arr.length;
        if (index == n) {
            return;
        }

        // recursive and self work
        if (x == arr[index]) {
            System.out.print(index + " ");
        }

        printIndex(arr, index + 1, x);

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[] = {4, 5, 7, 4, 9, 24, 4, 99, 4};
        System.out.print("Given Array: ");
        for (int i : arr) {
            System.out.print(i + " ");
        }
        System.out.println();

        System.out.print("Enter the value of x: ");
        int x = sc.nextInt();

        // code to find x is present or not
        System.out.printf("%d is present at index: ", x);
        printIndex(arr, 0, x);
        sc.close();

    }
}
