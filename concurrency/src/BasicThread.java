/**
 * @Author: YanL
 * @Time: 23:41 2019/12/5
 * @Email: imyanl.dt@gmail.com
 * @Description:
 */
public class BasicThread {
    public static void main(String[] args){
        Thread thread = new Thread(new ListOff());
        thread.start();
        System.out.println("Waiting for ListOff");
    }
}
