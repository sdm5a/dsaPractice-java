
public class Q3_reverseLL {

    public static void displayInReverse(Node temp) {

        if (temp == null) {
            return;
        }
        Node head = temp;
        displayInReverse(head.next);
        System.out.println(head.data);

    }

    public static class Node {

        int data;
        Node next;

        Node(int data) {
            this.data = data;
        }
    }

    public static void main(String[] args) {
        // Reverse linked list using recursion.

        // creating of nodes
        Node a = new Node(78);
        Node b = new Node(7);
        Node c = new Node(8);
        Node d = new Node(18);
        Node e = new Node(12);
        Node f = new Node(41);
        Node g = new Node(01);

        // making connection
        a.next = b;
        b.next = c;
        c.next = d;
        d.next = e;
        e.next = f;
        f.next = g;

        displayInReverse(a);

    }
}
