package lessonExamples;

public class InterestCalc {

	public static void main(String[] args) {

		double start = 5000;
		
		double rate = 1.015;
		double credit = start;
		
		for (int i = 0; i <= 50; i++) {
			credit = start * Math.pow(rate, i);
			System.out.printf("%2d. Jahr: Guthaben = %8.2f \n", i, credit);;
		}
	}
}
