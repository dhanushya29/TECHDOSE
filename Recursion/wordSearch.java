public class wordSearch {
    class Solution {
        public boolean help(char[][]b,String w,int st,int r,int c){
            if(st>=w.length())return true;
            if(r<0 || c<0 || r>=b.length || c>=b[0].length || b[r][c]!=w.charAt(st))return false;
            char temp=b[r][c];
            b[r][c]='0';
            if(help(b,w,st+1,r+1,c) || help(b,w,st+1,r-1,c) || help(b,w,st+1,r,c+1) || help(b,w,st+1,r,c-1)){
                return true;
            }
            b[r][c]=temp;
            return false;
        }
        public boolean exist(char[][] board, String word) {
            for(int i=0;i<board.length;i++){
                for(int j=0;j<board[0].length;j++){
                    if(board[i][j]==word.charAt(0) && help(board,word,0,i,j))
                        return true;
                }
            }
            return false;
        }
    }
}
