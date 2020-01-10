import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/**
 * @Author: YanL
 * @Time: 11:43 2019/11/24
 * @Email: imyanl.dt@gmail.com
 * @Description:
 */
public class GenericEntry {
    public static void main(String[] args){
        Map<String, Integer> map = new HashMap<String, Integer>();

        map.put("Tom1", 22);
        map.put("Tom2", 32);
        map.put("Tom3", 34);
        map.put("Tom4", 43);

        Set<Map.Entry<String, Integer>> entrySet = map.entrySet();
        Iterator<Map.Entry<String, Integer>> iterator = entrySet.iterator();

        while (iterator.hasNext()){
            Map.Entry<String, Integer> entry = iterator.next();
            System.out.println(entry.getKey() + "--->" + entry.getValue());
        }
    }
}
