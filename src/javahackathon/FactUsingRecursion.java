package javahackathon;

import java.util.Scanner;

public class FactUsingRecursion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         Scanner scan=new Scanner(System.in);
         System.out.println("Enter the Number to find the factorial :");
         int n=scan.nextInt();
         int fact=1;
         fact=factorial(n);
         System.out.println("Factorial of number "+n+" is "+fact);
	}
    static int factorial(int n) {
    	if(n==0) 
    		return 1;
    	else 
    		return (n*factorial(n-1));
    	}
    }
/*
 * 
Output:
Enter the Number to find the factorial :
5
Factorial of number 5 is 120
 */
