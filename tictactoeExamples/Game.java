package tictactoeExamples;
// import java.util.Random;

import java.util.Random;

public class Game {

	// from parameters
	final int FIELD_SIZE;
	String[] iconString;
	int difficulty;

	// control variables
	static int gamesPlayed;
	int roundCounter;
	int ini;
	boolean isSelecting;

	// functional fields
	Menu mainMenu, settingsMenu;
	GameField field;

	// player objects
	static Player player1;
	static Player player2;
	Player hasInitiative;

	/**
	 * 
	 * @param FIELD_SIZE
	 * @param iconString
	 * @param playerIcon
	 * @param difficulty
	 */
	public Game(int FIELD_SIZE, String[] iconString) {

		this.FIELD_SIZE = FIELD_SIZE;
		this.iconString = iconString;

		gamesPlayed = 0;
		roundCounter = 0;
		ini = 0;
		isSelecting = true;

		this.field = new GameField(this.FIELD_SIZE);
		player1 = new Player();
		player2 = new Player();
		this.hasInitiative = randInitiative(player1, player2);
	}

	public void startProgram() {
		// interfaces etc
		this.hasInitiative = randInitiative(player1, player2);

		for (int i = 0; i < (this.FIELD_SIZE * this.FIELD_SIZE); i++) {
			isSelecting = true;

			// get Active Player
			do {
				try {
					field.setFieldValues(1, 1, 'X');
					isSelecting = false;
					continue;
				} catch (Exception e) {
					// TODO: handle exception
				}
			} while (isSelecting);
			System.out.println(field.toString());
			// checkWinner
		}
	}

	public char checkWin(char iconChar) {
		char icon = iconChar;

		return icon;
	}

	static Player randInitiative(Player player1, Player player2) {
		Player hasInitiative = player2;
		Random random = new Random();
		double iniDouble = random.nextDouble();
		if (iniDouble < 0.5) {
			hasInitiative = player1;
		}
		;
		return hasInitiative;
	}

	public void runGame() {
		// TODO Auto-generated method stub
		System.out.println(""
				+ "Spiel läuft.\n"
				+ "Ende...");
	}
}