public class Board {
    Pawn[][] board;
    
    Board() {
        this.board = new Pawn[4][4];
    }
    
    void placePawnOnTheBoard(final int x, final int y, final Pawn pawn) {
        this.board[x][y] = pawn;
    }
    
    public String toString() {
		String mapAsString = "";
		
		for (int i = 0; i < board.length; i++) {
			String row = "[";
			for (int j = 0; j < board[i].length; j++) {
				if(this.board[i][j] == null) {
					row += " ___ ,";
				} else {
					row += " " + this.board[i][j] + " ,"; 
				}
			}
			row += "]";
			mapAsString += row + "\n";
		}
		return mapAsString;
	}
}