package com.reacher.j20171214;

/**
 * Created by reacher on 17-12-14.
 */
public class URLValidate extends BaseValidate {

    @Override
    public String validate(String value) {
        if (!value.contains("http:")) {
            return "网址格式不正确";
        }
        return null;
    }
}
