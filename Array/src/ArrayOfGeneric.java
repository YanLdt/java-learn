import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @Author: YanL
 * @Time: 11:09 2019/11/29
 * @Email: imyanl.dt@gmail.com
 * @Description: 创建数组然后转型为泛型
 */
public class ArrayOfGeneric {
    @SuppressWarnings("unchecked")
    public static void main(String[] args){
        List<Integer>[] ls;
        List[] la = new List[10];
        ls = (List<Integer>[])la;
        ls[0] = new ArrayList<Integer>();
        ls[1] = new ArrayList<Integer>();

        ls[0].add(1);
        ls[0].add(2);
        ls[1].add(2);

        System.out.println(Arrays.toString(ls));

    }
}
