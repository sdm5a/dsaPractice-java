import java.util.Scanner;

public class FactorialuptoN {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the value of n: ");
        int n=sc.nextInt();
        System.out.println("Factorial upto "+n+" is -->");
        for(int i=1;i<=n;i++){
            int fact=1;
            for(int j=1;j<=i;j++){
                fact*=j;
            }
            System.out.println("Factorial of " + i +" is "+fact);
        }
        sc.close();
    }
}
