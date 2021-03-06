package ru.job4j.pseudo;

/**
 * @author Aleksey Vdovenko (a.a.vd0venk0@gmail.com)
 * @version $Id$
 * @since 0.1
 */
public class Square implements Shape {
    /**
     * Рисуем квадрат.
     * @return Строковый квадрат.
     */
    @Override
    public String draw() {
        StringBuilder pic = new StringBuilder();
        pic.append("*****");
        pic.append(System.lineSeparator());
        pic.append("*   *");
        pic.append(System.lineSeparator());
        pic.append("*   *");
        pic.append(System.lineSeparator());
        pic.append("*   *");
        pic.append(System.lineSeparator());
        pic.append("*****");
        pic.append(System.lineSeparator());
        return pic.toString();
    }
}