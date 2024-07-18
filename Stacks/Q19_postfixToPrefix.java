import java.util.Stack;

public class Q19_postfixToPrefix {
    public static void main(String[] args) {
        String str="953+4*6/-";

        Stack<String> val=new Stack<>();
        for(int i=0;i<str.length();i++){
            char ch=str.charAt(i);
            int assci=(int)ch;

            if(assci>=48 && assci<=57){
                val.push(""+ch);
            }else{
                String v2=val.pop();
                String v1=val.pop();

                if(ch=='+') val.push("+"+v1+v2);
                if(ch=='-') val.push("-"+v1+v2);
                if(ch=='*') val.push("*"+v1+v2);
                if(ch=='/') val.push("/"+v1+v2);
            }
        }

        System.out.println("Answer: "+val.peek());

    }
}
