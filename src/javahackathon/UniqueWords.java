package javahackathon;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UniqueWords {
	 static void printUniquedWords(String str)
	    {
	        // Extracting words from string
	        Pattern p = Pattern.compile("[a-zA-Z]+");
	        Matcher m = p.matcher(str);
	         
	        // Map to store count of a word
	        HashMap<String, Integer> hm = new HashMap<>();
	         
	        // if a word found
	        while (m.find()) 
	        {
	            String word = m.group();
	             
	            // If this is first occurrence of word
	            if(!hm.containsKey(word))
	                hm.put(word, 1);
	            else
	                // increment counter of word
	                hm.put(word, hm.get(word) + 1);
	             
	        }
	         
	        // Traverse map and print all words whose count
	        // is  1
	        Set<String> s = hm.keySet();
	        Iterator<String> itr = s.iterator();
	 
	        while(itr.hasNext())
	        {
	            String w = itr.next();
	             
	            if (hm.get(w) == 1)
	                System.out.println(w);
	        }    
	    }
	     
	    // Driver Method
	    public static void main(String[] args) 
	    {
	       Scanner scan=new Scanner(System.in);
	       System.out.println("Enter the Sentence :");
	       String str=scan.nextLine();
	        printUniquedWords(str);
	    }

}
/*
 * Output:
Enter the Sentence :
Java is a lanuage. it is unique
Java
a
unique
lanuage
it
 */

