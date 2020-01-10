import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * @Author: YanL
 * @Time: 16:06 2019/12/9
 * @Email: imyanl.dt@gmail.com
 * @Description: 线程不安全
 */
public class TicketDemo {
    public static void main(String[] args) {
        //创建线程对象
        Ticket ticket = new Ticket();

        Thread t1 = new Thread(ticket, "窗口1");
        Thread t2 = new Thread(ticket, "窗口2");
        Thread t3 = new Thread(ticket, "窗口3");

        t1.start();
        t2.start();
        t3.start();
    }
}

class Ticket implements Runnable {
    private int ticket = 100;

    Lock lock = new ReentrantLock();

//    /**
//     * 同步锁
//     */
//    Object lock = new Object();
//    /**
//     * 执行卖票操作
//     */
//    @Override
//    public void run(){
//        while(true) {
//            synchronized (lock) {
//
//
//            if (ticket > 0) {
//                //出票
//                try {
//                    //模拟出票时间
//                    Thread.sleep(100);
//                } catch (InterruptedException i) {
//                    i.printStackTrace();
//                }
//                //获取线程对象名字
//                String name = Thread.currentThread().getName();
//                System.out.println(name + "正在卖： " + ticket--);
//            }
//        }
//        }
//    }

    @Override
    public void run(){
        while(true) {

            lock.lock();


            if (ticket > 0) {
                //出票
                try {
                    //模拟出票时间
                    Thread.sleep(100);
                } catch (InterruptedException i) {
                    i.printStackTrace();
                }
                //获取线程对象名字
                String name = Thread.currentThread().getName();
                System.out.println(name + "正在卖： " + ticket--);
            }
            lock.unlock();
        }
    }


//    @Override
//    public void run() {
//        while(true){
//            sellTicket();
//        }
//    }

//    /**
//     * 锁对象 是谁调用这个方法就是谁执行
//     */
//    public synchronized void sellTicket() {
//        if (ticket > 0) {
//            //出票
//            try {
//                //模拟出票时间
//                Thread.sleep(100);
//            } catch (InterruptedException i) {
//                i.printStackTrace();
//            }
//            //获取线程对象名字
//            String name = Thread.currentThread().getName();
//            System.out.println(name + "正在卖： " + ticket--);
//        }
//    }
}
