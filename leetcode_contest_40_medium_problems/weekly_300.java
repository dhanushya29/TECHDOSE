import java.util.Arrays;

public class weekly_300 {
    
 //* Definition for singly-linked list.
  public class ListNode {
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
  }
 
class Solution {
     public int[][] spiralMatrix(int m, int n, ListNode head) {
        int [][] ans=new int[m][n];
        for(int [] arr:ans){
            Arrays.fill(arr,-1);
        }
        int rB=0,rE=m-1,cB=0,cE=n-1;
        ListNode curr=head;
        while(rB<=rE && cB<=cE && curr!=null){
            for(int i=cB;i<=cE && curr!=null;i++){
                if(curr!=null){
                ans[rB][i]=curr.val;}          
                curr=curr.next;
            }
            rB++;
            for(int i=rB;i<=rE && curr!=null;i++){
                if(curr!=null){
                ans[i][cE]=curr.val;}
                curr=curr.next;
            }
            cE--;
            if(rB<=rE){
                for(int i=cE;i>=cB && curr!=null;i--){
                    if(curr!=null){
                        ans[rE][i]=curr.val;
                    }
                    curr=curr.next;
                }
            }
            rE--;
            if(cB<=cE){
                for(int i=rE;i>=rB && curr!=null;i--){
                    if(curr!=null){
                        ans[i][cB]=curr.val;
                    }
                    curr=curr.next;
                }
            }
            cB++;
        }
        return ans;
    // }
}
}
}
