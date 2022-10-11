public class mergeIntervals{
    class Solution {
        public int[][] merge(int[][] intervals) {
            int row=intervals.length,col=intervals[0].length;
            List<int[]> list=new ArrayList<int[]>();
            Arrays.sort(intervals, (a, b) -> Integer.compare(a[0], b[0]));
            int start=intervals[0][0],end=intervals[0][1];
            for(int i=1;i<row;i++){
                    if(end>=intervals[i][0]){
                        end=Math.max(end,intervals[i][1]);
                    }else{
                        list.add(new int[]{start,end});
                        start=intervals[i][0];
                        end=intervals[i][1];
                    }
            }
            list.add(new int[]{start,end});
            start=intervals[row-1][0];
            end=intervals[row-1][1];
            int[][] ans=new int[list.size()][2];
            for(int i=0;i<list.size();i++){
               for(int j=0;j<2;j++){
                   ans[i][j]=list.get(i)[j];
               }
           } 
           return ans;
        }
    }
}