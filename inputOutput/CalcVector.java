package inputOutput;

import java.util.ArrayList;
import java.util.Scanner;

public class CalcVector {
	ArrayList<Integer> vector;
	String vectorString;
	double vectorLength;
		
	public CalcVector() {
		vector = new ArrayList<Integer>();
		
		Scanner scanner = new Scanner(System.in);
		
		while (scanner.hasNextInt()) {
			vector.add(scanner.nextInt());
		}
		
		double sumVectorSqu = 0;
		for (Integer integer : vector) {
			sumVectorSqu += Math.pow(integer, 2);
		}
		vectorLength = Math.sqrt(sumVectorSqu);
		
		System.out.println(toStringVector());
		System.out.println(toStringLength());
		scanner.close();
	}
	
	private String toStringVector() {
		vectorString = "a = [";
		for (Integer integer : vector) {
			vectorString += integer + ", ";
		}
		vectorString = vectorString.substring(0, vectorString.length() - 2) 
				+ "]";
		return vectorString;
	}
	
	private String toStringLength() {
		String lengthString;
		lengthString = String.format("||a|| = %.2f", vectorLength);
		return lengthString;
	}
	
	public static void main(String[] args) {
		new CalcVector();
	}
}
