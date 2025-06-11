package jdbc_sql.ex2;

import java.sql.*;

public class Main {
    public static void main(String[] args) {
        try (Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/testdb?user=root&password=12345");
//        try(Connection connection = DriverManager.getConnection("jdbc:mysql://10.7.0.9:3307/testdb?user=test&password=test");
             Statement statement = connection.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE,
                     ResultSet.CONCUR_UPDATABLE)) {

            //CRUD with statement
            statement.executeUpdate("INSERT INTO users VALUES (41, 'Sheva')");
            statement.executeUpdate("UPDATE users SET login = 'Shevchuk' WHERE id = 42");
            statement.executeUpdate("DELETE FROM users WHERE id = 41");
            //create with preparedStatement
            PreparedStatement prestat = connection.prepareStatement("INSERT INTO users (id, login) VALUES (?, ?)");
            prestat.setInt(1, 2);
            prestat.setString(2, "Leno");
            prestat.executeUpdate();

            //CRUD with resultSet
            ResultSet resultSet = statement.executeQuery("SELECT * FROM users");
            // create row with resultset
            resultSet.moveToInsertRow();//переместили курсор на пустую строку
            resultSet.updateInt("id", 43);
            resultSet.updateString("login", "Dimon");//заполнили строку данными
            resultSet.insertRow();//добавили строку в БД
            resultSet.moveToCurrentRow();//вернули курсор
            //update row with resultSet
            while (resultSet.next()) {
                if (resultSet.getInt("id") == 43) {
                    resultSet.updateString("login", "Dimonov");
                    resultSet.updateRow();
                }
            }
            //delete row with resultSet
            while (resultSet.next()) {
                if (resultSet.getInt(1) == 43) {
                    resultSet.deleteRow();
                }
            }

            //show all
            while (resultSet.next())
                System.out.println(resultSet.getInt(1) + " " + resultSet.getString(2));

            //получаем метаданные
            ResultSetMetaData metaData = resultSet.getMetaData();
            int columnCount = metaData.getColumnCount();
            for (int column = 1; column <= columnCount; column++)
            {
                String name = metaData.getColumnName(column);
                String className = metaData.getColumnClassName(column);
                String typeName = metaData.getColumnTypeName(column);
                int type = metaData.getColumnType(column);

                System.out.println(name + "\t" + className + "\t" + typeName + "\t" + type);
            }

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

    }

}
