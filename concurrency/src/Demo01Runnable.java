/**
 * @Author: YanL
 * @Time: 21:55 2019/12/9
 * @Email: imyanl.dt@gmail.com
 * @Description:
 */
public class Demo01Runnable {
    public static void main(String[] args) {
// 匿名内部类
        Runnable task = new Runnable() {
            @Override
            public void run() { // 覆盖重写抽象方法
                System.out.println("多线程任务执行！");
            }
        };
        new Thread(task).start(); // 启动线程
    }
}
