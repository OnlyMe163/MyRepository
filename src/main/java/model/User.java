package model;

/**
 * Created by Дмитрий on 27.06.2016.
 */
public class User {
    private String login;
    private String password;
    private int id;

    public void setId(int id) {
        this.id = id;
    }

    public User() {

    }

    public User(String login, String password) {

        this.login = login;
        this.password = password;
    }

    public User(String login, String password, int id) {

        this.login = login;
        this.password = password;
        this.id = id;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
