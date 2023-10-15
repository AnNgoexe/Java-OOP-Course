public class Main {
    public static void main(String[] args) {
        Fraction fraction1 = new Fraction(1, 2);
        Fraction fraction2 = new Fraction(2, 3);
    
        System.out.println("Fraction 1: " + fraction1.getNumerator() + "/" + fraction1.getDenominator());
        System.out.println("Fraction 2: " + fraction2.getNumerator() + "/" + fraction2.getDenominator());
    
        Fraction sum = fraction1.add(fraction2);
        System.out.println("Sum: " + sum.getNumerator() + "/" + sum.getDenominator());
    
        Fraction difference = fraction1.subtract(fraction2);
        System.out.println("Difference: " + difference.getNumerator() + "/" + difference.getDenominator());
    
        Fraction product = fraction1.multiply(fraction2);
        System.out.println("Product: " + product.getNumerator() + "/" + product.getDenominator());
    
        Fraction quotient = fraction1.divide(fraction2);
        System.out.println("Quotient: " + quotient.getNumerator() + "/" + quotient.getDenominator());
    
        boolean isEqual = fraction1.equals(fraction2);
        System.out.println("Are the fractions equal? " + isEqual);
    }
}
