package ru.job4j.condition;

import java.lang.Math;

/**
 * Triangle.
 * Треугольник.
 * @author Aleksey Vdovenko (a.a.vd0venk0@gmail.com).
 */
public class Triangle {

    private Point a;
    private Point b;
    private Point c;

    public Triangle(Point a, Point b, Point c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    /**
     * Метод возвращает полупериметр по длинам сторон треугольника.
     * @param ab расстояние между точками a b.
     * @param ac расстояние между точками a c.
     * @param bc расстояние между точками b c.
     * @return Полупериметр.
     */
    public double period(double ab, double ac, double bc) {
        return (ab + ac + bc) / 2;
    }

    /**
     * Метод возвращает площадь треугольника (если треугольник не существует, то -1).
     * @return Площадь треугольника или -1.
     */
    public double area() {
        double rsl = -1; // Площадь треугольника (-1 - признак несущетвующего треугольника).
        double ab = this.a.distanceTo(this.b);
        double ac = this.a.distanceTo(this.c);
        double bc = this.b.distanceTo(this.c);
        double p = this.period(ab, ac, bc);
        if (this.exist(ab, ac, bc)) {
            rsl = Math.sqrt(p * (p - ab) * (p - ac) * (p - bc));
        }
        return rsl;
    }

    /**
     * Метод проверяет уществование треугольника.
     * @param ab - сторона ab.
     * @param ac - сторона ac.
     * @param bc - сторона bc.
     * @return - Признак существования треугольника.
     */
    private boolean exist(double ab, double ac, double bc) {
        return ((ab + ac > bc) && (ac + bc > ab) && (ab + bc > ac));
    }
}