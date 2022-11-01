import java.util.*;
public class queueUsingArray {
    static int[]queue;
     static void setCapacity(int capacity){
        queue=new int[capacity];
    }
    static int front=0,rear=-1,size=0;
    public static boolean isFull(){
        return rear+1==queue.length;
    }
    public static boolean isEmpty(){
        return size==0;
    }
    public static void enqueue(int ele){
        if(!isFull()){
            queue[++rear]=ele;
            size++;
        }else{
            System.out.println("Queue full");
        }
    }
    public static int poll(){
        int del=-1;
        if(!isEmpty())
        {
           del= queue[front++];
            size--;
        }
        return del;
    }
    public static int Rear() {
        if(isEmpty()) return -1;
        return queue[rear];
    }
    public static int peek(){
        int ans=-1;
        if(!isEmpty())
        {
            ans=queue[front];
            // rear--;
        }
        return ans;
    }
    public static void main(String[]args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the capacity:");
        int capacity=sc.nextInt();
        setCapacity(capacity);
        System.out.println("Cap:"+queue.length);
        while(true){
            System.out.println("Enter a value:\n1.enqueue\n2.poll \n3.peek\n4.rear\n5.exit");
            int option=sc.nextInt();
            switch(option){
                case 1:
                   System.out.println("enter element to push:");
                   int ele=sc.nextInt();
                   enqueue(ele);
                   break;
                case 2:
                    int del=poll();
                    if(del==-1)System.out.println("Queue Empty");
                    else System.out.println("Deleted element is "+del);
                    break;
                case 3:
                    int ans=peek();
                    System.out.println("Top element is "+ans);
                    break;
                case 4:
                    int rear=Rear();
                    System.out.println(rear);
                    break;
                default:
                break;

            }
            if(option>=5)break;
        }
    }
}