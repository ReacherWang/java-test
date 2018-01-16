package com.reacher.j20171104;

import java.util.Scanner;

/**
 * Created by reacher on 17-11-4.
 */
public class FindWords {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String str = scanner.nextLine();

        String[] words = getWords(str);

        for (String word: words) {
            System.out.println("单词为: " + word);
        }

        System.out.println("长度最小的单词为: " + getMinWord(words));

    }

    private static String getMinWord(String[] words) {
        String min = words[0];

        for (int i = 1; i < words.length; ++i) {
            if (min.length() > words[i].length()) {
                min = words[i];
            }
        }

        return min;
    }

    private static String[] getWords(String str) {
        int index = 0;
        StringBuffer word = new StringBuffer();
        String[] words = new String[str.length()];
        for (int i = 0; i < str.length(); ++i) {
            char ch = str.charAt(i);
            if (ch != ',' && ch != '.' && ch != '!' && ch != ' ') {
                word.append(ch);
                continue;
            }
            if (word.length() > 0) {
                words[index++] = word.toString();
                word = new StringBuffer();
            }

        }
        if (word.length() > 0) {
            words[index++] = word.toString();
        }
        String[] temps = new String[index];
        for (int i = 0; i < temps.length; ++i) {
            temps[i] = words[i];
        }

        return temps;
    }

}
