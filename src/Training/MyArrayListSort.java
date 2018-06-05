package Training;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class MyArrayListSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<Student> list = new ArrayList<Student>();
		LinkedList<String> li = new LinkedList<String>();
		li.add("sid");
		li.addLast("123");
		for (@SuppressWarnings("unused")
		Object myObject : li) {
			System.out.println("list..." + li);
		}

		Student s1 = new Student("Ram", 3000);
		Student s2 = new Student("John", 6000);
		Student s3 = new Student("Crish", 2000);
		Student s4 = new Student("Tom", 2400);
		list.add(s1);
		list.add(s2);
		list.add(s3);
		list.add(s4);
		Collections.sort(list);
		System.out.println("Sorted list entries: ");
		for (Student e : list) {
			System.out.println(e);
		}
	}
}
