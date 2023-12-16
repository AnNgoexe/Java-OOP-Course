import java.util.ArrayList;

public class Game {
    /**
     * Attribute of the Game class.
     */
    private Board board;
    private ArrayList<Move> moveHistory;

    /**
     * Initialize Game object with 1 parameter.
     */
    public Game(Board board) {
        this.board = board;
        this.moveHistory = new ArrayList<>();
    }

    /**
     * Move a piece.
     */
    public void movePiece(Piece piece, int x, int y) {
        if (piece.canMove(this.getBoard(), x, y)) {
            int prevX = piece.getCoordinatesX();
            int prevY = piece.getCoordinatesY();
            Piece newPiece = this.board.getAt(x, y);
            Move move;
            if (newPiece != null) {
                move = new Move(prevX, x, prevY, y, piece, newPiece);
                this.board.removeAt(x, y);
            } else {
                move = new Move(prevX, x, prevY, y, piece);
            }
            piece.setCoordinatesX(x);
            piece.setCoordinatesY(y);
            this.moveHistory.add(move);
        }
    }

    /**
     * Get the board of the game.
     */
    public Board getBoard() {
        return this.board;
    }

    /**
     * Set the board of the game.
     */
    public void setBoard(Board board) {
        this.board = board;
    }

    /**
     * Get the move history of the game.
     */
    public ArrayList<Move> getMoveHistory() {
        return this.moveHistory;
    }
}
 