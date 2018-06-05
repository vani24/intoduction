package javahackathon;

import java.util.Scanner;

public class BinarySearch {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int counter, num, item, array[], first, last, middle;
	      //To capture user input
	      Scanner input = new Scanner(System.in);
	      System.out.println("Enter number of elements:");
	      num = input.nextInt(); 

	      //Creating array to store the all the numbers
	      array = new int[num];

	      System.out.println("Enter " + num + " integers");
	      //Loop to store each numbers in array
	      for (counter = 0; counter < num; counter++)
	          array[counter] = input.nextInt();

	      System.out.println("Enter the search value:");
	      item = input.nextInt();
	      first = 0;
	      last = num ;
	      middle = (first + last)/2;

	      while( first <= last )
	      {
	         if ( array[middle] < item ) {
	           first = middle + 1;
	         }
	         else if ( array[middle] == item )
	         {
	           System.out.println(item + " found at location " + (middle + 1) + ".");
	           break;
	         }
	         else
	         {
	             last = middle - 1;
	         }
	         middle = (first + last)/2;
	      }
	      if ( first > last )
	          System.out.println(item + " is not found.\n");
	   }


}
/*
 * Output:
 * Enter number of elements:
5
Enter 5 integers
22
11
22
45
33
Enter the search value:
22
22 found at location 3.
 */
