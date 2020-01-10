import java.util.function.Consumer;

/**
 * @Author: YanL
 * @Time: 21:26 2019/12/10
 * @Email: imyanl.dt@gmail.com
 * @Description:
 */
public class Demo04ConsumerAndThen {
    private static void consumeString(Consumer<String> one, Consumer<String> two) {
        one.andThen(two).accept("Hello");
    }

    public static void main(String[] args) {
        consumeString(
                s -> System.out.println(s.toLowerCase()),
                s -> System.out.println(s.toUpperCase()));
    }
}
