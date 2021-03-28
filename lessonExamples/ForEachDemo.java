package lessonExamples;


public class ForEachDemo {
	
	public static double median (double [] arr) {
		
		double sum = 0.0;
		
		for (double element : arr) {
			sum += element;
		}
		return sum / arr.length;
	}
	
	public static void main(String[] args) {
		
		double [] arr = {7, 1.2, 3, 8, 20.8};
		
		double medianArr = median(arr);
		
		System.out.println(medianArr);
	}
	
}
