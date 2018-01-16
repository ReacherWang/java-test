package com.reacher.j20171111.thistest;

import com.reacher.j20171111.thistest.Point;

/**
 * Created by reacher on 17-11-11.
 */
public class Rectangle {

    private Point point1;
    private Point point2;

    public Rectangle() {
        this(null, null);
    }

    public void setPoint1(Point point1) {
        this.point1 = point1;
    }

    public void setPoint2(Point point2) {
        this.point2 = point2;
    }

    public Rectangle(Point point1, Point point2) {
        this.point1 = point1;
        this.point2 = point2;
    }

    /**
     * 获取宽度
     * @return
     */
    public int getWidth() {
        return this.point2.getY() - this.point1.getY();
    }

    /**
     * 获取长度
     * @return
     */
    public int getLength() {
        return this.point2.getX() - this.point1.getX();
    }

    /**
     * 获取面积
     * @return
     */
    public int getArea() {
        int length = this.getLength();
        int width = this.getWidth();

        return length * width;
    }

    /**
     * 获取周长
     * @return
     */
    public int getPerimeter() {
        int length = this.getLength();
        int width = this.getWidth();

        return (length + width) * 2;
    }
}
