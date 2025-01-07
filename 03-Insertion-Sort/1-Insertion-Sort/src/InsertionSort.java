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
            for (int j = i; j > 0; j--) {
                if (arr[j].compareTo(arr[j - 1]) < 0) {
                    swap(arr, j, j - 1);
                } else {
                    break;
                }
            }
        }
    }

    private static <E> void swap(E[] arr, int i, int j) {

        E t = arr[i];
        arr[i] = arr[j];
        arr[j] = t;
    }

    public static void main(String[] args) {
        int[] dataSize = {10000, 100000};
        for (int n : dataSize) {
            Integer[] arr = ArrayGenerator.generateRandomArray(n, n);
            SortingHelper.sortTest("InsertionSort", "sort", arr);
        }
    }
}
