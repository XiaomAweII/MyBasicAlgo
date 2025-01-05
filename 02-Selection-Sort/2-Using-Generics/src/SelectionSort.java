import java.lang.reflect.Array;
import java.util.Arrays;

/**
 * @author xiaoweii
 * @create 2025-01-05 22:47
 */
public class SelectionSort {
    private SelectionSort() {
    }

    public static <E extends Comparable> void sort(E[] arr) {
        for (int i = 0; i < arr.length; i++) {
            int minIndex = i;
            for (int j = i; j < arr.length; j++) {
                if (arr[j].compareTo(arr[minIndex]) < 0) {
                    minIndex = j;
                }
            }
            swap(arr, i, minIndex);
        }
    }

    private static <E> void swap(E[] arr, int i, int j) {

        E t = arr[i];
        arr[i] = arr[j];
        arr[j] = t;
    }

    public static void main(String[] args) {
        Integer[] arr = {1, 4, 2, 3, 6, 5};
        System.out.println("排序前：" + Arrays.toString(arr));
        SelectionSort.sort(arr);
        System.out.println("排序后：" + Arrays.toString(arr));
    }
}
