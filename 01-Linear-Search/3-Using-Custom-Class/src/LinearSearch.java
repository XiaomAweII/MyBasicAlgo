import java.util.Arrays;

/**
 * @author xiaoweii
 * @create 2025-01-05 21:20
 */
public class LinearSearch {

    private LinearSearch() {
    }

    public static <E> int search(E[] data, E target) {
        for (int i = 0; i < data.length; i++) {
            if (data[i].equals(target)) {
                return i;
            }
        }
        return -1;
    }

    /*
     * 对自定义的类进行线性查找法的测试
     */
    public static void main(String[] args) {
        Student[] students = {new Student("ZhangSan"),
                new Student("LiSi"),
                new Student("WangWu")};
        Student wangWu = new Student("WangWu");
        System.out.println("students" + Arrays.toString(students));
        System.out.println("LinearSearch.search(students,wangWu) = " + LinearSearch.search(students, wangWu));
    }
}
