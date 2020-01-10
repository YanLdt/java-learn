import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

/**
 * @Author: YanL
 * @Time: 15:26 2019/12/12
 * @Email: imyanl.dt@gmail.com
 * @Description:
 */
public class Demo01 {
    public static void main(String[] args) throws SQLException {
        String url = "jdbc:mysql://localhost:3306/student";
        Properties info = new Properties();
        Connection connection = DriverManager.getConnection(url, "root", "datouwudi233");
        System.out.println(connection);
    }
}
