/**
 * @Author: YanL
 * @Time: 20:15 2019/11/25
 * @Email: imyanl.dt@gmail.com
 * @Description:
 */
public class DataHolder<T> {
    T item;

    private void setData(T t){
        this.item = t;
    }

    private T getData(){
        return this.item;
    }

    public  <T> void PrinterInfo(T e){
        System.out.println(e);
    }
}
