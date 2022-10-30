public class josephusCircle {
        public static void main(String[] args) {
            System.out.println(solve(5,2));
        }
        static class Node{
            int val;
            Node next,prev;
            Node(){}
            Node(int val){this.val = val;}
        }
        static int solve(int n,int k){
            Node head = null;
            for(int i=1;i<=n;i++)
                head= append(head,i);
            return josephusCircleDeletion(head,k);
        }
        static Node append(Node head,int data){
            if(head ==null){
                head= new Node(data);
                head.next = head;
                head.prev = head;
            }else{
                Node tmp = head;
                while(tmp.next!=head) tmp = tmp.next;
                // tmp is in last node
                Node nn = new Node(data);
                tmp.next = nn;
    
                nn.prev=  tmp;
                nn.next = head;
    
                head.prev= nn;
            }
            return head;
        }
        static boolean delete(Node prev,Node temp){
            if(prev==temp)return true;
            prev.next=temp.next;
            temp.next.prev=prev;
            return false;
        }
        static int josephusCircleDeletion(Node head,int k){
            Node temp=head;
            boolean flag=false;
            while(!flag){
                for(int i=1;i<k;i++){
                    temp=temp.next;
                }
                flag=delete(temp.prev,temp);
                temp=temp.next;
            }
            return temp.val;
        }
}

