
import java.util.Scanner;

public class Q6_rotateBy90Degree {

    static void transpose(int arr[][]) {
        int r = arr.length;
        int c = arr[0].length;
        for (int i = 0; i < r; i++) {
            for (int j = i; j < c; j++) {
                int temp = arr[i][j];
                arr[i][j] = arr[j][i];
                arr[j][i] = temp;

            }
        }
    }

    static void reverse(int arr[]) {
        int k = 0;
        int j = arr.length - 1;
        while (k < j) {
            int temp = arr[j];
            arr[j] = arr[k];
            arr[k] = temp;
            k++;
            j--;

        }
    }

    static void rotateBy90Degree(int arr[][]) {
        int r = arr.length;
        // int c = arr[0].length;

        // finding the transpose first
        transpose(arr);
        for (int i = 0; i < r; i++) {
            reverse(arr[i]);
        }

    }

    static void printMatrix(int arr[][]) {

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of rows: ");
        int r = sc.nextInt();
        System.out.print("Enter the number of columns: ");
        int c = sc.nextInt();

        int arr[][] = new int[r][c];

        // Taking 2D array as input
        System.out.println("Enter the elements: ");
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                System.out.printf("arr[%d][%d]: ", i, j);
                arr[i][j] = sc.nextInt();
            }
        }

        // Printing the give  2D array
        System.out.println("Given Matrix --->");
        printMatrix(arr);

        //Given a square matrix turn it by 90 degrees in clockwise direction without using extra space
        System.out.println("Roteted Matrix:::");
        rotateBy90Degree(arr);
        printMatrix(arr);
        sc.close();;

    }
}
