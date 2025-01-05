import java.lang.annotation.Target;
import java.util.Arrays;

/**
 * @author xiaoweii
 * @create 2025-01-05 20:54
 */
public class LinearSearch {

    /**
     *  使用私有化构造方法，不允许外部通过new关键字创建实例
     */
    private LinearSearch(){}

    /**
     * 对线性查找法泛型化，使得方法更具有通用性
     * @param data - 目标数组
     * @param target - 待查找目标值
     * @return int - 待查找目标值在数组中的索引，如果不存在则返回-1
     * @param <E> - 泛型类型
     */
    public static <E> int search(E[] data, E target){
        for (int i = 0; i < data.length; i++) {
            if (data[i].equals(target)) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        Integer[] data = {24, 18, 12, 9, 16, 66, 32, 4};

        System.out.println("data"+Arrays.toString(data));

        System.out.println("LinearSearch.search(data,16) = "
                + LinearSearch.search(data, 16));
        System.out.println("LinearSearch.search(data,666) = "
                + LinearSearch.search(data, 666));
    }
}
