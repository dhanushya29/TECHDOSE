import java.util.*;


public class lcm {
    public static int gcd(int a,int b){
        if(b==0)return a;
        else return gcd(b,a%b);
    }
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int m=sc.nextInt();
        int n=sc.nextInt();
        int gcdAns=gcd(m,n);
        System.out.print((m*n)/gcdAns);
    }
}
