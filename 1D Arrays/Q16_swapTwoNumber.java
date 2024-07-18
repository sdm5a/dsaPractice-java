
import java.util.Scanner;

public class Q16_swapTwoNumber {

    static void swapByTemp(int a, int b) {
        int temp = a;
        a = b;
        b = temp;
        System.out.printf("Swaped value: a=%d b=%d", a, b);
    }

    static void swapWithoutTemp(int a, int b) {
        a = a + b;
        b = a - b;
        a = a - b;
        System.out.printf("Swaped value: a=%d b=%d", a, b);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Code to swap using temp
        System.out.print("Enter the value of a: ");
        int a = sc.nextInt();
        System.out.print("Enter the value of b: ");
        int b = sc.nextInt();

        // swapByTemp(a, b);
        swapWithoutTemp(a, b);
        sc.close();
    }
}
