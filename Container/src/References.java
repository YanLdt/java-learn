import java.lang.ref.*;
import java.util.LinkedList;

/**
 * @Author: YanL
 * @Time: 19:38 2019/12/2
 * @Email: imyanl.dt@gmail.com
 * @Description:
 */
public class References {
    private static ReferenceQueue<VeryBig> rq = new ReferenceQueue<>();
    public static void checkQueue() {
        Reference<? extends VeryBig> inq = rq.poll();
        if(inq != null)
            System.out.println("In queue: " + inq.get());
    }
    public static void main(String[] args){
        int size = 10;
        if(args.length > 0)
            size = new Integer(args[0]);
        LinkedList<SoftReference<VeryBig>> sa = new LinkedList<>();
        for(int i = 0; i < size; i++){
            sa.add(new SoftReference<VeryBig>(new VeryBig("Soft " + i), rq));
            System.out.println("Just created: " + sa.getLast());
            checkQueue();
        }

        LinkedList<WeakReference<VeryBig>> wa = new LinkedList<>();
        for(int i = 0; i < size; i++){
            wa.add(new WeakReference<>(new VeryBig("Weak " + i), rq));
            System.out.println("Just created: " + wa.getLast());
            checkQueue();
        }
        SoftReference<VeryBig> s = new SoftReference<>(new VeryBig("Soft"));
        WeakReference<VeryBig> w = new WeakReference<>(new VeryBig("Weak"));
        System.gc();
        LinkedList<PhantomReference<VeryBig>> pa = new LinkedList<>();
        for(int i = 0; i < size; i++){
            pa.add(new PhantomReference<>(new VeryBig("Phantom" + i), rq));
            System.out.println("Just created: " + pa.getLast());
            checkQueue();
        }
    }

}

class VeryBig{
    private static final int SIZE = 10000;
    private long[] la = new long[SIZE];
    private String ident;
    public VeryBig(String id) {ident = id;}
    public String toString() {return ident;}

    @Override
    protected void finalize() throws Throwable {
        System.out.println("Finalizing " + ident);
    }
}

/**
 * Just created: java.lang.ref.SoftReference@1b6d3586
 * Just created: java.lang.ref.SoftReference@4554617c
 * Just created: java.lang.ref.SoftReference@74a14482
 * Just created: java.lang.ref.SoftReference@1540e19d
 * Just created: java.lang.ref.SoftReference@677327b6
 * Just created: java.lang.ref.SoftReference@14ae5a5
 * Just created: java.lang.ref.SoftReference@7f31245a
 * Just created: java.lang.ref.SoftReference@6d6f6e28
 * Just created: java.lang.ref.SoftReference@135fbaa4
 * Just created: java.lang.ref.SoftReference@45ee12a7
 * Just created: java.lang.ref.WeakReference@330bedb4
 * Just created: java.lang.ref.WeakReference@2503dbd3
 * Just created: java.lang.ref.WeakReference@4b67cf4d
 * Just created: java.lang.ref.WeakReference@7ea987ac
 * Just created: java.lang.ref.WeakReference@12a3a380
 * Just created: java.lang.ref.WeakReference@29453f44
 * Just created: java.lang.ref.WeakReference@5cad8086
 * Just created: java.lang.ref.WeakReference@6e0be858
 * Just created: java.lang.ref.WeakReference@61bbe9ba
 * Just created: java.lang.ref.WeakReference@610455d6
 * Just created: java.lang.ref.PhantomReference@511d50c0
 * Finalizing Weak 6
 * In queue: null
 * Just created: java.lang.ref.PhantomReference@60e53b93
 * In queue: null
 * Finalizing Weak 1
 * Finalizing Weak 0
 * Finalizing Weak
 * Finalizing Weak 9
 * Finalizing Weak 8
 * Finalizing Weak 7
 * Finalizing Weak 5
 * Finalizing Weak 4
 * Finalizing Weak 3
 * Finalizing Weak 2
 * Just created: java.lang.ref.PhantomReference@5e2de80c
 * In queue: null
 * Just created: java.lang.ref.PhantomReference@1d44bcfa
 * In queue: null
 * Just created: java.lang.ref.PhantomReference@266474c2
 * In queue: null
 * Just created: java.lang.ref.PhantomReference@6f94fa3e
 * In queue: null
 * Just created: java.lang.ref.PhantomReference@5e481248
 * In queue: null
 * Just created: java.lang.ref.PhantomReference@66d3c617
 * In queue: null
 * Just created: java.lang.ref.PhantomReference@63947c6b
 * In queue: null
 * Just created: java.lang.ref.PhantomReference@2b193f2d
 * In queue: null
 */
