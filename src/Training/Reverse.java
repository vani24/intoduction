/*
 * Write a program to reverse the digits of the NUMBERS  in java programming
 without using reverse command
 */
package Training;

public class Reverse {

	public static void main(String[] args) {

		// TODO Auto-generated method stub
		/*
		 * int n, reverse = 0;
		 * 
		 * System.out.println("Enter a number to reverse"); Scanner in = new
		 * Scanner(System.in); n = in.nextInt();
		 * 
		 * while (n != 0) { reverse = reverse + n % 10; n = n / 10; }
		 * 
		 * System.out.println("Reverse of the number is " + reverse);
		 */

		String name = new String("my name is");
		change(name);
		System.out.println("name====" + name);

	}

	static String change(String str) {
		str = str + " Vani";
		return str;

	}
	/*
	 * static void change(String in) { in = in + " changed"; }
	 * 
	 * static void change(StringBuffer in) { in.append(" changed"); }
	 * 
	 * public static void main(String[] args) { StringBuffer sb = new
	 * StringBuffer("value"); String str = "value"; change(sb); change(str);
	 * System.out.println("StringBuffer: " + sb); System.out.println("String: " +
	 * str); }
	 */
}
