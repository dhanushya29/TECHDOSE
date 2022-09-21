import java.util.*;
public class radixSort {
    public static int[]radixSortFunc(int[]arr,int n){
        int max=arr[0];
        for(int i=1;i<n;i++){
            max=arr[i]>max?arr[i]:max;
        }
        int[]res=new int[n];
        int digits = (int)(Math.log(max)/Math.log(10));
        for(int i=0;i<=digits;i++){
            int[]hash=new int[10];
            for(int j:arr){
                int val=(j/(int)(Math.pow(10,i)))%10;
                hash[val]++;
            }
            for(int k=1;k<10;k++){
                hash[k]+=hash[k-1];
            }
            
            for(int ind=0;ind<n;ind++){
                int val=(arr[i]/(int)(Math.pow(10,i)))%10;
                res[--hash[val]]=arr[ind];
            }
           // arr=res;
        }
        return res;
    }
    public static void main(String[]args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[]arr=new int [n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int []newarr=new int[n];
        newarr=radixSortFunc(arr,n);
        System.out.println(Arrays.toString(newarr));
    }
}
