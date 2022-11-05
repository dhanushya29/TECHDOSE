import java.util.*;

public class stackUsingLinkedList {
    static Node top=null;
    public static boolean isEmpty(){
        return top==null;
    }
    public static void push(int x){
        Node nn=new Node(x);
        // if(isEmpty()))top= nn;
        nn.next=top;
        top=nn;
    } 
    public static int pop(){
        if(isEmpty())return -1;
        int res=top.data;
        top=top.next;
        return res;
    }
    public static int topNode(){
        if(isEmpty())return -1;
        int res=top.data;
        return res;
    }
    public static void reverse(){
        Node curr=top,prev=null;
        Node next=null;
        while(curr!=null){
            next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;
        }
        top=prev;
    }
    public static void display(){
        Node temp=top;
        while(temp!=null){
            System.out.println(temp.data);
            temp=temp.next;
        }
    }
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        while(true){
            System.out.println("Enter a value:\n1.push\n2.pop \n3.top\n4.reverse\n5.display");
            int option=sc.nextInt();
            switch(option){
                case 1:
                   System.out.println("enter element to push:");
                   int ele=sc.nextInt();
                   push(ele);
                   break;
                case 2:
                    int del=pop();
                    // if(del==-1)System.out.println("Queue Empty");
                    System.out.println("Deleted element is "+del);
                    break;
                case 3:
                    int ans=topNode();
                    System.out.println("Top element is "+ans);
                    break;
                case 4:
                     reverse();
                     break;
                case 5:
                     display();break;
                default:
                break;

            }
            if(option>=6)break;
        }
    }
}
