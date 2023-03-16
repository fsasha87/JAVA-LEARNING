package jdbc_sql.exDaoPool;

public interface AbonentDao extends BaseDao<Long, Abonent>{
    Abonent findAbonentByLastName (String patternName) throws DaoException;
}
