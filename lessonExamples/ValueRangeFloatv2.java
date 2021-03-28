package lessonExamples;

public class ValueRangeFloatv2 {

	public static void main(String[] args) {
		//declare Variables
		float incFloat = 0;
		long incLong = 0;
		long longCeil = (long) Math.ceil(incFloat);		//comparison through float cast into exact integers   (incLong == longCeil && incLong == longFloor)
		long longFloor = (long) Math.floor(incFloat);	//comparison through float cast into exact integers
		//
		while (incLong == longCeil && incLong == longFloor) {
			incFloat++;
			longCeil = (long) Math.ceil(incFloat);
			longFloor = (long) Math.floor(incFloat);
			incLong++;
		}
		System.out.println("Long: " + incLong + "   Letzter genauer Float Wert : " + longCeil + "\nZeig mir den Grenzbereich!\n");
			
	}
}