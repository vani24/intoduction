package Training;

public class Student implements Comparable<Student> {
	
	private String name;
	private int id;
	public Student(){
		
	}
	public Student(String name,int id) {
		this.name=name;
		this.id=id;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return this.name+" ..."+this.id;
	}

	public int compareTo(Student s) {// comparable interface
		
			//return this.id-s.id;
		
		return (this.name).compareTo(s.name); 
	}

	public int compare(Student s1, Student s2) {// comparator
		// TODO Auto-generated method stub
		return 0;
	}
	
	
	@Override
	public boolean equals(Object arg0) {
		Student s=(Student)arg0;
		// TODO Auto-generated method stub
		return (this.name).equals(s.name)&& this.id==s.id;
	}
	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return this.name.hashCode()+this.id;//340+11-->351
	}

}

