/**
 * @Author: YanL
 * @Time: 23:38 2019/11/22
 * @Email: imyanl.dt@gmail.com
 * @Description:
 */
public class Java8Tester {
    public static void main(String[] args){

        Java8Tester tester = new Java8Tester();

        MathOperation addition = (int a, int b) -> a + b;

        MathOperation subtraction = (a, b) -> a - b;

        MathOperation multiplication = (int a, int b) -> {return a * b; };

        MathOperation division = (int a, int b) -> a / b;

        System.out.println("10 + 5 = " + tester.operate(10 ,5, addition));
        System.out.println("10 - 5 = " + tester.operate(10, 5, subtraction));
        System.out.println("10 * 5 = " + tester.operate(10, 5, multiplication));
        System.out.println("10 / 5 = " + tester.operate(10, 5, division));

        GreetingService greetingService = message -> System.out.println("Hello " + message);

        GreetingService greetingService1 = (message -> System.out.println("Hello " + message));

        greetingService.sayMessage("ly");
        greetingService1.sayMessage("zy");
    }

    interface MathOperation{
        int operation(int a, int b);
    }

    interface GreetingService{
        void sayMessage(String message);
    }

    private int operate(int a, int b, MathOperation mathOperation){
        return mathOperation.operation(a, b);
    }



}
