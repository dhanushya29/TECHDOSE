import java.io.*;
import java.util.Scanner;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.ArrayList;

public class meetInTheMiddle {
	public static List<Integer> splitArray(int[]arr,int si,int ei){
		List<Integer> list=new ArrayList<>();
		int range=ei-si+1;
		for(int i=0;i<(1<<range);i++){
			int sum=0;
			for(int j=0;j<range;j++){
				if((i&(1<<j))!=0){
					int ind=si+j;
					sum+=arr[ind];
				}
			}
			list.add(sum);
		}
		return list;
	}
	public static int lowerBound(List<Integer> ans,long val){
		int low=0,high=ans.size()-1;
		while(low<=high){
			int mid=low+(high-low)/2;
			if(val>=ans.get(mid)){
				low=mid+1;
			}
			// else if(val==ans.get(mid))return mid;
			else high=mid-1;
		}
		return low;
	}
    public static void main(String[] args) throws IOException {


        // BufferedReader Class for Fast buffer Input
        File inFile = new File("C:\\Coding\\input.txt");
        Scanner sc = new Scanner(inFile);

        // PrintWriter class prints formatted representations
        // of objects to a text-output stream.
        // PrintWriter pw=new PrintWriter(new
        //         BufferedWriter(new FileWriter("C:\\Coding\\output.txt")));
        // same print or println can be used
        // Your code goes Here
        int n=sc.nextInt();
        int[]arr=new int[n];
        for(int i=0;i<n;i++){
        	arr[i]=sc.nextInt();
        }
        int sum=sc.nextInt();
        List<Integer> sum1=new ArrayList<>();
        List<Integer> sum2=new ArrayList<>();

        sum1=splitArray(arr,0,n/2-1);
        sum2=splitArray(arr,n/2,n-1);
        Collections.sort(sum2);
        long max=0;
        for(int i=0;i<sum1.size();i++){
        	if(sum1.get(i)<=sum){
        	int temp=lowerBound(sum2,sum-sum1.get(i));
        	if(temp==sum2.size() || sum2.get(temp)!=sum-sum1.get(i)){
        		temp--;
        	}
        	if(max<sum1.get(i)+sum2.get(temp)){
        		max=sum1.get(i)+sum2.get(temp);
        	}
        }
        }
        System.out.println(sum1);
        System.out.println(sum2);
        System.out.println(max);
    }
}
