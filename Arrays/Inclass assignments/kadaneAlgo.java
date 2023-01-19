import java.util.*;
public class kadaneAlgo {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[]arr=new int [n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int meh=0,msf=Integer.MIN_VALUE,left=0,right=0;
        for(int i=0;i<n;i++){
             meh+=arr[i];
            if(meh<arr[i]){
                left=i;
                meh=arr[i];
            }
            if(msf<meh){
                right=i;
                //System.out.println(left);
                msf=meh;
            }
        }
        for(int i=left;i<=right;i++){
            System.out.println(arr[i]);
        }
        System.out.println(msf);
    }
}
