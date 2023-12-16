public class ExpressionTest {
    /**
     * Main method.
     */
    public static void main(String[] args) {
        Expression number1 = new Numeral(10);
        Expression number2 = new Numeral(3);
        Expression number3 = new Numeral(4);
        Expression square1 = new Square(number1);
        Expression subtraction = new Subtraction(square1, number2);
        Expression multiply = new Multiplication(number2, number3);
        Expression addition = new Addition(subtraction, multiply);
        Expression square2 = new Square(addition);
        System.out.print(square2.toString() + ": ");
        System.out.println(square2.evaluate());
    }
}
