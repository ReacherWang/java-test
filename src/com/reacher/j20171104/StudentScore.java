package com.reacher.j20171104;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Random;

/**
 * Created by reacher on 17-11-4.
 */
public class StudentScore {

    public static void main(String[] args) {
        Integer[] scores = init();//实参

        int avg = getAvg(scores);
        int counter = getLowAvgCounter(scores, avg);

        descSort(scores);
        ascSort(scores);

        System.out.println("\n平均分数为: " + avg);
        System.out.println("低于平均分数的学生个数为: " + counter);
    }

    private static Integer[] init() {
        Integer[] scores = new Integer[10];

        Random random = new Random(System.currentTimeMillis());
        for (int i = 0; i < scores.length; ++i) {
            scores[i] = random.nextInt(100);
        }

        return scores;
    }

    /**
     * 形参列表
     * @param scores
     */
    private static void descSort(Integer[] scores) {
        Arrays.sort(scores, new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o2 - o1;
            }
        });
    }

    private static void ascSort(Integer[] scores) {
        Arrays.sort(scores, new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o1 - o2;
            }
        });
    }

    private static int getAvg(Integer[] scores) {
        int sum = 0;
        for (int i = 0; i < scores.length; ++i) {
            sum += scores[i];
        }

        return sum / scores.length;
    }

    private static int getLowAvgCounter(Integer[] scores, int avg) {
        int counter = 0;

        for (int score: scores) {
            if (score < avg) {
                ++counter;
            }
        }

        return counter;
    }
}
