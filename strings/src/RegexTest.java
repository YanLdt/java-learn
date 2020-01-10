import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @Author: YanL
 * @Time: 21:47 2019/11/4
 * @Email: imyanl.dt@gmail.com
 * @Description:
 */
public class RegexTest {
    public static void main(String[] args){
        String str = "abajhkabhskajslkabjkjsabjkjsabsa";
        int i = 0;
        String regex = "ab";
        Pattern p = Pattern.compile(regex);
        Matcher m = p.matcher(str);
        while(m.find()){
            System.out.println(m.group() + " at position: " + m.start() +"-" +(m.end()-1));
        }
    }
}
