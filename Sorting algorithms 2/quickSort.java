import java.util.*;
public class quickSort{
    static void swap(int a,int b){
        int temp=a;
        a=b;
        b=temp;
    }
    static void qsort(int []arr,int i,int j,int pivot){
        while(i<pivot){
        if(arr[j]<arr[pivot]){
            i++;
            swap(arr[i],arr[j]);
            j++;
        }else if(arr[j]>arr[pivot]){
            j++;
        }else{
            break;
        }
      }
    }
    static void quickSort(int []arr,int low,int high){
        int i=low-1;
        int j=low;
        qsort(arr,i,j,high-1);
        qsort(arr, i, j, );
    }
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[]arr=new int [n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        quickSort(arr,0,n-1);
    }
}