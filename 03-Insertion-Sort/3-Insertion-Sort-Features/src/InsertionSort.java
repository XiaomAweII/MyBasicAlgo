import java.util.Arrays;

/**
 * @author xiaoweii
 * @create 2025-01-07 22:45
 */
public class InsertionSort {

    private InsertionSort() {
    }

    /**
     * 插入排序
     * 定义 ： 从第一个元素开始，每次从未排序的元素中取出一个，插入到已排序的元素中的合适位置
     *
     * @param arr
     * @param <E>
     */
    public static <E extends Comparable<E>> void sort(E[] arr) {

        for (int i = 0; i < arr.length; i++) {
            for (int j = i; j > 0 && arr[j].compareTo(arr[j - 1]) < 0; j--) {
                swap(arr, j, j - 1);
            }
        }
    }

    public static <E extends Comparable<E>> void sort2(E[] arr) {
        for (int i = 0; i < arr.length; i++) {
            E t = arr[i];
            int j;
            for (j = i; j > 0 && t.compareTo(arr[j - 1]) < 0; j--) {
                arr[j] = arr[j - 1];
            }
            arr[j] = t;
        }
    }

    private static <E> void swap(E[] arr, int i, int j) {

        E t = arr[i];
        arr[i] = arr[j];
        arr[j] = t;
    }

    /**
     * 结论：处理有序数组，插入排序很快
     * @param args
     */
    public static void main(String[] args) {
        int[] dataSize = {10000, 100000};
        for (int n : dataSize) {
            System.out.println("Random Array : ");

            Integer[] arr = ArrayGenerator.generateRandomArray(n, n);
            Integer[] arr2 = Arrays.copyOf(arr, arr.length);
            SortingHelper.sortTest("InsertionSort", "sort2", arr);
            SortingHelper.sortTest("SelectionSort", "sort", arr2);

            System.out.println();

            System.out.println("Ordered Array : ");

            arr = ArrayGenerator.generateOrderedArray(n);
            arr2 = Arrays.copyOf(arr, arr.length);
            SortingHelper.sortTest("InsertionSort", "sort2", arr);
            SortingHelper.sortTest("SelectionSort", "sort", arr2);

            System.out.println();
        }
    }
}
