public class Q3_arrayImplementation {

    public static class Que{
        private int []arr=new int[15];
        int idx=-1;
        int front=0;
        int rear=-1;
        int size=0;

        void add(int x){
            if(idx==arr.length){
                System.out.println("Queue Is Full");
                return;
            }
            arr[++idx]=x;
            rear=idx;
            size++;
        }
        
        int peek(){
            if(idx==-1){
                System.out.println("Queue Is Empty");
                return -1;
            }
            
            return arr[front];
        }
        
        int poll(){
            if(idx==-1){
                System.out.println("Queue Is Empty");
                return -1;
            } 
            int x=arr[front];
            arr[front]=0;
            front++;
            return x;
        }

        boolean isEmpty(){
            if(size==0) return true;
            return false;
        }

        void display(){
            
            for(int i=front;i<=rear;i++){
                System.out.print(arr[i]+" ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        // Array implementation of Queue as class
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
