import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * @Author: YanL
 * @Time: 17:01 2019/11/30
 * @Email: imyanl.dt@gmail.com
 * @Description:
 */
public class FillingLists {
    public static void main(String[] args){
        List<StringAddress> list = new ArrayList<>(
                Collections.nCopies(4, new StringAddress("Hello"))
        );

        System.out.println(list);
        Collections.fill(list, new StringAddress("World!"));//替换
        System.out.println(list);

    }
}

class StringAddress{
    private String s;
    public StringAddress(String s){this.s = s;};
    public String toString(){
        return super.toString() + " " + s;
    }
}

