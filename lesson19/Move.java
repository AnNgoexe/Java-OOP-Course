public class Move {
    /**
     * Attribute of the Move class.
     */
    private Piece movedPiece;
    private int startX;
    private int endX;
    private int startY;
    private int endY;
    private Piece killedPiece;

    /**
     * Initialize Move object with 5 parameters.
     */
    public Move(int startX, int endX, int startY, int endY, Piece movedPiece) {
        this.movedPiece = movedPiece;
        this.startX = startX;
        this.endX = endX;
        this.startY = startY;
        this.endY = endY;
    }

    /**
     * Initialize Move object with 6 parameters.
     */
    public Move(int startX, int endX, int startY, int endY, Piece movedPiece, Piece killedPiece) {
        this.movedPiece = movedPiece;
        this.startX = startX;
        this.endX = endX;
        this.startY = startY;
        this.endY = endY;
        this.killedPiece = killedPiece;
    }

    /**
     * Get the moved piece.
     */
    public Piece getMovedPiece() {
        return this.movedPiece;
    }

    /**
     * Set the moved piece.
     */
    public void setMovedPiece(Piece movedPiece) {
        this.movedPiece = movedPiece;
    }

    /**
     * Get the start position X.
     */
    public int getStartX() {
        return this.startX;
    }

    /**
     * Set the start position X.
     */
    public void setStartX(int startX) {
        this.startX = startX;
    }

    /**
     * Get the end position X.
     */
    public int getEndX() {
        return this.endX;
    }

    /**
     * Set the end position X.
     */
    public void setEndX(int endX) {
        this.endX = endX;
    }

    /**
     * Get the start position Y.
     */
    public int getStartY() {
        return this.startY;
    }

    /**
     * Set the start position Y.
     */
    public void setStartY(int startY) {
        this.startY = startY;
    }

    /**
     * Get the end position Y.
     */
    public int getEndY() {
        return this.endY;
    }

    /**
     * Set the end position Y.
     */
    public void setEndY(int endY) {
        this.endY = endY;
    }

    /**
     * Get the killed piece.
     */
    public Piece getKilledPiece() {
        return this.killedPiece;
    }

    /**
     * Set the killed piece.
     */
    public void setKilledPiece(Piece killedPiece) {
        this.killedPiece = killedPiece;
    }

    /**
     * Get the information of Move object.
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.movedPiece.getColor());
        sb.append("-");
        sb.append(this.movedPiece.getSymbol());
        sb.append((char) (this.endX + 96));
        sb.append(this.endY);
        return sb.toString();
    }
}
 