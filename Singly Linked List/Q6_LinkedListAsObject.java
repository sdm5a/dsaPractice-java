
public class Q6_LinkedListAsObject {

    public static class Node {

        int data;
        Node next;

        Node(int data) {
            this.data = data;
        }

    }

    public static class LinkedList {

        Node head = null;
        Node tail = null;
        int size = 0;

        void addAtEnd(int data) {
            Node temp = head;
            Node n = new Node(data);
            if (head == null) {
                addAtStart(data);
                return;
            }
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = n;
            size++;
        }

        void addAtStart(int data) {
            Node temp = head;
            Node n = new Node(data);
            n.next = temp;
            head = n;
            size++;
        }

        void addAtIndex(int data, int index) {
            Node temp = head;
            Node n = new Node(data);
            if (head == null) {
                addAtStart(data);
                return;
            }
            for (int i = 1; i < index - 1; i++) {
                temp = temp.next;
            }
            n.next = temp.next;
            temp.next = n;
            size++;
        }

        int elementAtIndex(int index) {
            Node temp = head;
            for (int i = 1; i < index; i++) {
                temp = temp.next;
            }
            return temp.data;
        }

        void deleteAtIndex(int index) {
            Node temp = head;
            if (head == null) {
                return;
            }
            if (head.next == null && index < 2) {
                return;
            }
            for (int i = 1; i < index - 1; i++) {
                temp = temp.next;
            }
            temp.next = temp.next.next;
            size--;
        }

        void display() {
            Node temp = head;
            while (temp != null) {
                System.out.print(temp.data + " ");
                temp = temp.next;
            }
            System.out.println();
        }

    }

    public static void main(String[] args) {
        // Implement LinkedList as an object as class and create various function like addAtIndex, 
        // addAtEnd, addAtStart, getSize, elementAtIndex, deleteAtIndex, etc.
        LinkedList l = new LinkedList();
        l.addAtStart(05);
        l.addAtStart(06);
        l.addAtStart(07);
        l.display();
        l.addAtEnd(78);
        l.addAtEnd(12);
        l.display();
        l.addAtIndex(036, 2);
        l.display();

        System.out.println("Element at index 3 is: " + l.elementAtIndex(3));

        System.out.println("Length of given linked list: " + l.size);

        l.deleteAtIndex(3);
        l.display();
    }
}
