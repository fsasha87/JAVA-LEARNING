package jdbc_sql.exDaoPool;

public class Main {
    public static void main(String[] args) throws DaoException {
        new AbonentDaoImpl().findAll().forEach(System.out::println);
        AbonentDao abonentDao = new AbonentDaoImpl();
        Abonent abonent = abonentDao.findAbonentByLastName("Ivanov");
        System.out.println(abonent);
    }
}
