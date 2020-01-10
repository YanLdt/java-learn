import java.lang.reflect.Array;

/**
 * @Author: YanL
 * @Time: 23:03 2019/11/26
 * @Email: imyanl.dt@gmail.com
 * @Description:
 */
public class GenericArrayWithTypeToken<T> {
    private T[] array;

    public GenericArrayWithTypeToken(Class<T> type, int sz){
        array = (T[]) Array.newInstance(type, sz);
    }

    public void put(int index, T item){
        array[index] = item;
    }

    public T[] rep(){
        return array;
    }

    public static void main(String[] args){
        GenericArrayWithTypeToken<Integer> genericArrayWithTypeToken = new GenericArrayWithTypeToken<>(Integer.TYPE , 1);
        genericArrayWithTypeToken.put(0, 34);
        genericArrayWithTypeToken.rep();

        System.out.println(genericArrayWithTypeToken);
    }
}

