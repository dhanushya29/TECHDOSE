public class reverseStackWithoutExtraSpace {
    public static void reverse(){
        Node top=null;
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
}
