package Training;

import java.util.ArrayList;
import java.util.List;

public class ArrayListEquals {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  List<Integer> integerOne = new ArrayList<Integer>();
		  List<Integer> integerTwo = new ArrayList<Integer>();
		  List<Integer> integerThree = new ArrayList<Integer>();
		  List<Integer> integerfour = new ArrayList<Integer>();

		  integerOne.add(10);
		  integerOne.add(20);

		  integerTwo.add(10);
		  integerTwo.add(20);
		  
		  integerThree.add(30);
		  integerThree.add(40);
		  
		  integerfour.add(50);
		  integerfour.add(10);
		  
		  

		  boolean equals = integerOne.equals(integerTwo);
		  boolean equals2=integerThree.equals(integerfour);
		  boolean containsAll = integerOne.containsAll(integerTwo)
		    && integerTwo.containsAll(integerOne);

		  System.out.println("Integer1 and Integer2 equals :"+equals);
		  System.out.println("Integer 3 and Integer4 equals :"+equals2);
		  System.out.println(containsAll);
	}

}
