package sample;

import java.util.Scanner;

public class ReverseWord {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the Sentence to be reveresed :");
		
		String inputString=scan.nextLine();
        String[] words = inputString.split(" ");
		
		String reverseString = "";
		
		for (int i = 0; i < words.length; i++) 
		{
			String word = words[i];
			
			String reverseWord = "";
			
			for (int j = word.length()-1; j >= 0; j--) 
			{
				reverseWord = reverseWord + word.charAt(j);
			}
			
			reverseString = reverseString + reverseWord + " ";
		}
		
		System.out.println("Input String : "+inputString);
		
		System.out.println("Reverse String : "+reverseString);
		

	}

}
