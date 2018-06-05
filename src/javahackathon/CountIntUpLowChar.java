package javahackathon;

import java.util.Scanner;

public class CountIntUpLowChar {
	public static void main(String args[])
    {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter the Sentence :");
        String str=scan.nextLine();
        int upper = 0, lower = 0, number = 0, special = 0;
 
        for(int i = 0; i < str.length(); i++)
        {
            char ch = str.charAt(i);
            if (ch >= 'A' && ch <= 'Z')
                upper++;
            else if (ch >= 'a' && ch <= 'z')
                lower++;
            else if (ch >= '0' && ch <= '9')
                number++;
            else
                special++;
        }
 
        System.out.println("Lower case letters : " + lower);
        System.out.println("Upper case letters : " + upper);
        System.out.println("Number : " + number);
       
    }

}
/*
 * Output:
 * Enter the Sentence :
THis is the Example for the Counting the NUMBERS 1203
Lower case letters : 29
Upper case letters : 11
Number : 4

 */
