/**
 * @Author: YanL
 * @Time: 23:59 2019/12/5
 * @Email: imyanl.dt@gmail.com
 * @Description:
 */
public class MoreBasicThreads {
    public static void main(String[] args) {
        for(int i = 0; i < 5; i++){
            new Thread(new ListOff()).start();
        }
        System.out.println("Waiting");
    }
}
