/**
 * @Author: YanL
 * @Time: 16:59 2019/12/9
 * @Email: imyanl.dt@gmail.com
 * @Description:
 */
public class WaitingTest {
    public static Object object = new Object();

    public static void main(String[] args) {
        new Thread(new Runnable() {
            @Override
            public void run() {
                while(true) {
                    synchronized (object) {
                        try{
                            System.out.println(Thread.currentThread().getName() + "=== 获取到锁对象，调用wait方法， 进入waiting状态，释放锁对象");
                            object.wait();
                        }catch (InterruptedException i) {
                            i.printStackTrace();
                        }
                        System.out.println(Thread.currentThread().getName() + "=== 从waiting状态醒来，获取到锁对象，继续执行了");
                    }
                }
            }
        }, "等待线程").start();

        new Thread(new Runnable() {
            @Override
            public void run() {
                try{
                    System.out.println(Thread.currentThread().getName() + "-----等待3秒钟");
                    Thread.sleep(3000);
                }catch (InterruptedException i) {
                    i.printStackTrace();
                }
                synchronized (object) {
                    System.out.println(Thread.currentThread().getName() + "-----获取到锁对象，调用notify方法，释放锁对象");
                    object.notify();
                }
            }
        }, "唤醒线程").start();
    }
}
