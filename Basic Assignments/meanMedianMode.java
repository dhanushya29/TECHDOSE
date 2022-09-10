import java.util.*;


public class meanMedianMode {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[]arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int sum=0,mean=0,median=0,mode=0;
        for(int i=0;i<n;i++){
              sum+=arr[i];
        }
        mean=sum/n;
        Arrays.sort(arr);
        median=arr[n/2];
        System.out.print(mean+" "+median);
    }
}