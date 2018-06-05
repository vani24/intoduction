package sample;

import java.util.Scanner;

public class DuplicateEleInArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		int[] arr1=new int[5];
		System.out.println("Enter the First Array....");
		for(int i=0;i<arr1.length;i++) {
			arr1[i]=scan.nextInt();
		}
		System.out.println("First array loaded......");
		int[] arr2=new int[5];
		System.out.println("Enter the Second Array....");
		for(int j=0;j<arr2.length;j++) {
			arr2[j]=scan.nextInt();
		}
		System.out.println("Second Array Loaded......");
		
		for(int i=0;i<arr1.length;i++) {
			if(arr1[i] != arr2[i]) {
				System.out.println("arr1["+i+"]-----> "+arr1[i]+" is not equal to arr2["+i+"]----->"+arr2[i]);
			}
		}

	}

}
