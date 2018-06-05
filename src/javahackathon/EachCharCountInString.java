package javahackathon;

import java.util.HashMap;
import java.util.Scanner;

public class EachCharCountInString {
	 static void characterCount(String inputString)
	    {
	        //Creating a HashMap containing char as a key and occurrences as  a value
	 
	        HashMap<Character, Integer> charCountMap = new HashMap<Character, Integer>();
	 
	        //Converting given string to char array
	 
	        char[] strArray = inputString.toCharArray();
	 
	        //checking each char of strArray
	 
	        for (char c : strArray)
	        {
	            if(charCountMap.containsKey(c))
	            {
	                //If char is present in charCountMap, incrementing it's count by 1
	 
	                charCountMap.put(c, charCountMap.get(c)+1);
	            }
	            else
	            {
	                //If char is not present in charCountMap,
	                //putting this char to charCountMap with 1 as it's value
	 
	                charCountMap.put(c, 1);
	            }
	        }
	 
	        //Printing the charCountMap
	 
	        System.out.println(charCountMap);
	    }
	 
	    public static void main(String[] args)
	    {
	       Scanner scan=new Scanner(System.in);
	       System.out.println("Write the Sentence: ");
	       String str=scan.nextLine();
	       characterCount(str);
	       
	    }

}

/*
 * Output:
Write the Sentence: 
Character count example
{ =2, a=3, C=1, c=2, e=3, h=1, l=1, m=1, n=1, o=1, p=1, r=2, t=2, u=1, x=1}
 */
