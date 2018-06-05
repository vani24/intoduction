package javahackathon;

import java.util.Scanner;

public class StringToInteger {
	public static void main(String a[]){
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the String to convert to integer:");
        String str=scan.nextLine();
        Integer i = Integer.valueOf(str);
        System.out.println("The integer value: "+i);
    }

}
/*
  Output:
Enter the String to convert to integer:
23
The integer value: 23
 */
