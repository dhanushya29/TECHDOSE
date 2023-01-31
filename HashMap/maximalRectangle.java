class Solution {
    public int findMax(int[]dp){
        Stack<Integer> stk=new Stack<>();
        int max=0;
        int[]left=new int[dp.length];
        int[]right=new int[dp.length];
        for(int i=0;i<dp.length;i++){
            while(!stk.isEmpty() && dp[i]<=dp[stk.peek()]){
                stk.pop();
            }
            left[i] = stk.isEmpty() ? 0 : stk.peek()+1;
            stk.push(i);
        }
         while(!stk.isEmpty())
            stk.pop();
        for(int i=dp.length-1;i>=0;i--){
            while(!stk.isEmpty() && dp[i]<=dp[stk.peek()]){
                stk.pop();
            }
            right[i] = stk.isEmpty() ? dp.length-1 : stk.peek()-1;
            stk.push(i);
        }
        for(int i=0;i<dp.length;i++){
            int area=(right[i]-left[i]+1 )* dp[i];
            max=Math.max(max,area);
        }
        return max;
    }
    public int maximalRectangle(char[][] matrix) {
        int len=matrix.length;
        if(len==0)return 0;
        int col=matrix[0].length;
        int[][]mat=new int[len][col];
        for(int i=0;i<len;i++){
            for(int j=0;j<col;j++){
                mat[i][j]=matrix[i][j]-'0';
            }
        }
        int[]dp=new int[col];
        int max=0;
        for(int i=0;i<len;i++){
            for(int j=0;j<col;j++){
                dp[j]=mat[i][j]==1?dp[j]+1:0;
            }
            max=Math.max(max,findMax(dp));
        }
       return max;
    }
}
