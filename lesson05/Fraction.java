public class Fraction {
    /**
     * Attribute of Fraction class.
     */
    private int numerator;
    private int denominator = 1;

    /**
     * Initialize Fraction class with parameters.
     */
    public Fraction(int numerator, int denominator) {
        this.numerator = numerator;
        if (denominator != 0) {
            this.denominator = denominator;
        }
    }

    /**
     * get the numerator of the fraction.
     */
    public int getNumerator() {
        return this.numerator;
    }

    /**
     * get the denominator of the fraction.
     */
    public int getDenominator() {
        return this.denominator;
    }

    /**
     * set numerator.
     */
    public void setNumerator(int numerator) {
        this.numerator = numerator;
    }

    /**
     * set denominator.
     */
    public void setDenominator(int denominator) {
        if (denominator != 0) {
            this.denominator = denominator;
        }
    }

    /**
     * the gcd of two numbers.
     */
    public int gcd(int a, int b) {
        a = Math.abs(a);
        b = Math.abs(b);
        if (b == 0) {
            return a;
        }
        return gcd(b, a % b);
    }

    /**
     * reduce the fraction.
     */
    public Fraction reduce() {
        int x = gcd(numerator, denominator);
        numerator = numerator / x;
        denominator = denominator / x;
        return this;
    }

    /**
     * add two fractions.
     */
    public Fraction add(Fraction other) {
        int num = this.numerator * other.denominator + other.numerator * this.denominator;
        int den = other.denominator * this.denominator;
        this.numerator = num;
        this.denominator = den;
        return this.reduce();
    }
    
    /**
     * subtract.
     */
    public Fraction subtract(Fraction other) {
        int num = this.numerator * other.denominator - other.numerator * this.denominator;
        int den = other.denominator * this.denominator;
        this.numerator = num;
        this.denominator = den;
        return this.reduce();
    }

    /**
     * multiply two fractions.
     */
    public Fraction multiply(Fraction other) {
        this.numerator = this.numerator * other.numerator;
        this.denominator = this.denominator * other.denominator;
        return this.reduce();
    }

    /**
     * divide two fractions.
     */
    public Fraction divide(Fraction other) {
        this.numerator = this.numerator * other.denominator;
        this.denominator = this.denominator * other.numerator;
        return this.reduce();
    }

    /**
     * compare two fractions.
     */
    public boolean equals(Object obj) {
        if (obj instanceof Fraction) {
            Fraction other = (Fraction) obj;
            return (this.numerator * other.denominator == other.numerator * this.denominator);
        } else {
            return false;
        }
    }
}     
