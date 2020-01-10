import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @Author: YanL
 * @Time: 22:04 2019/11/4
 * @Email: imyanl.dt@gmail.com
 * @Description:
 */
public class RegexTest2 {
    public static void main(String[] args){
        String s1 = "absjahskajskljaslka";
        String s2 = "basjhasdjksklkdjssad";
        String regex = "ab";
        Pattern p = Pattern.compile(regex);
        Matcher m1 = p.matcher(s1);
        Matcher m2 = p.matcher(s2);
        System.out.println(m1.lookingAt());
        System.out.println(m2.lookingAt());

    }
}
