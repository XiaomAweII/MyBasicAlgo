import java.lang.reflect.Method;

/**
 * @author xiaoweii
 * @create 2025-01-05 23:09
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
            System.out.printf("%s.%s, n = %d : %f s%n", sortClassName, sortMethodName, arr.length, time);
        } catch (Exception e) {
            e.printStackTrace();
            throw new RuntimeException("Exception message:" + e.getMessage());
        }
    }
}
