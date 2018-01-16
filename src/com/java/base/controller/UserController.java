package com.java.base.controller;

import com.java.base.model.User;
import com.java.base.service.UserService;

import java.util.List;

/**
 * 类说明
 *
 * @author wanggw
 * @date 2017/1/6
 */
public class UserController {

    private String name = "reacher";

    private int a = 123;

    //TODO 对应的界面展示

    /**================以下为测试代码==================*/
    public static void main(String[] args) {

        UserService userService = new UserService();
        boolean result = userService.register("zhaoyu", "111111", "jianda");

        if (result) {
            System.out.println("SUCCESS");
        } else {
            System.out.println("FAIL");
        }

    }
}
