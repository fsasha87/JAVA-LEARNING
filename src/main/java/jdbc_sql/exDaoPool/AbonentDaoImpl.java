package jdbc_sql.exDaoPool;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class AbonentDaoImpl implements AbonentDao{
    private static final String SQL_SELECT_ALL_ABONENTS = "SELECT idphonebook, lastname, phone FROM phonebook";
    private static final String SQL_SELECT_ABONENT_BY_LASTNAME = "SELECT idphonebook, lastname, phone FROM phonebook WHERE lastname = ?";


    @Override
    public Abonent findAbonentByLastName(String patternName) throws DaoException {
        Abonent abonent = null;
        Connection connection = null;
        PreparedStatement preparedStatement = null;
        try {
//            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/testphones?user=root&password=12345");
            connection = MySqlDataSourceFactory.getConnection();
            preparedStatement = connection.prepareStatement(SQL_SELECT_ABONENT_BY_LASTNAME);
            preparedStatement.setString(1, patternName);
            ResultSet resultSet = preparedStatement.executeQuery();
            abonent = new Abonent();
            while (resultSet.next()){
                if (resultSet.getString("lastname").equals(patternName)){
                abonent.setId(resultSet.getInt("idphonebook"));
                abonent.setName(patternName);
                abonent.setPhone(resultSet.getInt("phone"));
            }
            }
        } catch (SQLException e) {
//            System.err.println("SQLException (request or table failed): "+e);
            throw new DaoException(e);
        } finally {
            close(preparedStatement);
            close(connection);
        }

        return abonent;
    }

    @Override
    public List<Abonent> findAll() {
        List<Abonent> abonents = new ArrayList<>();
        Connection connection = null;
        Statement statement = null;
        try {
//            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/testphones?user=root&password=12345");
            connection = MySqlDataSourceFactory.getConnection();
            statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery(SQL_SELECT_ALL_ABONENTS);
            while (resultSet.next()){
                Abonent abonent = new Abonent();
                abonent.setId(resultSet.getInt("idphonebook"));
                abonent.setName(resultSet.getString("lastname"));
                abonent.setPhone(resultSet.getInt("phone"));
                abonents.add(abonent);
            }
        } catch (SQLException e) {
//
        } finally {
            close(statement);
            close(connection);
        }

        return abonents;
    }

    @Override
    public Abonent findEntity(Long id) {
        return null;
    }

    @Override
    public boolean delete(Abonent abonent) {
        return false;
    }

    @Override
    public boolean delete(Long id) {
        return false;
    }

    @Override
    public boolean create(Abonent abonent) {
        return false;
    }

    @Override
    public Abonent update(Abonent abonent) {
        return null;
    }


}
