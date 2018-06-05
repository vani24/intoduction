package javahackathon;

import java.util.Scanner;

public class RemoveChar {
	public static void main(String args[]) {
		  Scanner scan=new Scanner(System.in);
		  System.out.println("Enter the Sentence : ");
		  String str=scan.nextLine();
		  System.out.println("Enter the postion of the charcter to be removed :");
		  int n=scan.nextInt();
	      System.out.println(removeCharAt(str, n));
	   }
	   public static String removeCharAt(String s, int pos) {
	      return s.substring(0, pos) + s.substring(pos + 1);
	   }
}
/*
Output:
Enter the Sentence : 
This is java
Enter the postion of the charcter to be removed :
3
Thi is java

 */
