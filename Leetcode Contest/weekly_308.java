import java.util.Stack;

public class weekly_308 {
    // class Solution {
        public String removeStars(String s) {
            Stack<Character> stk=new Stack<Character>();
            int len=s.length();
            for(int i=0;i<len;i++){
                if(s.charAt(i)=='*'){
                    stk.pop();
                }else
                stk.push(s.charAt(i));
            }
            StringBuilder str=new StringBuilder();
            stk.forEach(x->str.append(x));
            return str.toString();
        // }
    }
}
