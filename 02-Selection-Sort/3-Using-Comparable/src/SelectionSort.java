import java.util.Arrays;

/**
 * @author xiaoweii
 * @create 2025-01-05 22:52
 */
public class SelectionSort {
    private SelectionSort() {
    }

    public static <E extends Comparable<E>> void sort(E[] arr) {
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
        Student[] students = {new Student("Alice", 98),
                new Student("Bobo", 100),
                new Student("Charles", 66)};
        System.out.println("排序前：" + Arrays.toString(students));
        SelectionSort.sort(students);
        System.out.println("排序后：" + Arrays.toString(students));
    }

}
