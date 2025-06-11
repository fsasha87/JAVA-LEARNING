package jdbc_sql.exTransaction;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class TransactionMain {
    public static void main(String[] args) {
        try(Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/testdb?user=root&password=12345");
            Statement statement = connection.createStatement()){
            try {
                connection.setAutoCommit(false);
                statement.executeUpdate("INSERT INTO users (login) VALUES ('111')");
                statement.executeUpdate("INSERT INTO users (login) VALUES ('1111')");
                statement.addBatch("INSERT INTO users (login) VALUES ('22')");
                statement.addBatch("INSERT INTO users (login) VALUES ('222')");
                statement.executeBatch();

                connection.commit();
            } catch (SQLException e){
                connection.rollback();
            } finally {
                connection.setAutoCommit(true);
            }

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
