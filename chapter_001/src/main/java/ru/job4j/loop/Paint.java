package ru.job4j.loop;

/**
 * Paint.
 *
 * @author Aleksey Vdovenko (a.a.vd0venk0@gmail.com)
 */
public class Paint {

    /**
     * Рисуем правый треугольник.
     * @param height Высота треугольника.
     * @return Псевдографика.
     */
    public String rightTrl(int height) {
        StringBuilder screen = new StringBuilder();
        int weight = height;
        for (int row = 0; row != height; row++) {
            for (int column = 0; column != weight; column++) {
                if (row >= column) {
                    screen.append("^");
                } else {
                    screen.append(" ");
                }
            }
            screen.append(System.lineSeparator());
        }
        return screen.toString();
    }

    /**
     * Рисуем левый треугольник.
     * @param height Высота треугольника.
     * @return Псевдографика.
     */
    public String leftTrl(int height) {
        StringBuilder screen = new StringBuilder();
        int weight = height;
        for (int row = 0; row != height; row++) {
            for (int column = 0; column != weight; column++) {
                if (row >= weight - column - 1) {
                    screen.append("^");
                } else {
                    screen.append(" ");
                }
            }
            screen.append(System.lineSeparator());
        }
        return screen.toString();
    }

    /**
     * Рисуем пирамиду.
     * @param height Высота пирамиды.
     * @return Псевдографика.
     */
    public String pyramid(int height) {
        StringBuilder screen = new StringBuilder();
        int weight = 2 * height - 1;
        for (int row = 0; row != height; row++) {
            for (int column = 0; column != weight; column++) {
                if (row >= height - column - 1 && row + height - 1 >= column) {
                    screen.append("^");
                } else {
                    screen.append(" ");
                }
            }
            screen.append(System.lineSeparator());
        }
        return screen.toString();
    }

//    /**
//     * Псевдографика в консоли.
//     */
//    public static void main(String[] args) {
//        Paint paint = new Paint();
//        System.out.println(paint.leftTrl(3));
//        System.out.println(paint.rightTrl(3));
//        System.out.println(paint.pyramid(3));
//    }
}