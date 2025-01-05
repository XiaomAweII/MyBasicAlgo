import java.util.Arrays;

/**
 * @author xiaoweii
 * @create 2025-01-05 20:37
 */
public class Main {
    public static void main(String[] args) {
        int[] data = {24, 18, 12, 9, 16, 66, 32, 4};

        // LinearSearch ls=new LinearSearch(); // 编译时报错

        System.out.println("data = " + Arrays.toString(data));

        System.out.println("LinearSearch.search(data,16) = "
                + LinearSearch.search(data, 16));
        System.out.println("LinearSearch.search(data,666) = "
                + LinearSearch.search(data, 666));
    }
}
