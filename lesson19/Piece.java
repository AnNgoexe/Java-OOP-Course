public abstract class Piece {
    /**
     * Attribute of the Piece class.
     */
    private int coordinatesX;
    private int coordinatesY;
    private String color = "white";

    /**
     * Initialize piece object with 2 parameters.
     */
    public Piece(int coordinatesX, int coordinatesY) {
        this.coordinatesX = coordinatesX;
        this.coordinatesY = coordinatesY;
    }

    /**
     * Initialize piece object with 3 parameters
     */
    public Piece(int coordinatesX, int coordinatesY, String color) {
        this.coordinatesX = coordinatesX;
        this.coordinatesY = coordinatesY;
        this.color = color;
    }

    /**
     * Get the symbol of the piece.
     */
    public abstract String getSymbol();

    /**
     * Check if the piece can move.
     */
    public abstract boolean canMove(Board board, int x, int y);

    /**
     * Get the coordinatesX of the piece.
     */
    public int getCoordinatesX() {
        return this.coordinatesX;
    }

    /**
     * Set the coordinatesX of the piece.
     */
    public void setCoordinatesX(int coordinatesX) {
        this.coordinatesX = coordinatesX;
    }

    /**
     * Get the coordinatesY of the piece.
     */
    public int getCoordinatesY() {
        return this.coordinatesY;
    }

    /**
     * Set the coordinatesY of the piece.
     */
    public void setCoordinatesY(int coordinatesY) {
        this.coordinatesY = coordinatesY;
    }

    /**
     * Get the color of the piece.
     */
    public String getColor() {
        return this.color;
    }

    /**
     * Set the color of the piece.
     */
    public void setColor(String color) {
        this.color = color;
    }

    /**
     * Check the position.
     */
    public boolean checkPosition(Piece piece) {
        return this.coordinatesX == piece.coordinatesX 
            && this.coordinatesY == piece.coordinatesY;
    }
}
 