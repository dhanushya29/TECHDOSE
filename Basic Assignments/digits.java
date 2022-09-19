import java.util.*;
public class digits {
    public static void main(String[]args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
         String str=Integer.toString(n);
         int len=str.length();
         for(int i=1;i<=len;i++){
            System.out.print(i);
         }
    }
}
