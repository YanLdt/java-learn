import java.util.List;

/**
 * @Author: YanL
 * @Time: 16:09 2019/11/21
 * @Email: imyanl.dt@gmail.com
 * @Description: 使用通配符
 */
public class WildcardsGeneric {
    public static <T> void checkList(List<?> myList, T obj){
        if(myList.contains(obj))
            System.out.println("the list contains the element" + obj);
        else
            System.out.println("the list does not contain the element: " + obj);
    }
    public static <T> void checkListWildcards(List<? extends  Number> myWildList, T obj){
        if(myWildList.contains(obj))
            System.out.println("the list contains the element" + obj);
        else
            System.out.println("the list does not contain the element: " + obj);
    }
}
