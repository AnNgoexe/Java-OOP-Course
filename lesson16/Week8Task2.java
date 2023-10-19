import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Week8Task2 {
    public static void nullPointerEx() {
        String[] strArray = null;
        int arrayLength = strArray.length;
    }

    /**
     * Check null pointer.
     */
    public static String nullPointerExTest() {
        try {
            nullPointerEx();
        } catch (NullPointerException e) {
            return "Lỗi Null Pointer";
        }
        return "Không có lỗi";
    }

    public static void arrayIndexOutOfBoundsEx() {
        double[] a = new double[10];
        double x = a[10];
    }

    /**
     * Check out of bounds.
     */
    public static String arrayIndexOutOfBoundsExTest() {
        try {
            arrayIndexOutOfBoundsEx();
        } catch (ArrayIndexOutOfBoundsException e) {
            return "Lỗi Array Index Out of Bounds";
        }
        return "Không có lỗi";
    }

    public static void arithmeticEx() {
        int x = 1000 / 0;
    }

    /**
     * Check arithmetic.
     */
    public static String arithmeticExTest() {
        try {
            arithmeticEx();
        } catch (ArithmeticException e) {
            return "Lỗi Arithmetic";
        }
        return "Không có lỗi";
    }

    public static void fileNotFoundEx() throws FileNotFoundException {
        FileReader reader = new FileReader("erika");
    }

    /**
     * Check File.
     */
    public static String fileNotFoundExTest() {
        try {
            fileNotFoundEx();
        } catch (FileNotFoundException e) {
            return "Lỗi File Not Found";
        }
        return "Không có lỗi";
    }

    public static void ioEx() throws IOException {
        FileReader fileReader = new FileReader(("scp"));
        int a = fileReader.read();
    }

    /**
     * Check input / output.
     */
    public static String ioExTest() {
        try {
            ioEx();
        } catch (IOException e) {
            return "Lỗi IO";
        }
        return "Không có lỗi";
    }
}