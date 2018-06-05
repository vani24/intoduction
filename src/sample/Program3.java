package sample;

import java.util.Arrays;
import java.util.Scanner;

public class Program3 {

	public static void main(String[] args) {
		

			int n = 0;
			Scanner scanner = new Scanner(System.in);
			       System.out.print("Enter no. of elements you want in array:");
			       n = scanner.nextInt();
			       Integer a[] = new Integer[n];
			       System.out.println("Enter all the elements:");
			       for (int i = 0; i < n; i++) 
			       {
			           a[i] = scanner.nextInt();
			       }

			Integer[] numbersArray = a;

			Arrays.sort(numbersArray);
			int aSize = numbersArray.length;
			System.out.println("Highest Number is "+numbersArray[aSize-1]);
			System.out.println("Second highest Number is "+numbersArray[aSize-2]);
			System.out.println("Third highest Number is "+numbersArray[aSize-3]);
			}
		

	

}
