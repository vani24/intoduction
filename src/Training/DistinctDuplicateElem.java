/*
 * Given an array prints the unique numbers and also print the number of 
occurrences of duplicate numbers
 */
		
package Training;

public class DistinctDuplicateElem {
	public static void printDistinctElements(int[] arr){
        
        for(int i=0;i<arr.length;i++){
        	
            boolean isDistinct = false;
            for(int j=0;j<i;j++){
                if(arr[i] == arr[j]){
                    isDistinct = true;
                    break;
                }
                
            }
            if(!isDistinct){
                System.out.print(arr[i]+" ");
            }
            
        }
        for (int i = 0; i < arr.length; i++) {
            int count = 0;
            for (int j = 0; j < arr.length; j++) {
                if (arr[i] == arr[j])
                  count++;
            }
           

            System.out.println("\n"+arr[i] + " ---> occurs " + count + " times");
        }
    }
     
    public static void main(String a[]){
         
        int[] nums = {5,2,7,2,4,7,8,2,3};
        DistinctDuplicateElem.printDistinctElements(nums);
    }

}
