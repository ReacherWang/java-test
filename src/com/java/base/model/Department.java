package com.java.base.model;

/**
 * Created by reacher on 17-9-10.
 */
public class Department extends BaseModel {

    private String name;
    private int userId;

    private User user;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    @Override
    public String toString() {
        return "Department{" +
                "name='" + name + '\'' +
                ", user=" + user.toString() +
                '}';
    }
}
