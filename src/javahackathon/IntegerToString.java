package javahackathon;

import java.util.Scanner;

public class IntegerToString {
	public static void main(String args[])
	  {
	    Scanner scan=new Scanner(System.in);
	    System.out.println("Enter the value to convert to string :");
	    int a=scan.nextInt();
	    String str1 = Integer.toString(a);
	    System.out.println("String str1 = " + str1); 
	    
	  }

}
/*
Output:
Enter the value to convert to string :

1245
String str1 = 1245
 */
