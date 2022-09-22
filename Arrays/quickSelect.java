package TECHDOSE.Arrays;
import java.util.*;
public static int partite(int[]arr,int low,int high){

}
public class quickSelect {
    public static boolean quickSelect(int[]arr,int k,int n){
        boolean flag=true;
        int low=p,high=n-1;

    }
    public static void main(String[]args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[]arr=new int [n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int k=sc.nextInt();
        boolean ans= quickSelect(arr,k,n);
    }
}
