import java.util.HashMap;
import java.util.Map;

public class Q1_inBuiltHashMap{
    public static void main(String[] args) {
        Map<String,Integer> mp=new HashMap<>();
        mp.put("Saddam", 85);
        mp.put("Rahul", 90);
        mp.put("Ritesh", 80);
        mp.put("Suraj", 75);
        mp.put("Shashi", 70);
        mp.put("Awantika", 92);

        System.out.println(mp.get("Awantika")); 
        System.out.println(mp.containsKey("Saddam"));
        mp.remove("Rahul");
        mp.put("Suraj", 80);
        mp.putIfAbsent("Pranil", 0);
        System.out.println(mp.keySet());
        System.out.println(mp.values());
        System.out.println(mp.entrySet());

        System.out.println(mp);

        // traversing across all entry on keyset
        for (String k : mp.keySet()) {
            System.out.println(mp.get(k));
        }

        for (Map.Entry<String,Integer> e : mp.entrySet()) {
            System.out.printf("%s" +" = "+ "%d\n",e.getKey(),e.getValue());
        }

        for(var e: mp.entrySet()){
            System.out.printf("%s" +" = "+ "%d\n",e.getKey(),e.getValue());
        }
    }
}