public class GCD {
    /**
     * calculate GCD of two numbers.
     */
    public int gcd(int a, int b) {
        a = Math.abs(a);
        b = Math.abs(b);
        if (b == 0) {
            return a;
        }
        return gcd(b, a % b);
    }
    public static void main(String[] args) {
        GCD test = new GCD();
        System.out.println(test.gcd(10,-11));
        System.out.println(test.gcd(60,54));
    }
}  
