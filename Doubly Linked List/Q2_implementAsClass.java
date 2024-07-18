public class Q2_implementAsClass {

    public static class Node{
        int data;
        Node next;
        Node prev;

        Node(int data){
            this.data=data;
        }
    }

    public static class DoublyLL{
        Node head=null;
        Node tail=null;
        int size=0;

        void insertAtEnd(int data){
            if(head==null){
                insertAtStart(data);
                return;
            }

            Node temp=head;
            while (temp.next!=null) {
                temp=temp.next;
            }
            Node s=new Node(data);
            temp.next=s;
            s.prev=temp;
            size++;
        }

        void insertAtStart(int data){
            Node s=new Node(data);
            s.next=head;
            head=s;
            size++;
        }

        void insertAtIndex(int data ,int n){
            Node temp=head;
            for(int i=1;i<n-1;i++){
                temp=temp.next;
            }
            Node s=new Node(data);
            s.next=temp.next;
            temp.next.prev=s;
            temp.next=s;
            s.prev=temp;
            size++;
        }

        void display(){
            Node temp=head;
            while (temp!=null) {
                System.out.print(temp.data+" ");
                temp=temp.next;
            }
            System.out.println();
        }

        void deleteStart(){
            head.next.prev=null;
            head=head.next;
            size--;
        }

        void deleteEnd(){
            Node temp=head;
            while (temp.next.next!=null) {
                temp=temp.next;
            }
            temp.next=null;
            size--;
        }

        void deleteAtIndex(int n){
            Node temp=head;
            for(int i=1;i<n-1;i++){
                temp=temp.next;
            }
            temp.next=temp.next.next;
            temp.next.next.prev=temp;
            size--;
        }
        
    }


    public static void main(String[] args) {
        // Implementation of doubly linked list as class and write various function to add element 
        // delete element from various node , to display
        DoublyLL d=new DoublyLL();
        d.insertAtStart(2);
        d.insertAtStart(3);
        d.insertAtStart(4);
        d.insertAtStart(5);
        d.insertAtStart(6);
        d.insertAtStart(7);

        d.display();

        d.insertAtEnd(52);
        d.insertAtStart(14);
        d.display();

        d.insertAtIndex(10, 3);
        d.display();
        
        System.out.println("Size: "+d.size);
        d.deleteStart();
        d.deleteEnd();
        d.deleteAtIndex(3);
        d.display();
        System.out.println("Size:"+d.size);

    }
}
