package com.reacher.j20171214;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * Created by reacher on 17-12-14.
 */
public class Main {

    private static final Map<Integer, BaseValidate> validates = new HashMap<>();

    static {
        validates.put(1, new PhoneValidate());
        validates.put(2, new EmailValidate());
        validates.put(3, new URLValidate());
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("请输入数据类型(1:电话号码　２:邮箱 3:网址):");
        int dataType = scanner.nextInt();
        System.out.print("请输入要校验的数据:");
        String value = scanner.next();

        BaseValidate validate = validates.get(dataType);

        String result = validate.validate(value);

        if (null == result) {
            System.out.println("该数据合法");
        } else {
            System.out.println(result);
        }
    }
}
