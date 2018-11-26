package ru.job4j.calculator;

/**
 * Fit.
 * Программа расчета идеального веса.
 * @author Aleksey Vdovenko (a.a.vd0venk0@gmail.com)
 */
public class Fit {

    /**
     * Идеальный вес для мужчины.
     * @param height Рост.
     * @return Идеальный вес.
     */
    public double manWeight(double height) {
        return ((height - 100) * 1.15);
    }

    /**
     * Идеальный вес для женщины.
     * @param height Рост.
     * @return Идеальный вес.
     */
    public double womanWeight(double height) {
        return ((height - 110) * 1.15);
    }
}
