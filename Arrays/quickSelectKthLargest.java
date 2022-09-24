package TECHDOSE.Arrays;
import java.util.*;
public class quickSelectKthLargest {
    public static int quickSelect(int[]arr,int low,int k,int n){
        //boolean flag=true;
        int high=n-1;
        while(low<=high){
            int partite=partition(arr,low,high);
            if(partite+1==k){
                return arr[partite];
            }else if(partite+1>k){
                high=partite-1;
            }else{
                low=partite+1;
            }
        }
        return -1;
    }
    public static int partition(int[]arr,int low,int high){
        int i=low-1,pivot=arr[high];
        for(int j=low;j<high;j++){
            if(arr[j]<pivot){
                i++;
                swap(arr,i,j);
            }
        }
        swap(arr,i+1,high);
        return i+1;
    }
    
    private static void swap(int[] arr, int i, int j) {
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }
    public static void main(String[]args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[]arr=new int [n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int k=sc.nextInt();
        int ans= quickSelect(arr,0,n-k+1,n);
        System.out.println(ans);
    }
}
