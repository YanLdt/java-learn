/**
 * @Author: YanL
 * @Time: 21:33 2019/11/25
 * @Email: imyanl.dt@gmail.com
 * @Description:
 */
class Manipulat<T extends HasF> {
    T obj;
    public void setObj(T t)
    {
        this.obj = t;
    }

    public T getObj(){
        return this.obj;
    }

    void manipulator(){
        obj.f();
    }
}