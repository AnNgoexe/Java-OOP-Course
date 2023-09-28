public class Prime {
    /**
     * check whether the number is prime or not.
     */
    public boolean isPrime(int n) {
        if (n <= 1) {
            return false;
        }
        for (int i = 2; i * i <= n; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Prime number = new Prime();
        System.out.println(number.isPrime(10));
        System.out.println(number.isPrime(13));
    }
} 
