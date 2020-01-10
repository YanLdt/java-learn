/**
 * @Author: YanL
 * @Time: 16:57 2019/12/2
 * @Email: imyanl.dt@gmail.com
 * @Description:
 */
public class StringHashCode {
    public static void main(String[] args){
        String[] hellos = "Hello Hello my".split(" ");
        System.out.println(hellos[0].hashCode());
        System.out.println(hellos[1].hashCode());
        System.out.println(hellos[2].hashCode());
    }
}
