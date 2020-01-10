import org.omg.CORBA.MARSHAL;
import org.omg.PortableInterceptor.SYSTEM_EXCEPTION;

import java.util.Iterator;
import java.util.LinkedHashMap;

/**
 * @Author: YanL
 * @Time: 22:45 2019/11/30
 * @Email: imyanl.dt@gmail.com
 * @Description:
 */
public class MapDataTest {
    public static void main(String[] args){
        System.out.println(MapData.mapData(new Letters(), 12));
        System.out.println(MapData.mapData(new Letters(), "pops"));


    }
}

class Pairs<K, V>{
    public final K key;
    public final V value;
    public Pairs(K key, V value){
        this.key = key;
        this.value = value;
    }
}

class MapData<K, V> extends LinkedHashMap<K, V>{
    public MapData(Generator<Pairs<K, V>> generator, int quantity){
        for(int i = 0; i < quantity; i++){
            Pairs<K, V> pairs = generator.next();
            put(pairs.key, pairs.value);
        }
    }
    public MapData(Generator<K> genK, V value, int quantity){
        for(int i = 0; i < quantity; i++){
            put(genK.next(), value);
        }
    }
    public MapData(Generator<K> genK, Generator<V> genV, int quantity){
        for(int i = 0; i < quantity; i++){
            put(genK.next(), genV.next());
        }
    }

    public MapData(Iterable<K> iteK, Generator<V> genV){
        for(K k : iteK){
            put(k, genV.next());
        }
    }

    public MapData(Iterable<K> iteK, V value){
        for(K k : iteK){
            put(k, value);
        }
    }

    public static <K, V> MapData<K, V> mapData(Generator<Pairs<K, V>> generator, int quantity){
        return new MapData<K, V>(generator, quantity);
    }

    public static <K, V> MapData<K, V> mapData(Generator<K> genK, V value, int quantity){
        return new MapData<K, V>(genK, value, quantity);
    }

    public static <K, V> MapData<K, V> mapData(Generator<K> genK, Generator<V> genV, int quantity){
        return new MapData<K, V>(genK, genV, quantity);
    }

    public static <K, V> MapData<K, V> mapData(Iterable<K> iteK, Generator<V> genV){
        return new MapData<K, V>(iteK, genV);
    }

    public static <K, V> MapData<K, V> mapData(Iterable<K> iteK, V value){
        return new MapData<K, V>(iteK, value);
    }

}


class Letters implements Generator<Pairs<Integer, String>>, Iterable<Integer>{
    private int size = 9;
    private int number = 1;
    private char letter = 'A';
    public Pairs<Integer, String> next(){
        return new Pairs<>(number++, "" + letter++);
    }

    public Iterator<Integer> iterator(){
        return new Iterator<Integer>() {
            @Override
            public boolean hasNext() {
                return number < size;
            }

            @Override
            public Integer next() {
                return number++;
            }
            @Override
            public void remove() {
                throw new UnsupportedOperationException();
            }
        };
    }
}