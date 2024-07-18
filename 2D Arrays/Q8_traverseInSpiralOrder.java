
import java.util.Scanner;

public class Q8_traverseInSpiralOrder {

    static void spiralOrder(int arr[][]) {
        int r = arr.length;
        int totalNum = 0;

        int topRow = 0;
        int bottomRow = r - 1;
        int leftColumn = 0;
        int rightColumn = r - 1;

        while (totalNum < r * r) {

            // printing top row :: leftColumn --> rightColumn 
            for (int j = leftColumn; j <= rightColumn && totalNum < r * r; j++) {
                System.out.print(arr[topRow][j] + " ");
                totalNum++;
            }
            topRow++;

            // printing right column :: topRow --> bottomRow
            for (int j = topRow; j <= bottomRow && totalNum < r * r; j++) {
                System.out.print(arr[j][rightColumn] + " ");
                totalNum++;
            }
            rightColumn--;

            // printing bottom row :: rightColumn --> leftColumn
            for (int j = rightColumn; j >= leftColumn && totalNum < r * r; j--) {
                System.out.print(arr[bottomRow][j] + " ");
                totalNum++;
            }
            bottomRow--;

            // printing left column :: bottomRow --> topRow
            for (int j = bottomRow; j >= topRow && totalNum < r * r; j--) {
                System.out.print(arr[j][leftColumn] + " ");
                totalNum++;
            }
            leftColumn++;
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

        //Traversal of mtrix in spiral order
        System.out.println("In spiral order:::");
        spiralOrder(arr);
        sc.close();

    }
}
