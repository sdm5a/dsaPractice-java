
import java.util.Scanner;
import java.util.ArrayList;

public class Q13_returnArrayList {

    static ArrayList<Integer> returnArrayList(int arr[], int index, int x) {
        // base case
        ArrayList<Integer> ans = new ArrayList<>();
        int n = arr.length;
        if (index == n) {
            return ans;
        }

        // recursive and self work
        ans = returnArrayList(arr, index + 1, x);
        if (x == arr[index]) {
            ans.add(index);
        }
        return ans;

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
        ArrayList<Integer> ans = returnArrayList(arr, 0, x);
        System.out.println(ans);
        sc.close();

    }
}
