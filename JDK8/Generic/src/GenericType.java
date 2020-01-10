/**
 * @Author: YanL
 * @Time: 11:17 2019/11/26
 * @Email: imyanl.dt@gmail.com
 * @Description:
 */
public class GenericType<T> {
    Class<?> classType;

    public GenericType(Class<?> type){
        classType = type;
    }

    public boolean isInstance(Object object){
        return classType.isInstance(object);
    }

    public static void main(String[] args){
        GenericType<String> genericType = new GenericType<>(String.class);
        System.out.println("---------");
        System.out.println(genericType.isInstance(new String()));
        System.out.println(genericType.isInstance(new Object()));
    }
}