package src.classes.informatik1;

/**
 * represent a fraction as a numerator and a denominator 
 * @author Lukas Kalvelage
 *
 */
public class RationalNumber {

	/**
	 * 
	 */
	int numerator;
	/**
	 * 
	 */
	int denominator;
	
	/**
	 * 
	 * @param numerator
	 * @param denominator
	 */
	public RationalNumber(int numerator, int denominator) {
		this.numerator = numerator;
		this.denominator = denominator;
		reduce();
	}
	
	/**
	 * 
	 * @return
	 */
	public int getNumerator() {
		return numerator;
	}
	
	/**
	 * 
	 * @return
	 */
	public int getDenominator() {
		return denominator;
	}
	
	/**
	 * 
	 * @param numerator
	 */
	public void setNumerator(int numerator) {
		this.numerator = numerator;
	}
	
	/**
	 * 
	 * @param denominator
	 */
	public void setDenominator(int denominator) {
		this.denominator = denominator;
	}
	
	/**
	 * 
	 */
	private void reduce () {
		int gcd = greatestCommonDivisor(numerator, denominator);
		
		while (gcd >1) {
			numerator /= gcd;
			denominator /= gcd;
			gcd = greatestCommonDivisor(numerator, denominator);
		}
	}
	
	/**
	 * 
	 * @param a
	 * 			first Integer
	 * @param b
	 * 			second Integer
	 * @return
	 */
	private int greatestCommonDivisor(int a, int b) {
		if (a < 0) {
			a= -a;
		}
		if (b < 0) {
			b = -b;
		}
		while (b != 0) {
			int h = a%b;
			a = b;
			b=h;
		}
		return a;
	}

	/**
	 * 
	 * @param a
	 * @param b
	 * @return
	 */
	public static RationalNumber add (RationalNumber a, RationalNumber b) {
		int numerator = a.numerator * b.numerator + b.numerator * a.denominator;
		int denominator = a.denominator * b.denominator;
		
		return new RationalNumber(numerator, denominator);
	}
	
	/**
	 * 
	 * @param a
	 * @param b
	 * @return
	 */
	public static RationalNumber subtract (RationalNumber a, RationalNumber b) {
		int numerator = a.numerator * b.numerator - b.numerator * a.denominator;
		int denominator = a.denominator * b.denominator;
		
		return new RationalNumber(numerator, denominator);
	}
	
	/**
	 * 
	 * @param a
	 * @param b
	 * @return
	 */
	public static RationalNumber multiply (RationalNumber a, RationalNumber b) {
		int numerator = a.numerator * b.numerator;
		int denominator = a.denominator * b.denominator;
		
		return new RationalNumber(numerator, denominator);
	}
	
	/**
	 * 
	 * @param a
	 * @param b
	 * @return
	 */
	public static RationalNumber divide (RationalNumber a, RationalNumber b) {
		int numerator = a.numerator * b.denominator;
		int denominator = a.denominator * b.numerator;
		
		return new RationalNumber(numerator, denominator);
	}
	
	/**
	 * 
	 */
	public String toString () {
		return numerator + "/" + denominator;
	}
}
