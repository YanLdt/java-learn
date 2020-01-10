import java.util.LinkedList;

/**
 * @Author: YanL
 * @Time: 15:20 2019/12/2
 * @Email: imyanl.dt@gmail.com
 * @Description:
 */
public class DequeTest {
    static void fillTest(Deque<Integer> deque){
        for(int i = 20; i < 27; i++)
            deque.addFirst(i);
        for(int i = 50; i < 55; i++)
            deque.addLast(i);
    }
    public static void main(String[] args){
        Deque<Integer> deque = new Deque<>();
        fillTest(deque);
        System.out.println(deque);

        while (deque.size() != 0)
            System.out.print(deque.removeFirst() + " ");

        System.out.print("\n------ \n");

        fillTest((deque));

        while (deque.size() != 0)
            System.out.print(deque.removeLast() + " ");
    }
}

class Deque<T>{
    private LinkedList<T> deque = new LinkedList<T>();
    public void addFirst(T e){deque.addFirst(e);}
    public void addLast(T e){deque.addLast(e);}
    public T getFirst() {return deque.getFirst();}
    public T getLast() {return deque.getLast();}
    public T removeFirst() {return deque.removeFirst();}
    public T removeLast() {return deque.removeLast();}
    public int size() {return deque.size();}
    public String toString() {return deque.toString();}
}
