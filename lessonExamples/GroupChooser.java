package lessonExamples;

public class GroupChooser {

	public static void main(String[] args) {
		
		int group = 0;
		
		for (int i = 0; i < 5; i++) {
			
			group = (int)(Math.random() * 3 + 1);
			
			switch (group) {
			case 1:
				System.out.println("Team Freymuth");
				break;
			case 2:
				System.out.println("Team Arienti");
				break;
			case 3:
				System.out.println("Team Kalvelage");
				break;
			default:
				System.out.println("Ung�ltiger Zufallswert");
			}
		}
	}

}
