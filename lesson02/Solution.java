public class Solution {
    /**
     * calculate fibonacci number.
     */
    public long fibonacci(long n) {
        if (n < 0) {
            return -1;
        } else if (n == 0) {
            return 0;
        } else if (n == 1) {
            return 1;
        } else {
            long firstNumber = 0;
            long secondNumber = 1;
        
            for (long i = 2; i <= n; i++) {
                long temp = firstNumber + secondNumber;
                if (temp < 0) { 
                    return Long.MAX_VALUE;
                }
                firstNumber = secondNumber;
                secondNumber = temp;
            }
            return secondNumber;
        }
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.fibonacci(10));
    }
}    