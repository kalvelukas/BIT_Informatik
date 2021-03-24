package src.classes.informatik1;

public class TaskDemo {
	
	//Array gibt nach größe sortiert aus, ind1 ist 2. stelle
	static int[] createSortedArray(int a, int b) {
		if (a < b) {
			return new int[] {a, b};
		} else {
			return new int[] {b, a};
		}
	}
	public static void main(String[] args) {
			System.out.println(createSortedArray(7, 4)[1]);
	}
}
