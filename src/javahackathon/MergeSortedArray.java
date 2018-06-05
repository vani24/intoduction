package javahackathon;

import java.util.Arrays;
import java.util.Scanner;

public class MergeSortedArray {
		     
		    // Driver method to test the above function
		    public static void main(String[] args) 
		    {
		    	int n=6; 
		    	Scanner scan=new Scanner(System.in);
				 //System.out.println("Enter number of elements in an array..");
				// int num=scan.nextInt();
				 int[] arr1=new int[n];
				 System.out.println("Enter the first sorted Array of elements : ");
				 for(int i=0;i<arr1.length;i++) {
					 arr1[i]=scan.nextInt();
				 }
				// System.out.println("Enter number of elements in an array..");
				 int num1=4;
				 int[] arr2=new int[num1];
				 System.out.println("Enter the second sorted array of elements :");
				 for(int i=0;i<arr2.length;i++) {
					 arr2[i]=scan.nextInt();
				 }
				
						
			
				 int[] mergedArr = mergeTwoSortedArray(arr1, arr2);
				  for (int i : mergedArr) {
				   System.out.print(i + " ");
				  }
				 }
				 
				 public static int[] mergeTwoSortedArray(int[] arr1, int[] arr2) {
				  int[] mergedArray = new int[arr1.length + arr2.length];
				  int i = 0, j = 0, index = 0;
				 
				  while (i < arr1.length && j < arr2.length){
				   if (arr1[i] < arr2[j])       
				    mergedArray[index++] = arr1[i++];
				   else       
				    mergedArray[index++] = arr2[j++];               
				  }
				 
				  while (i < arr1.length)  
				   mergedArray[index++] = arr1[i++];
				 
				  while (j < arr2.length)    
				   mergedArray[index++] = arr2[j++];
				 
				  return mergedArray;
				 }
}

/*
 * Output:
 * Enter the first sorted Array of elements : 
1
2
5
6
7
8
Enter the second sorted array of elements :
3
4
9
10
1 2 3 4 5 6 7 8 9 10 
 */
