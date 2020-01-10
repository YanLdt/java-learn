import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @Author: YanL
 * @Time: 14:48 2019/11/5
 * @Email: imyanl.dt@gmail.com
 * @Description:
 */
public class Resetting {
    public static void main(String[] args){
        String s = "there is a dog";
        String regex = "[dsp][iou][gs]";
        Pattern p = Pattern.compile(regex);
        Matcher m = p.matcher(s);
        while(m.find())
            System.out.println(m.group());

        m.reset("there is a pig");
        while(m.find())
            System.out.println(m.group());
    }
}
