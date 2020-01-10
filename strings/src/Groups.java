import java.util.Set;
import java.util.TreeSet;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @Author: YanL
 * @Time: 11:05 2019/11/5
 * @Email: imyanl.dt@gmail.com
 * @Description:
 */
public class Groups {
    static public final String POEM =
            "Twas brillig, and the slithy toves\n" +
                    "Did gyre and gimble in the wabe.\n" +
                    "All mimsy were the borogoves,\n" +
                    "And the mome raths outgrabe.\n\n" +
                    "Beware the Jabberwock, my son,\n" +
                    "The jaws that bite, the claws that catch,\n" +
                    "Beware the Jubjub bird, and shun\n" +
                    "The frumious Bandersnatch.";
    public static void main(String[] args){
        Matcher m = Pattern.compile("(^[a-z]|\\s+[a-z])\\w+").matcher(POEM);    //  \w词字符 ????
        Set<String> words = new TreeSet<String>();
        while(m.find()){
            words.add(m.group());
        }
        System.out.println("Number of non_cap words= " + words.size());
        System.out.println(words);
    }
}
