import java.util.Arrays;

/**
 * @author xiaoweii
 * @create 2025-01-05 22:32
 */
public class SelectionSort {
    /**
     * 选择排序
     * 思路：从数组当中，依次选择一个最小的元素，放到排好序的数组最后
     */
    private SelectionSort() {
    }

    /**
     * 选择排序算法
     *
     * @param arr - 入参，待排序的数组
     */
    public static void sort(int[] arr) {
        // arr[0,i)是有序的，arr[i,n)是无序的
        for (int i = 0; i < arr.length; i++) {
            // 选择arr[i,n)当中的最小值的索引
            int minIndex = i;
            for (int j = i; j < arr.length; j++) {
                if (arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }
            swap(arr, i, minIndex);
        }
    }

    public static void swap(int[] arr, int i, int j) {
        int t = arr[i];
        arr[i] = arr[j];
        arr[j] = t;
    }

    public static void main(String[] args) {
        int[] arr = {1, 4, 2, 3, 6, 5};
        System.out.println("排序前数组：" + Arrays.toString(arr));
        SelectionSort.sort(arr);
        System.out.println("排序后数组：" + Arrays.toString(arr));
    }
}
