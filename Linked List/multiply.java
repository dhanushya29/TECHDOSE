public class multiply {
 
    public static Node reverse(Node head){
        Node curr=head,prev=null,next=null;
        while(curr!=null){
            next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;
        }
        return prev;
    }
     public static int size(Node head){
        Node temp = head;
        int len = 0;
        while(temp!=null){
            len++;
            temp = temp.next;
        }
        return len;
     }
    public static Node multiplyLL(Node head1, Node head2) {
        // Write your code here
        head1=reverse(head1);
        head2=reverse(head2);
        int sum=0,carry=0;
        Node ans=new Node(0);
        Node temp=ans;
        int m=size(head1);
        int n=size(head2);
        for(int i=1;i<=m+n+1;i++){
            temp.next=new Node(0);
            temp=temp.next;
        }
        Node start=ans;
        while(head2!=null){
            carry=0;
            Node val1=head1,t=start;
            while(val1!=null){
                sum=t.data+(val1.data*head2.data)+carry;
                carry=sum/10;
                sum%=10;
                t.data=sum;
                t=t.next;
                val1=val1.next;
            }
            if(carry>0)t.data+=carry;
            start=start.next;
            head2=head2.next;
        }
        Node res=reverse(ans);
        while(res.next!=null && res.data==0){
            res=res.next;
        }
        return res;
    }
}

