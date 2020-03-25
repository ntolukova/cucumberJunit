package jdbc_tests;
import java.sql.*;

public class Main {
    public static void main(String[] args) throws SQLException {
        String dbURL = "jdbc:oracle:thin:@ec2-18-221-138-55.us-east-2.compute.amazonaws.com:1521:xe";
        String dbUsername = "hr";
        String dbPassword = "hr";
        Connection connection = DriverManager.getConnection(dbURL,dbUsername,dbPassword);
        Statement statement = connection.createStatement();
        ResultSet resultSet = statement.executeQuery("select * from employees");
        resultSet.next();
        System.out.println(resultSet.getString("first_name"));
        resultSet.close();
        statement.close();
        connection.close();



    }
}
