
public class Q4_findLengthOfLL {

    // find the length of linked list using recursion
    public static int displayLength(Node temp, int count) {

        if (temp == null) {
            return 0;
        }

        int ans = displayLength(temp.next, count);

        return ans + 1;

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

        int ans = displayLength(a, 0);
        System.out.println(ans);

    }
}
