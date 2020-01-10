import java.util.concurrent.*;

/**
 * @Author: YanL
 * @Time: 20:36 2019/12/9
 * @Email: imyanl.dt@gmail.com
 * @Description:
 */
public class ThreadPoolDemo {

    public static void main(String[] args) {
        ExecutorService executorService = new ThreadPoolExecutor(2, 10,
                200L, TimeUnit.MILLISECONDS, new ArrayBlockingQueue<>(10));
        MyRunnable r = new MyRunnable();
        executorService.submit(r);
        executorService.submit(r);
        executorService.submit(r);
    }
}

class MyRunnable implements Runnable {
    @Override
    public void run() {
        try{
            Thread.sleep(2000);
        }catch (InterruptedException e){
            e.printStackTrace();
        }
        System.out.println("coach is coming: " + Thread.currentThread().getName());
        System.out.println("coach taught me to swim, and he left the pool");
    }
}
