package javahackathon;

import java.util.Scanner;

public class PalindromeNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int numCopy = 0;

	      Scanner scan = new Scanner(System.in);
	      System.out.println("Enter how many numbers you want to enter");
	      int num = scan.nextInt();
	      System.out.println("Enter "+num +" Elements");
	      numCopy = num;

			String[] array = new String[num];   
		
			for(int i = 0; i < num; i++)
			{ 
		
			    array[i] = new Integer(scan.nextInt()).toString();
			    String rev="";
			for(int k=array[i].length()-1;k>=0;k--){
			    rev +=array[i].charAt(k);
			}
			    if(array[i].equals(rev))  { 
			        System.out.println("Is a palindrome");
		         }  else { 
			        System.out.println("Is not a palindrome");
			        }
			    break;
		
			}
	    }
	  
	}


/*
 Output:
 
Enter how many numbers you want to enter
4
Enter 4 Elements
1331
Is a palindrome


Enter how many numbers you want to enter
5
Enter 5 Elements
12345
Is not a palindrome
 * 
 */
