package com.reacher.j20171029;

import java.util.Scanner;

/**
 * Created by reacher on 17-10-29.
 */
public class ArrayTest {

    /**
     * 数组定义:数组元素类型[] 数组名 = new 数组元素类型[数组元素个数];
     *
     * 1、数组可以给默认的初始值(如果数组大小等于默认值的个数)：
     *      1.1数组元素类型[] 数组名 = new 数组元素类型[]　｛元素１, 元素２, ......｝;
     *      1.2数组元素类型[] 数组名 = ｛元素１, 元素２, ......｝;
     * 2、数组小标形式访问
     *      ２.1以下标的形式进行访问:　数组名[下标]
     *      2.2下标范围:如果数组元素个数为ｎ，小标的范围是：０～~ｎ-1
     *３、数组以for each形式访问
     *      3.1 for(数组元素类型　变量名: 数组名)
     *4、数组越界:小标不在０～~ｎ-1的范围
     *      4.1数组越界会抛异常:ArrayIndexOutOfBoundsException
     *@param args
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double[] scores = new double[5];

        for (int i = 0; i < scores.length; ++i) {
            System.out.print("Please inout score: ");
            scores[i] = scanner.nextDouble();
        }
        double min = scores[0];
        double sum = 0;
        for (double score: scores) {
            if (min > score) {
                min = score;
            }
            sum += score;
        }
        System.out.println("Min score is: " + min);
        System.out.println("Avg score is: " + sum / scores.length);

        double[] scoresTemp = new double[scores.length];
        System.arraycopy(scores, 0, scoresTemp, 0, scores.length);

        for (double temp: scoresTemp) {
            System.out.println(temp);
        }
    }
}
