import sun.awt.IconInfo;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

/**
 * @Author: YanL
 * @Time: 10:27 2019/12/2
 * @Email: imyanl.dt@gmail.com
 * @Description:
 */
public class Lists {
    public static void main(String[] args){
        List<Integer> list = new LinkedList<>();
        list.add(1);
        list.add(2);
        list.add(3);

        ListIterator<Integer> listIterator = list.listIterator();

        Integer integer = listIterator.next();
        System.out.println((integer));
        listIterator.remove();
        listIterator.add(5);
        System.out.println(list.toString());
        listIterator.next();
        listIterator.add(8);//添加
        listIterator.next();
        listIterator.set(10);//替换

        System.out.println(list.toString());

    }

}
