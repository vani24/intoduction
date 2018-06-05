package javahackathon;

import java.util.Arrays;
import java.util.Scanner;

public class ArraySorting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the size of the array :");
		int n=scan.nextInt();
		int[] a=new int[n];
		System.out.println("Enter the Elements of the array to be sorted :");
        for(int i=0;i<a.length;i++) {
        	a[i]=scan.nextInt();
        	
        }
        Arrays.sort(a);
        System.out.println("Sorted Elements of the Array is : " +Arrays.toString(a));
	}

}

/*
Output:

Enter the size of the array :
7
Enter the Elements of the array to be sorted :
13
1
4
7
90
23
56
Sorted Elements of the Array is : [1, 4, 7, 13, 23, 56, 90]
*
*/