package jdbc_sql.ex1;

import java.sql.*;


public class Main {
    public static void main(String[] args) throws SQLException, ClassNotFoundException {
////        Class.forName("com.mysql.cj.jdbc.Driver");
//        Connection connection  = DriverManager.getConnection(
//                "jdbc:mysql://localhost:3306/testdb",
//                "root", "12345");
//        Statement statement = connection.createStatement();
//        ResultSet results = statement.executeQuery("SELECT * FROM users");
//        while (results.next()) {
//            Integer id = results.getInt(1);
//            String login = results.getString(2);
//            System.out.println(results.getRow() + ". " + id + "\t"+ login);
//        }

        try(Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/testdb?user=root&password=12345");
//        try(Connection connection = DriverManager.getConnection("jdbc:mysql://10.7.0.9:3307/testdb?user=test&password=test");

            Statement statement = connection.createStatement()){
            ResultSet resultSet = statement.executeQuery("SELECT * FROM users");
            while (resultSet.next())
                System.out.println(resultSet.getInt(1)+" "+resultSet.getString(2));

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }


    }
}
