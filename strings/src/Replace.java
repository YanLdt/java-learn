/**
 * @Author: YanL
 * @Time: 14:36 2019/11/5
 * @Email: imyanl.dt@gmail.com
 * @Description:
 */
public class Replace {
    public static void main(String[] args){
        String s = "abdskjsaabdjskabdsakabdsjab";
        s = s.replaceFirst("ab", "AB");
        System.out.println(s);

        s = s.replaceAll("ab", "CD");
        System.out.println(s);
    }
}
