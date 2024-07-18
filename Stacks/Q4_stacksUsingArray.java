public class Q4_stacksUsingArray {

    public static class ArrayStack{
        int idx=0;
        int []arr=new int[10];
        
        
        void push(int data){
            if(isFull()){
                System.out.println("Stack is Full.");
                return;
            }
            arr[idx]=data;
            idx++;
        }

        int pop(){
            if(idx==0){
                System.out.println("Stack is Empty.");
                return -1;
            }
            int top=arr[idx-1];
            arr[idx-1]=0;
            idx--;
            return top;
        } 

        int peek(){
            if(idx==0){
                System.out.println("Stack is Empty.");
                return -1;
            }
            return arr[idx-1];
        }

        void display(){
            for(int i=0;i<=idx-1;i++){
                System.out.print(arr[i]+" ");
            }
            System.out.println();
        }

        boolean isEmpty(){
            if(idx==0) return true;
            else return false;
        }

        boolean isFull(){
            if(idx==arr.length) return true;
            else return false;
        }


        
    }
    public static void main(String[] args) {
     
        ArrayStack s=new ArrayStack();
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
        System.out.println(s.isFull());
        s.push(47);
        
    }
}
