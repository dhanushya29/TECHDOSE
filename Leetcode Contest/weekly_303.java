public class weekly_303 {
    // class Solution {
        public int equalPairs(int[][] grid) {
            // int count=0;
            int row=grid.length,count=0,res=0;
            for(int i=0;i<row;i++){
                for(int j=0;j<row;j++){
                    count=0;
                    for(int k=0;k<row;k++){
                        if(grid[i][k]==grid[k][j]){
                            count++;
                        }
                    }
                    // System.out.printf("i = %d j=%d count=%d \n",i,j,count);
                    if(count==row){
                       res++;
                   }
                }
            }
            return res;
        }
    // }
}
