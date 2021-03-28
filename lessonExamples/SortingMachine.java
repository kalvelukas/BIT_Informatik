package lessonExamples;

public class SortingMachine {
	
	public static void printSorted ( int [] a) {
		for (int i = 0; i < a.length; i++) {
			System.out.println("Index " + i + " hat den Wert: " + a[i]);
		}
	}
	
	static void sort (int[] arr) {
		int i = 0;
		
		while (i <= arr.length - 2) {
			if (arr[i] > arr[i + 1]) {
				int temp = arr[i];
				arr[i] = arr[i+1];
				arr [i+1] = temp;
				
				if (i > 0)
					i--;
			} else {
				i++;
			}
			
		}
	
	}
	
	public static void main(String[] args) {
	
		int[] arr = {10, 9, 8, 7, 6, 5, 4, 3, 2, 1, 7};
	
		sort(arr);
	
		printSorted(arr);
	
	}
}
