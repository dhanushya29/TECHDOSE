import java.io.*;
import java.util.Scanner;

public class ithBitSet {
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
        int k=sc.nextInt();
        // end of the code
        // pw.flush();
        if((n&(1<<k))!=0){
            System.out.println("YES");
        }else{
            System.out.println("NO");
        }
    }
}