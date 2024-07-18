public class Q5_stacksUsingLinkedList {

    public static class  Node {
        int data;
        Node next;
        Node(int data){
            this.data=data;
        }
    
    }

    public static class LLStack {
        Node head=null;

        void push(int data){
            Node n=new Node(data);
            n.next=head;
            head=n;
        
        }

        int pop(){
            int a=head.data;
            if(head==null){
                System.out.println("Stack is Empty.");
                return -1;
            }
            head=head.next;
            return a;
        }

        void peek(){
            System.out.println(head.data);
        }

        boolean isEmpty(){
            if(head==null){
                return true;
            }
            return false;
        }

        void displayrec(Node head){
            Node temp=head;
            if(temp==null) return;
            displayrec(temp.next);
            System.out.print(temp.data+" ");
            
        }

        void display(){
            displayrec(head);
            System.out.println();
        }

        void displayrev(){
            Node temp=head;
            while (temp!=null) {
                System.out.print(temp.data+" ");
                temp=temp.next;
            }
            System.out.println();
        }
        
    }
    public static void main(String[] args) {
        LLStack s=new LLStack();
        s.push(2);
        s.push(4);
        s.push(9);
        s.push(1);
        s.push(7);
        s.push(2);
        s.push(4);
        s.push(9);
        s.push(1);
        s.push(7);
        s.display();
        // System.out.println(s.isFull());
        s.push(47);
        s.display();
        s.pop();
        s.display();
    }
}
