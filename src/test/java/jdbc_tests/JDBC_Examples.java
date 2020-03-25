package jdbc_tests;

import org.junit.Test;

import java.sql.*;
import java.util.HashMap;
import java.util.Map;

public class JDBC_Examples {
    public final String dbURL = "jdbc:oracle:thin:@ec2-18-221-138-55.us-east-2.compute.amazonaws.com:1521:xe";
    public final String dbUsername = "hr";
    public final String dbPassword = "hr";

    @Test
    public void readRegionNames() throws SQLException {
        Connection connection = DriverManager.getConnection(dbURL, dbUsername, dbPassword);
        Statement statement = connection.createStatement();
        ResultSet resultSet = statement.executeQuery("SELECT region_id, region_name FROM regions");
        while (resultSet.next()) {
            System.out.println(resultSet.getInt(1) + " | " + resultSet.getString(2));
        }

        resultSet.close();
        statement.close();
        connection.close();
    }

    @Test
    public void countAndNavigations() throws SQLException {
        Connection connection = DriverManager.getConnection(dbURL, dbUsername, dbPassword);
        Statement statement = connection.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
        ResultSet resultSet = statement.executeQuery("SELECT * FROM employees");
        resultSet.last();
        int rowCount = resultSet.getRow();
        System.out.println("number of rows: " + rowCount);
        System.out.println("last employee name is: " + resultSet.getString("first_name"));
        resultSet.close();
        statement.close();
        connection.close();
    }

    @Test
    public void prepearedStatement() throws SQLException {
        Map<String, String> regions = new HashMap<>();
        Connection connection = null;
        PreparedStatement preparedStatement = null;
        ResultSet resultSet = null;
        String sql = "select * from countries where region_id in(?, ?)";
        try {
            connection = DriverManager.getConnection(dbURL, dbUsername, dbPassword);
            preparedStatement = connection.prepareStatement(sql, ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
            preparedStatement.setInt(1, 2);
            preparedStatement.setInt(2, 4);
            resultSet = preparedStatement.executeQuery();
            resultSet.last();
            int rowsNumber = resultSet.getRow();
            System.out.println(rowsNumber);
                while (resultSet.previous()) {
                    regions.put(resultSet.getString("COUNTRY_NAME"),resultSet.getString("REGION_ID"));
                }
                for(String rID : regions.keySet()){
                    System.out.println(rID + " | " + regions.get(rID));
                }
            System.out.println(regions);


        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            try {
                if (resultSet != null && !resultSet.isClosed()) {
                    resultSet.close();
                }
                if (preparedStatement != null && !preparedStatement.isClosed()) {
                    preparedStatement.close();
                }
                if (connection != null && !connection.isClosed()) {
                    connection.close();
                }
            }catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }
    @Test
    public void metaDataExample() {
        Connection connection = null;
        PreparedStatement preparedStatement = null;
        ResultSet resultSet = null;
        String sql = "select * from countries where region_id in(?, ?)";
        try {
            connection = DriverManager.getConnection(dbURL, dbUsername, dbPassword);
            preparedStatement = connection.prepareStatement(sql, ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
            preparedStatement.setInt(1, 2);
            preparedStatement.setInt(2, 4);
            resultSet = preparedStatement.executeQuery();
            DatabaseMetaData metaData = connection.getMetaData();
            System.out.println("Database type: " + metaData.getDatabaseProductName());
            System.out.println("Database version: " + metaData.getDatabaseProductVersion());
            System.out.println("User: " + metaData.getUserName());
            System.out.println("Driver: " + metaData.getDriverName());

            ResultSetMetaData resultSetMetaData = resultSet.getMetaData();
            System.out.println(resultSetMetaData.getColumnCount());
            System.out.println(resultSetMetaData.getColumnName(1));
            System.out.println(resultSetMetaData.getColumnName(2));
            System.out.println(resultSetMetaData.getColumnName(3));
        } catch (Exception e) {
            throw new RuntimeException();
        } finally {
            try {
                if (resultSet != null && !resultSet.isClosed()) {
                    resultSet.close();
                }
                if (preparedStatement != null && !preparedStatement.isClosed()) {
                    preparedStatement.close();
                }
                if (connection != null && !connection.isClosed()) {
                    connection.close();
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }

        }
    }
    }
