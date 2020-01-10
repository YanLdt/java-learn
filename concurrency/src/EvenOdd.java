import java.util.ArrayList;

/**
 * @Author: YanL
 * @Time: 15:28 2019/12/9
 * @Email: imyanl.dt@gmail.com
 * @Description:
 */
public class EvenOdd {
    public static void main(String[] args){
        Runnable even = new Even();
        Thread t1 = new Thread(even);
        Runnable odd = new Odd();
        Thread t2 = new Thread(odd);
        t1.start();
        t2.start();
    }

}

class Even implements Runnable {
    @Override
    public void run() {
        ArrayList<Integer> even = new ArrayList<>();
        for (int i = 0; i <= 1000; i++) {
            if(i % 2 == 0){
                even.add(i);
            }
        }
        System.out.print("Even number: ");
        System.out.println(even.toString());
    }
}
class Odd implements Runnable {
    @Override
    public void run() {
        ArrayList<Integer> odd = new ArrayList<>();
        for(int i = 0; i <= 1000; i++) {
            if(i % 2 == 1){
                odd.add(i);
            }
        }
        System.out.print("Odd number: ");
        System.out.println(odd.toString());
    }
}
