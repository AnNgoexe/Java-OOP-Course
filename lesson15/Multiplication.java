public class Multiplication extends BinaryExpression {
    /**
     * Initialize Multiplication object with 2 parameters.
     */
    public Multiplication(Expression left, Expression right) {
        super(left, right);
    }

    /**
     * Get the information of the multiplication class.
     */
    @Override
    public String toString() {
        return "(" + this.left.toString() + " * " + this.right.toString() + ")";
    }

    /**
     * Evaluate the value.
     */
    @Override
    public double evaluate() {
        return this.left.evaluate() * this.right.evaluate();
    }
}
