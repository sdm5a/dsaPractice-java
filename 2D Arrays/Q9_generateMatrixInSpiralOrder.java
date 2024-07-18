
import java.util.Scanner;

public class Q9_generateMatrixInSpiralOrder {

    static void generateMatrixInSpiralOrder(int arr[][]) {
        int r = arr.length;
        int totalNum = 0;

        int topRow = 0;
        int bottomRow = r - 1;
        int leftColumn = 0;
        int rightColumn = r - 1;

        while (totalNum < r * r) {

            // printing top row :: leftColumn --> rightColumn 
            for (int j = leftColumn; j <= rightColumn && totalNum < r * r; j++) {
                arr[topRow][j] = totalNum + 1;
                totalNum++;
            }
            topRow++;

            // printing right column :: topRow --> bottomRow
            for (int j = topRow; j <= bottomRow && totalNum < r * r; j++) {
                arr[j][rightColumn] = totalNum + 1;
                totalNum++;
            }
            rightColumn--;

            // printing bottom row :: rightColumn --> leftColumn
            for (int j = rightColumn; j >= leftColumn && totalNum < r * r; j--) {
                arr[bottomRow][j] = totalNum + 1;
                totalNum++;
            }
            bottomRow--;

            // printing left column :: bottomRow --> topRow
            for (int j = bottomRow; j >= topRow && totalNum < r * r; j--) {
                arr[j][leftColumn] = totalNum + 1;
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

        System.out.print("Enter the value of n: ");
        int n = sc.nextInt();

        int arr[][] = new int[n][n];
        // To generate matric of nxn in spiral order
        generateMatrixInSpiralOrder(arr);
        System.out.println("Required Matrix :::");
        printMatrix(arr);
        sc.close();

    }
}
