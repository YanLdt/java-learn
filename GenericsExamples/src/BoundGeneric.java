/**
 * @Author: YanL
 * @Time: 15:47 2019/11/21
 * @Email: imyanl.dt@gmail.com
 * @Description:
 */
public class BoundGeneric {
    public static void main(String[] args){
        GenericNumber<Integer> genericNumber = new GenericNumber<Integer>();
        GenericNumber<Double> genericNumber1 = new GenericNumber<Double>();
        //type argument String is no within the upper bounds of type Variable T
        //GenericNumber<String>
    }
}
