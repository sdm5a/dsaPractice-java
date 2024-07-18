
public class Q6_copyArray {

    public static void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4, 56, 7, 8, 23};
        System.out.println("Origianl :");
        printArray(arr);
        System.out.println();

        // Sallow copy
        int arrC[] = arr;
        System.out.println("Sallow copy: ");
        printArray(arrC);
        System.out.println();

        // Deep copy by arr.clone()
        int arrD[] = arr.clone();
        System.out.println("Deep copy by arr.clone(): ");
        printArray(arrD);

    }
}
