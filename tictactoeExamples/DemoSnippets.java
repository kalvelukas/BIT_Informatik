package tictactoeExamples;

import lessonExamples.Coin;

public class DemoSnippets {
	public static void main(String[] args) {
		System.out.print("Init\n");
	
		System.out.println("Method Output: ");
	
		Coin instance = Coin.getInstance();
		
		instance.addMoreCoin();
		instance.deductCoin();
		
		System.out.println(instance.getCoin());
	}

	private int moveCount;
	
	public void demon() {
		String textString = "demon";
		String numberString = "123";
	}
	
	public void checkWin() {		
		int n = 3;
		State[][] board = new State[n][n];
		int moveCount = 0;
	}

	void Move(int x, int y, State s, Object[][] board){
		if(board[x][y] == State.Blank){
			board[x][y] = s;
		}
		moveCount++;

		//check end conditions

		int n = 5;
		//check col
		for(int i = 0; i < n; i++){
			if(board[x][i] != s)
				break;
			if(i == n-1){
				//report win for s
			}
		}

		//check row
		for(int i = 0; i < n; i++){
			if(board[i][y] != s)
				break;
			if(i == n-1){
				//report win for s
			}
		}

		//check diag
		if(x == y){
		//we're on a diagonal
			for(int i = 0; i < n; i++){
				if(board[i][i] != s)
					break;
				if(i == n-1){
					//report win for s
				}
			}
		}

		//check anti diag (thanks rampion)
		if(x + y == n - 1){
			for(int i = 0; i < n; i++){
				if(board[i][(n-1)-i] != s)
					break;
				if(i == n-1){
					//report win for s
				}
			}
		}

		//check draw
		if(moveCount == (Math.pow(n, 2) - 1)){
			//report draw
		}
	}
}
