package javahackathon;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class DupicateCharsInString {
	public void findDuplicateChars(String str){
        
        Map<Character, Integer> dupMap = new HashMap<Character, Integer>(); 
        char[] chrs = str.toCharArray();
        for(Character ch:chrs){
            if(dupMap.containsKey(ch)){
                dupMap.put(ch, dupMap.get(ch)+1);
            } else {
                dupMap.put(ch, 1);
            }
        }
        Set<Character> keys = dupMap.keySet();
        for(Character ch:keys){
            if(dupMap.get(ch) > 1){
                System.out.println(ch+"--->"+dupMap.get(ch));
            }
        }
    }
     
    public static void main(String a[]){
    	Scanner scan=new Scanner(System.in);
    	System.out.println("Write the Sentence to find the duplicate Characters :");
    	String str=scan.nextLine();
    	DupicateCharsInString dcs = new DupicateCharsInString();
        dcs.findDuplicateChars(str);
    }

}
/*
 * Output:
Write the Sentence to find the duplicate Characters :
Thisisjavaexample
a--->3
s--->2
e--->2
i--->2
 * 
 */
