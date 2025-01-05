/**
 * @author xiaoweii
 * @create 2025-01-05 22:05
 */
public class ArrayGenerator {
    private ArrayGenerator() {}

    /**
     * 生成一个长度为n顺序数组
     * @param n - 入参 n，表示数组的大小
     * @return 返回生成长度为n的随机数组
     */
    public static Integer[] generateOrderedArray(int n) {
        Integer[] arr = new Integer[n];
        for (int i = 0; i < n; i++) {
            arr[i] = i;
        }
        return arr;
    }
}
