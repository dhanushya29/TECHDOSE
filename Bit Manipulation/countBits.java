import java.util.*;
class countBits{
    public static int[] countBits(int n) {
        int[]res=new int[n+1];
        res[0]=0;
        for(int i=1;i<=n;i++){
            int count=i&(i-1);
            res[i]=res[count]+1;
        }
        return res;
    }
	public static void main(String []args){
         int n=6;
         int[]out=new int[n+1];
         out=countBits(n);
         for(int i=0;i<n+1;i++){
             System.out.println(out[i]);
		 }
	}		 
}