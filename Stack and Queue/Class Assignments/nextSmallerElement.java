import java.util.Arrays;
import java.util.Stack;
public class nextSmallerElement {
    public static void main(String[]args){
        int []arr={4,1,3,2};
        Stack<Integer> stk=new Stack<>();
        int []res=new int[4];
        int ind=0;
        for(int i=3;i>=0;i--){
            while(!stk.isEmpty() && stk.peek()<=arr[i]){
                // res[ind++]=arr[i];
                stk.pop();
            }
            res[i]=stk.isEmpty()?-1:arr[i];
            stk.push(arr[i]);
        }
        System.out.println(Arrays.toString(res));
    }
}
