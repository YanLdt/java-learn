import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @Author: YanL
 * @Time: 17:06 2019/12/2
 * @Email: imyanl.dt@gmail.com
 * @Description:
 */
public class CountedString {
    private static List<String> created = new ArrayList<>();
    private String s;
    private int id = 0;
    public CountedString(String str){
        s = str;
        created.add(s);

        for(String s1 : created)
            if(s1.equals(s))
                id++;
    }
    public String toString(){
        return "String: " + s + " id: " + id + " hashcode(): " + hashCode();
     }

    @Override
    public int hashCode() {
        int result = 17;
        result = 37 * result + s.hashCode();
        result = 37 * result + id;
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        return obj instanceof CountedString && s.equals(((CountedString) obj).s) && id == ((CountedString)obj).id;
    }

    public static void main(String[] args){
        Map<CountedString, Integer> map = new HashMap<>();
        CountedString[] cs = new CountedString[5];

        for(int i = 0; i < cs.length; i++){
            cs[i] = new CountedString("hi");
            map.put(cs[i], i);
        }

        System.out.print(map);

        for(CountedString cstring : cs){
            System.out.println("Looking up" + cstring);
            System.out.println(map.get(cstring));
        }
    }
}
