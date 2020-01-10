/**
 * @Author: YanL
 * @Time: 22:59 2019/11/26
 * @Email: imyanl.dt@gmail.com
 * @Description:
 */
public class GenericFactory {

    public static void main(String[] args){
        Creater<Integer> creater = new Creater<>();

        System.out.println(creater.newInstance(new IntegerFactory()));
    }


}
