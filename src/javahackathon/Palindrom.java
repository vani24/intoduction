package javahackathon;

import java.util.Scanner;

public class Palindrom {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the word for palindrom : ");
		String s=scan.nextLine();
		char c[]=s.toCharArray();
		int n=c.length;
		boolean flag=true;
		for(int i=0;i<n/2;i++) {
			if(c[i]!=c[n-1-i]) {
				flag=false;
				break;
			}
			
		}
		if(!flag) {
			System.out.println(s+" is not a palindrom");
			
		}else {
			System.out.println(s+" is a palindrom");
		}

	}

}
/*
 Output:
Enter the word for palindrom : 
MalayalaM
MalayalaM is a palindrom


Enter the word for palindrom : 
Kannada
Kannada is not a palindrom
 */
