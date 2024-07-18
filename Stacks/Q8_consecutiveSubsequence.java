import java.util.Stack;

public class Q8_consecutiveSubsequence {

    public static int[] removeSubsequence(int arr[]){
        int n=arr.length;
        Stack<Integer> st=new Stack<>();

        for(int i=0;i<n;i++){
            if(st.empty()) st.push(arr[i]);
            else if(st.peek()!=arr[i]){
                st.push(arr[i]);
            }else if(st.peek()==arr[i]){
                if(i==n-1 || arr[i]!=arr[i+1]){
                    st.pop();
                }
            }
        }

        int size=st.size();
        int ans[]=new int[size];
        for(int i=size-1;i>=0;i--){
            ans[i]=st.pop();
        }
        return ans;
    }
    public static void main(String[] args) {
        int arr[]={1,2,2,3,3,3,7,8,4,4,4,9};
        int ans[]=removeSubsequence(arr);
        System.out.println("Resultant Array :::");
        for(int i=0;i<ans.length;i++){
            System.out.print(ans[i]+" ");
        }
    }
}
