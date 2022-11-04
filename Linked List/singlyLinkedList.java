import java.util.*;
public class singlyLinkedList {
    static Node ll=null;
    static void append(int data){
        Node nn=new Node(data);
        if(ll==null){
            ll=nn;
            return;
        }
        Node tmp = ll;
        while(tmp.next!=null){
            tmp= tmp.next;
        }
        tmp.next=nn;
    }
    static void prepend(int data){
        Node nn=new Node(data);
        nn.next=ll;
        ll=nn;
    }
    public static void insertAt(int pos,int val){
        Node nn=new Node(val);
        if(ll==null ){
                ll=nn;
        }
        else if(pos-1==0){
            nn.next=ll;
            ll=nn;
        }
        else{ 
                Node temp=ll;
                while(--pos>1){
                    // prev=temp;
                    temp=temp.next;
                }
                nn.next=temp.next;
                temp.next=nn;
            }
        }
        public static boolean search(int val){
            Node temp=ll;
            // boolean result=false;
            while(temp!=null){
                if(temp.data==val)return true;
                temp=temp.next;
            }
            return false;
        }
        public static int deleteAt(int pos){
            Node temp=ll;
            int del=0;
            while(--pos>1){
                temp=temp.next;
            }
            System.out.println(temp.data);
            del=temp.next.data;
            temp.next=temp.next.next;    
            return del;
        }  
        public static int poll(){
            int res=ll.data;
            ll=ll.next;
            return res;
        }  
        public static int pop(){
            Node nn=ll;
            while(nn.next.next!=null)nn=nn.next;
            int res=nn.next.data;
            nn.next=null;
            return res;
        } 
        public static void display(){
            Node temp=ll;
            // System.out.println("HEllo");
            while(temp!=null){
                System.out.println(temp.data+" ");
                temp=temp.next;
            }
        }
        public static void main(String[]args){
            Scanner sc=new Scanner(System.in);
            while(true){
                System.out.println(" Enter the option \n1)append\n2)prepend \n3)insertAt \n4)search \n5)deleteAt\n 6)poll \n7)pop \n8)display");
                int option = sc.nextInt();
                boolean exit= false;
                switch(option){
                    case 1:
                        System.out.println("Enter the value to append:");
                        int val = sc.nextInt();
                        append(val);
                        break;
                    case 2:
                        System.out.println("Enter the value to prepend:");
                        int val2 = sc.nextInt();
                        prepend(val2);
                        break;
                    case 3:
                        System.out.println("Enter the value :");
                        int val3 = sc.nextInt();
                        System.out.println("Enter the position :");
                        int pos = sc.nextInt();
                        insertAt(pos,val3);
                        break;
                    case 4:
                        System.out.println("Enter the value to search:");
                        int val4 = sc.nextInt();
                        System.out.println(search(val4));
                        break;
                    case 5:
                        System.out.println("Enter the position :");
                        int pos2 = sc.nextInt();
                        deleteAt(pos2);
                        break;
                    case 6:
                        System.out.println("polled element is "+poll());
                        break;
                    case 7:
                        System.out.println("popped element is"+pop());
                        break;
                    case 8:
                        System.out.println("linked list is");
                        display();
                        break;
    
                    default:
                        exit = true;
                        break;
                }
                if(exit)break;
            }
        }
    }
