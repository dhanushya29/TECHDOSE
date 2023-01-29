public class designHashMap {
    class MyHashMap {
        class ListNode {
            int key,val;
            ListNode next,prev;
            ListNode(){};
            ListNode(int key,int val){
                this.key=key;
                this.val=val;
            }
        }
        ListNode[]arr;
        int size;
        public MyHashMap() {
            size=1000;
            arr=new ListNode[size];
        }
        public ListNode search(ListNode head,int key){
            ListNode temp=head;
            while(temp!=null){
                if(temp.key==key){
                    return temp;
                }
                temp=temp.next;
            }
            return null;
        }
        public ListNode prepend(ListNode head,int key,int val){
            ListNode nn=new ListNode(key,val);
            // if(head==null)head=nn;
            // else{
                nn.next=head;
               if(head!=null) head.prev=nn;
                head=nn;
            // }
            return nn;
        }
        public ListNode delete(ListNode head,ListNode temp){
            ListNode prevNode=temp.prev,nextNode=temp.next;
            if(nextNode!=null){
                nextNode.prev=prevNode;
            }
            if(prevNode==null){
                return temp.next;
            }
            prevNode.next=nextNode;
            return head;
        }
        public void put(int key, int value) {
            ListNode prev=search(arr[key%size],key);
            if(prev!=null)arr[key%size]=delete(arr[key%size],prev);
            arr[key%size]=prepend(arr[key%size],key,value);
        }
        
        public int get(int key) {
            ListNode prev=search(arr[key%size],key);
            return prev==null?-1:prev.val;
        }
        
        public void remove(int key) {
            ListNode prev=search(arr[key%size],key);
            if(prev!=null)arr[key%size]=delete(arr[key%size],prev);
        }
    }
}
