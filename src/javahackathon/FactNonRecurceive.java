package javahackathon;

import java.util.Scanner;

public class FactNonRecurceive {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int fact=1;
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the number to find the Factorial : ");
		int a=scan.nextInt();
		for(int i=1;i<=a;i++) {
		  fact=fact*i;	
		}
		System.out.println("Factorial of number "+a+" is :" +fact);

	}

}
/*
Output:
Enter the number to find the  Factorial : 
5
Factorial of number 5 is :120
*/