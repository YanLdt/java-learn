import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.StreamSupport;

/**
 * @Author: YanL
 * @Time: 20:57 2019/11/4
 * @Email: imyanl.dt@gmail.com
 * @Description:
 */
public class TestRegularExpression {
    public static void main(String[] args) {
        String[] s = {"15510631665","138736321665","15838381667","1583281665"};
        String regex = "1[358][58][0-9]{4}1665";

        Pattern p = Pattern.compile(regex);
        for(String str : s){
            Matcher m = p.matcher(str);
            System.out.println(str + " " + m.matches());
        }
    }
}
