import java.io.*;
import java.util.Scanner;

public class highestPowOf2LessThanN {
    public static void main(String[] args) throws IOException {


        // BufferedReader Class for Fast buffer Input
        File inFile = new File("C:\\Coding\\input.txt");
        Scanner sc = new Scanner(inFile);
        //O(N)
        int n=sc.nextInt();
        while((n&(n-1))!=0){
            n=n&(n-1);
        }
        System.out.println(n);
        //O(1)
        int n=sc.nextInt();
        if((n&(n-1))==0){
            System.out.println(n);
        }else{
            System.out.println(1<<(Integer.toBinaryString(n).length()-1));
        }
    }
}