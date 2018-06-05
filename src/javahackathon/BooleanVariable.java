package javahackathon;

import java.util.Scanner;

public class BooleanVariable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	    boolean a,b,c;
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the Three Boolean variables : ");
		if(scan.hasNextBoolean()) {
			a=scan.nextBoolean();
			b=scan.nextBoolean();
			c=scan.nextBoolean();
			boolean value=atLeastTwo(a,b,c);
			System.out.println("Result :" +value);
			
		}
		
		
		
	}
	static boolean  atLeastTwo(boolean a, boolean b, boolean c) 
	{
	    if ((a && b) || (b && c) || (a && c)) 
	    {
	        return true;
	    }
	    else
	    {
	        return false;
	    }
	}

}
/*
Output:
Enter the Three Boolean variables : 
true
false
true
Result :true
 */
