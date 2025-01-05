/**
 * @author xiaoweii
 * @create 2025-01-05 20:29
 */
public class LinearSearch {
    /**
     * 1. 不希望外部通过new对象的方式访问我们的search方法，因此将构造方法进行私有化
     */
    private LinearSearch() {
    }

    /**
     * 2. 线性查找法
     * 定义 ： 顺序或逆序遍历目标数组，逐一比较每个元素与目标元素是否相等，若相等则返回该元素的索引，若遍历完毕仍未找到则返回-1
     *
     * @param data   - 目标数组
     * @param target - 待查找目标值
     * @return
     */
    public static int search(int[] data, int target) {
        for (int i = 0; i < data.length; i++) {
            if (data[i] == target) {
                return i;
            }
        }
        return -1;
    }

    /**
     * 3. 私有化构造方法，在该方法内部的main方法依然可以使用new实例
     * @param args
     */
    public static void main(String[] args) {
        int[] data = {24, 18, 12, 9, 16, 66, 32, 4};
        LinearSearch linearSearch = new LinearSearch();
        int res = LinearSearch.search(data, 16);
        System.out.println(res);
    }
}
