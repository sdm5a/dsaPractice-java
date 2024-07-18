import java.util.Stack;

public class Q13_infixEvaluation {
    public static void main(String[] args) {
        String str = "9-(5+3)*4/6";
        Stack<Character> op = new Stack<>();
        Stack<Integer> val = new Stack<>();

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            int assci = (int) ch;
            if (assci >= 48 && assci <= 57) val.push(assci - 48);
            else if(op.size() == 0 || ch=='(' || op.peek()=='(') op.push(ch);
            else if(ch==')'){
                while (op.peek()!='(') {
                    int v1 = val.pop();
                    int v2 = val.pop();
                    if (op.peek() == '+') val.push(v2 + v1);
                    if (op.peek() == '-') val.push(v2 - v1);
                    if (op.peek() == '*') val.push(v2 * v1);
                    if (op.peek() == '/') val.push(v2 / v1);
                    op.pop();  
                }
                op.pop();
            }
            else{
                if (ch == '+' || ch == '-') {
                    int v1 = val.pop();
                    int v2 = val.pop();
                    if (op.peek() == '+') val.push(v2 + v1);
                    if (op.peek() == '-') val.push(v2 - v1);
                    if (op.peek() == '*') val.push(v2 * v1);
                    if (op.peek() == '/') val.push(v2 / v1);
                    op.pop();    
                    op.push(ch);
                }

                if (ch == '*' || ch == '/') {
                    if (op.peek() == '*' || op.peek() == '/') {
                        int v1 = val.pop();
                        int v2 = val.pop();
                        if (op.peek() == '*') val.push(v2 * v1);
                        else val.push(v2 / v1);
                        op.pop();    
                        op.push(ch);
                    }else op.push(ch);
                }
                
            }

        }

        while (val.size() > 1) {
            int v1 = val.pop();
            int v2 = val.pop();
            if (op.peek() == '+') val.push(v2 + v1);
            if (op.peek() == '-') val.push(v2 - v1);
            if (op.peek() == '*') val.push(v2 * v1);
            if (op.peek()=='/')   val.push(v2 / v1);
            op.pop();
        }

        System.out.println("Answer: " + val.peek());
    }
}
