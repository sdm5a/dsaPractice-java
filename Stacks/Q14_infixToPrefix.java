import java.util.Stack;

public class Q14_infixToPrefix {
    public static void main(String[] args) {
        String str="9-(4+3)*4/2";
        Stack<String> val=new Stack<>();
        Stack<Character> op=new Stack<>();
        // convert this infix expression into prefix expression
        for(int i=0;i<str.length();i++){
            char ch=str.charAt(i);
            int assci=(int)ch;

            if(assci>=48 && assci<=57){
                val.push(""+ch);
            }
            else if(op.size()==0 || ch=='(' || op.peek()=='('){
                op.push(ch);
            }else if(ch==')'){
                while (op.peek()!='(') {
                    String val2=val.pop();
                    String val1=val.pop();

                    if(op.peek()=='+') val.push("+"+val1+val2);
                    if(op.peek()=='-') val.push("-"+val1+val2);
                    if(op.peek()=='*') val.push("*"+val1+val2);
                    if(op.peek()=='/') val.push("/"+val1+val2);
                    op.pop(); 
                }
                op.pop();
            }
            else{
                if(ch=='+' || ch=='-'){
                    String val2=val.pop();
                    String val1=val.pop();

                    if(op.peek()=='+') val.push("+"+val1+val2);
                    if(op.peek()=='-') val.push("-"+val1+val2);
                    if(op.peek()=='*') val.push("*"+val1+val2);
                    if(op.peek()=='/') val.push("/"+val1+val2);
                    op.pop();
                    op.push(ch);
                }
                if (ch == '*' || ch == '/') {
                    if(op.peek()=='+' || op.peek()=='-') op.push(ch);
                    else{
                        String val2 = val.pop();
                        String val1 = val.pop();

                        if (op.peek() == '*') val.push("*"+val1+val2);
                        else val.push("/"+val1+val2);
                        op.pop();    
                        op.push(ch);
                    }
                 } 
            }
        }

        while(val.size()>1){
            String val2=val.pop();
            String val1=val.pop();

            if(op.peek()=='+') val.push("+"+val1+val2);
            if(op.peek()=='-') val.push("-"+val1+val2);
            if(op.peek()=='*') val.push("*"+val1+val2);
            if(op.peek()=='/') val.push("/"+val1+val2);
            op.pop();
        
        }

        System.out.println(val.peek());
    }
}
