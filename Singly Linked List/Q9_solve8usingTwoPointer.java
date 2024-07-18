
import java.util.Scanner;

public class Q9_solve8usingTwoPointer {

    public static class Node {

        int data;
        Node next;

        Node(int data) {
            this.data = data;
        }

    }

    public static int size(Node head) {
        Node temp = head;
        int size = 0;

        while (temp != null) {
            temp = temp.next;
            size++;
        }

        return size;
    }

    public static int findNthNodeFromEnd(Node head, int idx) {
        Node fast = head;
        Node slow = head;
        for (int i = 1; i <= idx; i++) {
            fast = fast.next;
        }

        while (fast != null) {
            slow = slow.next;
            fast = fast.next;
        }

        return slow.data;
    }

    public static void display(Node head) {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Node a = new Node(5);
        Node b = new Node(7);
        Node c = new Node(8);
        Node d = new Node(1);
        Node e = new Node(6);
        Node f = new Node(4);
        Node g = new Node(3);

        a.next = b;
        b.next = c;
        c.next = d;
        d.next = e;
        e.next = f;
        f.next = g;

        System.out.println("The given LinkedList: ");
        display(a);

        System.out.print("Enter the value of index: ");
        int idx = sc.nextInt();

        int ans = findNthNodeFromEnd(a, idx);
        System.out.println("The nth node from end is: " + ans);
        sc.close();
    }
}
