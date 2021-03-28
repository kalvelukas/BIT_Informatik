package lessonExamples;

public class valueRangev3 {
	public static void main(String[] args) {
		float incFloat = 0;
		int incInt = 0;
		while (incFloat == incInt && (int) incFloat == incInt) {
			incFloat++;
			incInt++;
		}
		System.out.println(incInt + " " + incFloat);
		System.out.println("Long: " + incInt + "   Letzter genauer Float Wert : " + incFloat + "\nZeig mir den Grenzbereich!\n");
				
	}
}