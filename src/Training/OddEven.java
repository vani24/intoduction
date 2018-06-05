/*
 * Write a program to find odd or even
 */
package Training;

import java.util.Scanner;

public class OddEven {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter the Number...:");
		Scanner scan=new Scanner(System.in);
		int num=scan.nextInt();
		
		if(num%2==0) {
			System.out.println(num+" is a even number");
		}else {
			System.out.println(num+" is a odd number");
		}

	}

}
