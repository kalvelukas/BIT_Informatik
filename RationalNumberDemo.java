package src.classes.informatik1;

public class RationalNumberDemo {
	public static void main(String[] args) {
		int a = 20;
		int b = 16;
		
		System.out.println("Jahr:" + a + b);
		System.out.println(a + b + " Jahr");
		
		System.out.println("\n\nHier ist noch was von den Brüchen:\n");
		
		RationalNumber ratA = new RationalNumber(2, 10);
		RationalNumber ratB = new RationalNumber(36, 48);
		
		System.out.println("a + b = " + RationalNumber.add(ratA, ratB));
		System.out.println("a - b = " + RationalNumber.subtract(ratA, ratB));
		System.out.println("a * b = " + RationalNumber.multiply(ratA, ratB));
		System.out.println("a / b = " + RationalNumber.divide(ratA, ratB));
	}
}
