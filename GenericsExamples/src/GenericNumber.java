/**
 * @Author: YanL
 * @Time: 15:44 2019/11/21
 * @Email: imyanl.dt@gmail.com
 * @Description:
 */
public class GenericNumber<T extends Number> {
    private T obj;

    public GenericNumber(){
    }
    public GenericNumber(T t){
        this.obj = t;
    }

    public T getObj(){
        return obj;
    }

    public void setObj(T t){
        obj = t;
    }

}
