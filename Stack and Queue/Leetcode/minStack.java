import java.util.Stack;

public class minStack {
    class MinStack {
        Stack<Long> stk;
        long min=-1;
        public MinStack() {
            stk=new Stack<>();
        }
        
        public void push(long val) {
            if(stk.isEmpty()){
                min=val;
                stk.push(val);
            }else{
                if(min<=val)stk.push(val);
                else {
                    // min=2*val - min;
                    stk.push(2*val - min);
                    min=val;
                }
            }
        }
        
        public void pop() {
            long p=stk.pop();
            if(p<min){
                min=2*min-p;
            }
        }
        
        public int top() {
            return (int)Math.max(stk.peek(),min);
        }
        
        public int getMin() {
            return (int)min;
        }
    }
    
    /**
     * Your MinStack object will be instantiated and called as such:
     * MinStack obj = new MinStack();
     * obj.push(val);
     * obj.pop();
     * int param_3 = obj.top();
     * int param_4 = obj.getMin();
     */
}
