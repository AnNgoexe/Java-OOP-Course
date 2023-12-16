public class Rook extends Piece {
    /**
     * Initialize Rook class with 2 paramters.
     */
    public Rook(int coordinatesX, int coordinatesY) {
        super(coordinatesX, coordinatesY);
    }

    /**
     * Initialize Rook class with 3 paramters.
     */
    public Rook(int coordinatesX, int coordinatesY, String color) {
        super(coordinatesX, coordinatesY, color);
    }

    /**
     * Get the symbol of the piece.
     */
    @Override
    public String getSymbol() {
        return "R";
    }

    /**
     * Check if the piece can move.
     */
    @Override
    public boolean canMove(Board board, int x, int y) {
        if(!board.validate(x, y)) {
            return false;
        }
        if (this.getCoordinatesX() == x) {
            for (int i = Math.min(y, this.getCoordinatesY()) + 1; 
                     i <= Math.max(y, this.getCoordinatesY()) - 1; i++) {
                if (board.getAt(x, i) != null) {
                    return false;
                }
            }
        } else if (this.getCoordinatesY() == y) {
            for (int j = Math.min(x, this.getCoordinatesX()) + 1; 
                     j <= Math.max(x, this.getCoordinatesX()) - 1; j++) {
                if (board.getAt(j, y) != null) {
                    return false;
                }
            }
        }
        else return false;
        Piece destinationPiece = board.getAt(x, y);
        if(destinationPiece != null && destinationPiece.getColor().equals(this.getColor())) {
            return false;
        }
        return true;
    }
}
 