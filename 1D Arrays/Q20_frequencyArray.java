
import java.util.Scanner;

public class Q20_frequencyArray {

    static int[] frequencyArray(int arr[]) {
        int freq[] = new int[100005];
        for (int i = 0; i < arr.length; i++) {
            freq[arr[i]]++;
        }
        return freq;
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

        // Code for q queries on frequency array
        int freq[] = frequencyArray(arr);
        System.out.print("Enter the number of queries: ");
        int q = sc.nextInt();

        while (q > 0) {
            System.out.print("Enter any number to search: ");
            int num = sc.nextInt();
            if (freq[num] > 0) {
                System.out.printf("The given numbmer %d is present by %d times.", num, freq[num]);
                System.out.println();
            } else {
                System.out.println("This number is not present.");
            }
            q--;
        }

        sc.close();
    }
}
