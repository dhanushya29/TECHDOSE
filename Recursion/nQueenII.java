package Recursion;

import java.util.ArrayList;
import java.util.List;

public class nQueenII {
    class Solution {
        public void helper(char[][]matrix,int row,List<List<String>> result){
            if(row==matrix.length){
                List<String> ans=builder(matrix);
                result.add(ans);
                return;
            }
            for(int col=0;col<matrix.length;col++){
                matrix[row][col]='Q';
                if(isValid(matrix,row,col)){
                    helper(matrix,row+1,result);
                }
                matrix[row][col]='.';
            }
        }
        public boolean isValid(char[][]matrix,int row,int col){
            for(int i=0;i<row;i++){
                for(int j=0;j<matrix.length;j++){
                    if((col==j || Math.abs(row-i)==Math.abs(col-j)) && matrix[i][j]=='Q'){
                        return false;
                    }
                }
            }
            return true;
        }
        public List<String> builder(char[][]matrix){
            List<String> ans=new ArrayList<>();
            for(int i=0;i<matrix.length;i++){
                ans.add(new String(matrix[i]));
            }
            return ans;
        }
        public int totalNQueens(int n) {
            List<List<String>> result=new ArrayList<>();
            char[][]matrix=new char[n][n];
            for(int i=0;i<n;i++){
                for(int j=0;j<n;j++){
                    matrix[i][j]='.';
                }
            }
            helper(matrix,0,result);
            return result.size();
        }
    }
}
