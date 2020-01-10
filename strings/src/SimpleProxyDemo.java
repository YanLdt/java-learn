/**
 * @Author: YanL
 * @Time: 16:34 2019/11/12
 * @Email: imyanl.dt@gmail.com
 * @Description:
 */
public class SimpleProxyDemo {
    public static void consumer(Interface iface){
        iface.doSomething();
        iface.somethingElse("bobobo");
    }
    public static void main(String[] args){
        consumer(new RealObject());
        consumer(new SimpleProxy(new RealObject()));
    }

}
interface Interface {
    void doSomething();
    void somethingElse(String args);
}

class RealObject implements Interface {
    public void doSomething(){
        System.out.println("doSomething");
    }
    public void somethingElse(String args){
        System.out.println("something " + args);
    }
}

class SimpleProxy implements Interface{
    private Interface proxied;
    public SimpleProxy(Interface proxied){
        this.proxied = proxied;
    }
    public void doSomething(){
        System.out.println("doSomething");
        proxied.doSomething();
    }
    public void somethingElse(String args){
        System.out.println("something " + args);
        proxied.somethingElse(args);
    }
}
