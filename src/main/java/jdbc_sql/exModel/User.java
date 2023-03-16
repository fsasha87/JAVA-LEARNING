package jdbc_sql.exModel;

public class User {
    public int id;
    public String login;
    public User(){}

    public User(String login) {
        this.login = login;
    }

    public User(int id, String login) {
        this.id = id;
        this.login = login;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", login='" + login + '\'' +
                '}';
    }
}
