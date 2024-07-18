import java.util.Scanner;

public class MultipleOf5And7 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter any number: ");
        int n=sc.nextInt();
        for(int i=1;i<=n;i++){
            if(i%5==0 && i%7==0){
                System.out.println("Multiple of 5 and 7 is: "+i);
            }
        }
        sc.close();
    }
}
