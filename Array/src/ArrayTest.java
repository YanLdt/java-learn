import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

/**
 * @Author: YanL
 * @Time: 22:39 2019/11/28
 * @Email: imyanl.dt@gmail.com
 * @Description:
 */
public class ArrayTest {
    public static void main(String[] args){
        ArrayList arrayList = new ArrayList();
        arrayList.add(1);
        arrayList.add("2");

        Integer[] array = new Integer[10];
        for(int i = 0; i < 10; i++){
            array[i] = i;
            System.out.println(array[i]);
        }

        System.out.println(arrayList.toString());
        
        System.out.println(Arrays.toString(array));
    }
}
