package interfaces.filters.interfaceprocessor;

/**
 * @Author: YanL
 * @Time: 17:05 2019/10/16
 * @Email: imyanl.dt@gmail.com
 * @Description:
 */
public class Apply {
    public static void process(Processor p, Object s){
        System.out.println("Using Processor " + p.name());
        System.out.println(p.process(s));
    }
}
