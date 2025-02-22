
import java.util.Scanner;

public class Q5_transposeOfMatrix {

    static int[][] transpose(int arr[][]) {
        int r = arr.length;
        int c = arr[0].length;

        int ans[][] = new int[c][r];
        for (int i = 0; i < c; i++) {
            for (int j = 0; j < r; j++) {
                ans[i][j] = arr[j][i];

            }
        }
        return ans;
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

        //Transpose of a square matrix
        System.out.println("Transpose of Matrix:::");
        int ans[][] = transpose(arr);
        printMatrix(ans);
        sc.close();;

    }
}
