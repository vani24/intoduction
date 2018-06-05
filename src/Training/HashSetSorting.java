package Training;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;

public class HashSetSorting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashSet<String> names = new HashSet<String>();
		names.add("Asker"); 
		names.add("Crak"); 
		names.add("Bayliss");
		names.add("Mohna"); 
		names.add("Dina"); 
		System.out.println("HashSet before sorting : " + names); 
		// Sorting HashSet using List 
		List<String> tempList = new ArrayList<String>(names); 
		Collections.sort(tempList); 
		System.out.println("HashSet element in sorted order : " + tempList);
		
	}

}
