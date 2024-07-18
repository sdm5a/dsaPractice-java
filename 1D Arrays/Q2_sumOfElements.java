
public class Q2_sumOfElements {

    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4, 56, 7, 8, 23};
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        System.out.print("Sum of all elements of this array is: " + sum);
    }
}
