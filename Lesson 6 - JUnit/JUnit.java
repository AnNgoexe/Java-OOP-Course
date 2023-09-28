public class JUnit {
    /**
     * Find max number of 2 numbers.
     */
    public static int max2Int(int a, int b) {
        return Math.max(a, b);
    }

    /**
     * Find the minimum number of an array.
     */
    public static int minArray(int[] array) {
        int minNumber = array[0];
        for (int i = 1; i < array.length; i++) {
            minNumber = Math.min(array[i], minNumber);
        }
        return minNumber;
    }

    /**
     * Calculate BMI number then return a comment.
     */
    public static String calculateBmi(double weight, double height) {
        double bmiNumber = weight / Math.pow(height, 2);
        bmiNumber = (double) Math.round(bmiNumber * 10) / 10;

        if (bmiNumber < 18.5) {
            return "Thiếu cân";
        } else if (bmiNumber <= 22.9) {
            return "Bình thường";
        } else if (bmiNumber <= 24.9) {
            return "Thừa cân";
        } else {
            return "Béo phì";
        }
    }

    public static void main(String[] args) {
        System.out.println("Max of 2 and 3: " + max2Int(2, 3));
    
        int[] array = {1, 2, 3, 4, 5};
        System.out.println("Min of array: " + minArray(array));
    
        System.out.println("BMI comment: " + calculateBmi(50, 1.6));
    }
}