package src.classes.informatik1;

public class SumDoWhileLoops {

	public static void main(String[] args) {
		
		int i = 0;
		int sum = 0;
		
		do {
			sum += i;
			i++;
		} while (i <= 100);
		
		System.out.println(sum);
	}
}