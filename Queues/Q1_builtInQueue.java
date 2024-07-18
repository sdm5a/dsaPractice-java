import java.util.LinkedList;
import java.util.Queue;

public class Q1_builtInQueue{
    public static void main(String[] args) {
        Queue<Integer> q=new LinkedList<>();
        System.out.println(q.isEmpty());
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(5);
        q.add(6);
        q.add(7);
        q.offer(8);
        q.offer(9);
        q.offer(10);
        q.offer(11);
        
        q.remove();
        q.poll();
        System.out.println(q.size());
        System.out.println(q);
        System.out.println(q.element());
        System.out.println(q.peek());
        System.out.println(q.isEmpty());
    }
}