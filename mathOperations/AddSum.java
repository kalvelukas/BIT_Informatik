package mathOperations;

public class AddSum {
	
	public static void main(String[] args) {
		
		int n=5;
		int result = 0;
		int i = 0;
		while (i<=n) {
			result = result + i;
			i = i+1;
		}
		System.out.println(result);
	}
}
