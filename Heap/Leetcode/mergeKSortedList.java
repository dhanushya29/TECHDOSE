package Heap.Leetcode;

import java.util.PriorityQueue;

public class mergeKSortedList {
    /**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode mergeKLists(ListNode[] lists) {
        ListNode res=new ListNode(-1);
        ListNode temp=res;
        PriorityQueue<ListNode>pq=new PriorityQueue<>((a,b)->a.val-b.val);
        for(ListNode list:lists){
            if(list!=null)
            pq.add(list);
        }
        while(!pq.isEmpty()){
            ListNode front=pq.poll();
            ListNode nextNode=front.next;
            front.next=null;
            temp.next=front;
            if(nextNode!=null) pq.add(nextNode);
            temp = temp.next;
        }
        return res.next;
    }
}
}
