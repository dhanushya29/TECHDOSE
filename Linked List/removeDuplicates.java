

/**
 * Definition for singly-linked list.**/
class ListNode {
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
  }
 
public class removeDuplicates {
    public ListNode deleteDuplicates(ListNode head) {
        ListNode temp=head;
        while(temp!=null && temp.next!=null){
            if(temp.val == temp.next.val)temp.next=temp.next.next;
            else temp=temp.next;
        }
        return head;
    }
}