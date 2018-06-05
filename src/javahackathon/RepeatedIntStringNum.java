package javahackathon;

import java.util.Scanner;

public class RepeatedIntStringNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.println("write the sentence to count the Uppercase lowercase and number :");
		String test=scan.nextLine();
		//String test = "Aa kiu, I swd skieo 236587. GH kiu: sieo?? 25.33";
		count(test);

	}
	public static void count(String x){
		char[] ch = x.toCharArray();
		int letter = 0;
		int space = 0;
		int num = 0;
		int other = 0;
		int uppercase=0,lowercase=0;
		
		
		for(int i = 0; i < x.length(); i++){
			if(Character.isLowerCase(x.charAt(i))){
				lowercase++;
			}else if(Character.isUpperCase(x.charAt(i))){
				uppercase++;
			}
			else if(Character.isDigit(ch[i])){
				num ++ ;
			}
			else if(Character.isSpaceChar(ch[i])){
				space ++ ;
			}
			else{
				other ++;
			}
		}
		System.out.println(x);
		System.out.println("uppercase: " + uppercase);
		System.out.println("lowercase : "+lowercase);
		System.out.println("space: " + space);
		System.out.println("number: " + num);
		System.out.println("other: " + other);
			

	}

}


/*
Output:

write the sentence to count the Uppercase lowercase and number :
THis is to test the counter proGram 1235
THis is to test the counter proGram 1235
uppercase: 3
lowercase26
space: 7
number: 4
other: 0

 */
