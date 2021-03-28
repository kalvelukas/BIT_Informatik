package mathOperations;

public class TriangularMatrix {
	public static void main(String[] args) {
				
		int [][] triangle = new int[3][];
		
		for (int i = 0; i < triangle.length; i++) {
			triangle[i] = new int [i + 1];
		}
		
		System.out.println(triangle[0][0]);
		System.out.println(triangle[1][1]);
		System.out.println(triangle[2][2]);
	}
}
