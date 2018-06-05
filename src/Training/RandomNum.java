/*
 * write a program to generate 10 random numbers.
 */

package Training;

import java.util.Random;

public class RandomNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random randomGenerator = new Random();
	    for (int i = 1; i<= 10; ++i){
	      int randomInt = randomGenerator.nextInt(100);
	      System.out.println("Generated : " + randomInt);
	    }
	    
	    System.out.println("Done.");
	  }
	  
	 



}
