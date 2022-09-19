import java.util.*;
public class catalanNumbers {
    public static void main(String[]args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[]catalan=new int[n+1];
        catalan[0]=1;
        catalan[1]=1;
        for(int i=2;i<=n;i++){
            for(int j=0;j<i;j++){
                catalan[i]+=catalan[j]*catalan[i-j-1];
            }
            }
        System.out.println(catalan[n]);
    }
}
