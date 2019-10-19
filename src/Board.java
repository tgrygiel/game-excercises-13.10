public class Board {
    Pawn[][] board;
    
    Board() {
        this.board = new Pawn[4][4];
    }
    
    void placePawnOnTheBoard(final int x, final int y, final Pawn pawn) {
        this.board[x][y] = pawn;
    }
}