import java.util.*;
public class frequency {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        String str=sc.next();
        int len=str.length();
        int[]freq=new int[26];
        for(int i=0;i<len;i++){
            freq[str.charAt(i)-'a']++;
        }
        for(int i=0;i<26;i++){
            if(freq[i]>0){
                System.out.println((char)(i+97)+" "+freq[i]);
            }
        }
    }
}
