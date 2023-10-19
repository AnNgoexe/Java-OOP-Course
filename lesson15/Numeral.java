public class Numeral extends Expression {
    /**
     * Attribute of Numeral class.
     */
    private double value;

    /**
     * Initialize Numeral object without parameters.
     */
    public Numeral() {

    }

    /**
     * Initialize Numeral object with a parameter.
     */
    public Numeral(double value) {
        this.value = value;
    }

    /**
     * Get the information of the Numeral class.
     */
    @Override
    public String toString() {
        if (this.value == (int) this.value) {
            return Integer.toString((int) this.value);
        }
        return Double.toString(this.value);
    }

    /**
     * Get the value.
     */
    @Override
    public double evaluate() {
        return this.value;
    }
}
