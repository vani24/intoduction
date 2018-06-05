package sample;

public class Program5 {
	public static void main(String[] args) {
		  new Program5();
		 }
		  
		 public Program5() {
		  int[] arr=new int[]{2,5,3,1,4,5,1};
		   
		  System.out.println("Before Sorting...");
		  printArray(arr);
		   
		  bubbleSort(arr);
		   
		  System.out.println("\nAfter Sorting...");
		  printArray(arr);
		 }
		  
		 private void bubbleSort(int[] arr){
		  if(arr==null)
		   return;
		   
		  boolean isSorted=true;
		 
		  for (int i = 0; i < arr.length-1; i++) {
		   for (int j = 1; j < arr.length-i; j++) {
		    if(arr[j-1] > arr[j]){
		     isSorted = false;
		     int temp = arr[j];
		     arr[j] = arr[j-1];
		     arr[j-1] = temp; 
		    }
		   }
		    
		   // Remember that a bubble sort will continue until no swaps have occurred,
		   // which says that array is in proper sorted order.
		   if(isSorted){
		    break;
		   }
		  }
		   
		 }
		  
		 private void printArray(int arr[]){
		  for (int i = 0; i < arr.length; i++) {
		   System.out.print(arr[i] + " ");
		  }
		 }

}
