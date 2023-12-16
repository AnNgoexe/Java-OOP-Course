import java.util.List;

public class Week11 {
    /**
     * Sort generic method.
     */
    public static <T extends Comparable<T>> List<T> sortGeneric(List<T> list) {
        T key;
        for (int i = 0; i < list.size(); i++) {
            key = list.get(i);
            int j = i - 1;
            while (j >= 0 && list.get(j).compareTo(key) > 0) {
                list.set(j + 1, list.get(j));
                j = j - 1;
            }
            list.set(j + 1, key);
        }
        return list;
    }
}
