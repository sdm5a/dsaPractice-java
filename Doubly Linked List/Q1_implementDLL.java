public class Q1_implementDLL{

    public static class Node{
        int data;
        Node next;
        Node prev;
        
        Node(int data){
            this.data=data;
        }
    }

    public static void display(Node head){
        Node temp=head;

        while (temp!=null) {
            System.out.print(temp.data+" ");
            temp=temp.next;
        }
        System.out.println();
    }


    public static void displayT(Node tail){
        Node temp=tail;
        while (temp.prev!=null) {
            temp=temp.prev;
        }
        display(temp);
    }

    public static void displayN(Node n){
        while (n.prev!=null) {
            n=n.prev;
        }
        display(n);
    }

    public static void main(String[] args) {
        // Implement doubly linked list and write function to diplay from head, from tail and from any node
        Node a=new Node(1);
        Node b=new Node(2);
        Node c=new Node(3);
        Node d=new Node(4);
        Node e=new Node(5);
        Node f=new Node(6);
        Node g=new Node(7);
        Node h=new Node(8);
        Node i=new Node(9);

        // making connection
        a.next=b;
        b.prev=a;
        b.next=c;
        c.prev=b;
        c.next=d;
        d.prev=c;
        d.next=e;
        e.prev=d;
        e.next=f;
        f.prev=e;
        f.next=g;
        g.prev=f;
        g.next=h;
        h.prev=g;
        h.next=i;
        i.prev=h;

        // funtion to display from head
        display(a);

        // function to display form tail
        displayT(i);

        // function to display from any node
        displayN(e);
        

    }
}