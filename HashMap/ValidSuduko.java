class Solution {
    public int row(int i,char[][]board){
        char[] arr=board[i];
        Set<Character> set=new HashSet<>();
        for(char ch:arr){
            if(ch=='.')continue;
            if(set.add(ch)==false){
                return 0;
            }
        }
        return 1;
    }
    public int col(int c,char[][]board){
        Set<Character> set=new HashSet<>();
        for(int i=0;i<9;i++){
            if(board[i][c]=='.')continue;
            if(set.add(board[i][c])==false){
                return 0;
            }
        }
        return 1;
    }
    public int subSquare(char[][]board){
        for(int i=0;i<9;i+=3){
            for(int j=0;j<9;j+=3){
                Set<Character> set=new HashSet<>();
                for(int i1=i;i1<i+3;i1++){
                    for(int j1=j;j1<j+3;j1++){
                        if(board[i1][j1]=='.')continue;
                        if(set.add(board[i1][j1])==false){
                            return 0;
                        }
                    }
                }
            }
        }
        return 1;
    }
    public boolean isValidSudoku(char[][] board) {
        for(int i=0;i<9;i++){
            int res1=row(i,board);
            int res2=col(i,board);
            if(res1<1 || res2<1){
                return false;
            }
            int res3=subSquare(board);
            if(res3<1){
                return false;
            }
        }
        return true;
    }
}
