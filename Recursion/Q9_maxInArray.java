
public class Q9_maxInArray {

    static int maxValue(int arr[], int index) {
        // base case
        if (index == arr.length - 1) {
            return arr[arr.length - 1];
        }

        // recusive work
        int smallAns = maxValue(arr, index + 1);

        // self work
        return Math.max(smallAns, arr[index]);
    }

    public static void main(String[] args) {
        int arr[] = {1, 5, 6, 3, 7, 23, 89, 21};

        // to find maximum value from array
        int ans = maxValue(arr, 0);
        System.out.println("Maximum Value of the given array is: " + ans);
    }
}
