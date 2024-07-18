import java.util.LinkedList;
import java.util.Queue;

public class Q2_printQueue {
    public static void main(String[] args) {
        //Print all the elements of a queue using helper queue.
        Queue<Integer> q=new LinkedList<>();
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

        Queue<Integer> helper=new LinkedList<>();
        while(q.size()!=0){
            int x=q.poll();
            System.out.print(x+" ");
            helper.offer(x);
        }
        System.out.println();
        while(helper.size()!=0){
            int x=helper.poll();
            // System.out.print(x+" ");
            q.offer(x);
        }


        System.out.println(q);
    }
}
