/**
 * @Author: YanL
 * @Time: 22:55 2019/11/26
 * @Email: imyanl.dt@gmail.com
 * @Description:
 */
public class IntegerFactory implements Factory<Integer>{
    @Override
    public Integer create() {
        Integer integer = new Integer(9);
        return integer;
    }
}

interface Factory<T>{
    T create();
}

class Creater<T>{
    T instance;
    public <F extends Factory<T>> T newInstance(F f){
        instance = f.create();
        return instance;
    }
}