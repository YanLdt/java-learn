/**
 * @Author: YanL
 * @Time: 11:06 2019/12/10
 * @Email: imyanl.dt@gmail.com
 * @Description:
 */
public class ResponsiveUi extends Thread{
    private static volatile double d = 1;
    public ResponsiveUi() {
        setDaemon(true);
        start();
    }

    @Override
    public void run() {
        while(true){
            d = d + (Math.PI + Math.E) / d;
        }
    }
    public static void main(String[] args) throws Exception {
        new ResponsiveUi();
        System.in.read();
        System.out.println(d);
    }
}

class UnresponsiveUi {
    private volatile double d = 1;
    public UnresponsiveUi() throws Exception {
        while(d > 0) {
            d = d + (Math.PI + Math.E) / d;
        }
        System.in.read();
    }
}
