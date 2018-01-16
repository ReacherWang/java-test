package com.reacher.j20171021;

import java.util.Scanner;

/**
 * Created by reacher on 17-10-21.
 */
public class ScoreToLevelTest {

    /**
     * >= 90 ======>  A
     * >= 80 ======>  B
     * >= 60 ======>  C
     * <  60 ======>  D
     *
     * @param args
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Please input your score: ");
        int score = scanner.nextInt();

        String level = null;

        if (score >= 90) {
            level = "A";
        } else if (score >= 80) {
            level = "B";
        } else if (score >= 60) {
            level = "C";
        } else {
            level = "D";
        }

        System.out.println("Your score to level is " + level);
    }
}
