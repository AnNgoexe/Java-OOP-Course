public abstract class BinaryExpression extends Expression {
    /**
     * Attribute of BinaryExpression class.
     */
    protected Expression left;
    protected Expression right;

    /**
     * Initialize BinaryExpression object with 2 parameters.
     */
    public BinaryExpression(Expression left, Expression right) {
        this.left = left;
        this.right = right;
    }

    /**
     * Get the information of the expression.
     */
    @Override
    public abstract String toString();

    /**
     * Evaluate the value.
     */
    @Override
    public abstract double evaluate();
}
