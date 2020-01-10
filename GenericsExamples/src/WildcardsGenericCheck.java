import java.util.ArrayList;
import java.util.List;

/**
 * @Author: YanL
 * @Time: 16:12 2019/11/21
 * @Email: imyanl.dt@gmail.com
 * @Description:
 */
public class WildcardsGenericCheck {
    public static void main(String[] args){
        List<Integer> intList = new ArrayList<Integer>();
        intList.add(1);
        intList.add(2);
        intList.add(4);

        List<Integer> intWildList = new ArrayList<Integer>();
        intList.add(1);
        intList.add(2);
        intList.add(4);

        List<String> strList = new ArrayList<String>();
        strList.add("one");
        strList.add("two");
        strList.add("four");

        List<Object> objList = new ArrayList<Object>();
        objList.add(1);
        objList.add("two");
        objList.add(intList);


        WildcardsGeneric.checkList(objList, intList);
        WildcardsGeneric.checkListWildcards(intWildList, strList);
    }
}
