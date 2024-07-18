import java.util.Scanner;

public class SumOfSeries {
    public static void main(String[] args) {
        // S = 1-2+3-4+5....n
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the value of n: ");
        int n=sc.nextInt();
        int sum=0;
        for(int i=1;i<=n;i++){
            if(i%2==0){
                sum-=i;
            }else{
                sum+=i;
            }
        }
        System.out.print("Sum of the series is: "+sum);
        sc.close();
    }
}
