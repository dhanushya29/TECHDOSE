
import java.io.*;
import java.util.Scanner;

public class rightMostSetBit {
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
        //rightmostSetBit
        while((n&1)!=1){
        	count++;
        	n>>=1;
        }
        //leftmostSetBit
        int count=0;
        int temp=n;
        while(n > 0){
        	count++;
        	n>>=1;
        }
        System.out.println(count);
    }
}