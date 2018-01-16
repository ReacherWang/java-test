package com.java.base.utils;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.lang.reflect.Field;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

/**
 * 类说明
 *
 * @author wanggw
 * @date 2017/1/6
 */
public final class SQLHelper {

    private static final Logger LOGGER = LoggerFactory.getLogger(SQLHelper.class);

    public  static <T> List<T> query(final String sql, Class<T> clazz) {
        List<T> results = new ArrayList<>();
        try {
            Statement statement = DBUtil.open();
            ResultSet resultSet = statement.executeQuery(sql);
            List<Field> fields = ReflectUtil.fieldNamesWithSuper(clazz);
            while (resultSet.next()) {
                T temp = clazz.newInstance();
                for(Field field: fields) {
                    String resultFile = null;
                    try {
                        resultFile = resultSet.getString(field.getName());
                    } catch (Exception e) {
                        continue;
                    }
                    ReflectUtil.invokeSetMethod(temp, field, resultFile);
                }
                results.add(temp);
            }
            resultSet.close();
        } catch (Exception e) {
            LOGGER.error("Query error message:" + e);
        } finally {
            DBUtil.close();
        }
        return results;
    }

    public static boolean delete(final String sql) {
        try {
            Statement statement = DBUtil.open();

            return statement.execute(sql);
        } catch (Exception e) {
            LOGGER.error("Delete error message:" + e);
        } finally {
            DBUtil.close();
        }
        return false;
    }

    public static void update(final String sql) {
        try {
            Statement statement = DBUtil.open();

            statement.executeUpdate(sql);
        } catch (Exception e) {
            LOGGER.error("Update error message:" + e);
        } finally {
            DBUtil.close();
        }
    }

    public static void insert(final String sql) {
        try {
            Statement statement = DBUtil.open();

            statement.executeUpdate(sql);
        } catch (Exception e) {
            LOGGER.error("Insert error message:" + e);
        } finally {
            DBUtil.close();
        }
    }

}
