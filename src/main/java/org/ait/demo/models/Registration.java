package org.ait.demo.models;

public class Registration {
    private  String name;
    private String surname;
    private String email;
    private String password;

    public Registration setName(String name) {
        this.name = name;
        return this;
    }

    public Registration setSurname(String surname) {
        this.surname = surname;
        return this;
    }

    public Registration setEmail(String email) {
        this.email = email;
        return this;
    }

    public Registration setPassword(String password) {
        this.password = password;
        return this;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public String getEmail() {
        return email;
    }

    public String getPassword() {
        return password;
    }
}