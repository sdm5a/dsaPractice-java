public class Q5_circularQueue {

    public static class CircularQue {
        private int []arr=new int[5];
        int idx=-1;
        int front=0;
        int rear=-1;
        int size=0;

        void add(int x){
            if(size==arr.length){
                System.out.println("Queue Is Full");
                return;
            }else if(size==0){
                arr[++idx]=x;
                rear=idx;
                size++;
                return;
            }else if(size>0){
                if(rear<=arr.length){
                    arr[++rear]=x;
                    rear=idx;
                    size++;
                }else if(rear>arr.length){
                    arr[0]=x;
                    rear=0;
                    size++;
                }
            }
            
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

            if(rear<front){
                for(int i=front;i<=arr.length;i++){
                    System.out.print(arr[i]+" ");
                }
                for(int i=0;i<=rear;i++){
                    System.out.print(arr[i]+" ");
                }
                 
            }else{
                for(int i=front;i<=size;i++){
                    System.out.print(arr[i]+" ");
                }
                System.out.println();
            }
            
            
        }
    }
    public static void main(String[] args) {
        // implement circular queue using array
        CircularQue q=new CircularQue();
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(5);
        System.out.println(q.size);
        q.display();
        System.out.println(q.poll());
        // q.display();
        // System.out.println(q.peek());
        // System.out.println(q.isEmpty());
    }
}
