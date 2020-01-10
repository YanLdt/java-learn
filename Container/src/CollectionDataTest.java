

import sun.nio.cs.Surrogate;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Set;

/**
 * @Author: YanL
 * @Time: 17:14 2019/11/30
 * @Email: imyanl.dt@gmail.com
 * @Description:
 */
public class CollectionDataTest {
    public static void main(String[] args){
        Set<String> set = new LinkedHashSet<>(
                new CollectionData<String>(new Government(), 15)
        );

        set.addAll(CollectionData.list(new Government(), 16));
        System.out.println(set);
    }
}

class CollectionData<T> extends ArrayList<T>{
    public CollectionData(Generator<T> generator, int quantity){
        for(int i = 0; i < quantity; i++)
            add(generator.next());
    }

    public static <T> CollectionData<T> list(Generator<T> generator, int quantity){
        return new CollectionData<>(generator, quantity);
    }
}

/**
 * 生成器接口
 * @param <T>
 */
interface Generator<T>{
    /**
     * 用以产生新对象
     * @return
     */
    public T next();
}

class Government implements Generator<String>{
    String[] foundation = ("string women lying in ponds " + "distributing swords is no basis for a system of " + "government my ni").split(" ");
    private int index;
    public String next(){
        return foundation[index++];
    }
}