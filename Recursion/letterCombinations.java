package Recursion;

import java.util.ArrayList;
import java.util.List;

public class letterCombinations {
    class Solution {
        public void func(List<String> ans,String[]op,int num,String output){
            if(num==0){
                ans.add(new String(output));
                return;
            }
            int n1=num%10;
            String s1=op[n1];
            for(int i=0;i<s1.length();i++){
                func(ans,op,num/10,s1.charAt(i)+output);
            }
        }
        public List<String> letterCombinations(String digits) {
            List<String> ans=new ArrayList<>();
            String[] op={" "," ","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};
            if(digits.equals(""))return ans;
            int num=Integer.parseInt(digits);
            func(ans,op,num,new String());
            return ans;
        }
    }
}
