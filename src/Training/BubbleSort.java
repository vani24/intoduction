package Training;

public class BubbleSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr=new int[] {40,60,20,50,30,70,10};
		System.out.println("Array before sorting......");
		printArray(arr);
		bubbleSort(arr);
		System.out.println("\n");
		System.out.println("Array After sorting........");
		printArray(arr);
		
	}
	private static void bubbleSort(int[] arr) {
		if(arr==null)
			return;
		boolean isSorted=true;
		for(int i=0;i<arr.length-1;i++) {
			for(int j=1;j<arr.length-i;j++) {
				if(arr[j-1]>arr[j]) {
					
					isSorted=false;
					int temp=arr[j];
					arr[j]=arr[j-1];
					arr[j-1]=temp;
				}
			}
			if(isSorted) {
				break;
					
				}
			}
		}
	
	private static void printArray(int[] arr) {
		
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
	}

}
