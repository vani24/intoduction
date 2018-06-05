/*
 * Given an array, how do you get the count of pairs that sum to even
 */

package Training;

public class SumOfEven {
	public static int evenSumSubArrays(int arr[]) {
	    int[] count = new int[2];
	    int sum = 0;
	 
	    for (int i = 0; i < arr.length; i++) {
	        sum = (sum + arr[i]) % 2;
	        count[Math.abs(sum)]++;
	    }
	 
	    //Total even sum arrays = Total even sub arrays + number of odd pairs 
	                                            //+ number of even only pairs
	    int totalEvenSumSubArrayCount = count[0] + (count[0] 
	                                    * (count[0] - 1) / 2)  
	                                    + (count[1] * (count[1] - 1) / 2);
	 
	    return (totalEvenSumSubArrayCount); 
	}
	 

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {1, 2, 2, 3, 4, 1};
	  
	    System.out.println( "The Number of Subarrays with even sum is "+evenSumSubArrays (arr));
	         
	}

}
