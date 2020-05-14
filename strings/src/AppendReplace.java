import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @Author: YanL
 * @Time: 14:38 2019/11/5
 * @Email: imyanl.dt@gmail.com
 * @Description:
 */
public class AppendReplace {
    public static void main(String[] args){
        String s = "abdskjsaabdjskabdsakabdsjab";
        String regex = "ab";
        StringBuffer stringBuffer = new StringBuffer();
        Pattern p = Pattern.compile(regex);
        Matcher m = p.matcher(s);
        while(m.find()) {
            m.appendReplacement(stringBuffer, m.group().toUpperCase());
        }
        m.appendTail(stringBuffer);
        System.out.println(stringBuffer);
    }
}
