import java.util.Scanner;

public class ReverseTheNumber {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter any number: ");
        int num=sc.nextInt();
        int ans=0;
        while(num>0){
            ans = ans*10 + num%10;
            num/=10;
        }
        System.out.print("Reversed number is: "+ans);
        sc.close();
    }
}
