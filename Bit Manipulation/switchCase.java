import java.io.*;
import java.util.Scanner;

public class switchCase {
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
        char ch=sc.next().charAt(0);
        //XOR SWITCH
        // System.out.println((char)(ch^32));
        //TO Upper
        // System.out.println((char)(ch&~(1<<5)));
        //TO Lower
        System.out.println((char)(ch|(1<<5)));
    }
}