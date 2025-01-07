import java.lang.reflect.Method;

/**
 * @author xiaoweii
 * @create 2025-01-07 22:53
 */
public class SortingHelper {
    private SortingHelper() {
    }

    public static <E extends Comparable<E>> boolean isSorted(E[] arr) {
        for (int i = 1; i < arr.length; i++) {
            if (arr[i - 1].compareTo(arr[i]) > 0) {
                return false;
            }
        }
        return true;
    }

    /**
     * 使用反射执行排序方法查看效率
     * @param sortClassName
     * @param sortMethodName
     * @param arr
     * @param <E>
     */
    public static <E extends Comparable<E>> void sortTest(String sortClassName, String sortMethodName, E[] arr) {
        try {
            Class<?> sortClass = Class.forName(sortClassName);
            Method sortMethod = sortClass.getMethod(sortMethodName, Comparable[].class);
            long startTime = System.nanoTime();
            sortMethod.invoke(null, (Object) arr);
            long endTime = System.nanoTime();
            double time = (endTime - startTime) / 1_000_000_000.0;
            if (!SortingHelper.isSorted(arr)) {
                throw new RuntimeException(sortClassName + "." + sortMethodName + " failed");
            }
            System.out.printf("%s.%s , n = %d : %f s%n", sortClassName, sortMethodName, arr.length, time);
        } catch (Exception e) {
            e.printStackTrace();
            throw new RuntimeException("Refelction failed: " + e.getMessage());
        }

    }
}
