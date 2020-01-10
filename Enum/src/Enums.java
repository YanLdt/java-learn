import java.util.Random;

/**
 * @Author: YanL
 * @Time: 10:54 2019/12/5
 * @Email: imyanl.dt@gmail.com
 * @Description: 使用enum随机访问元素
 */
public class Enums {
    private static Random rand = new Random(47);

    /**
     * <T extends Enum<T>>表示T是一个enum实例
     * @param ec enum类型
     * @param <T>是一个enum实例
     * @return 随机返回Enum值里的元素
     */
    public static <T extends Enum<T>> T random(Class<T> ec) {
        return random(ec.getEnumConstants());
    }
    public static <T> T random(T[] values){
        return values[rand.nextInt(values.length)];
    }
}
