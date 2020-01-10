import java.sql.*;

/**
 * @Author: YanL
 * @Time: 15:33 2019/12/12
 * @Email: imyanl.dt@gmail.com
 * @Description:
 */
public class Demo02Flower {
    public static void main(String[] args) {
        Connection connection = null;
        Statement statement = null;

        try{
            connection = DriverManager.getConnection("jdbc:mysql://localhost/student", "root", "datouwudi233");
            statement = connection.createStatement();
            statement.executeUpdate("use student");
            statement.executeUpdate("set names utf8;");
            int count = 0;
            count += statement.executeUpdate("insert into flower values (5, 'pink', 'female', '1993-03-24');");
            count += statement.executeUpdate("insert into flower values (6, 'flower', 'male', '1993-03-24');");
            System.out.println("created");
            ResultSet resultSet = statement.executeQuery("select * from flower");
            while (resultSet.next()) {
                int id = resultSet.getInt("id");
                String name = resultSet.getString("name");
                String gender = resultSet.getString("gender");
                Date date = resultSet.getDate("birthday");

                System.out.println(id + name + gender + date);

            }
            resultSet.close();

        }catch (SQLException e){
            e.printStackTrace();
        }
        finally {
            if(statement != null){
                try {
                    statement.close();
                }catch (SQLException e){
                    e.printStackTrace();
                }
            }
        }
    }
}
