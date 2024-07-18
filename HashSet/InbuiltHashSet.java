import java.util.HashSet;

public class InbuiltHashSet{
    public static void main(String[] args) {
        HashSet<Integer> s=new HashSet<>();
        s.add(1);
        s.add(2);
        s.add(3);
        s.add(4);
        s.add(5);
        s.add(6);
        s.add(7);
        s.add(8);
        System.out.println(s);

        System.out.println(s.contains(6));
        System.out.println(s.size());
        s.remove(5);
        System.out.println(s);
    }
}