/*
 * Given an array of integers, print only odd numbers
 */
package Training;

import java.util.Scanner;

public class OddNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the Array Size");
		int size=scan.nextInt();
		int[] arr=new int[size];
		System.out.println("Enter the Numbers : ");
		for(int i=0;i<arr.length;i++) {
			arr[i]=scan.nextInt();
			
		}
		for(int j=0;j<arr.length;j++) {
			if(arr[j]%2 !=0) {
				System.out.println(arr[j]+ " is odd number");
			}
		}

	}

}
