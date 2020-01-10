import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

/**
 * @Author: YanL
 * @Time: 21:29 2019/12/10
 * @Email: imyanl.dt@gmail.com
 * @Description:
 */
public class Demo05Consumer {
    private static void printInfo(Consumer<String> one, Consumer<String> two, String[] array) {
        for(String info : array) {
            one.andThen(two).accept(info);
        }
    }

    private static List<String> filter(String[] array, Predicate<String> one, Predicate<String> two) {
        List<String> list = new ArrayList<>();
        for(String info : array) {
            if(one.and(two).test(info)){
                list.add(info);
            }
        }
        return list;
    }

    private static int getAgeNum(String str, Function<String, String> one, Function<String, Integer> two, Function<Integer, Integer> three) {
        return one.andThen(two).andThen(three).apply(str);
    }

    public static void main(String[] args){
        String str = "赵丽颖，20";
        String[] array = {"迪丽热巴，女", "古力娜扎，女", "马儿扎哈，男"};
        printInfo(
                s -> System.out.print("姓名： " + s.split("，")[0]),
                s -> System.out.print("。性别： " + s.split("，")[1] + "。" + "\n"),
                array
        );
        List<String> list = filter(array,
                s -> "女".equals(s.split("，")[1]),
                s -> s.split("，")[0].length() == 4);
        System.out.println(list);
        int age=getAgeNum(str, s -> s.split("，")[1],
                s -> Integer.parseInt(s),
                n -> n += 100);
        System.out.print(age);
    }
}
