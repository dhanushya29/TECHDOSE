public class isPlaindrome {
    /**
  Definition for singly-linked list.**/
  public class ListNode {
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 
 
public class isPalindrome{
    // ListNode second;
    public ListNode reverse(ListNode second){
        ListNode curr=second;
        ListNode prev=null,next=null;
        // System.out.println(curr.val);
        while(curr!=null){
            next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;
            // System.out.println(next.val+" "+curr.val+" "+prev.next);
        }
        // System.out.println(prev.val);
        second=prev;
        return second;
        // System.out.println(second.val);
    }
    public boolean compare(ListNode a,ListNode b){
        boolean result=true;
        ListNode start=a;
        ListNode second=b;
        System.out.println(start.val+" "+second.val);
        while(start!=null && second!=null){
            if(start.val==second.val){
                start=start.next;
                second=second.next;
                result=true;
            }else{
                return false;
            }
        }
        if(start == null && second==null)return true;
        return false;
    }
    public boolean isPalindrome(ListNode head) {
        ListNode second,mid=null,prev=head;
        ListNode slow=head,fast=head;
        if(head==null || head.next==null)return true;
        while(fast!=null && fast.next!=null){
            fast=fast.next.next;
            prev=slow;
            slow=slow.next;
        }
        if(fast!=null){
            mid=slow;
            slow=slow.next;
        }
        second=slow;
        // System.out.println(mid.val+" "+prev.val+" "+slow.val+" "+newStart.val+" ");
        prev.next=null;
        boolean res=true;
        second=reverse(second);
        System.out.println(second.val);
        res=compare(head,second);
        // System.out.print(res);
        second=reverse(second);
                System.out.println(second.val);

        if(mid!=null){
            prev.next=mid;
            mid.next=second;
        }else prev.next=second;
        return res;
    }
}
}
}