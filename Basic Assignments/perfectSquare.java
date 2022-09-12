import java.util.*;
public class perfectSquare {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        boolean flag=false;
        for(int i=1;i*i<=n;i++){
            if(n%i==0 && n/i==i){
                flag=true;
            }
        }
        if(flag==true || n==0){
            System.out.println("YES");
        }else{
            System.out.println("NO");
        }
    }
}
