import java.util.*;
public class Factors{
  public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    //int[]array=new int [n];
    //int ind=0;
    for(int i=1;i*i<=n;i++){
      if(n%i==0){
        //array[ind++]=i;
        System.out.println(i);
      if(i*i!=n){
       // array[ind++]=n/i;
        System.out.println(n/i);
      }
      }
    }
    // for(int i=0;i<ind;i++){
    //   System.out.println(array[i]);
    // }
  }
}
