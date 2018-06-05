package Training;

import java.util.Scanner;

public class Fibonacci {
	// Function to check number is a
    // perfect square or not
    static boolean isPerfectSquare(int num)
    {
        int n = (int)(Math.sqrt(num));
        return(n*n == num);
    }
     
    // Function to check if the number
    // is in Fibonacci or not
    static void checkFib(int array[], int n)
    {
        int count = 0;
        for (int i = 0; i<n; i++)
        {
            if (isPerfectSquare(5 * array[i] * array[i] + 4) ||
                isPerfectSquare(5 * array[i] * array[i] - 4))
            {
                System.out.print(array[i]+" ");
                count++;
            }
        }
        if (count == 0)
            System.out.println("None Present");
    }
     
    // driver program
    public static void main (String[] args) 
    {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter the number of elements in an array :");
        int n=scan.nextInt();
        int[] arr=new int[n];
        System.out.println("Enter the elements : ");
        for (int i=0;i<arr.length;i++) {
        	arr[i]=scan.nextInt();
        }
    	//int array[] = {4, 2, 8, 5, 20, 1, 40, 13, 23};
        //int n1 = array.length;
        checkFib(arr, n);
    }

}
