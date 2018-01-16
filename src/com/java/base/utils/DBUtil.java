package com.java.base.utils;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

/**
 * Created by reacher on 17-9-10.
 */
public final class DBUtil {

    private static final Logger LOGGER = LoggerFactory.getLogger(DBUtil.class);

    private static final String URL = "jdbc:mysql://127.0.0.1/reacher";
    private static final String USER = "root";
    private static final String PASSWORD = "reacherlinux";

    private static Connection connection = null;

    private static Statement statement = null;

    static {
        try {
            Class.forName("com.mysql.jdbc.Driver");//加载驱动
        } catch (Exception e) {
            LOGGER.error("Driver error message:" + e);
        }
    }

    public static Statement open() {
        try {

            connection = DriverManager.getConnection(URL, USER, PASSWORD);//打开数据库连接

            statement = connection.createStatement();//准备执行
            return statement;
        } catch (Exception e) {
            LOGGER.error("Open error message:" + e);
        }
        return null;
    }

    public static void close() {
        try {
            if (null != statement) {
                statement.close();
            }
            if (null != connection) {
                connection.close();
            }
        } catch (Exception e) {
            LOGGER.error("Close error message:" + e);
        }
    }

}

