package tictactoeExamples;

import java.util.ArrayList;

import lessonExamples.InputUtils;

public class Menu {
	// parameters Main Menu
	static String mainMenuName = "H A U P T M E N Ü";
	static String[] mainMenuOptions = {"Spielen", "Einstellungen", "Statistiken"};
	static Menu mainMenu = new Menu(mainMenuName, mainMenuOptions);
	// parameters Settings Menu
	static String settingsMenuName = "E I N S T E L L U N G E N";
	static String[] settingsMenuOptions = {"Symbol auswählen", "Schwierigkeit einstellen", "Spiel zurücksetzen"};
	static Menu settingsMenu = new Menu(settingsMenuName, settingsMenuOptions);
	// parameters Icon Selection Menu
	static String iconSelectionMenuName = "S Y M B O L A U S W A H L";
	static String[] playerIcons = {"X", "O"};
	static Menu iconSelectionMenu = new Menu(iconSelectionMenuName, playerIcons);
	// parameters Stats Menu
	static String statsMenuName = "S T A T I S T I K E N";
	static String[] statsMenuOptions = {"Spielen", "Einstellungen", "Statistiken"};
	static Menu statsMenu = new Menu(statsMenuName, statsMenuOptions, Game.player1.getStats());
//	// parameters Main Menu
//	static String mainMenuName = "H A U P T M E N Ü";
//	static String[] mainMenuOptions = { "Spielen", "Einstellungen", "Statistiken" };
//	static Menu mainMenu = new Menu(mainMenuName, mainMenuOptions);
	
	String menuTitle;
	ArrayList<MenuItem> menuItems;
	InputUtils keyInput;
	PlayerStatistics playerStats;

	Menu(String menuTitle, String[] menuItemNames) {
		this.menuTitle = menuTitle;
		this.menuItems = new ArrayList<>();
		for (int i = 0; i < menuItemNames.length; i++) {
			menuItems.add(new MenuItem(menuItemNames[i]));
		}
		keyInput = new InputUtils();
	}
	
	Menu(String menuTitle, String[] menuItemNames, PlayerStatistics playerStats) {
		this(menuTitle, menuItemNames);
		this.playerStats = playerStats;
	}
	
	public static String[] getPlayerIcons() {
		return playerIcons;
	}

	public void displayMenu() {
		// header
		System.out.println(this.menuTitle);
		// upper Border
		printBorder();
		// menu body of options
		for (int i = 0; i < this.menuItems.size(); i++) {
			MenuItem item = this.menuItems.get(i);
			System.out.printf("%d. %s\n", i + 1, item.getName());
		}
		// exit option
		System.out.printf("%d. Verlassen\n", this.menuItems.size() + 1);
		// lower border
		printBorder();
	}

	private void printBorder() {
		char decorateSymbol = '=';
		int overhang = 3;

		for (int i = 0; i < this.menuTitle.length() + overhang; i++) {
			System.out.print(decorateSymbol);
		}
		System.out.print("\n");
	}

	public int fetchIndex() {
		final int EXIT = menuItems.size() + 1;
		int choice = 0;

		displayMenu();
		choice = keyInput.getInteger(1, EXIT);
		if (choice != EXIT) {
			System.out.printf("\nGehe zu: %s\n\n", this.menuItems.get(choice - 1).getName());
		} else {
			System.out.println("\nVerlasse das Menu.");
		}
		return choice;
	}
}
