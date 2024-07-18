
import java.util.Scanner;

public class Q2_addTwoMatrices {

    static int[][] addTwoMatrices(int arr1[][], int arr2[][]) {
        int r1 = arr1.length;
        int c1 = arr1[0].length;

        int ans[][] = new int[r1][c1];
        for (int i = 0; i < r1; i++) {
            for (int j = 0; j < c1; j++) {
                ans[i][j] = arr1[i][j] + arr2[i][j];
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

        System.out.print("Enter the number of rows of A: ");
        int r1 = sc.nextInt();
        System.out.print("Enter the number of columns of A: ");
        int c1 = sc.nextInt();

        int arr1[][] = new int[r1][c1];

        // Taking Matrix A as input
        System.out.println("Enter the elements: ");
        for (int i = 0; i < r1; i++) {
            for (int j = 0; j < c1; j++) {
                System.out.printf("arr1[%d][%d]: ", i, j);
                arr1[i][j] = sc.nextInt();
            }
        }

        System.out.print("Enter the number of rows of B: ");
        int r2 = sc.nextInt();
        System.out.print("Enter the number of columns of B: ");
        int c2 = sc.nextInt();

        int arr2[][] = new int[r2][c2];

        // Taking Matrix B as input
        System.out.println("Enter the elements: ");
        for (int i = 0; i < r2; i++) {
            for (int j = 0; j < c2; j++) {
                System.out.printf("arr2[%d][%d]: ", i, j);
                arr2[i][j] = sc.nextInt();
            }
        }

        // Printing the both Matrix A and B array
        System.out.println("Matrix A --->");
        printMatrix(arr1);
        System.out.println("Matrix B --->");
        printMatrix(arr2);

        // Adding the two matrix A and B
        if (r1 == r2 && c1 == c2) {
            System.out.println("Sum of Matrix A and B:::");
            int ans[][] = addTwoMatrices(arr1, arr2);
            printMatrix(ans);
        } else {
            System.out.println("The given two matrix is invalid to perform Addition.");
        }
        sc.close();;

    }
}
