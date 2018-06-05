package Training;

import java.util.Scanner;

public class LinerSearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i;
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the number of elements :");
		int num=scan.nextInt();
		int[] arr=new int[num];
		System.out.println("Enter "+num+" elements :");
		for(i=0;i<arr.length;i++) {
			arr[i]=scan.nextInt();
		}
		System.out.println("Enter the search element :");
		int search=scan.nextInt();
		for(i=0;i<arr.length;i++ ) {
			if(arr[i]==search) {
				System.out.println(search+" is found at the location "+(i+1));
				break;
			}
		}
		if(i==num) {
			System.out.println(search+ " doest not exisits.");
		}
	}

}
