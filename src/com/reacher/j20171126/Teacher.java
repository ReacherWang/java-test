package com.reacher.j20171126;

/**
 * Created by reacher on 17-11-26.
 */
public class Teacher {

    private String name;
    private String level;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLevel() {
        return level;
    }

    public void setLevel(String level) {
        this.level = level;
    }

    @Override
    public String toString() {
        return "Teacher{" +
                "name='" + name + '\'' +
                ", level='" + level + '\'' +
                '}';
    }
}
