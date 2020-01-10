/**
 * @Author: YanL
 * @Time: 22:56 2019/11/25
 * @Email: imyanl.dt@gmail.com
 * @Description:  类型擦除
 */
public class GenericHolder<T> {
    T obj;
    public T getObj() {
        return obj;
    }
    public void setObj(T obj) {
        this.obj = obj;
    }
    public static void main(String[] args) {
        GenericHolder<String> holder = new GenericHolder<>();
        holder.setObj("Item");
        String s = holder.getObj();
    }

    /**
     * # javap -c GenericHolder.class
     * Compiled from "GenericHolder.java"
     * public class GenericHolder<T> {
     *   T obj;
     *
     *   public GenericHolder();
     *     Code:
     *        0: aload_0
     *        1: invokespecial #1                  // Method java/lang/Object."<init>":()V
     *        4: return
     *
     *   public T getObj();
     *     Code:
     *        0: aload_0
     *        1: getfield      #2                  // Field obj:Ljava/lang/Object;
     *        4: areturn
     *
     *   public void setObj(T);
     *     Code:
     *        0: aload_0
     *        1: aload_1
     *        2: putfield      #2                  // Field obj:Ljava/lang/Object;
     *        5: return
     *
     *   public static void main(java.lang.String[]);
     *     Code:
     *        0: new           #3                  // class GenericHolder
     *        3: dup
     *        4: invokespecial #4                  // Method "<init>":()V
     *        7: astore_1
     *        8: aload_1
     *        9: ldc           #5                  // String Item
     *       11: invokevirtual #6                  // Method setObj:(Ljava/lang/Object;)V
     *       14: aload_1
     *       15: invokevirtual #7                  // Method getObj:()Ljava/lang/Object;
     *       18: checkcast     #8                  // class java/lang/String   类型转换
     *       21: astore_2
     *       22: return
     * }
     */
}
