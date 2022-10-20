import java.util.Scanner;

public class biweekly_74 {
    // class Solution {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            String s = sc.next(), p= sc.next();
            System.out.println(maximumSubsequenceCount(s, p));
        }
        public static long maximumSubsequenceCount(String text, String pattern){
            long res = 0,one = 0, two = 0;
            for(char c: text.toCharArray()){
                if(pattern.charAt(0)==c) one++;
                if(pattern.charAt(1)==c){
                  res+= one;
                    two++;
                }
            }
            return Math.max(res+one,res+two);
        }
    // }
}