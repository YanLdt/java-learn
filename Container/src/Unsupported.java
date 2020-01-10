import java.util.*;

/**
 * @Author: YanL
 * @Time: 14:04 2019/12/1
 * @Email: imyanl.dt@gmail.com
 * @Description:
 */
public class Unsupported {
    static void test(String msg, List<String> list){
        System.out.println("---" + msg + "---");
        Collection<String> collection = list;
        Collection<String> subCollection = list.subList(1, 8);

        Collection<String> collection2 = new ArrayList<>();
        collection2.addAll(list);

        Collection<String> collection1 = new ArrayList<>(subCollection);
        try{ collection2.retainAll(collection1);}catch (Exception e){
            System.out.println("retainall(): " + e);
        }
        try{collection2.removeAll(collection1);} catch (Exception e){
            System.out.println("removeall(): " + e);
        }
        try{collection2.clear();} catch (Exception e ){
            System.out.println("clear(): " + e);
        }
        try{collection2.add("X");} catch (Exception e){
            System.out.println("add(): " + e);
        }

        try{collection2.addAll(collection1);} catch (Exception e){
            System.out.println("addAll(): " + e);
        }

        try{collection2.remove(collection1);} catch (Exception e){
            System.out.println("remove(): " + e);
        }
        try{list.set(0, "X");} catch (Exception e){
            System.out.println("List.set(): " + e);
        }
    }

    public static void main(String[] args){
        List<String> list = Arrays.asList("A B C D E F G H I J K L".split(" "));

        test("Modifiable copy", new ArrayList<>(list));
        test("Arrays.asList()", list);
        test("unmodifiableList()", Collections.unmodifiableList(new ArrayList<>(list)));
    }
}
