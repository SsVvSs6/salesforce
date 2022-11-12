package model;

public class User {

    private String url = "https://tms8.lightning.force.com/";
    private String login = "o1gkci-ka7h@force.com";
    private String password = "TMSAQA17onl";

    public User(String url, String login, String password) {
        this.url = url;
        this.login = login;
        this.password = password;
    }

    public User() {
    }

    public String getUrl() {
        return url;
    }

    public String getLogin() {
        return login;
    }

    public String getPassword() {
        return password;
    }
}
