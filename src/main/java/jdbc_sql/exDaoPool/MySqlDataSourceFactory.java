package jdbc_sql.exDaoPool;

//import com.mysql.cj.jdbc.MysqlDataSource;

import java.sql.Connection;
import java.sql.SQLException;

public class MySqlDataSourceFactory {
//    private static MysqlDataSource dataSource = new MysqlDataSource();
//    static {
//        dataSource.setURL("jdbc:mysql://localhost:3306/testphones");
//        dataSource.setUser("root");
//        dataSource.setPassword("12345");
//    }
    public static Connection getConnection() throws SQLException {
        return null;
//        return dataSource.getConnection();
    }
}
