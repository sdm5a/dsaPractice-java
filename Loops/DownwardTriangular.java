import java.util.Scanner;

public class DownwardTriangular {
     public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number of rows: ");
        int r=sc.nextInt();
        System.out.println("Required Pattern");
        for(int i=r;i>=0;i--){
            for(int j=1;j<=i;j++){
                System.out.print("* ");
            }
            System.out.println("");
        }
        sc.close();
    }
}
