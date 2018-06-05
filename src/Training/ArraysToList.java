package Training;
/*
 * Arrays to List and List to Arrays
 */
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArraysToList {
	public static void main(String[] args) {
	String[] strArr = {"JAVA", "C++", "PERL", "STRUTS", "PLAY"};
    List<String> strList = Arrays.asList(strArr);
    System.out.println("Created List Size: "+strList.size());
    System.out.println(strList);
	}
}
 class ListToArrays{
         public static void main(String[] args) {
        	 List<String> myList = new ArrayList<String>();
        	 myList.add("Apple");
        	 myList.add("Banana");
        	 myList.add("Orange");
        	 Object[] myArray = myList.toArray();
        	 for (Object myObject : myArray) {
        	    System.out.println(myObject);
        	 }
         }
}