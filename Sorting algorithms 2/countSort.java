import java.util.*;
public class countSort {
    public static int[] countSortFunc(int[]arr,int n){
        int max=arr[0];
        for(int i=1;i<n;i++){
            max=Math.max(arr[i], max);
        }
        int[]hash=new int[max+1];
        for(int i:arr){
            hash[i]++;
        }
        for(int i=1;i<=max;i++){
            hash[i]+=hash[i-1];
        }
        int[]res=new int[n];
        for(int i=n-1;i>=0;i--){
            res[--hash[arr[i]]]=arr[i];
        }
        return res;
    }
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[]arr=new int [n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        arr=countSortFunc(arr,n);
        System.out.println(Arrays.toString(arr));
    }
}
