import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

/**
 * @Author: YanL
 * @Time: 15:02 2019/12/3
 * @Email: imyanl.dt@gmail.com
 * @Description:
 */
public class DeserializeDemo {
    public static void main(String[] args){
        Employee e = null;
        try {

            //创建反序列化流
            FileInputStream fi = new FileInputStream("employee.txt");
            ObjectInputStream in = new ObjectInputStream(fi);
            //读取对象
            e = (Employee)in.readObject();
            //释放资源
            in.close();
            fi.close();
        }catch (IOException i){
            i.printStackTrace();
            return;
        }catch (ClassNotFoundException c){
            System.out.println("Employee class not found");
            c.printStackTrace();
            return;
        }

        System.out.println("Name: " + e.name);
        System.out.println("Address: " + e.address);
        System.out.println("Age: " +e.age);
    }
}
