public class Square extends Expression {
    /**
     * Attribute of Square class.
     */
    private Expression expression;

    /**
     * Initialize Square object with a parameter.
     */
    public Square(Expression expression) {
        this.expression = expression;
    }

    /**
     * Get the information of the expression.
     */
    @Override
    public String toString() {
        return "(" + this.expression.toString() + ") ^ 2";
    }

    /**
     * Get the value.
     */
    @Override
    public double evaluate() {
        return this.expression.evaluate() * this.expression.evaluate();
    }
}
