package Training;

import java.util.ArrayList;
import java.util.List;

public class CommonEleInList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> list1=new ArrayList<Integer>();
		list1.add(34);
		list1.add(22);
		list1.add(33);
		list1.add(44);
		list1.add(12);
		
		List<Integer> list2=new ArrayList<Integer>();
		list2.add(11);
		list2.add(22);
		list2.add(33);
		list2.add(55);
		list2.add(12);
		
		list2.retainAll(list1);
		System.out.println("Common Values are :"+list2);
		
		

	}

}
