public class Addition extends BinaryExpression {
    /**
     * Initialize Addition object with 2 parameters.
     */
    public Addition(Expression left, Expression right) {
        super(left, right);
    }

    /**
     * Get the information of the addition class.
     */
    @Override
    public String toString() {
        return "(" + this.left.toString() + " + " + this.right.toString() + ")";
    }

    /**
     * Evaluate the value.
     */
    @Override
    public double evaluate() {
        return this.left.evaluate() + this.right.evaluate();
    }
}
