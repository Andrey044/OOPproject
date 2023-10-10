package ua.opu;

abstract public class User {

private String login;

private String password;

abstract void changePassword();



public User(String login, String password){
    this.login = login;
    this.password = password;
}

}
