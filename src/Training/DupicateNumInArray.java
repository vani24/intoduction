/*
 * WJP to compare two compare two array and display repeating numbers?
 */
package Training;

public class DupicateNumInArray {

	public static void main(String args[]) {
		// TODO Auto-generated method stub
		int[] arr1= {1,4,6,7,3,7};
		int[] arr2= {4,8,9,6,1,3};
		for(int i=0 ; i<arr1.length;i++) {
			for(int j=0 ; j<arr2.length;j++) {
				if(arr1[i]==arr2[j]) {
					System.out.println(arr1[i]);
					
				}
			}
		}
		
		

	}

}
