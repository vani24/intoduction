package crackingtheCoding;

import java.util.Scanner;

public class CountChange {
	
	 public static void main(String[] args) {
	       
         int quarters;   // Number of quarters, to be input by the user.
         int dimes;      // Number of dimes, to be input by the user.
         int nickels;    // Number of nickels, to be input by the user.
         int pennies;    // Number of pennies, to be input by the user.
         
         double coins; // Total value of all the coins, in dollars.
         
         /* Ask the user for the number of each type of coin. */
         Scanner sc=new Scanner(System.in);
         System.out.println("Enter the number of quarters:  ");
         //TextIO.put();
         quarters = sc.nextInt();
         System.out.println("Enter the number of dimes:     ");
        
         dimes = sc.nextInt();
         System.out.println("Enter the number of nickels:   ");
        
         nickels = sc.nextInt();
         System.out.println("Enter the number of pennies:   ");
        
         pennies =sc.nextInt();
         
         /* Add up the values of the coins, in dollars. */
         
         coins = (0.25 * quarters) + (0.10 * dimes) 
                             + (0.05 * nickels) + (0.01 * pennies); 
         
         /* Report the result back to the user. */
         
        System.out.println("The total in coins is " + coins); 
             
      }  // end main()

}
