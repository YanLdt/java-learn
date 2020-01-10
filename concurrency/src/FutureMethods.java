import java.sql.Time;
import java.util.concurrent.*;

/**
 * @Author: YanL
 * @Time: 10:44 2019/12/8
 * @Email: imyanl.dt@gmail.com
 * @Description:
 */
public class FutureMethods {
    private static ExecutorService executorService = Executors.newSingleThreadExecutor();

    static Future<Integer> calculate(Integer input) {
        return executorService.submit(() -> {
            Thread.sleep(3000);
            return input * input;
        });
    }

    public static void main(String[] args) {
        Future<Integer> calculateFuture = calculate(100);
//        try{
        //System.out.println("calculate result: " + calculateFuture.get(2, TimeUnit.SECONDS));

        System.out.println(calculateFuture.isDone());
        while (!calculateFuture.isDone()) {}
        System.out.println(calculateFuture.isDone());
//        }catch (InterruptedException i){
//            i.printStackTrace();
//        }catch (ExecutionException e){
//            e.printStackTrace();
//        }
//        catch (TimeoutException t){
//            t.printStackTrace();
//        }

//    }

    }
}

