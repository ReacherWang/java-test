package com.java.base.enums;

/**
 * 类说明
 *
 * @author wanggw
 * @date 2017/1/6
 */
public enum UserTypeEnum {

    TEACHER(1, "老师"), STUDENT(2, "学生");

    private int id;
    private String name;

    UserTypeEnum(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return this.id;
    }
}
