/*
 * Create student class with name(String type) and regno (int type) attributes.
 *  use any collection to Store 5 student information. sort using student name
 */
package sample;

import java.util.Arrays;
import java.util.Comparator;
import java.util.HashSet;

import Training.Student;

final class sortByName implements Comparator<Student>{

	public int compare(Student s1, Student s2) {
		return (s1.getName()).compareTo(s2.getName());
	}
	
}
class sortById implements Comparator<Student>{

	public int compare(Student s1, Student s2) {
		return s1.getId()-s2.getId();
	}
	
}


public class StudentSorted {
	
	public static void main(String[] args) {
		Student ob1=new Student("banu",143);// heap memory
		Student ob2=new Student("aanu",113);
		Student ob3=new Student("aanu",112);
		Student ob4=new Student("seema",121);
		Student ob5=new Student("john",111);
		Student[] st=new Student[5];
		st[0]=ob1;
		st[1]=ob2;
		st[2]=ob3;
		st[3]=ob4;
		st[4]=ob5;
		Arrays.sort(st,new sortByName());
		System.out.println("sorting by name");
		for(Student s:st){
			System.out.println(s);
		}
	
	/*	Arrays.sort(st, new sortById());*/
		
		/*System.out.println("sorting by id");
		for(Student s:st){
			System.out.println(s);
		}*/
		//use comaparator to sort the student objects by name,id
		
	}
}
/*
 *sorting by name
aanu ...113
aanu ...112
banu ...143
john ...111
seema ...121 
 */
