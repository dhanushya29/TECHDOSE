import java.util.*;
public class sqrt {
        public static int mySqrt(int x) {
           if(x==0)return 0;
            int left=1,right=x;
            while(left<=right){
                int mid=left+(right-left)/2;
                if(mid==x/mid)return mid;
                else if(mid<x/mid)left=mid+1;
                else right=mid-1;
            }
            return right;
        }
        public static void main(String[]args) {
            Scanner sc=new Scanner(System.in);
            int n=sc.nextInt();
            System.out.println(mySqrt(n));
        }
}
