package sample;


import java.util.Scanner;

public class Program10 {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		      System.out.println("Enter the number of elements you want in a array");
		  int n=s.nextInt();
		  int[] arr=new int[n];
		  System.out.println("Enter the elements:");
		  for(int i=0;i<arr.length;i++) {
			  arr[i]=s.nextInt();
		  }

	        for (int i = 0; i < arr.length; i++) {
	            int count = 0;
	            for (int j = 0; j < arr.length; j++) {
	                if (arr[i] == arr[j])
	                  count++;
	            }
	           

	            System.out.println(arr[i] + "\t--->occures\t" + count + " times");
	        }
    }
}