package javahackathon;

import java.util.Scanner;

public class InputStringOrIntOrBool {
	public static void main(String[]s){
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter the value to check if it is a interger or a string or a boolean");
        if(scan.hasNextInt()) {
        	System.out.println(scan.nextInt()+" is a Integer");
        	
        }else if(scan.hasNextBoolean()) {
        	System.out.println(scan.nextBoolean()+" is a Boolean");
        }else if(scan.hasNextLine()) {
        	System.out.println(scan.nextLine()+" is a String");
        }
     
    }
   

}

/*
Output:

Enter the value to check if it is a interger or a string or a boolean
1902
1902 is a Integer
--------------------------------------
Enter the value to check if it is a interger or a string or a boolean
false
false is a Boolean
----------------------------------------
Enter the value to check if it is a interger or a string or a boolean
This is java example
This is java example is a String
 */
