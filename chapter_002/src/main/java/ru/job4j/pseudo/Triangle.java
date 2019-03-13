package ru.job4j.pseudo;

/**
 * @author Aleksey Vdovenko (a.a.vd0venk0@gmail.com)
 * @version $Id$
 * @since 0.1
 */
public class Triangle implements Shape {
    /**
     * Рисуем треугольник.
     * @return Строковый треугольник.
     */
    @Override
    public String draw() {
        StringBuilder pic = new StringBuilder();
        pic.append("    *");
        pic.append(System.lineSeparator());
        pic.append("   **");
        pic.append(System.lineSeparator());
        pic.append("  * *");
        pic.append(System.lineSeparator());
        pic.append(" *  *");
        pic.append(System.lineSeparator());
        pic.append("*****");
        pic.append(System.lineSeparator());
        return pic.toString();
    }
}