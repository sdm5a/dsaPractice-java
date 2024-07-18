public class Q4_linkedListImpelmentation {

    public static class Node {
        int data;
        Node next;

        Node(int data){
            this.data=data;
        }   
    }

    public static class Que{
        Node front=null;
        Node rear=null;
        int size=0;

        void add(int x){
            Node n=new Node(x);
            if(size==0){
                rear=n;
                front=n;
                size++;
            }else{
                rear.next=n;
                rear=n;
                size++;
            }

        }

        int peek(){
            if(size==0){
                System.out.println("Queue is Empty");
                return -1;
            }
            return front.data;
        }

        int poll(){
            int x=front.data;
            front=front.next;
            return x;
        }

        boolean isEmpty(){
            if(size==0) return true;
            return false;
        }

        void display(){
            Node temp=front;

            while (temp!=null) {
                System.out.print(temp.data+" ");
                temp=temp.next;
            }
            System.out.println();
        }
        
    }
    public static void main(String[] args) {
        // Linked List implementation of Queue as a class
        Que q=new Que();
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(5);
        q.display();
        q.poll();
        q.display();
        System.out.println(q.peek());
        System.out.println(q.isEmpty());
    }
}
