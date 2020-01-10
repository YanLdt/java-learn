/**
 * @Author: YanL
 * @Time: 22:20 2019/12/9
 * @Email: imyanl.dt@gmail.com
 * @Description:
 */
public class Demo08InvokeCalc {
    public static void main(String[] args) {

        invokeCalc(120, 130, (int a, int b) -> a + b);
    }
    private static void invokeCalc(int a, int b, Calculator calculator) {
        int result = calculator.calc(a, b);
        System.out.println("结果是： " + result);
    }
}

interface Calculator {
    /**
     * 计算int值相加
     * @param a int
     * @param b int
     * @return a+b
     */
    int calc(int a, int b);
}
