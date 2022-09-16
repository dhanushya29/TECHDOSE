import java.util.*;
public class mergeSort {
    public static void merge(int []arr,int low,int high,int n){
        int mid;
        if(low==high)return;
            mid=(low+high)/2;
            merge(arr, low, mid,n);
            merge(arr, mid+1, high,n);
            mergeSortFunc(arr,low,mid,high,n);
    }
    public static void mergeSortFunc(int[] arr,int low,int mid,int high,int n){
        int i,j,k;
        i=low;j=mid+1;k=low;
        int[]b=new int[high+1];
        while(i<=mid && j<=high){
            if(arr[i]<arr[j]){
                b[k++]=arr[i++];
            }else{
                b[k++]=arr[j++];
            }
        }
        while(i<=mid){
            b[k++]=arr[i++];
        }
        while(j<=high){
            b[k++]=arr[i++];
        }
        for(int ind=low;ind<=high;ind++){
            arr[ind]=b[ind];
        }
    }
    public static void main(String[]args) {
            Scanner sc=new Scanner(System.in);
            int n=sc.nextInt();
            int[]arr=new int [n];
            for(int i=0;i<n;i++){
                arr[i]=sc.nextInt();
            }
            int low=0,high=n-1;
            merge(arr, low, high,n);
            System.out.println(Arrays.toString(arr));
    }
}
