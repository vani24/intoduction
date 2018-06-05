package Training;

import java.util.Scanner;

public class SimilarElementInArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the First Array :");
		int[] arr1=new int[6];
		for(int i=0;i<arr1.length;i++) {
			arr1[i]=scan.nextInt();
		}
		System.out.println("First Array Loaded....");
		System.out.println("Enter the Second Array :");
		int[] arr2=new int[6];
		for(int j=0;j<arr2.length;j++) {
			arr2[j]=scan.nextInt();
		}
		System.out.println("Second Array loaded.....");
		
		for(int k=0;k<arr1.length;k++) {
			if(arr1[k]==arr2[k]) {
				System.out.println("Common Elements is : "+arr1[k]);
			}
		}
		

	}

}
