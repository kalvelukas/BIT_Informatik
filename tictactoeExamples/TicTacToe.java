package tictactoeExamples;

import java.io.*;

public class TicTacToe {
	private int[][] board;
	private int spielerAmZug;
	private int spielTiefe;
	private int bestMove;

	public TicTacToe() {
		// leeres Brett wird initialisiert
		board = new int[3][3];
		for (int i = 0; i < 3; i++)
			for (int j = 0; j < 3; j++)
				board[i][j] = 0;

		// Welcher Spieler ist am Zug? 1 für X und -1 für O
		spielerAmZug = 1;
		spielTiefe = 0;
		bestMove = 0;
	}

	// ****************************************************************************
	// public-Methoden

	// das aktuelle Brett wird angezeigt
	public void showBoard() {
		System.out.println("\n**1*2*3**");
		for (int i = 0; i < 3; i++) {
			System.out.print((i + 1) + " ");
			for (int j = 0; j < 3; j++) {
				if (board[i][j] == -1)
					System.out.print("O ");
				else if (board[i][j] == 1)
					System.out.print("X ");
				else
					System.out.print("- ");
			}
			System.out.println(i + 1);
		}
		System.out.println("**1*2*3**\n");
	}

	// Spiel schon zu Ende?
	public boolean finishedGame() {
		if ((evaluate(board) != 0) || (countSigns(board) == 9))
			return true;
		else
			return false;
	}

	// das Spielergebnis wird ausgegeben
	public String resultGame() {
		int wert = evaluate(board);
		if (wert == 0)
			return "Spiel endete unentschieden";
		else if (wert == 1)
			return "Spieler X gewinnt";
		else
			return "Spieler O gewinnt";
	}

	// X ist am Zug, bester Zug wird in bestMove gepseichert
	public int minmaxX(int[][] b, int tiefe) {
		// vielleicht ist das Spiel schon fertig?
		int eval = evaluate(b);
		if (eval != 0)
			return eval;
		if (countSigns(b) == 9)
			return 0;

		int max = -5;
		int[] zuege = genMoves(b);

		for (int i = 0; i < zuege.length; i++) {
			b[zuege[i] / 10][zuege[i] % 10] = 1; // führe X-Zug aus
			int wert = minmaxO(b, tiefe + 1);
			if (wert > max) {
				max = wert;
				if (tiefe == spielTiefe)
					bestMove = zuege[i]; // bester Zug wird gespeichert
			}
			b[zuege[i] / 10][zuege[i] % 10] = 0; // nimm X-Zug zurück
		}
		return max;
	}

	// O ist am Zug, bester Zug wird in bestMove gepseichert
	public int minmaxO(int[][] b, int tiefe) {
		// vielleicht ist das Spiel schon fertig?
		int eval = evaluate(b);
		if (eval != 0)
			return eval;
		if (countSigns(b) == 9)
			return 0;

		int min = 5;
		int[] zuege = genMoves(b);

		for (int i = 0; i < zuege.length; i++) {
			b[zuege[i] / 10][zuege[i] % 10] = -1; // führe O-Zug aus
			int wert = minmaxX(b, tiefe + 1);
			if (wert < min) {
				min = wert;
				if (tiefe == spielTiefe)
					bestMove = zuege[i]; // bester Zug wird gespeichert
			}
			b[zuege[i] / 10][zuege[i] % 10] = 0; // nimm O-Zug zurück
		}
		return min;
	}

	// Spieler macht einen Zug
	public boolean meinZug(int x, int y, int move) {
		if ((x >= 0) && (x < 3) && (y >= 0) && (y < 3) && (board[x][y] == 0) && (spielerAmZug == move)) {
			board[x][y] = move;
			spielerAmZug = -spielerAmZug;
			spielTiefe++;
			return true;
		} else
			return false;
	}

	// Computer darf einen Zug machen
	public void compZug() {
		if (spielerAmZug == -1) {
			minmaxO(board, spielTiefe);
			board[bestMove / 10][bestMove % 10] = -1;
		} else {
			minmaxX(board, spielTiefe);
			board[bestMove / 10][bestMove % 10] = 1;
		}
		spielTiefe++;
		spielerAmZug = -spielerAmZug;
	}

	// ****************************************************************************
	// zählt die Anzahl der bereits besetzten Felder
	private int countSigns(int[][] b) {
		int count = 0;
		for (int i = 0; i < 3; i++)
			for (int j = 0; j < 3; j++)
				if (b[i][j] != 0)
					count++;
		return count;
	}

	// liefert die Liste der noch offenen Positionen mit x*10+y
	private int[] genMoves(int[][] b) {
		// speichere die Züge
		int[] zuege = new int[9 - countSigns(b)]; // wieviele Züge gibt es?
		int anzZuege = 0;
		for (int i = 0; i < 3; i++)
			for (int j = 0; j < 3; j++)
				if (b[i][j] == 0)
					zuege[anzZuege++] = i * 10 + j;
		return zuege;
	}

	// bewertet die aktuelle Stellung, -1 O-gewinnt, 1 X-gewinnt, sonst 0
	private int evaluate(int[][] b) {
		// prüfe zeilen und spalten
		int sum = 0, sum2 = 0;
		for (int i = 0; i < 3; i++) {
			sum = b[i][0] + b[i][1] + b[i][2];
			sum2 = b[0][i] + b[1][i] + b[2][i];
			if ((sum == -3) || (sum2 == -3))
				return -1;
			else if ((sum == 3) || (sum2 == 3))
				return 1;
		}

		// prüfe die Diagonale links oben nach rechts unten
		sum = b[0][0] + b[1][1] + b[2][2];
		// prüfe die Diagonale links unten nach rechts oben
		sum2 = b[0][2] + b[1][1] + b[2][0];

		if ((sum == -3) || (sum2 == -3))
			return -1;
		else if ((sum == 3) || (sum2 == 3))
			return 1;

		// ansonsten ist es (noch) unentschieden
		return 0;
	}

	public static void main(String[] args) {
		TicTacToe ttt = new TicTacToe();
		// System.out.println("MinMax liefert den Wert: "+ttt.minmaxX(ttt.board));

		// zur Kommunikation
		InputStreamReader stdin = new InputStreamReader(System.in);
		BufferedReader console = new BufferedReader(stdin);

		int x, y;
		while (true) {
			ttt.showBoard();
			System.out.println("Ihr Zug, zuerst x dann y: ");

			try {
				x = Integer.parseInt(console.readLine());
				y = Integer.parseInt(console.readLine());
			} catch (Exception e) {
				System.out.println("Eingabefehler, versuchen Sie es noch einmal.");
				continue;
			}

			if (!ttt.meinZug(y - 1, x - 1, 1)) {
				System.out.println("ungültiger Zug, bitte noch einmal...");
				continue;
			}

			if (ttt.finishedGame()) {
				System.out.print("ENDE! ");
				System.out.println(ttt.resultGame());
				ttt.showBoard();
				break;
			}

			System.out.println("Der Computer hat gespielt: ");
			ttt.compZug();

			if (ttt.finishedGame()) {
				System.out.print("ENDE! ");
				System.out.println(ttt.resultGame());
				ttt.showBoard();
				break;
			}
		}
	}
}