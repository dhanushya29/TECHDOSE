import java.util.LinkedList;
import java.util.Queue;

public class rottenOranges{
public int orangesRotting(int[][] grid) {
        int m=grid[0].length,n=grid.length,rem=0;
        int[][]dirs={{-1,0},{0,1},{1,0},{0,-1}};
        boolean[][] visited=new boolean[n][m];
        Queue<int[]> q=new LinkedList<>();
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(grid[i][j]==2){
                    q.add(new int[]{i,j});
                    visited[i][j]=true;
                }
                if(grid[i][j]==1)rem++;
            }
        }
        int min=0;
        while(!q.isEmpty()){
            int size=q.size();
            for(int i=0;i<size;i++){
                int [] front=q.poll();
                for(int[]dir:dirs){
                    int x=front[0]+dir[0],y=front[1]+dir[1];
                    if(x>-1 && y>-1 && x<n && y<m && !visited[x][y] && grid[x][y]==1){
                        grid[x][y]=2;
                        visited[x][y]=true;
                        q.add(new int[]{x,y});
                        rem--;
                    }
                }
            }
            if(rem==0)return min;
            ++min;
        }
        return rem>0?-1:min;
    }
}