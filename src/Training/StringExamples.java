/*
1.Find the position of the given character in a given string
2. Replace given character with * in a given string
3. Find the number of words in a given string
4. Find number of characters in a given string
5. Check the given word is present in a given string
6. Convert the fallowing to string
i) Int
ii) Char
iii) boolean
7. Convert string to array of character
8. Find the length of the given string
9. Convert all characters to upper case in a given string ( b. lower case )
10. Find the character in a given position in a given string
 */
package Training;

import java.util.Scanner;

public class StringExamples {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the String :");
		String str=scan.nextLine();
		System.out.println("Enter the character  : ");
		String s=scan.nextLine();
		findindex(str,s);
		replace(str,s);
		lengthOfChar(str);
		countWord(str);
		System.out.println("Enter the word to find in the String : ");
		String word=scan.nextLine();
		findWord(str,word);
		System.out.println("Enter the String number to convert  it to int :");
		String value=scan.nextLine();
		System.out.println("Enter the boolean value to be converted from String :");
		String bool=scan.nextLine();
		System.out.println("Enter the char to be find in the given string :");
		int ch=scan.nextInt();
		findChar(ch,str);
		convert(str,value,bool,ch);
		convertToUppercase(str);
		convertToLowerCase(str);

	}
	public static void findindex(String str,String s) {
		int index=str.indexOf(s);
		System.out.println("The postion of the given Character is : "+index);
		System.out.println("--------------------------------------------");
	}
	
	public static void replace(String str,String s) {
		String s1=str.replace(s, "*");
		System.out.println("Replace of the Character by * is : "+s1);
		System.out.println("--------------------------------------------");
	}
	public static void lengthOfChar(String str) {
		int len=str.length();
		System.out.println("The length of characters in the given string is :"+len);
		System.out.println("--------------------------------------------");
	}
	public static void countWord(String str) {
		int wordCount=0; 
		String[] words = str.split(" ");
        //Updating the wordCount
        wordCount = wordCount + words.length;
		System.out.println("Number of words in the given Stirng :"+wordCount);
		System.out.println("--------------------------------------------");
	}
	public static void findWord(String str,String word) {
		if (str.contains(word)) {
			System.out.println(word+ " is present in the given string");
			System.out.println("--------------------------------------------");
		}else {
			System.out.println(word+" is not present in the given String");
			System.out.println("--------------------------------------------");
		}
	}
	public static void convert(String str,String value,String bool,int ch ) {
             int val=Integer.parseInt(value);
             char val2=str.charAt(ch);
             boolean b1=Boolean.parseBoolean(bool);
             char[] c_arr = str.toCharArray();
             //System.out.println(val2);
             System.out.println("Parsing String to Integer : "+val);
             System.out.println("Parsing String to Charecter :"+ val2);
             System.out.println("Parsing String to Boolean :"+b1);
             System.out.println(c_arr);
             System.out.println("--------------------------------------------");
	}
	public static void convertToUppercase(String str) {
		String s=str.toUpperCase();
		System.out.println("Converting String to uppercase: "+ s);
		System.out.println("--------------------------------------------");
	}
   
	public static void convertToLowerCase(String str) {
		String s=str.toLowerCase();
		System.out.println("Converting String to LowerCase: "+ s);
		System.out.println("--------------------------------------------");
	}
	public static void findChar(int n,String str) {
		char ch=str.charAt(n);
		System.out.println("Charecter found at the postion "+n+" is :"+ch);
		System.out.println("--------------------------------------------");
	}
}

