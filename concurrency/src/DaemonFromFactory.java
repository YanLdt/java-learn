import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;

/**
 * @Author: YanL
 * @Time: 11:47 2019/12/9
 * @Email: imyanl.dt@gmail.com
 * @Description:
 */
public class DaemonFromFactory implements Runnable {
    @Override
    public void run(){
        try{
            while(true) {
                TimeUnit.MILLISECONDS.sleep(100);
                System.out.println(Thread.currentThread() + " " + this);
            }
        }catch (InterruptedException i ){
            i.printStackTrace();
        }
    }
    public static void main(String[] args) throws Exception{
        ExecutorService executorService = Executors.newCachedThreadPool(new DaemonThreadFactory());
        for(int i = 0; i < 10; i++){
            executorService.execute(new DaemonFromFactory());
        }
        System.out.println("All daemons started");
        Thread.sleep(5000);
    }
}

class DaemonThreadFactory implements ThreadFactory {
    @Override
    public Thread newThread(Runnable r) {
        Thread t = new Thread(r);
        t.setDaemon(true);
        return t;
    }
}