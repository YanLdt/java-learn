/**
 * @Author: YanL
 * @Time: 11:28 2019/11/20
 * @Email: imyanl.dt@gmail.com
 * @Description:
 */

//必须在尖括号内指定容器类型
public class GeneticContainer<T> {
    private T obj;

    public GeneticContainer(){

    }

    //Pass type in as parameter to constructor
    public GeneticContainer(T t) {
        obj = t;
    }

    /**
     * @return the obj
     */
    public T getObj(){
        return obj;
    }

    /**
     * @ param obj the obj to set
     */
    public void setObj(T t){
        obj = t;
    }
}
