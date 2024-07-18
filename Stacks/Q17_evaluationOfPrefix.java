import java.util.Stack;

public class Q17_evaluationOfPrefix {
    public static void main(String[] args) {
        String str="-9/*+5346";

        Stack<Integer> val=new Stack<>();
        for(int i=str.length()-1;i>=0;i--){
            char ch=str.charAt(i);
            int assci=(int)ch;

            if(assci>=48 && assci<=57){
                val.push(assci-48);
            }else{
                int v1=val.pop();
                int v2=val.pop();

                if(ch=='+') val.push(v1+v2);
                if(ch=='-') val.push(v1-v2);
                if(ch=='*') val.push(v1*v2);
                if(ch=='/') val.push(v1/v2);
            }
        }

        System.out.println("Answer: "+val.peek());
    }
}
