import java.lang.reflect.Method;
import java.lang.reflect.Type;
import java.util.Set;
import java.util.TreeSet;

/**
 * @Author: YanL
 * @Time: 23:14 2019/12/3
 * @Email: imyanl.dt@gmail.com
 * @Description:
 */
public class Reflection {
    private static Set<String> analyze(Class<?> enumClass) {
        System.out.println("------Analyzing " + enumClass + " -------");
        System.out.println("Interfaces: ");
        for(Type t : enumClass.getGenericInterfaces()){
            System.out.println(t);
        }

        System.out.println("Base: " + enumClass.getSuperclass());
        System.out.println("Method: ");
        Set<String> methods = new TreeSet<>();
        for(Method m : enumClass.getMethods()){
            methods.add(m.getName());
        }
        System.out.println(methods);
        return methods;
    }

    public static void main(String[] args){
        Set<String> exploreMethods = analyze(Explore.class);
        Set<String> enumMethods = analyze(Enum.class);
        System.out.println("Explore.ContainsAll(Enum)? " + exploreMethods.containsAll(enumMethods));
        System.out.println("Explore.removeALl(Enum): " + exploreMethods.removeAll(enumMethods));
        System.out.println(exploreMethods);

    }
}

enum Explore{
    //
    HERE, THERE
}
