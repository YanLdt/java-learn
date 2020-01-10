import java.util.function.Supplier;

/**
 * @Author: YanL
 * @Time: 21:12 2019/12/10
 * @Email: imyanl.dt@gmail.com
 * @Description:
 */
public class Demo02Supplier {
    private static String getString(Supplier<String> function) {
        return function.get();
    }
    public static void main(String[] args) {
        String msgA = "Hello ";
        String msgB = "World";
        System.out.println(getString(() -> msgA + msgB ));
    }
}
