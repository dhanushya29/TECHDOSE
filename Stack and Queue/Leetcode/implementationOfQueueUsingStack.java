import java.util.Stack;

public class implementationOfQueueUsingStack {
    class MyQueue {
        Stack <Integer> stk1;
        Stack<Integer> stk2;
        public MyQueue() {
            stk1=new Stack<>();
            stk2=new Stack<>();
        }
        
        public void push(int x) {
            while(!stk2.isEmpty()){
                stk1.push(stk2.pop());
            }
            stk1.push(x);
        }
        
        public int pop() {
            while(!stk1.isEmpty()){
                stk2.push(stk1.pop());
            }
           int res= stk2.pop();
            return res;
        }
        
        public int peek() {
            while(!stk1.isEmpty()){
                stk2.push(stk1.pop());
            }
           int res= stk2.peek();
            return res;
        }
        
        public boolean empty() {
            return stk1.isEmpty() && stk2.isEmpty();
        }
    }
    
    /**
     * Your MyQueue object will be instantiated and called as such:
     * MyQueue obj = new MyQueue();
     * obj.push(x);
     * int param_2 = obj.pop();
     * int param_3 = obj.peek();
     * boolean param_4 = obj.empty();
     */
}
