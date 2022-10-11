import java.util.*;
public class largestSubarray {
    public static void main(String[]args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int []arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        for(int i=1;i<n;i++){
            arr[i]+=arr[i-1];
        }
        int a=sc.nextInt();
        System.out.println(arr[6]-arr[a==0?0:a-1]);
    }
}
