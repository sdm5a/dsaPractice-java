
public class Q10_sumOfElement {

    static int arraySum(int arr[], int index) {
        // Base case
        int n = arr.length;
        if (index == n) {
            return 0;
        }

        // recursive work
        int smallAns = arraySum(arr, index + 1);

        // self work
        return arr[index] + smallAns;
    }

    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4, 5, 6};

        // code to find the sum of element of this array
        System.out.print("the given array: ");
        for (int a : arr) {
            System.out.print(a + " ");
        }

        int ans = arraySum(arr, 0);
        System.out.println();
        System.out.println("The total sum of element of this array: " + ans);

    }
}
