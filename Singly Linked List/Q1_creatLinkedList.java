//Create a linked list and print it using node temp in loop.

public class Q1_creatLinkedList {

    public static class Node {

        int data;
        Node next;

        Node(int data) {
            this.data = data;
        }

    }

    public static void main(String[] args) {

        // creating nodes
        Node a = new Node(5);
        Node b = new Node(6);
        Node c = new Node(7);
        Node d = new Node(45);
        Node e = new Node(23);
        Node f = new Node(12);

        // making connection between nodes
        a.next = b;
        b.next = c;
        c.next = d;
        d.next = e;
        e.next = f;

        // printing or traversing each node using loop
        while (a != null) {
            System.out.println(a.data);
            a = a.next;
        }

        // by for loop
        for (; a != null;) {
            System.out.println(a.data);
            a = a.next;
        }
    }
}
