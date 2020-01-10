/**
 * @Author: YanL
 * @Time: 21:53 2019/11/25
 * @Email: imyanl.dt@gmail.com
 * @Description:
 */
public class SimpleHolder {

    private Object obj;
    public Object getObj() {
        return obj;
    }
    public void setObj(Object obj) {
        this.obj = obj;
    }
    public static void main(String[] args) {
        SimpleHolder holder = new SimpleHolder();
        holder.setObj("Item");
        String s = (String) holder.getObj();

        System.out.println(s);
    }
    //
}
