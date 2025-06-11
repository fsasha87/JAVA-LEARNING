package jdbc_sql.exModel;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class UserMain {
    public static void main(String[] args) throws SQLException {
        Connection connection = null;
        try {
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/testdb?user=root&password=12345");
            User user1 = new User("Petrova");
            addUser(connection, user1);
            System.out.println(addUser(connection, user1));

            User user2 = getUserById(connection, 32);
            System.out.println(user2);//User{id=32, login='Lenon'}

            getAllUsers(connection).forEach(System.out::println);

        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {
            if (connection != null)
                connection.close();
        }
    }

    public static boolean addUser(Connection connection, User user) throws SQLException {
        // Создаем и подготавливаем запрос на вставку данных в таблицу
        String insertQuery = "INSERT INTO users(login) VALUES (?)";
        PreparedStatement statement = connection.prepareStatement(insertQuery);

        // Заполняем запрос данными из объекта Employee
        statement.setString(1, user.login);

        // Выполняем наш запрос, и он возвращает true, если новая строка добавилась
        int count = statement.executeUpdate();
        return count > 0;

    }

    public static User getUserById(Connection connection, int id) throws SQLException {
        // Создаем и подготавливаем запрос для получения сотрудника из таблицы
        PreparedStatement statement = connection.prepareStatement("SELECT * FROM users WHERE id = ?");
        statement.setInt(1, id);

        // Выполняем наш запрос, и он возвращает null, если строк в результате запроса нет
        ResultSet resultSet = statement.executeQuery();
        User user = new User();

        while (resultSet.next()) {
            if (resultSet.getInt(1) == id)// Заполняем объект Employee данными из ResultSet
                user.id = resultSet.getInt(1);
                user.login = resultSet.getString(2);
        }
        return user;
    }

    public static List<User> getAllUsers(Connection connection) throws SQLException {
        List<User> users = new ArrayList<>();
        Statement statement  = connection.createStatement();
        ResultSet resultSet = statement.executeQuery("SELECT * FROM users");
        while (resultSet.next()){
            User user = new User();
            user.id = resultSet.getInt(1);
            user.login = resultSet.getString(2);
            users.add(user);
        }

        return users;
    }


}
