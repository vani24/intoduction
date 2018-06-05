/*
 * Swap two number with and without using third variable
 */
package Training;

public class Swaping {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//with using third variable
		int a=10;
		int b=20;
		int temp;
		System.out.println("Values of a and b before swaping... a= "+a+", b= "+b);	
		temp=a;
		a=b;
		b=temp;
		
		System.out.println("Values of a and b After swaping... a= "+a+", b= "+b);
		System.out.println("***********************************************************************");
		//swaping with out using third variable
		int i=30, j=40;
		System.out.println("Values of i and j before swaping... i= "+i+", j= "+j);
		i=i+j;
		j=i-j;
		i=i-j;
		
		System.out.println("Values of i and j After swaping... i= "+i+", j= "+j);
		
		

	}

}
