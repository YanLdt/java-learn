/**
 * @Author: YanL
 * @Time: 22:03 2019/12/9
 * @Email: imyanl.dt@gmail.com
 * @Description:
 */
public class Demo05InvokeCook {
    public static void main(String[] args) {
        invokeCook(() -> System.out.println("吃饭啦！"));
    }

    static void invokeCook(Cook cook) {
        cook.makeFood();
    }
}

interface Cook{
    /**
     * 做食物
     */
    void makeFood();
}
