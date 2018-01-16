package com.reacher.j20171111.thistest;

/**
 * Created by reacher on 17-11-11.
 */
public class MainTest {

    /**
     *
     * public void thistest(String name, int age){}
     *
     * public void thistest(int age, String name){}
     *
     * @param args
     */
    public static void main(String[] args) {
        Point point1 = new Point(2, 3);
        Point point2 = new Point(7, 9);

        Rectangle rectangle = new Rectangle();
        rectangle.setPoint1(point1);
        rectangle.setPoint2(point2);

        System.out.println("长：" + rectangle.getLength());
        System.out.println("宽：" + rectangle.getWidth());
        System.out.println("面积：" + rectangle.getArea());
        System.out.println("周长：" + rectangle.getPerimeter());
    }

}
