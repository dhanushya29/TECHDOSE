import java.lang.*;
import java.util.*;
class Random{
	public static void main(String[] args){
	int randomnum=(int)(Math.random() * 3);
	switch(randomnum){
		case 1:
		  System.out.println("Greeting");
		  break;
		 case 2:
		    System.out.println("Ppt");
			break;
		default:
System.out.println("Invalid");}}}