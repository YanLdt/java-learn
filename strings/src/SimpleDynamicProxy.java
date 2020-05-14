import javax.naming.spi.ObjectFactoryBuilder;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * @Author: YanL
 * @Time: 16:53 2019/11/12
 * @Email: imyanl.dt@gmail.com
 * @Description:
 */
public class SimpleDynamicProxy {

    public static void consumer(Interface iface){
        iface.doSomething();
        iface.somethingElse("nonono");
    }
    public static void main(String[] args){
        RealObject realObject = new RealObject();
        consumer(realObject);

        Interface proxy = (Interface) Proxy.newProxyInstance(
                Interface.class.getClassLoader(),
                new Class[] {Interface.class},
                new DynamicProxyHandler(realObject));
        consumer(proxy);
    }
}

class DynamicProxyHandler implements InvocationHandler{
    private Object proxied;
    public DynamicProxyHandler(Object proxied){
        this.proxied = proxied;
    }
    @Override
    public Object invoke(Object proxy, Method method, Object[] args)
        throws Throwable{
        System.out.println("**** proxy: " + proxy.getClass() + ", method: " + method + ", args: " + args);
        if(args != null)
            for(Object arg : args)
                System.out.println("  " + arg);

            return method.invoke(proxied, args);
    }
}


