import java.sql.*;

public class Main {
    private static Connection connect = null;
    private static Statement statement = null;
    private static ResultSet resultSet = null;
    private static String url = "jdbc:mysql://localhost:3306/connect_mysql_database?useTimezone=true&serverTimezone=UTC";
    private static String user ="root", pass = "";

    public static void main(String[] args) {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            connect = DriverManager.getConnection(url, user, pass);
            statement = connect.createStatement();
            resultSet = statement.executeQuery("select * from bubblesort_table");

            while (resultSet.next()){
                int id = resultSet.getInt(1);
                int values = resultSet.getInt(2);
                System.out.println(id + ". " + values);
            }

        } catch (SQLException throwables) {
            throwables.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

    }
}
