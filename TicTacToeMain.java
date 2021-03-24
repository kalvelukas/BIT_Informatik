/**
 * JRE15
 */
package src.classes.informatik1;

/**
 * Tic Tac Toe Java Game Hausarbeit InformatikI - Dozent: Prof. Dr. Rohjans
 * 
 * @author Lukas Kalvelage
 */

public class TicTacToeMain {
	/**
	 * From here, the program starts and initial, gamewide parameters are set
	 */
		
	//parameters for initialisation of the game's central settings

	// flow control variables
	static int selection;
	
	// Game parameters
	static final int FIELD_SIZE = 3;
	//icons from menu selection
	// create Game Object
	static Game tictactoe = new Game(FIELD_SIZE, Menu.getPlayerIcons());
		
	private static void mainMenuFlow() {
		selection = Menu.mainMenu.fetchIndex();
		switch (selection) {
		case 1:
			tictactoe.runGame();
			mainMenuFlow();
			break;
		case 2:
			settingsMenuFlow();
			mainMenuFlow();
			break;
		case 3:
			statsMenuFlow();
			mainMenuFlow();
			break;
		default:
			break;
		}
	}
	
	private static void statsMenuFlow() {
		// TODO Auto-generated method stub
		System.out.println("statistiken");
	}

	private static void settingsMenuFlow() {
		selection = Menu.settingsMenu.fetchIndex();
		switch (selection) {
		case 1:
			System.out.println("symbol ausgewählt");
			iconSelectionMenuFlow();
			settingsMenuFlow();
			break;
		case 2:
			System.out.println("schwierigkeit");
			difficultySelectionMenuFlow();
			settingsMenuFlow();
			break;
		case 3:
			System.out.println("reset stats");
			resetMenuFlow();
			settingsMenuFlow();
			break;
		default:
			break;
		}
	}

	private static void resetMenuFlow() {
		// TODO Auto-generated method stub
		
	}

	private static void difficultySelectionMenuFlow() {
		// TODO Auto-generated method stub
		
	}

	private static void iconSelectionMenuFlow() {
		selection = Menu.iconSelectionMenu.fetchIndex();
		switch (selection) {
		case 1:
			;
			iconSelectionMenuFlow();
			settingsMenuFlow();
			break;
		case 2:
			System.out.println("schwierigkeit");
			difficultySelectionMenuFlow();
			settingsMenuFlow();
			break;
		case 3:
			System.out.println("reset stats");
			resetMenuFlow();
			settingsMenuFlow();
			break;
		default:
			break;
		}// TODO Auto-generated method stub
		
	}

	public static void main(String[] args) {
		mainMenuFlow();
		System.out.println("\n\nSchön war's. Bis zum nächsten Mal!");
	}
}