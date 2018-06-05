package Training;

public class SelectionSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr=new int[] {35,2,7,3,22,5};
		System.out.println("Before Sorting......");
		printArray(arr);
		selectionSort(arr);
		System.out.println("After Sorting.......");
		printArray(arr);
		

	}
	private static void selectionSort(int[] arr) {
		for(int i =0 ;i<arr.length-1;i++) {
			int minTillNow=i;
			for(int j=i+1;j<arr.length;j++) {
				if(arr[minTillNow]>arr[j]) {
					minTillNow=j;
				}
			}
			if(minTillNow!=i) {
				int temp=arr[minTillNow];
				arr[minTillNow]=arr[i];
				arr[i]=temp;
			}
		}
	}
  private static void printArray(int[] arr) {
	  for(int i=0;i<arr.length;i++) {
		  System.out.println(arr[i]+" ");
	  }
  }
}
