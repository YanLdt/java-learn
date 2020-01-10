import java.util.Collections;
import java.util.Iterator;
import java.util.SortedSet;
import java.util.TreeSet;

/**
 * @Author: YanL
 * @Time: 11:45 2019/12/2
 * @Email: imyanl.dt@gmail.com
 * @Description:
 */
public class SortedSetDemo {
    public static void main(String[] args){
        SortedSet<String> sortedSet = new TreeSet<>();
        Collections.addAll(sortedSet, "one two three four five six seven eight".split(" "));
        System.out.println(sortedSet);

        String low = sortedSet.first();
        String high = sortedSet.last();
        System.out.println(low);
        System.out.println(high);

        Iterator<String> iterator = sortedSet.iterator();
        for(int i = 0; i <= 6; i++){
            //System.out.println(iterator.next());
            if(i == 3) low = iterator.next();
            if(i == 6) high = iterator.next();
            else iterator.next();
        }
        System.out.println(low);
        System.out.println(high);
        System.out.println(sortedSet.subSet(low, high));
        System.out.println(sortedSet.headSet(high));
        System.out.println(sortedSet.tailSet(low));
    }
}