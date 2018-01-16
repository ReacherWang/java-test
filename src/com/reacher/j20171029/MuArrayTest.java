package com.reacher.j20171029;

import java.util.Scanner;

/**
 * Created by reacher on 17-10-29.
 */
public class MuArrayTest {

    /**
     * 二维数组定义：
     *      1、数组元素类型[][] 数组名 = new 数组元素类型[一维大小][二维大小];
     *          eg: int[][] a = new int[2][3];
     *      2、数组元素类型[][] 数组名 = new 数组元素类型[一维大小][];
     *          注意:二维可以省略、一维不可以省略
     *      3、二维数组可以理解为一个特殊的一维数组，只是这个一维数组的每个元素又是一个一维数组
     *
     * 初始化:
     *      1、先定义数组，然后每个单独赋值
     *      2、数组元素类型[][] 数组名 = {{元素１, 元素２, ...}, {元素１, 元素２, ...}, ...}
     *
     * @param args
     */
    public static void main(String[] args) {
        double[][] scores = new double[2][3];

        System.out.println(scores.length);
        System.out.println(scores[0].length);

        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < scores.length; ++i) {
            System.out.println("请输入第[" + (i + 1) + "]位学生的成绩信息");
            for (int j = 0; j < scores[i].length; ++j) {
                System.out.print("请输入第[" + (j + 1) + "]门课程的成绩: ");
                scores[i][j] = scanner.nextDouble();
            }
        }

        for (int i = 0; i < 2; ++i) {
            double sum = 0;
            for (int j = 0; j < 3; ++j) {
                sum += scores[i][j];
            }
            System.out.println("第[" + (i + 1) + "]位学生的平均成绩是: " + (sum / 3));
        }

    }
}
