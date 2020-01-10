import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * @Author: YanL
 * @Time: 10:28 2019/12/6
 * @Email: imyanl.dt@gmail.com
 * @Description:
 */
public class CachedThreadPool {
    public static void main(String[] args) {
        ExecutorService executorService = Executors.newCachedThreadPool();
        for(int i = 0; i < 5; i++){
            executorService.execute(new ListOff());
        }
        executorService.shutdown();
    }
}
