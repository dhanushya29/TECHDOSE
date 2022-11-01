import java.util.Arrays;
import java.util.Stack;

public class previousSmallest {
    public static void main(String[] args) {
        int[]arr={9,2,1,0,5};
        int[]res=new int[5];
        Stack<Integer> stk=new Stack<>();
        for(int i=0;i<5;i++){
            while(!stk.isEmpty() && stk.peek()>arr[i]){
                stk.pop();
            }
            res[i]=stk.isEmpty()?-1:stk.peek();
            stk.push(arr[i]);
        }
        System.out.print(Arrays.toString(res));
    }
}
