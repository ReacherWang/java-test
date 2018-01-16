package com.reacher.j20171214;

/**
 * Created by reacher on 17-12-14.
 */
public class EmailValidate extends BaseValidate {

    @Override
    public String validate(String value) {
        if (!value.contains("@")) {
            return "邮箱格式不正确";
        }
        return null;
    }
}
