package Training;

import java.util.Scanner;

public class PascalsTriangle {

	 static void printPascal(int n)
	    {
	         
	      // Iterate through every line
	      // and print entries in it
	      for (int line = 0; line < n; line++)
	      {
	        // Every line has number of 
	        // integers equal to line number
	        for (int i = 0; i <= line; i++)
	          System.out.print(binomialCoeff
	                          (line, i)+" ");
	                         
	        System.out.println();
	      }
	    }
	      
	    // Link for details of this function
	    // https://www.geeksforgeeks.org/archives/25621
	    static int binomialCoeff(int n, int k)
	    {
	        int res = 1;
	         
	        if (k > n - k)
	           k = n - k;
	            
	        for (int i = 0; i < k; ++i)
	        {
	            res *= (n - i);
	            res /= (i + 1);
	        }
	        return res;
	    }
	      
	    // Driver code
	    public static void main(String args[])
	    {
	     Scanner scan=new Scanner(System.in);
	     System.out.println("Enter the number of Rows :");
	     int n=scan.nextInt();
	     System.out.println("----------------------------------------");
	      printPascal(n);
	    }
	}