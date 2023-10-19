public class Point {
    /**
     * Attribute of Point class.
     */
    private double pointX;
    private double pointY;

    /**
     * Initialize Point object with 2 parameters.
     */
    public Point(double pointX, double pointY) {
        this.pointX = pointX;
        this.pointY = pointY;
    }

    /**
     * Get the pointX.
     */
    public double getPointX() {
        return this.pointX;
    }

    /**
     * Set the pointX.
     */
    public void setPointX(double pointX) {
        this.pointX = pointX;
    }

    /**
     * Get the pointY.
     */
    public double getPointY() {
        return this.pointY;
    }

    /**
     * Set the pointY.
     */
    public void setPointY(double pointY) {
        this.pointY = pointY;
    }

    /**
     * Get the distance of two points.
     */
    public double distance(Point p) {
        double x = (p.pointX - this.pointX) * (p.pointX - this.pointX);
        double y = (p.pointY - this.pointY) * (p.pointY - this.pointY);
        return Math.sqrt(x + y);
    }

    /**
     * Get the information of the point.
     */
    public String toString() {
        String s = "";
        s = s.concat("(");
        s = s.concat(String.format("%.2f", pointX) + ",");
        s = s.concat(String.format("%.2f", pointY) + ")");
        return s;
    }

    /**
     * Check same points.
     */
    public boolean equals(Point point) {
        return this.pointX == point.pointX && this.pointY == point.pointY;
    }
}
 