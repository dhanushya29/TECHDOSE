import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class nextGreaterElement {
    // class Solution {
        public int[] nextGreaterElement(int[] nums1, int[] nums2) {
            int len=nums1.length,len2=nums2.length;
            int[]ans=new int[len];
            Stack<Integer> stk=new Stack<>();
            Map<Integer,Integer> map=new HashMap<>();
            for(int i=0;i<len2;i++){
                while(!stk.isEmpty() && stk.peek()<nums2[i]){
                    map.put(stk.pop(),nums2[i]);
                }
                stk.push(nums2[i]);
            }
            for(int i=0;i<len;i++){
                nums1[i]=map.getOrDefault(nums1[i],-1);
            }
            return nums1;
        }
    }
