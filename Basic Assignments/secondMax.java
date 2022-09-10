import java.util.*;

import javax.print.event.PrintJobListener;
public class secondMax{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[]arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int largest=arr[0]>arr[1]?arr[0]:arr[1];
        int secondLargest=arr[0]>arr[1]?arr[1]:arr[0];
        for(int i=2;i<n;i++){
            if(largest<arr[i]){
                secondLargest=largest;
                largest=arr[i];
            }else if(arr[i]>secondLargest){
                secondLargest=arr[i];
            }
        }
        System.out.print(secondLargest);
    }
}