package lessonExamples;

public class Sesh4 {
	public static void main(String[] args) {
		
		int weekday = 3; //weekday = 1 bis 7
		
		switch (weekday) {
		
			case 1:
			case 2:
			case 3:
			case 4:
			case 5:{
				System.out.println("Arbeiten");
				break;
			}
			case 6: {
				System.out.println("Einkaufen");
				break;
			}
			case 7: {
				System.out.println("Ausruhen");
				break;
			}
			default:
				System.out.println("Zahl zwischen 1 und 7");
				break;
			}
	}
}