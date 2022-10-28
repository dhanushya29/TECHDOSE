import java.util.* ;
import java.io.*; 
import java.util.* ;
import java.io.*; 
/****************************************************************

       Following is the class structure of the Node class:

       class Node {
	int data;
	Node next;
	Node child;

	public Node(int data) {
		this.data = data;
		this.next = null;
		this.child = null;
	}
}

*****************************************************************/
class Node {
	int data;
	Node next;
	Node child;

	public Node(int data) {
		this.data = data;
		this.next = null;
		this.child = null;
	}
public class flattenLinkedList {
    public Node merge(Node l1,Node l2){
        Node dummy=new Node(0);
        Node temp=dummy;
        while(l1!=null && l2!=null){
            if(l1.data <= l2.data){
                temp.child=l1;
                l1=l1.child;
                temp=temp.child;
            }
            else{
                temp.child=l2;
                l2=l2.child;
                temp=temp.child;
            }
        }
        if(l1!=null){
            temp.child=l1;
        }
        else{
            temp.child=l2;
        }
        temp.next=null;
        return dummy.child;
    }
	public Node flattenLinkedList(Node start) {
		 //Write your code here
//         Node temp=start;
        if(start==null || start.next==null)return start;
        start.next=flattenLinkedList(start.next);
        start=merge(start,start.next);
        return start;
	}
}
}
