public class Subtraction extends BinaryExpression {
    /**
     * Initialize object Subtraction with 2 parameters.
     */
    public Subtraction(Expression left, Expression right) {
        super(left, right);
    }

    /**
     * Get the information of the Subtraction class.
     */
    @Override
    public String toString() {
        return "(" + this.left.toString() + " - " + this.right.toString() + ")";
    }

    /**
     * Evaluate the value.
     */
    @Override
    public double evaluate() {
        return this.left.evaluate() - this.right.evaluate();
    }
}
