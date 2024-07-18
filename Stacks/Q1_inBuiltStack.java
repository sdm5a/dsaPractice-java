import java.util.Stack;

public class Q1_inBuiltStack {

    public static void main(String[] args) {
        Stack<Integer> s=new Stack<>();
        s.push(1);
        s.push(2);
        s.push(3);
        s.push(4);
        s.push(5);
        s.push(6);
        s.push(7);
        System.out.println("the given stack :" );
        System.out.println(s);

        System.out.println(s.peek());

        System.out.println(s.size());
        s.pop();
        s.pop();
        s.pop();
        System.out.println(s);
    }
} 