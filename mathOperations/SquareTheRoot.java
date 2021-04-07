package mathOperations;

public class SquareTheRoot {

	
	public static int recurse (int recurseOn) {
		if (recurseOn == 0) {
			return 1;
		} else {
			return recurseOn*recurse(recurseOn-1);
		}
	}
	
	public static void main(String[] args) {
		System.out.println(recurse(4));
	}

}
