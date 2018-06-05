package Training;

import java.util.Scanner;
class OddException extends Exception{
	public OddException() {
		System.out.println("you entered odd so you missed the gift");
	}
}

public class UserExceptionTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.println("Please enter the number :");
		int s=scan.nextInt();
		try {
			if(s%2!=0){
				throw new OddException();
				
			}else {
				System.out.println("co"
						+ "ngrats earned 10$");
			}
		}catch(OddException e) {
			e.printStackTrace();
		}

	}

}
