/*
 * Create student class with name(String type) and regno (int type) attributes. 
 * use any collection to Store 5 student information. (no duplicates).
 */

package Training;

import java.util.HashSet;

public class StudentDupicate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashSet<Student> ele = new HashSet<Student>();

		Student ob1 = new Student("aana", 11);
		Student ob2 = new Student("john", 15);
		Student ob3 = new Student("aana", 11);
		Student ob4 = new Student("zeba", 16);
		Student ob5 = new Student("banu", 12);
		ele.add(ob1);
		ele.add(ob2);
		ele.add(ob3);
		ele.add(ob4);
		ele.add(ob5);
		System.out.println(ele);
		System.out.println("AfterSorting .....");

	}

}

/*
 * Output: [zeba ...16, aana ...11, john ...15, banu ...12]
 */
