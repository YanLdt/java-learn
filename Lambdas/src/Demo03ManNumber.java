import java.util.function.Supplier;

/**
 * @Author: YanL
 * @Time: 21:16 2019/12/10
 * @Email: imyanl.dt@gmail.com
 * @Description:
 */
public class Demo03ManNumber {

    public static int getMax(Supplier<Integer> supplier) {
        return supplier.get();
    }

    public static void main(String[] args) {
        int arr[] = {2, 3, 4, 53, 32, 23, 434, 35};

        int maxNum = getMax(() -> {
            int max = arr[0];
            for(int i : arr) {
                if(i > max) {
                    max = i;
                }
            }
            return max;
        });
        System.out.println(maxNum);
    }
}
