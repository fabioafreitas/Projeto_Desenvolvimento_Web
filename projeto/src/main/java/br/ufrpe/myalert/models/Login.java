package br.ufrpe.myalert.models;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import sun.rmi.runtime.Log;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;

public class Login {

    private String id;
    // TODO adicionar user_id: <ObjectId1>
    private String username;
    private String password;
    public static List<Login> loginList;

    static {
        loginRepository();
    }

    public static void loginRepository() {
        loginList = new ArrayList<>(Arrays.asList(
                new Login("1", "maik", "maik123"),
                new Login("2", "elthon", "elthon123"),
                new Login("3", "gabriel", "gabriel123"),
                new Login("4", "eder", "eder123"),
                new Login("5", "fabio", "fabio123")
        ));
    }

    public Login(String id, String username, String password) {
        this.id = id;
        this.username = username;
        this.password = password;
    }

    public Login(String id) {
        this.id = id;
    }

    public Login() {
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Login login = (Login) o;
        return Objects.equals(username, login.username) &&
                Objects.equals(password, login.password);
    }

    @Override
    public int hashCode() {
        return Objects.hash(username, password);
    }
}
