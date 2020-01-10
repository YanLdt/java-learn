import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;

/**
 * @Author: YanL
 * @Time: 20:47 2019/12/2
 * @Email: imyanl.dt@gmail.com
 * @Description:
 */
public class SerializeDemo {
    public static void main(String[] args){
        Employee e = new Employee();
        e.name = "floyd";
        e.address = "London";
        e.age = 20;
        try {
            //创建序列化对象
            ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("employee.txt"));
            //写出对象
            out.writeObject(e);
            //释放资源
            out.close();
            System.out.println("Serialized data is saved");
        }catch (IOException i){
            i.printStackTrace();
        }
    }
}

/**
 * 序列化必须要实现Serializable接口
 * 如果文件在序列化之后有修改要加上序列版本号
 * 否则抛出 InvalidClassException
 */
class Employee implements Serializable{

    /**
     * 加入序列版本号
     */
    private static final long serialVersionUID = 1L;

    String name;
    String address;
    /**
     * //瞬态修饰成员  不会被序列化
     */
    transient int age;
    public void addressCheck() {
        System.out.println("address check: " + name + "--" + address);
    }
}