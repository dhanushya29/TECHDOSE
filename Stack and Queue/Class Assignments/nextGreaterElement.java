import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class nextGreaterElement {
    // class Solution {
       public static void main(String[]args){
        int []arr={2,5,8,7,9};
        Stack<Integer>stk=new Stack<>();
        int[] res=new int[5];
        for(int i=4;i>=0;i--){
            while(!stk.isEmpty() && stk.peek()<=arr[i]){
                stk.pop();
            }
            res[i]=stk.isEmpty()?-1:stk.peek();
            stk.push(arr[i]);
        }
        System.out.println(Arrays.toString(res));
       }
    }
