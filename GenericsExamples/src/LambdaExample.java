import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

/**
 * @Author: YanL
 * @Time: 19:42 2019/11/21
 * @Email: imyanl.dt@gmail.com
 * @Description:
 */
public class LambdaExample {
    public static void main(String[] args){
        List<String> bookList = new ArrayList<String>();
        bookList.add("Java 8 Recipes");
        bookList.add("Java EE 7 Recipes");
        bookList.add("Introducing Java 7");
        bookList.add("JavaFx 8: Introducing By Example");
        compareStrings(bookList, (n) -> n.contains("Java EE"));

    }

    public static void compareStrings(List<String> list, Predicate<String> predicate) {
        list.stream().filter((n) -> (predicate.test(n))).forEach((n) -> {
            System.out.println(n + " ");
        });
    }
}
