package sample;

abstract class SubClass {

	public abstract void submit();

}

public class sample2 extends SubClass {
	public static void main(String[] args) {

		/*
		 * String[] studentName=new String[5]; studentName[0]="Sindhu";
		 * studentName[1]="ABhi"; studentName[2]="Siri"; studentName[3]="Peter";
		 * studentName[4]="SId"; int arr; arr=studentName.length;
		 * 
		 * for(int i=0;i<arr;i++) { System.out.println("studentName ["+i+"]="
		 * +studentName[i]); }
		 */
		Integer i1 = 33;
		Integer i2 = 33;

		Integer n1 = new Integer(44);
		Integer n2 = new Integer(44);

		String a1 = "tekarch";
		String a2 = "tekarch";

		String s1 = new String("tek");
		String s2 = new String("tek");

		System.out.println(a1.equals(a2));
		System.out.println(a1 == a2);

		System.out.println(i1.equals(i2));
		System.out.println(i1 == i2);

		System.out.println(n1.equals(n2));
		System.out.println(n1 == n2);

		System.out.println(s1.equals(s2));
		System.out.println(s1 == s2);

	}

	@Override
	public void submit() {
		// TODO Auto-generated method stub

	}

}
