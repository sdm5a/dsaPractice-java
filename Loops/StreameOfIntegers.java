import java.util.Scanner;

public class StreameOfIntegers{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int sum=0;
        while(true){
            System.out.println("Enter integer to add:");
            int num=sc.nextInt();
            if(num>0){
                sum=sum + num;
            }else{
                System.out.println("Entered number is negative.");
                break;
            }
        }
        System.out.println("Total sum is:"+sum);    
        sc.close();
    }
}