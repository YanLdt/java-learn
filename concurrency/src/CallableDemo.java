import java.util.ArrayList;
import java.util.concurrent.*;

/**
 * @Author: YanL
 * @Time: 14:52 2019/12/7
 * @Email: imyanl.dt@gmail.com
 * @Description:
 */
public class CallableDemo {
    public static void main(String[] args){
        ExecutorService exec = Executors.newCachedThreadPool();
        ArrayList<Future<String>> results = new ArrayList<>();
        for(int i = 0; i < 10; i++){
            results.add(exec.submit(new TaskWithResult(i)));
        }
        for(Future<String> fs : results) {
            try{
                System.out.println(fs.get());
            }catch (InterruptedException i){
                i.printStackTrace();
                return;
            }catch (ExecutionException e){
                e.printStackTrace();
            }
        }
    }
}

class TaskWithResult implements Callable<String> {
    private int id;
    public TaskWithResult(int id) {
        this.id = id;
    }

    @Override
    public String call(){
        return "result of TaskWithResult " + id;
    }
}
