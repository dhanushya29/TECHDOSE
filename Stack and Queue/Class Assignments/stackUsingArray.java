import java.util.*;
public class stackUsingArray {
    // static int capacity;
    static int[]stack;
     static void setCapacity(int capacity){
        // super.capacity=capacity;
        stack=new int[capacity];
    }
    static int top=-1;
    static int size=0;
   public static boolean isFull(){
      return size==stack.length;
   }
   public static boolean isEmpty(){
      return size==0;
   }
    public static void push(int ele){
        if(!isFull()){
            stack[++top]=ele;
            size++;
        }else{
            System.out.println("Stack full");
        }
    }
    public static int pop(){
        int delete=0;
        if(isEmpty()){
            return -1;
        }
        delete=stack[top--];
        size--;
        return delete;
    }
    public static int top(){
        if(!isEmpty()){
            return stack[top];
        }
        return -1;
    }
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the capacity:");
        int capacity=sc.nextInt();
        setCapacity(capacity);
        System.out.println("Cap:"+stack.length);
        while(true){
            System.out.println("Enter a value:\n1.push\n2.pop \n3.top\n4.exit");
            int option=sc.nextInt();
            switch(option){
                case 1:
                   System.out.println("enter element to push:");
                   int ele=sc.nextInt();
                   push(ele);
                   break;
                case 2:
                    int del=pop();
                    if(del==-1)System.out.println("Stack Empty");
                    else System.out.println("Deleted element is "+del);
                    break;
                case 3:
                    int ans=top();
                    System.out.println("Top element is "+ans);
                    break;
                case 4:
                    break;
            }
            if(option==4)break;
        }
    }
}
