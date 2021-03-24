package src.classes.informatik1;

public class Player {

	// basic information
	private char icon;

	private PlayerStatistics stats;

	public Player() {
		stats = new PlayerStatistics();
	}

	public char getIcon() {
		return icon;
	}

	public void setIcon(char selIcon) {
		icon = selIcon;
	}

	public PlayerStatistics getStats() {
		// TODO Auto-generated method stub
		return stats;
	}

}
