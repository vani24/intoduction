/*
 * Write a program to find largest of three numbers
 */
package Training;

import java.util.Scanner;

public class LargestOfThree {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a, b, c, d;
        Scanner s = new Scanner(System.in);
        System.out.println("Enter all three numbers:");
        a = s.nextInt();
        b = s.nextInt();
        c = s.nextInt();
        d = c > (a > b ? a : b) ? c : ((a > b) ? a : b);
       
        System.out.println("Largest Number:"+d);

	}

}
