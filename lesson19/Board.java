import java.util.ArrayList;

public class Board {
    /**
     * Attribute of the Board class.
     */
    public static final int WIDTH = 8;
    public static final int HEIGHT = 8;
    private ArrayList<Piece> pieces;

    /**
     * Initialize Board class without paramters.
     */
    public Board() {
        this.pieces = new ArrayList<Piece>();
    }

    /**
     * Check if the position is valid.
     */
    public boolean validate(int x, int y) {
        return ((x >= 1 && x <= WIDTH) && ((y >= 1 && y <= HEIGHT)));
    }

    /**
     * Add a new piece.
     */
    void addPiece(Piece piece) {
        if (!this.validate(piece.getCoordinatesX(), piece.getCoordinatesY())) {
            return;
        }
        for (Piece p : this.pieces) {
            if (piece.checkPosition(p)) {
                return;
            }
        }
        this.pieces.add(piece);
    }

    /**
     * Get the piece at a position.
     */
    public Piece getAt(int x, int y) {
        for (Piece piece : this.pieces) {
            if (piece.getCoordinatesX() == x && piece.getCoordinatesY() == y) {
                return piece;
            }
        }
        return null;
    }

    /**
     * Remove the piece at a position.
     */
    public void removeAt(int x, int y) {
        for (Piece piece : this.pieces) {
            if (piece.getCoordinatesX() == x && piece.getCoordinatesY() == y) {
                this.pieces.remove(piece);
                return;
            }
        }
    }

    /**
     * Get the list of pieces.
     */
    public ArrayList<Piece> getPieces() {
        return this.pieces;
    }

    /**
     * Set the list of pieces.
     */
    public void setPieces(ArrayList<Piece> pieces) {
        this.pieces = pieces;
    }
}