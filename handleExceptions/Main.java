package handleExceptions;

import org.junit.platform.commons.function.Try;

public class Main {
	public static void main(String[] args) {
		int[] a = new int[4];
		
		try {
			a[4] = recursiveIncrease(7);
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Caught ArrayIndexOutOfBoundsException");
		} catch (StackOverflowError e) {
			System.out.println("StackOverflowError");
		}
		System.out.println("Exiting main()");
	}
	
	public static void printRatio(int a, int b) {
		
		try {
			int ratio = a/b;
			System.out.println("Ratio = " + ratio);
		} catch (ArithmeticException e) {
			System.out.println("Expected Arithmetic by Zero" + e);
		} catch (Exception e) {
			System.out.println("Unexpected Exception!!! " + e);
		}
	}
	
	public static int recursiveIncrease(int i) {
		return recursiveIncrease(i+1);
	}
}
