package com.lmk.user;

import java.util.List;

/**
 * @author LiuMengKe
 * @create 2018-04-04-15:14
 */
public class User {

    private String id;

    private String name;

    private String password;

    private List<Roles> roles;

    public User() {
    }

    public User(String password, String name) {
        this.password = password;
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public List<Roles> getRoles() {
        return roles;
    }

    public void setRoles(List<Roles> roles) {
        this.roles = roles;
    }
}
