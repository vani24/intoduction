package Training;

import java.util.Scanner;

public class FactNumber {
	
	public static int factorial(int n) {
		if (n==0) {
			return 1;
		}else {
			return n*(factorial(n-1));
		}
		
	}

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub

		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the number : ");
		int n=scan.nextInt();
		int fact=1;
		fact=factorial(n);
		System.out.println("Factorial of number "+n+" is "+fact);
		
	}

}
