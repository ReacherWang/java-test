package com.reacher.j20171104;

import java.util.Scanner;

/**
 * Created by reacher on 17-11-4.
 */
public class Test {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String str = scanner.nextLine();

        System.out.println("长度最小的单词为: " + getMinWord(str));

    }

    private static String getMinWord(String str) {
        String min = null;
        StringBuffer word = new StringBuffer();
        for (int i = 0; i < str.length(); ++i) {
            char ch = str.charAt(i);
            if (ch != ',' && ch != '.' && ch != '!' && ch != ' ') {
                word.append(ch);
                continue;
            }
            if (word.length() > 0) {
                if (null == min || min.length() > word.length()) {
                    min = word.toString();
                }
                word = new StringBuffer();
            }

        }
        if (word.length() > 0) {
            if (null == min || min.length() > word.length()) {
                min = word.toString();
            }
        }
        return min;
    }

}
