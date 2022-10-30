public class reverseKgroup{
    public static int  size(ListNode head){
        ListNode temp = head;
        int len = 0;
        while(temp!=null){
            len++;
            temp = temp.next;
        }
        return len;
    }
    public ListNode reverseKGroup(ListNode head, int k) {
        int len=size(head);
        ListNode temp=head,prev=null,pret=null;
        // System.out.print(8/3);
        for(int i=0;i<len/k;i++){
            ListNode currtail=temp;
            for(int j=0;j<k;j++){
                ListNode next=temp.next;
                temp.next=prev;
                prev=temp;
                temp=next;
            }
            ListNode currHead=prev;
            if(pret==null)head=currHead;
            else{
                pret.next=currHead;
            }
            pret=currtail;
        }
        pret.next=temp;
        return head;
    }
}