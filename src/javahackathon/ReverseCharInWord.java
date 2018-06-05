package javahackathon;

import java.util.Scanner;

public class ReverseCharInWord {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter a sentence for Revrese:");
		String str=scan.nextLine();
		String revstring="";
		 
		for(int i=str.length()-1;i>=0;--i){
		revstring +=str.charAt(i);
		}
		 
		System.out.println(revstring);
		}

	}

/*
Output:
Enter a sentence for Revrese:
Java Code
edoC avaJ
 * 
 */
