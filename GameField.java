/** JAVA JRE 15, tictactoe
 * Hausarbeit Informatik1, Studiengang Bauinformationstechnologie, bei Prof. Dr. Sebastian Rohjans
 */
package src.classes.informatik1;

/**
 * @author Lukas Kalvelage
 * 
 */
public class GameField {

	private char[][] fieldInts;
	private char[][] fieldChars;
	private int size;

	public GameField(int size) {
		this.size = size;

		this.fieldChars = new char[this.size][this.size];

		for (int i = 0; i < size; i++) {
			for (int j = 0; j < size; j++) {
				fieldChars[i][j] = ' ';
			}
		}
	}

	public char[][] getFieldValues() {
		return this.fieldChars;
	}

	public void setFieldValues(int row, int column, char icon) {
		if (this.fieldChars[row][column] == ' ') {
			this.fieldChars[row][column] = icon;
		} else {
			throw new IllegalArgumentException("Feld belegt!");
		}
	}

	public void resetField() {
		for (int i = 0; i < fieldChars.length; i++) {
			for (int j = 0; j < fieldChars[i].length; j++) {
				fieldChars[i][j] = ' ';
			}
		}
	}

	@Override
	public String toString() {

		String fieldString = "";

		for (int i = 0; i < getFieldValues().length; i++) {

			// upper line
			for (int y = 0; y < getFieldValues()[i].length; y++) {
				fieldString += "------";
			}
			fieldString += "-\n";

			// Field upper Whitespace
			for (int z = 0; z < getFieldValues()[i].length; z++) {
				fieldString += "|     ";
			}
			fieldString += "|\n";

			// Field mid line /w icons
			for (int j = 0; j < getFieldValues()[i].length; j++) {
				fieldString += "|  " + getFieldValues()[i][j] + "  ";
			}
			fieldString += "|\n";

			// Field upper Whitespace
			for (int z = 0; z < getFieldValues()[i].length; z++) {
				fieldString += "|     ";
			}
			fieldString += "|\n";

		}
		// Field underline
		for (int x = 0; x < getFieldValues().length; x++) {
			fieldString += "------";
		}
		fieldString += "-";

		return fieldString;
	}

	public static void main(String[] args) {
		var testField = new GameField(3);
		testField.setFieldValues(1, 1, 'O');
		testField.setFieldValues(0, 2, 'X');
		testField.setFieldValues(1, 0, 'X');
		testField.setFieldValues(1, 2, 'X');
		testField.setFieldValues(2, 1, 'O');
		try {
			testField.setFieldValues(1, 0, ' ');
		} catch (Exception e) {
			System.out.println("Error: " + e);
		}
		System.out.print(testField.toString());
	}
}
