import java.util.HashMap;

public class Q2_frequentElement {
    public static void main(String[] args) {
        int arr[]={1,2,3,3,3,4,5,5,6,6,3,3,8,9,9,9,9,9,9,0};
        // print the most frequent element that occurs most of the time
        HashMap<Integer,Integer> mp=new HashMap<>();
        int max=-1;
        int ans=-1;
        for(int i=0;i<arr.length;i++){
            if(!mp.containsKey(arr[i])){
                mp.put(arr[i], 1);
            }else{
                mp.put(arr[i], mp.get(arr[i])+1);
            }
            // max=Math.max(max, mp.get(arr[i]));
        }

      

        for(var e: mp.keySet()){
            if(max<mp.get(e)){
                ans=e;
                max=mp.get(e);
            }
            
        }
        System.out.println(ans);
    }
}
