import java.util.*;
public class Palindrome {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        String str=sc.next();
        int len=str.length();
        String reve="";
        for(int i=len-1;i>=0;i--){
            reve=reve+str.charAt(i);
        }
        if(str.equals(reve)){
            System.out.print("Yes");;
        }else{
            System.out.print("No");
        }
    }
}
