package javahackathon;

import java.util.Scanner;
import java.util.regex.Pattern;

public class ReverseWords {
	static String reverseWords(String str)
    {
 
        // Specifying the pattern to be searched
        Pattern pattern = Pattern.compile("\\s");
 
        // splitting String str with a pattern
        // (i.e )splitting the string whenever their
        //  is whitespace and store in temp array.
        String[] temp = pattern.split(str);
        String result = "";
 
        // Iterate over the temp array and store
        // the string in reverse order.
        for (int i = 0; i < temp.length; i++) {
            if (i == temp.length - 1)
                result = temp[i] + result;
            else
                result = " " + temp[i] + result;
        }
        return result;
    }
 
    // Driver methods to test above method
    public static void main(String[] args)
    {
       Scanner scan=new Scanner(System.in);
       System.out.println("Enter the words of strings to reverse: ");
       String s1=scan.nextLine();
       System.out.println(reverseWords(s1));
 
    }

}
/*
 * output:
Enter the words of strings to reverse: 
Java Code
Code Java
 */
