
import java.util.Scanner;

public class Q10_sumBetweenCordinates {

    static int rectangleSum(int arr[][], int l1, int r1, int l2, int r2) {
        int sum = 0;
        for (int i = l1; i <= l2; i++) {
            for (int j = r1; j <= r2; j++) {
                sum += arr[i][j];
            }
        }
        return sum;
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

        //Given a matrix of m x n and two coordinates (l1, r1) and (l2, r2).
        // Find the sum of the rectangle between these two coordinates
        System.out.print("Enter the value of l1");
        int l1 = sc.nextInt();
        System.out.print("Enter the value of r1");
        int r1 = sc.nextInt();
        System.out.print("Enter the value of l2");
        int l2 = sc.nextInt();
        System.out.print("Enter the value of r2");
        int r2 = sc.nextInt();

        int ans = rectangleSum(arr, l1, r1, l2, r2);
        System.out.println("The sum between these two coridinates is: " + ans);

        sc.close();;

    }
}
