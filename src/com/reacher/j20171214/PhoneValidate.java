package com.reacher.j20171214;

/**
 * Created by reacher on 17-12-14.
 */
public class PhoneValidate extends BaseValidate {

    @Override
    public String validate(String value) {
        if (11 != value.length()) {
            return "电话号码不合法";
        }
        return null;
    }
}
