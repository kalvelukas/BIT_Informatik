package lessonExamples;

import java.util.Scanner;

public class InputUtils {
	Scanner input;

	public InputUtils() {
		input = new Scanner(System.in);
	}

	public int getInteger(int min, int max) {
		int retChoice = 0;
		do {
			System.out.print("Ihre Eingabe: ");
			if (input.hasNextInt()) {
				retChoice = input.nextInt();
			}
			if (retChoice < min || retChoice > max) {
				System.out.println("Eingabe ungültig!");
			}
		} while (retChoice < min || retChoice > max);

		return retChoice;
	}
}
