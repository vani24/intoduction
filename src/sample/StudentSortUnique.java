/*
 * Create student class with name(String type) and regno (int type) attributes. 
 * use any collection to Store 5 student information. 
 * sort students using name(only unique student objects should be printed (Ex s1(aa,11) 
 * s2(aa,12) s3(aa,11) s4(bb,12) then s1(aa,11) s2(aa,12) s4(bb,12) should be printed.
 */
package sample;

import java.util.Arrays;
import java.util.Comparator;
import java.util.HashSet;

import Training.Student;



public class StudentSortUnique {
	public static void main(String[] args) {
		HashSet<Student> ele=new HashSet<Student>();  
		Student ob1=new Student("banu",143);// heap memory
		Student ob2=new Student("aanu",113);
		Student ob3=new Student("aanu",112);
		Student ob4=new Student("seema",121);
		Student ob5=new Student("john",111);
	
		ele.add(ob1);
		ele.add(ob2);
		ele.add(ob3);
		ele.add(ob4);
		ele.add(ob5);
		System.out.println("sorting by name");
		/*for(Student s:ele){
			System.out.println(s);
		}*/
	/*	Arrays.sort(st, new sortById());*/
		
		/*System.out.println("sorting by id");
		for(Student s:st){
			System.out.println(s);
		}*/
		//use comaparator to sort the student objects by name,id
		
	}

}
