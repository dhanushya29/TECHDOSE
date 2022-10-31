import java.util.Stack;
public class infixToPostfix {
    public static int prec(char ch){
        if(ch=='+' || ch=='-')return 1;
        if(ch=='*' || ch=='/' || ch=='%')return 2;
        if(ch=='^')return 3;
        return 0;
    }
    public static String infixToPostfixFunc(String str){
        Stack<Character> stk=new Stack<>();
        String res="";
        int n=str.length();
        for(int i=0;i<n;i++){
            char ch=str.charAt(i);
            if(Character.isLetter(ch)){
                res=res+ch;
            }
            else if(ch=='(')stk.push(ch);
            else if(ch==')' && !stk.isEmpty()){
                    while(stk.peek()!='('){
                        res=res+stk.pop();
                    }
                    stk.pop();
            }else{
                while(!stk.isEmpty() && !(stk.peek()=='(') && prec(stk.peek())>=prec(ch))
                    res=res+stk.pop();
                    stk.push(ch);
                }
                // if(stk.isEmpty())stk.push(ch);
                // System.out.println(res);
            }
            while(!stk.isEmpty()){
                    res=res+stk.pop();
                }
        return res;
    }
    public static void main(String[]args){
        String str="(A/(B-C+D))*(E-A)*C";
        System.out.println(infixToPostfixFunc(str));
    }
}
