package javahackathon;

import java.util.Scanner;

public class DistinctAndDupicateEleArr {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan= new Scanner(System.in);
		System.out.println("Enter how many elements to be in an Array :");
		int num=scan.nextInt();
		int[] arr=new int[num];
		int a=arr.length;
		System.out.println("Enter the Elements of the Array :");
		for(int i=0;i<arr.length;i++) {
			arr[i]=scan.nextInt();
			
		}
		printDistinct(arr, a);
		printDuplicate(arr, a);
		

	}
	static void printDistinct(int[] arr,int n) {
		System.out.println("Distinct ELements in the array are:");
		 for (int i = 0; i < n; i++)
	        {
			 int j;
	         for (j = 0; j < i; j++)
	            if (arr[i] == arr[j])
	                break;
	     
	            if (i == j)
	           // 
	            System.out.print( arr[i] + " ");
	        }
 }
	static void printDuplicate(int[] arr,int n) {
		  // Pick all elements one by one
		for (int i = 0; i < arr.length; i++) {
          int count = 0;
          for (int j = 0; j < arr.length; j++) { 
              if (arr[i] == arr[j])
                count++;
          }
	
          // Check if the picked element 
          // is already printed
          int k;
          for (k = 0; k < i; k++)
          if (arr[i] == arr[k]) {
          	 System.out.println("\n"+arr[i] + " ---> occurs " + count + " times");
          	 break;
          }
          
          	
         
      }
     
          
      }
	}

/*
Output:
Enter how many elements to be in an Array :
6
Enter the Elements of the Array :
1
2
3
1
5
2
Distinct ELements in the array are:
1 2 3 5 
1 ---> occurs 2 times

2 ---> occurs 2 times
 */

