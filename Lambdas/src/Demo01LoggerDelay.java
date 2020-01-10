/**
 * @Author: YanL
 * @Time: 20:53 2019/12/10
 * @Email: imyanl.dt@gmail.com
 * @Description:
 */
public class Demo01LoggerDelay {
    public static void log(int level, MessageBuilder messageBuilder) {
        if(level == 1) {
            System.out.println(messageBuilder.buildMessage());
        }
    }
    public static void main(String[] args) {
        String msgA = "Hello";
        String msgB = "World";
        String msgC = "Java";

        log(2, () -> {
            System.out.println("Lambda执行！");
            return msgA + msgB + msgC;
        } );
     }
}

@FunctionalInterface
interface MessageBuilder {
    /**
     * 生成日志
     * @return 生成日志
     */
    String buildMessage();
}
