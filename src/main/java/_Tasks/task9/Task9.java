package _Tasks.task9;

import java.sql.*;

public class Task9 {
    public static void main(String[] args) {
        try (Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/testdb?user=root&password=12345")){

            PreparedStatement ps = connection.prepareStatement("INSERT INTO users (id, login) VALUES (?, ?)");
            ps.setInt(1, 47);
            ps.setString(2, "Borisenko2");
            ps.executeUpdate();

            Statement statement = connection.createStatement();
            ResultSet rs = statement.executeQuery("SELECT * FROM users");
            while (rs.next()){
                System.out.println(rs.getInt(1)+" " + rs.getString(2));
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

    }
}
