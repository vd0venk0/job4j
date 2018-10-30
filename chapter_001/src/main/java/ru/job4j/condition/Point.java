package ru.job4j.condition;

import java.lang.Math;

/**
 * @author Aleksey Vdovenko (a.a.vd0venk0@gmail.com).
 * @version $Id$.
 * @since 0.1.
 */
public class Point {

    private int x;
    private int y;

    /**
     * Текущая точка.
     * @param x Координата x для текущей точки.
     * @param y Координата y для текущей точки.
     */
    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    /**
     * Метод для вычисления расстояния между текущей и входящей точкой.
     * @param that Входящая точка.
     * @return Расстояние между текущей и входящей точкой.
     */
    public double distanceTo(Point that) {
        return Math.sqrt(
                Math.pow((double) (this.x - that.x), 2D) + Math.pow((double) (this.y - that.y), 2D)
        );
    }

//  Проверим работу класса через консоль:
//    public static void main(String[] args) {
//        Point a = new Point(0, 0);
//        Point b = new Point(3, 4);
//        System.out.println(a.distanceTo(b));
//
//    }

}
