package Recursion;

import java.util.ArrayList;
import java.util.List;

public class generateParentheses {
    class Solution {
        public void func(List<String>list,int open,int close,String str,int n){
            if(open==n && close==n){
                list.add(str);
                return;
            }
            if(open<n){
                func(list,open+1,close,str+"(",n);
            }
            if(close<open){
                func(list,open,close+1,str+")",n);
            }
        }
        public List<String> generateParenthesis(int n) {
            List<String> list=new ArrayList<>();
            func(list,0,0,new String(),n);
            return list;
        }
    }

}
