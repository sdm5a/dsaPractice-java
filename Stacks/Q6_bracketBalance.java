import java.util.Scanner;
import java.util.Stack;

public class Q6_bracketBalance {

    public static boolean isBalance(String str){
        int size=str.length();
        Stack<Character> s=new Stack<>();
        for(int i=0;i<size;i++){
            char ch=str.charAt(i);

            if(ch=='('){
                s.push('(');
            }else if(ch==')'){
                if(s.size()==0) return false;
                else{
                    s.pop();
                }
            }
        }

        if(s.size()!=0) return false;
        return true;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the string of brackets: ");
        String str=sc.nextLine();
        if(isBalance(str)){
            System.out.println("BALANCED");
        }else{
            System.out.println("NOT BALANCED");
        }

        sc.close();
    }
}
