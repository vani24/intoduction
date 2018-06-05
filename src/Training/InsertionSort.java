package Training;

public class InsertionSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr =new int[] {30,4,28,1,3,8};
		System.out.println("Before Sorting.......");
		printArray(arr);
		insertionSort(arr);
		System.out.println("After Sorting.......");
		printArray(arr);

	}
	private static void insertionSort(int[] arr) {
		if(arr == null && arr.length < 2) {
			return;
		}
		
		for(int i=1;i<arr.length;i++) {
			int temp=arr[i];
			 int j=i-1;
			while(j>=0 && arr[j]>temp) {
				arr[j+1]=arr[j];
				j--;
			}
			arr[j+1]=temp;
			 
			
		}
	}
	
	private static void printArray(int[] arr) {
		for(int i=0;i<arr.length;i++) {
			System.out.println(arr[i]+" ");
		}
	}

}
