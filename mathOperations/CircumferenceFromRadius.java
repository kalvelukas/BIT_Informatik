package mathOperations;

public class CircumferenceFromRadius {

	public static void main(String[] args) {
		
		double radius = 25.85056;
		double circumf;
		
		if (radius >= 0){
			circumf = 2 * Math.PI * radius;

			System.out.println(circumf);
		} else {
			System.out.println("Fehler! Radius ist negativ.");
		}
	}
}