import java.util.Stack;

public class largestRectangleInHistogram {
    class Solution {
        public int largestRectangleArea(int[] heights) {
            Stack<Integer> stk=new Stack<>();
            int n=heights.length;
            int [] left=new int[n];
            for(int i=0;i<n;i++){
                    while(!stk.isEmpty() && heights[i]<=heights[stk.peek()]){
                        stk.pop();
                    }
                    left[i]=stk.isEmpty()?0:stk.peek()+1;
                    stk.push(i);
            }
            // int []right=new int[n];
            stk.clear();
            int maxArea=0;
            // System.out.print(stk);
            for(int i=n-1;i>=0;i--){
                    while(!stk.isEmpty() && heights[i]<=heights[stk.peek()]){
                        stk.pop();
                    }
                    int curr=stk.isEmpty()?n-1:stk.peek()-1;
                    int length=curr-left[i]+1;
                    maxArea=Math.max(maxArea,length*heights[i]);
                    stk.push(i);
            }
            return maxArea;
        }
    }
}
