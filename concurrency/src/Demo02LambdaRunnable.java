/**
 * @Author: YanL
 * @Time: 21:56 2019/12/9
 * @Email: imyanl.dt@gmail.com
 * @Description:
 */
public class Demo02LambdaRunnable {
    public static void main(String[] args) {
        //小括号表示方法不需要参数，不需要任何条件
        //箭头代表将前面的参数传递给后面的代码
        new Thread(() -> System.out.println("多线程任务执行！")).start();
    }
}
