package mathOperations;

public class PascalDemo {
	public static void main(String[] args) {
		PascalTriangle triangle = new PascalTriangle(10);
		PascalTriangle triangle2 = new PascalTriangle(30);
		triangle.printTriangle();
		triangle2.printTriangle();
	}
}
