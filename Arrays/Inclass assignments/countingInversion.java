
import java.util.*;
public class countingInversion {
    public static void swap(int[]arr,int i,int j){
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }
    public static int mergeSort(int[]arr,int low,int mid,int high,int n){
        int i=low,j=high,count=0;
        // int[]b=new int[n];
        while(i<=j){
            if(arr[i]>arr[j]){
                count++;
                swap(arr,i,j);
            }
        }
    int[]b=new int[high+1];
        int k;
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
        return k;
    }
    public static int merge(int[]arr,int low,int high,int n){
        int mid=low+(high-low)/2;
        if(low==high)return 0;
        merge(arr,low,mid,n);
        merge(arr,mid+1,high,n);
       int temp= mergeSort(arr,low,mid,high,n);
       return temp;
    }
    public static int counting(int[]arr,int low,int high,int n){
      int count= merge(arr,low,high,n);
      return count;
    }
    

    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[]arr=new int [n];
        for(int i=0;i<n;i++){
             arr[i]=sc.nextInt();
        }
        int low=0,high=n-1;
        // merge(arr, low, high,n);
        System.out.println(counting(arr,low,high,8));
       }      
    }

