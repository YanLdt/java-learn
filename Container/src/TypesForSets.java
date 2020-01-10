import sun.reflect.generics.tree.Tree;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

/**
 * @Author: YanL
 * @Time: 11:11 2019/12/2
 * @Email: imyanl.dt@gmail.com
 * @Description: set类型
 */
public class TypesForSets {
    static <T> Set<T> fill(Set<T> set, Class<T> type){
        try {
            for(int i = 0; i < 10; i++){
                set.add(type.getConstructor(int.class).newInstance(i));
            }
        }catch (Exception e){
            throw new RuntimeException();
        }
        return set;
    }
    static <T> void test(Set<T> set, Class<T> type){
        fill(set, type);
        fill(set, type);
        fill(set, type);
        System.out.println(set);
    }

    public static void main(String[] args){
        test(new HashSet<HashType>(), HashType.class);
        test(new LinkedHashSet<HashType>(), HashType.class);
        test(new TreeSet<TreeType>(), TreeType.class);


        /**
         * @类型不匹配 输出结果不是set  hashset必须重写hashcode方法
         * [2, 2, 3, 1, 0, 9, 4, 6, 6, 8, 7, 8, 5, 4, 0, 6, 8, 1, 0, 9, 1, 3, 3, 2, 5, 7, 5, 9, 7, 4]
         * [7, 4, 6, 2, 6, 9, 5, 5, 4, 4, 9, 3, 2, 5, 8, 3, 3, 1, 8, 0, 6, 1, 7, 2, 7, 0, 9, 1, 8, 0]
         * [0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 0, 1, 2, 3, 4, 5, 6, 7, 8, 9]
         * [0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 0, 1, 2, 3, 4, 5, 6, 7, 8, 9]
         */
        test(new HashSet<SetType>(), SetType.class);
        test(new HashSet<TreeType>(), TreeType.class);
        test(new LinkedHashSet<SetType>(), SetType.class);
        test(new LinkedHashSet<TreeType>(), TreeType.class);



        //没有实现comparable接口的类型会抛出异常
        try{
            test(new TreeSet<SetType>(), SetType.class);
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
        try{
            test(new TreeSet<HashType>(), HashType.class);
        }catch (Exception e){
            System.out.println(e.getMessage());
        }


    }
}


class SetType{
    int i;
    public SetType(int n) {i = n;}

    @Override
    public boolean equals(Object obj) {
        return obj instanceof SetType && (i == ((SetType) obj).i);
    }

    @Override
    public String toString(){
        return Integer.toString(i);
    }
}

class HashType extends SetType{
    public HashType(int n) { super(n);}

    @Override
    public int hashCode() {
        return i;
    }
}

/**
 * @树结构必须实现comparable接口
 */
class TreeType extends SetType implements Comparable<TreeType>{
    public TreeType(int n) {super(n);}
    public int compareTo(TreeType arg){
        return (arg.i < i ? -1 : (arg.i == i ? 0 : 1));
    }
}


