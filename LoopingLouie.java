package src.classes.informatik1;

public class LoopingLouie {

	public static void main(String[] args) {
		int sum = 0;
		int i= 1;
//		for (i = 1; i <= 100; i++) {
//			sum += i;
//		}
		do {
			sum += i;
			i++;
		}
		while (i <= 100);
		System.out.println(sum);
	}
}