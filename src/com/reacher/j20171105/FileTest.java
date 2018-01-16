package com.reacher.j20171105;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;

/**
 * Created by reacher on 17-11-5.
 */
public class FileTest {

    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(new FileInputStream("/home/reacher/Desktop/thistest.txt"), "utf-8"));

        String line = null;

        while ((line = reader.readLine()) != null) {
            System.out.println(line);
        }

        reader.close();

    }

}
