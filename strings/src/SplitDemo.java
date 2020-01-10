import java.util.Arrays;
import java.util.regex.Pattern;

/**
 * @Author: YanL
 * @Time: 14:26 2019/11/5
 * @Email: imyanl.dt@gmail.com
 * @Description:
 */
public class SplitDemo {
    public static void main(String[] args){
        String input = "This!!unusual use!!of exclamation!!points";
        System.out.println(Arrays.toString(Pattern.compile("!!").split(input)));
        System.out.println(Arrays.toString(Pattern.compile("!!").split(input, 2)));

        System.out.println(Arrays.toString(input.split("!!")));
        System.out.println(Arrays.toString(input.split("!!", 2)));
    }
}
