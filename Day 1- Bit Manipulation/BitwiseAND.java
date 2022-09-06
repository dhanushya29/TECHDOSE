import java.util.*;
class BitwiseAND {
    public static int rangeBitwiseAnd(int left, int right){
       int res=0;
        while(left!=right){
           left>>=1;
           right>>=1;
           res++;
        }
        return left<<res;
    }
    public static void main(String[]args){
        int left=5,right=7;
		System.out.print(rangeBitwiseAnd(left,right));
	}		
}