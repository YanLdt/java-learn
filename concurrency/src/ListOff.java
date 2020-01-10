/**
 * @Author: YanL
 * @Time: 23:31 2019/12/5
 * @Email: imyanl.dt@gmail.com
 * @Description:
 */
public class ListOff implements Runnable {
    protected int countDown = 10;
    private static int taskCount = 0;
    /**
     * 区分任务的多个实例，不希望被修改
     */
    private final int id = taskCount++;
    public ListOff(){}
    public ListOff(int countDown) {
        this.countDown = countDown;
    }
    public String status() {
        return "#" + id + "(" + (countDown > 0 ? countDown : "ListOff!") + ").";
    }

    /**
     * Runnable必须实现run()方法
     */
    @Override
    public void run() {
        while (countDown-->0) {
            System.out.println(status());
            //对线程调度器的建议，将CPU一个线程转移给另一个线程
            Thread.yield();
        }
    }
}
