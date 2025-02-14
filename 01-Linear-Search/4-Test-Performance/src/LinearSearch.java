/**
 * @author xiaoweii
 * @create 2025-01-05 22:17
 */
public class LinearSearch {
    private LinearSearch() {}

    public static <E> int search(E[] data, E target) {
        for (int i = 0; i < data.length; i++) {
            if (data[i].equals(target)) {
                return i;
            }
        }
        return -1;
    }

    /**
     * 测试线性查找的性能
     * @param args
     */
    public static void main(String[] args) {
        int[] dataSize={1000000,10000000};
        for (int n : dataSize) {
            Integer[] data = ArrayGenerator.generateOrderedArray(n);

            long startTime=System.nanoTime();
            for (int i = 0; i < 100; i++) {
                LinearSearch.search(data,n);
            }
            long endTime=System.nanoTime();

            double time = (endTime-startTime)/1000000000.0;
            System.out.println("n = " + n + ", 100 runs : " + time + "s");
        }
    }
}
