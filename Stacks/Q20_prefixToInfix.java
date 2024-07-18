import java.util.Stack;

public class Q20_prefixToInfix {

    public static void main(String[] args) {
         String str="-9/*+5346";

        Stack<String> val=new Stack<>();
        for(int i=str.length()-1;i>=0;i--){
            char ch=str.charAt(i);
            int assci=(int)ch;

            if(assci>=48 && assci<=57){
                val.push(""+ch);
            }else{
                String v1=val.pop();
                String v2=val.pop();

                if(ch=='+') val.push(v1+"+"+v2);
                if(ch=='-') val.push(v1+"-"+v2);
                if(ch=='*') val.push(v1+"*"+v2);
                if(ch=='/') val.push(v1+"/"+v2);
            }
        }

        System.out.println("Answer: "+val.peek());
    }
}