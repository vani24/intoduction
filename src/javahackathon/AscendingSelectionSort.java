package javahackathon;

import java.util.Scanner;

public class AscendingSelectionSort {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the size of the Array :");
		int n=scan.nextInt();
		int[] arr=new int[n];
		System.out.println("Enter the elements of the array :");
		for(int i=0;i<arr.length;i++) {
			arr[i]=scan.nextInt();
		}
		sort(arr);
		printArr(arr);
	}
	
	static void sort(int[] arr) {
		for(int i =0 ;i<arr.length-1;i++) {
			int minTillNow=i;
			for(int j=i+1;j<arr.length;j++) {
				if(arr[minTillNow]>arr[j]) {
					minTillNow=j;
				}
			}
			if(minTillNow!=i) {
				int temp=arr[minTillNow];
				arr[minTillNow]=arr[i];
				arr[i]=temp;
			}
		}
	}
	static void printArr(int[] arr) {
		System.out.println("The acending Order of slection Sort is : ");
		for(int i=0;i<arr.length;++i) {
			System.out.println(arr[i]+" ");
		}
	}

}
/*
 * 
 Output:
 Enter the size of the Array :
7
Enter the elements of the array :
2
4
6
844
75
24
6
The acending Order of slection Sort is : 
2 
4 
6 
6 
24 
75 
844 

 * 
 */
