import java.util.Stack;

public class Q2_copyInSameOrder {
    public static void main(String[] args) {
        Stack<Integer> s=new Stack<>();
        s.push(1);
        s.push(2);
        s.push(3);
        s.push(4);
        s.push(5);
        s.push(6);
        s.push(7);
        System.out.println(s);
        Stack<Integer> s1=new Stack<>();
        int size=s.size();
        for(int i=1;i<=size;i++){
            s1.push(s.pop());
        }
        System.out.println(s1);
        Stack<Integer> s2=new Stack<>();
        for(int i=1;i<=size;i++){
            s2.push(s1.pop());
        }

        System.out.println(s2);
    }
}
