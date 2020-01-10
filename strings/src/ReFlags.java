import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @Author: YanL
 * @Time: 14:20 2019/11/5
 * @Email: imyanl.dt@gmail.com
 * @Description:
 */
public class ReFlags {
    public static void main(String[] args){
        String s = "java has regex\nJAVA has regex\n" +
                "Java has pretty good regular expression\n" +
                "Regular expression are in java";
        Pattern p = Pattern.compile("^java", Pattern.CASE_INSENSITIVE |Pattern.MULTILINE);
        Matcher m = p.matcher(s);
        while (m.find())
            System.out.println(m.group());
    }
}
