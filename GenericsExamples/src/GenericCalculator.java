/**
 * @Author: YanL
 * @Time: 15:55 2019/11/21
 * @Email: imyanl.dt@gmail.com
 * @Description:
 */
public class GenericCalculator {

//    public static Integer addInteger(Integer a, Integer b){
//        return a + b;
//    }
//    public static Float addFloat(Float a, Float b){
//        return a + b;
//    }

    public static <N extends Number> double add(N a, N b){
        double sum = 0;
        sum = a.doubleValue() + b.doubleValue();
        return sum;
    }
}
