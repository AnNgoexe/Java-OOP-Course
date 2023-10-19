public class Division extends BinaryExpression {
    /**
     * Initialize object Division with 2 parameters.
     */
    public Division(Expression left, Expression right) {
        super(left, right);
    }

    /**
     * Get the information of the Division class.
     */
    @Override
    public String toString() {
        return "(" + this.left.toString() + " / " + this.right.toString() + ")";
    }

    /**
     * Evaluate the value.
     */
    @Override
    public double evaluate() {
        if (this.right.evaluate() == 0) {
            throw new ArithmeticException("Lỗi chia cho 0");
        }
        return this.left.evaluate() / this.right.evaluate();
    }
}

