import java.util.Arrays;

/**
 * @Author: YanL
 * @Time: 10:56 2019/11/29
 * @Email: imyanl.dt@gmail.com
 * @Description:
 */
public class ParameterizedArrayType {
    public static void main(String[] args){
        Integer[] ints = {1, 2, 3, 4, 5};
        Double[] doubles = {1.1, 3.2, 3.3, 4.4, 5.5};
        Integer[] ints2 = new ClassParameter<Integer>().f(ints);
        System.out.println(Arrays.toString(ints2));
        Double[] doubles1 = new ClassParameter<Double>().f(doubles);
        System.out.println(Arrays.toString(doubles1));

        ints2 = MethodParameter.f(ints);
        doubles1 = MethodParameter.f(doubles1);
        System.out.println(Arrays.toString(ints2));
        System.out.println(Arrays.toString(doubles1));
    }
}

class ClassParameter<T>{
    public T[] f(T[] arg){return arg;}
}

class MethodParameter{
    public static <T> T[] f(T[] arg){
        return arg;
    }
}

