package interfaces.filters.interfaceprocessor;

/**
 * @Author: YanL
 * @Time: 17:04 2019/10/16
 * @Email: imyanl.dt@gmail.com
 * @Description:
 */
public interface Processor {
    String name();
    Object process(Object input);
}
