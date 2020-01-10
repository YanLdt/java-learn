import java.util.Map;

/**
 * @Author: YanL
 * @Time: 21:39 2019/10/29
 * @Email: imyanl.dt@gmail.com
 * @Description:
 */
public class EnvironmentVariables {
    public static void main(String[] args){
        for (Map.Entry entry: System.getenv().entrySet()){
            System.out.println(entry.getKey() + ":" + entry.getValue());
        }
    }
}
