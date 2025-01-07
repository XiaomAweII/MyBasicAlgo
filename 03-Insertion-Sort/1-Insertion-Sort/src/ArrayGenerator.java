/**
 * @author xiaoweii
 * @create 2025-01-07 23:03
 */
public class ArrayGenerator {
    private ArrayGenerator() {
    }

    ;

    public static Integer[] generateOrderedArray(int n) {
        Integer[] arr = new Integer[n];
        for (int i = 0; i < n; i++) {
            arr[i] = i;
        }
        return arr;
    }

    public static Integer[] generateRandomArray(int n, int bound) {
        Integer[] arr = new Integer[n];
        for (int i = 0; i < n; i++) {
            arr[i] = (int) (Math.random() * bound);
        }
        return arr;
    }
}
