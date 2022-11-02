import java.util.*;

public class queueUsingLinkedList {
    static Node res=null;
    static Node front=null;
    static Node rear=null;
    public static boolean isEmpty(){
        return front==null;
    }
    public static void enqueue(int x){
        Node nn=new Node(x);
        if(isEmpty())front = rear = nn;
        rear.next=nn;
        rear=rear.next;
    } 
    public static int dequeue(){
        if(isEmpty())return -1;
        int res=front.data;
        front=front.next;
        return res;
    }
    public static int peek(){
        if(isEmpty())return -1;
        int res=front.data;
        // front=front.next;
        return res;
    }
    public static int Rear(){
        if(isEmpty())return -1;
        int res=rear.data;
        // front=front.next;
        return res;
    }
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        // System.out.println("Enter the capacity:");
        // int capacity=sc.nextInt();
        // setCapacity(capacity);
        // System.out.println("Cap:"+queue.length);
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
                    int del=dequeue();
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
