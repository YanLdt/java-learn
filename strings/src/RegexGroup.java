import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @Author: YanL
 * @Time: 22:18 2019/11/4
 * @Email: imyanl.dt@gmail.com
 * @Description:
 */
public class RegexGroup {
    public static void main(String[] args){
        String s = "abdskjsaabdjskabdsakabdsjab";
        String regex = "(a(b))d";
        Pattern p = Pattern.compile(regex);
        Matcher m = p.matcher(s);
        while(m.find())
            System.out.println(m.group(0) + ", " + m.group(1) + ", " + m.group(2));
    }
}
