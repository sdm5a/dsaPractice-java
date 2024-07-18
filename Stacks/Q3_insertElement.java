import java.util.Scanner;
import java.util.Stack;

public class Q3_insertElement {
    public static void main(String[] args) {
         Stack<Integer> s=new Stack<>();
        s.push(1);
        s.push(2);
        s.push(3);
        s.push(4);
        s.push(5);
        s.push(6);
        s.push(7);
        System.out.println("Original Stack :"+s);

        int size=s.size();
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the index: ");
        int idx=sc.nextInt();
        System.out.print("Enter the value: ");
        int element=sc.nextInt();

        Stack<Integer> s1=new Stack<>();
        for(int i=1;i<=size-idx+1;i++){
            s1.push(s.pop());
        }
        s.push(element);

        for(int i=1;i<=size-idx+1;i++){
            s.push(s1.pop());
        }

        System.out.println("After inserting element: "+s);
        sc.close();
    }
}
