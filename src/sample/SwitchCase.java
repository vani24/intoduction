package sample;

import java.util.Scanner;

public class SwitchCase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     for(int i=0;i<1;i++) {
		System.out.println("Please enter the mode of transport :");
        Scanner s=new Scanner(System.in);
        String commute=s.nextLine();
		if(commute.equalsIgnoreCase("Exit")) {
			System.out.println("Program Exit...");
			System.out.println("******************************************");
			break;
		}
		
	
		switch  (commute){
			case "bus" :
				System.out.println("it takes 30 mins to travel in Bus");
				break;
			case "train" :
				System.out.println("it takes 20 mins to travel in Train");
				break;
			case "car" :
				System.out.println("it takes 10 mins to travel in Car");
				break;
			case "walk" :
				System.out.println("i dont go to office");
				break;
			default :
				System.out.println("no comute entered");
				break;
		
		}
		System.out.println("********************************************");
		
	 }
		
		

	}

}
