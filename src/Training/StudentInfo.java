/*
1) Create the student class with name, id, marks. Read 5 student information and print all 5 student
information
2) Create the student class with name, id, marks. Implement the methods for the fallowing
i) Read student all information by name
ii) Read student all information by id
iii) Read student all information by marks
3.Create the student class with name, id, marks. Store the student in the ascending order
i) of marks
ii) of name
 */

package Training;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

class sortByName implements Comparator<StudentInfo>{

	public int compare(StudentInfo s1, StudentInfo s2) {
		return (s1.getName()).compareTo(s2.getName());
	}
	
}
class sortById implements Comparator<StudentInfo>{

	public int compare(StudentInfo s1, StudentInfo s2) {
		return s1.getMarks()-s2.getMarks();
	}
	
}

public class StudentInfo {
	public String name;
	public int id;
	public int marks;

	public StudentInfo() {
		System.out.println("constructor called");
	}
	
	public StudentInfo(String name,int id,int marks) {
		this.name=name;
		this.id=id;
		this.marks=marks;
		
	}
	
	public void writeExam(){
		System.out.println("writing exam");
	}
	
	public String getName() {
		return name;
	}
	public int getMarks() {
		return marks;
	}
	
	public String toString() {
		// TODO Auto-generated method stub
		return "student name="+this.name+ ",id="+this.id+ ", marks="+this.marks;
	}
	
	public static StudentInfo getInfoByName(String name,StudentInfo[] s){
		for(StudentInfo st:s){
			if(st.name.equalsIgnoreCase(name)){
				return st;
			}
		}
		return null;
	}
	public static StudentInfo getInfoById(int id,StudentInfo[] s){
		for(StudentInfo st:s){
			if(st.id == id){
				return st;
			}
		}
		return null;
	}
	public static StudentInfo getInfoByMarks(int marks,StudentInfo[] s){
		for(StudentInfo st:s){
			if(st.marks == marks){
				return st;
			}
		}
		return null;
	}
	
	
	public static void main(String[] args) {
		String name;
		int id;
		int m1;
		int m2;
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the name to get the details of the student: ");
		String str=sc.nextLine();
		StudentInfo[] sArray=new StudentInfo[5];
		for(int i=0;i<5;i++){
			System.out.println("eneter name");
			name=sc.next();
			System.out.println("eneter id");
			id=sc.nextInt();
			System.out.println("eneter m1");
			m1=sc.nextInt();
			
			
			
			sArray[i]=new StudentInfo(name,id,m1);
		}
		//sc.close();
		
		StudentInfo ob1=sArray[0];
		StudentInfo ob2=sArray[1];
		StudentInfo ob3=sArray[2];
		StudentInfo ob4=sArray[3];
		StudentInfo ob5=sArray[4];
		StudentInfo[] st=new StudentInfo[5];
		st[0]=ob1;
		st[1]=ob2;
		st[2]=ob3;
		st[3]=ob4;
		st[4]=ob5;
		
		
		//enhanced for loop or for each loop
		for(StudentInfo ss:st)
		System.out.println(ss);
		
		System.out.println("-----------------------------------------------------");
		System.out.println("Enter the name to get the details of the student:");
		String stName=sc.nextLine();
		StudentInfo resObj=getInfoByName(stName,st);
		System.out.println(resObj);
		System.out.println("-----------------------------------------------------");
		System.out.println("Enter the id to get the details of the student: ");
		int stId=sc.nextInt();
		StudentInfo resObj1=getInfoById(stId,st);
		System.out.println(resObj1);
		System.out.println("-----------------------------------------------------");
		System.out.println("Enter the marks to get the details of the student: ");
		int stMarks=sc.nextInt();
		StudentInfo resObj2=getInfoByMarks(stMarks,st);
		System.out.println(resObj2);
		
		System.out.println("-----------------------------------------------------");
		Arrays.sort(st,new sortByName());
		System.out.println("sorting by name");
		for(StudentInfo s:st){
			System.out.println(s);
		}
		Arrays.sort(st, new sortById());
		
		System.out.println("sorting by marks");
		for(StudentInfo s:st){
			System.out.println(s);
		}

	}

}
